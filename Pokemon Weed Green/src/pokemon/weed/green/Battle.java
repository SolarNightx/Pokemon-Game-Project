package pokemon.weed.green;

import DLibX.DConsole;
import java.util.Random;
import pokemonList.Pokemon;

public class Battle {
    
    Pokemon[] playerMons;
    Pokemon[] foeMons;
    Pokemon activePlayerMon;
    Pokemon activeFoeMon;
    Menu menu;
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
        menu = new Menu(dc, InterfaceType.BATTLE_MENU);
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
    public void startTurn(Moves playerMove, Moves foeMove) {
        if (activePlayerMon.speed > activeFoeMon.speed && foeMove.priority <= playerMove.priority) {
            playerAttack(playerMove);
            foeAttack(foeMove);
        } else if (activeFoeMon.speed > activePlayerMon.speed && playerMove.priority <= foeMove.priority) {
            foeAttack(foeMove);
            playerAttack(playerMove);
        } else {
            if (rng.nextBoolean()) {
                playerAttack(playerMove);
                foeAttack(foeMove);
            } else {
                foeAttack(foeMove);
                playerAttack(playerMove);
            }
        }
    }
    
    /* Damage formula:
        Damage: (((2 + (2 * Level / 5)) * Power * (Attack / Defence)) / 50 + 2) * Modifier
	Modifier: #Targets * Weather * Badge * Crit * STAB * Type * Burn * Other * Random    
        Random: (rng.nextInt(15) + 85) / 100.00;
    */
    
    public void playerAttack(Moves playerMove) {
        if (rng.nextInt(100) < (playerMove.accuracy)) { // Accuracy Check (Prob will change.)
            if (playerMove.moveType == MoveType.PHYSICAL) {
                // Random
                random = (rng.nextInt(15) + 85) / 100;
                // modifier
                if (activePlayerMon.type[0].type == playerMove.type.type || activePlayerMon.type[1].type == playerMove.type.type) {
                    stab = 1.50;
                } else {
                    stab = 1.00;
                }
                modifier = stab * random; // More should be added
                // Set damage
                damage = (int)((((2 + (2 * activePlayerMon.level / 5)) * playerMove.power * (activePlayerMon.atk / activeFoeMon.def)) / 50 + 2) * modifier);
            } else if (playerMove.moveType == MoveType.SPECIAL) {
                // Random
                random = (rng.nextInt(15) + 85) / 100;
                // modifier
                if (activePlayerMon.type[0].type == playerMove.type.type || activePlayerMon.type[1].type == playerMove.type.type) {
                    stab = 1.50;
                } else {
                    stab = 1.00;
                }
                modifier = stab * random; // More should be added
                // Set damage
                damage = (int)((((2 + (2 * activePlayerMon.level / 5)) * playerMove.power * (activePlayerMon.specialAtk / activeFoeMon.specialDef)) / 50 + 2) * modifier);
            }
            // Use the effect of the move
            playerMove.useEffect(activeFoeMon, rng);
        }
    }
    
    public void foeAttack(Moves foeMove) {
        if (rng.nextInt(100) < (foeMove.accuracy)) { // Accuracy Check (Prob will change.)
            if (foeMove.moveType == MoveType.PHYSICAL) {
                // Random
                random = (rng.nextInt(15) + 85) / 100;
                // modifier
                if (activeFoeMon.type[0].type == foeMove.type.type || activeFoeMon.type[1].type == foeMove.type.type) {
                    stab = 1.50;
                } else {
                    stab = 1.00;
                }
                modifier = stab * random; // More should be added
                // Set damage
                damage = (int)((((2 + (2 * activeFoeMon.level / 5)) * foeMove.power * (activeFoeMon.atk / activePlayerMon.def)) / 50 + 2) * modifier);
                // You still take the damage!!!!! We should animate this later with a different display HP variable.
                activePlayerMon.HP -= damage;
            } else if (foeMove.moveType == MoveType.SPECIAL) {
                // Random
                random = (rng.nextInt(15) + 85) / 100;
                // modifier
                if (activeFoeMon.type[0].type == foeMove.type.type || activeFoeMon.type[1].type == foeMove.type.type) {
                    stab = 1.50;
                } else {
                    stab = 1.00;
                }
                modifier = stab * random; // More should be added
                // Set damage
                damage = (int)((((2 + (2 * activeFoeMon.level / 5)) * foeMove.power * (activeFoeMon.specialAtk / activePlayerMon.specialDef)) / 50 + 2) * modifier);
                // You still take the damage!!!!! We should animate this later.
                activePlayerMon.HP -= damage;
            }
            // Use the effect of the move
            foeMove.useEffect(activeFoeMon, rng);
        }
    }
    
    public double typeEffectiveness() {
        
        return 1.00;
    }
    
    // Pokemon methods
    public void drawPokemon() {
        // Should animate deaths.
        if (activePlayerMon.HP > 0) {
            dc.drawImage(activePlayerMon.sprites[0], dc.getWidth() * 3 / 10, dc.getHeight() * 7 / 10);
        }
        if (activeFoeMon.HP > 0) {
            dc.drawImage(activeFoeMon.sprites[1], dc.getWidth() * 7 / 10, dc.getHeight() * 3 / 10);
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
                //this.generateFoeAttack();
                this.storedPlayerAttack = activePlayerMon.getMove(currentMenuOption);
                
            }
        } else {
            System.out.println("Did you really think that would work? Try a different menu!");
            System.out.println("Omiyowa mou shinderu.");
            dc.pause(3500);
            throw new IndexOutOfBoundsException("NANI?");
        }
    }
    
    public void drawMenu() {
        menu.drawMenu();
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
    
    // Key presses
    public boolean getSpacePress() {
        return menu.dc.getKeyPress(32);
    }
    
    public boolean getLeftPress() {
        return menu.dc.getKeyPress(37);
    }
    
    public boolean getRightPress() {
        return menu.dc.getKeyPress(39);
    }
    
    public boolean getUpPress() {
        return menu.dc.getKeyPress(38);
    }
    
    public boolean getDownPress() {
        return menu.dc.getKeyPress(40);
    }
}
