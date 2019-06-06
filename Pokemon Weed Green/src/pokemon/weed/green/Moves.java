package pokemon.weed.green;

import java.util.Random;
import pokemonList.Pokemon;

public abstract class Moves {
    
    int power;
    int accuracy;
    MoveType moveType;
    int chanceOfStatus;
    PType type;
    
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

enum PType {
    FIRE, NORMAL, STEEL, DRAGON, FAIRY, ROCK, GROUND, ELECTRIC, FLYING, ICE, 
    WATER, BUG, POISON, DARK, GRASS, PSYCHIC, GHOST, FIGHTING, NULL
}