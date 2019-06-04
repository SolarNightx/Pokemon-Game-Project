package pokemon.weed.green;

import pokemonList.Pokemon;

public class Battle {
    
    Pokemon[] playerMons;
    Pokemon[] foeMons;
    Pokemon activePlayerMon;
    Pokemon activeFoeMon;
    Menu menu = new Menu(InterfaceType.BATTLE_MENU);
    
    public Battle(Pokemon[] playerMons, Pokemon[] foeMons) {
        this.playerMons = playerMons;
        this.foeMons = foeMons;
        activePlayerMon = playerMons[0];
        activeFoeMon = foeMons[0];
    }
    
    // Battle methods
    public void startTurn(Moves playerMove, Moves foeMove) {
        if (activePlayerMon.speed > activeFoeMon.speed && foeMove.priority <= playerMove.priority) {
            playerAttack(playerMove);
            foeAttack();
        } else {
            
        }
    }
    
    public void playerAttack(Moves playerMove) {
        
    }
    
    public void foeAttack(Moves foeMove) {
        
    }
    
    // Menu methods
    public void drawMainMenu() {
        
    }
    
    public void drawAttackMenu() {
        
    }
    
    public boolean isSpacePressed() {
        return false;
    }
    
    public void loadPokemonMenu() {
        
    }
    
    public void loadBackpackMenu() {
        
    }
}
