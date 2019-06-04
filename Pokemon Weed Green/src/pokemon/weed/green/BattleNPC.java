package pokemon.weed.green;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import pokemonList.Pokemon;

public class BattleNPC extends NPC {
    
    String text;
    
    
    Pokemon[] pokemon = new Pokemon[6];
    
    public BattleNPC(int x, int y, Direction direction, String text, Pokemon[] pokemon, String[] sprites) {
        this.position.x = x;
        this.position.y = y;
        this.direction = direction;
        this.text = text;
        this.pokemon = pokemon;
        this.sprites = sprites;
    }
    
}
