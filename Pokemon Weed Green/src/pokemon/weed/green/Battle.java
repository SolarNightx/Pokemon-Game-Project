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
    DConsole dc;
    int damage = 0;
    
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
    public void drawMainMenu() {
        menu.type = InterfaceType.BATTLE_MENU;
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
