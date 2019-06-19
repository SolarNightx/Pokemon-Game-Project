package pokemon.weed.green;

import moveList.Moves;
import DLibX.DConsole;
import java.awt.Point;
import java.util.Random;
import pokemon.weed.green.MoveType.MType;
import pokemonList.Pokemon;

public class Battle {
    
    Pokemon[] playerMons;
    Pokemon[] foeMons;
    Pokemon activePlayerMon;
    Pokemon activeFoeMon;
    Menu menu;
    TextBox[] healthBars = new TextBox[2];
    Random rng = new Random();
    Moves storedFoeAttack = null;
    Moves storedPlayerAttack = null;
    DConsole dc;
    int damage = 0;
    int currentMenuOption = 0;
    
    // Variables that go into damage calc
    double random = 0;
    double modifier = 0;
    double stab = 1.00;
    
    public Battle(DConsole dc, Pokemon[] playerMons, Pokemon[] foeMons) {
        this.dc = dc;
        
        // Interfaces
        menu = new Menu(dc, InterfaceType.BATTLE_MENU);
        healthBars[0] = new TextBox(dc, InterfaceType.HEALTH_BAR, new String[] {"HP"});
        healthBars[1] = new TextBox(dc, InterfaceType.HEALTH_BAR, new String[] {"HP"});
        healthBars[0].setNewCoordinates(new Point(1, 1), new Point(5, 2)); // Out of 20
        healthBars[1].setNewCoordinates(new Point(16, 14), new Point(20, 15));
        
        // Rest of the stuff
        this.playerMons = playerMons;
        this.foeMons = foeMons;
        activePlayerMon = playerMons[0];
        activeFoeMon = foeMons[0];
        
        // Get table for type effectiveness
        Decode decoder = new Decode("TypeEffectivenessFile.txt");
        if (decoder.getOpen()) {
            double[][] typeEffectiveness = decoder.fromFileDouble();
            System.out.println("Type effectiveness chart succesfully read.");
        } else {
            System.out.println("No effectiveness chart found. All moves do 1.0x damage.");
        }
    }
    
    // Battle methods
    public void startTurn() {
        // Check speeds, then attack appropriately
        if (activePlayerMon.speed > activeFoeMon.speed 
                && storedFoeAttack.priority <= storedPlayerAttack.priority 
                || storedPlayerAttack.priority > storedFoeAttack.priority) {
            playerAttack(storedPlayerAttack);
            foeAttack(storedFoeAttack);
        } else if (activeFoeMon.speed > activePlayerMon.speed 
                && storedPlayerAttack.priority <= storedFoeAttack.priority
                || storedFoeAttack.priority > storedPlayerAttack.priority) {
            foeAttack(storedFoeAttack);
            playerAttack(storedPlayerAttack);
        } else {
            if (rng.nextBoolean()) {
                playerAttack(storedPlayerAttack);
                foeAttack(storedFoeAttack);
            } else {
                foeAttack(storedFoeAttack);
                playerAttack(storedPlayerAttack);
            }
        }
    }
    
    public void generateFoeMove() {
        // Self-explanitory
        int randomNumber;
        do {
            randomNumber = rng.nextInt(4);
        } while (activeFoeMon.getMove(randomNumber) != null);
        storedFoeAttack = activeFoeMon.getMove(randomNumber);
    }
    
    /* Damage formula:
        Damage: (((2 + (2 * Level / 5)) * Power * (Attack / Defence)) / 50 + 2) * Modifier
	Modifier: #Targets * Weather * Badge * Crit * STAB * Type * Burn * Other * Random    
        Random: (rng.nextInt(15) + 85) / 100.00;
    */
    
    public void playerAttack(Moves storedPlayerAttack) {
        if (rng.nextInt(100) < (storedPlayerAttack.accuracy)) { // Accuracy Check (Prob will change.)
            if (storedPlayerAttack.moveType.moveType == MType.PHYSICAL) {
                // Random
                random = (rng.nextInt(15) + 85) / 100;
                // modifier
                if (activePlayerMon.type[0].type == storedPlayerAttack.type.type || activePlayerMon.type[1].type == storedPlayerAttack.type.type) {
                    stab = 1.50;
                } else {
                    stab = 1.00;
                }
                modifier = stab * random; // More should be added
                // Set damage
                damage = (int)((((2 + (2 * activePlayerMon.level / 5)) * storedPlayerAttack.power * (activePlayerMon.atk / activeFoeMon.def)) / 50 + 2) * modifier);
            } else if (storedPlayerAttack.moveType.moveType == MType.SPECIAL) {
                // Random
                random = (rng.nextInt(15) + 85) / 100;
                // modifier
                if (activePlayerMon.type[0].type == storedPlayerAttack.type.type || activePlayerMon.type[1].type == storedPlayerAttack.type.type) {
                    stab = 1.50;
                } else {
                    stab = 1.00;
                }
                modifier = stab * random; // More should be added
                // Set damage
                damage = (int)((((2 + (2 * activePlayerMon.level / 5)) * storedPlayerAttack.power * (activePlayerMon.specialAtk / activeFoeMon.specialDef)) / 50 + 2) * modifier);
            }
            // Use the effect of the move
            storedPlayerAttack.useEffect(activeFoeMon, rng);
        }
    }
    
    public void foeAttack(Moves storedFoeAttack) {
        if (rng.nextInt(100) < (storedFoeAttack.accuracy)) { // Accuracy Check (Prob will change.)
            if (storedFoeAttack.moveType.moveType == MType.PHYSICAL) {
                // Random
                random = (rng.nextInt(15) + 85) / 100;
                // modifier
                if (activeFoeMon.type[0].type == storedFoeAttack.type.type || activeFoeMon.type[1].type == storedFoeAttack.type.type) {
                    stab = 1.50;
                } else {
                    stab = 1.00;
                }
                modifier = stab * random; // More should be added
                // Set damage
                damage = (int)((((2 + (2 * activeFoeMon.level / 5)) * storedFoeAttack.power * (activeFoeMon.atk / activePlayerMon.def)) / 50 + 2) * modifier);
                // You still take the damage!!!!! We should animate this later with a different display HP variable.
                activePlayerMon.HP -= damage;
            } else if (storedFoeAttack.moveType.moveType == MType.SPECIAL) {
                // Random
                random = (rng.nextInt(15) + 85) / 100;
                // modifier
                if (activeFoeMon.type[0].type == storedFoeAttack.type.type || activeFoeMon.type[1].type == storedFoeAttack.type.type) {
                    stab = 1.50;
                } else {
                    stab = 1.00;
                }
                modifier = stab * random; // More should be added
                // Set damage
                damage = (int)((((2 + (2 * activeFoeMon.level / 5)) * storedFoeAttack.power * (activeFoeMon.specialAtk / activePlayerMon.specialDef)) / 50 + 2) * modifier);
                // You still take the damage!!!!! We should animate this later.
                activePlayerMon.HP -= damage;
            }
            // Use the effect of the move
            storedFoeAttack.useEffect(activeFoeMon, rng);
        }
    }
    
    public double typeEffectiveness() {
        
        return 1.00;
    }
    
    // Pokemon methods
    
    public void drawPokemon() {
        // Should animate deaths.
        if (activePlayerMon.HP > 0) {
            dc.drawImage(activePlayerMon.sprites[1], dc.getWidth() * 3 / 20, dc.getHeight() * 9 / 20);
        }
        if (activeFoeMon.HP > 0) {
            dc.drawImage(activeFoeMon.sprites[0], dc.getWidth() * 13 / 20, dc.getHeight() * 3 / 20);
        }
    }
    
    // Menu methods
    
    public void checkInputs() {
        if (this.menu.type == InterfaceType.MAIN_BATTLE_MENU) {
            // Four square based system. Cannot navigate past borders.
            // 0 1     Pressing down adds 2, pressing right adds 1,
            // 2 3     and the other way subtracts.
            if (this.currentMenuOption > 1 && dc.getKeyPress(38)) { // Up
                this.currentMenuOption -= 2;
            } else if (this.currentMenuOption < 2 && dc.getKeyPress(40)) { // Down
                this.currentMenuOption += 2;
            } else if (this.currentMenuOption % 2 == 1 && dc.getKeyPress(37)) { // Left
                this.currentMenuOption--;
            } else if (this.currentMenuOption % 2 == 0 && dc.getKeyPress(39)) { // Right
                this.currentMenuOption++;
            }
            // Selection key presses
            if (dc.getKeyPress(90)) { // Select option (z)
                switch (currentMenuOption) {
                    case 0: this.drawAttackMenu(); break;
                    case 1: this.loadPokemonMenu(); break;
                    case 2: this.loadBackpackMenu(); break;
                    case 3: this.flee(); break;
                }
            }
        } else if (this.menu.type == InterfaceType.BATTLE_MENU) {
            // Four square based system. Cannot navigate past borders or null squares.
            // 0 1     Pressing down adds 2, pressing right adds 1,
            // 2 3     and the other way subtracts.
            if (this.currentMenuOption > 1 && dc.getKeyPress(38) && activePlayerMon.getMove(currentMenuOption - 2) != null) { // Up
                this.currentMenuOption -= 2;
            } else if (this.currentMenuOption < 2 && dc.getKeyPress(40) && activePlayerMon.getMove(currentMenuOption + 2) != null) { // Down
                this.currentMenuOption += 2;
            } else if (this.currentMenuOption % 2 == 1 && dc.getKeyPress(37) && activePlayerMon.getMove(currentMenuOption - 1) != null) { // Left
                this.currentMenuOption--;
            } else if (this.currentMenuOption % 2 == 0 && dc.getKeyPress(39) && activePlayerMon.getMove(currentMenuOption + 1) != null) { // Right
                this.currentMenuOption++;
            }
            // Selection key presses
            if (dc.getKeyPress(88)) { // Back to main menu
                this.drawMainMenu();
            } else if (dc.getKeyPress(90)) { // Select move (z)

                this.generateFoeMove();

                this.storedPlayerAttack = activePlayerMon.getMove(currentMenuOption);
                this.startTurn();
            }
        } else {
            System.out.println("Did you really think that would work? Try a different menu!");
            System.out.println("Omiyowa mou shinderu.");
            dc.pause(3500);
            throw new IndexOutOfBoundsException("NANI?");
        }
    }
    
    public void drawMenu() {
        menu.drawMenu(activePlayerMon);
    }
    
    public void drawHealthBars() {
        healthBars[0].drawHealthBar(activeFoeMon);
        healthBars[1].drawHealthBar(activePlayerMon);
        
    }
    
    public void drawMainMenu() {
        menu.type = InterfaceType.MAIN_BATTLE_MENU;
    }
    
    public void drawAttackMenu() {
        menu.type = InterfaceType.BATTLE_MENU;
    }
    
    public void loadPokemonMenu() {
        menu.type = InterfaceType.POKEMON_MENU;
    }
    
    public void loadBackpackMenu() {
        menu.type = InterfaceType.BACKPACK_MENU;
    }
    
    public void flee() {
        // Do of the fleeing and run away.
    }
}
