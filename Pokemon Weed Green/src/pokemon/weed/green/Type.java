package pokemon.weed.green;

public class Type {
    PType type;
    
    public Type(PType type) {
        this.type = type;
    }
    
    public enum PType {
        FIRE, NORMAL, STEEL, DRAGON, FAIRY, ROCK, GROUND, ELECTRIC, FLYING, ICE, 
        WATER, BUG, POISON, DARK, GRASS, PSYCHIC, GHOST, FIGHTING, NULL
    }
}


