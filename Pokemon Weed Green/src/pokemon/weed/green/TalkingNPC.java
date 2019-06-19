package pokemon.weed.green;

public class TalkingNPC extends NPC {
    
    public TalkingNPC(int x, int y, Direction direction, String[] text, boolean moving, String[] sprites) {
        this.position.x = x;
        this.position.y = y;
        this.direction = direction;
        this.text = text;
        this.moving = moving;
        this.sprites = sprites;
    }
}
