package pokemon.weed.green;

public class MoveType {

    public MType moveType;

    public MoveType(MType type) {
        moveType = type;
    }

    public enum MType {
        PHYSICAL, SPECIAL, STATUS
    }
}
