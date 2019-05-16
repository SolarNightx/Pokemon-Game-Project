package pokemon.weed.green;

import pokemonList.Pokemon;

public class BattleNPC extends NPC {
    
    String text;
    
    Pokemon[] pokemon = new Pokemon[6];
    
    public BattleNPC(int x, int y, int direction, String text, Pokemon[] pokemon) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.text = text;
        this.pokemon = pokemon;
    }
    
    
}
