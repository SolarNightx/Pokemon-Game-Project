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
    int damage = 0;
    
    public Battle(DConsole dc, Pokemon[] playerMons, Pokemon[] foeMons) {
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
    
    public void playerAttack(Moves playerMove) {
        if (rng.nextInt(100) < (playerMove.accuracy)) { // Accuracy Check (Prob will change.)
            if (playerMove.moveType == MoveType.PHYSICAL || playerMove.moveType == MoveType.SPECIAL) {
                // Do damage
            }
            // Do effect (even if status move)
        }
    }
    
    public void foeAttack(Moves foeMove) {
        
    }
    
    // Menu methods
    public void drawMainMenu() {
        
    }
    
    public void drawAttackMenu() {
        
    }
    
    public void loadPokemonMenu() {
        
    }
    
    public void loadBackpackMenu() {
        
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
