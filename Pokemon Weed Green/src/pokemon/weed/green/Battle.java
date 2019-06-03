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
    public void startTurn() {
        if (activePlayerMon.) {
            
        }
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
}
