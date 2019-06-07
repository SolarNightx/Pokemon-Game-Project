package pokemon.weed.green;

import java.util.Random;
import pokemonList.Pokemon;

public abstract class Moves {
    
    int power;
    int accuracy;
    int priority;
    MoveType moveType;
    int chanceOfStatus;
    public Type type;
    
    public void useEffect(Pokemon target, Random rng) {
        // Roll Number
        if (rng.nextInt() > chanceOfStatus) {
            // Do effect here.
        }
    }
    
}

enum MoveType {
    PHYSICAL, SPECIAL, STATUS
}