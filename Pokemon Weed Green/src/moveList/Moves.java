package moveList;

import java.util.Random;
import pokemon.weed.green.MoveType;
import pokemon.weed.green.Type;
import pokemonList.Pokemon;

public abstract class Moves {
    
    public int power;
    public int accuracy;
    public int priority;
    public MoveType moveType;
    public int chanceOfStatus;
    public Type type;
    public String name;
    
    public void useEffect(Pokemon target, Random rng) {
        // Roll Number
        if (rng.nextInt(100) + 1 < chanceOfStatus) {
            // Do effect here.
        }
    }
    
}
