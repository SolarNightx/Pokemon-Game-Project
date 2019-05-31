package pokemon.weed.green;

import pokemonList.Pokemon;

public class Battle {
    
    Pokemon[] playerMons;
    Pokemon[] foeMons;
    Menu menu = new Menu(InterfaceType.BATTLE_MENU);
    
    public Battle(Pokemon[] playerMons, Pokemon[] foeMons) {
        this.playerMons = playerMons;
        this.foeMons = foeMons;
    }
    
    public void drawMainMenu() {
        
    }
    
    public void drawAttackMenu() {
        
    }
    
    public void loadPokemonMenu() {
        
    }
    
    public void loadBackpackMenu() {
        
    }
}
