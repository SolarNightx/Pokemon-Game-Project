package pokemon.weed.green;

import DLibX.DConsole;
import java.awt.Image;
import java.awt.Point;
import java.util.Random;

public abstract class NPC {
    Random rng = new Random();
    DConsole dc;
    
    boolean moving;
    int randomCounter = 0;
    
    Point position;
    Point oldPosition;
    Point topLeftBounds;
    Point bottomRightBounds;
    Direction direction;
    
    String[] text;
    
    TextBox textBox = new TextBox(dc, InterfaceType.TEXT_BOX, text);
    String[] sprites;
    
    public void drawSprite(DConsole dc) {
        
    }
    
    public void startConversation() {
        
    }
    
    // Untested
    public void randomMovement(Tile[][] grid) {
        Tile targetTile = null;
        while (targetTile == null || targetTile.collide || !targetTile.door) {
            // Select random tile
            if (rng.nextBoolean()) { // North - South
                if (rng.nextBoolean() && this.position.y != 0 && this.position.y != this.topLeftBounds.y) { // North
                    targetTile = grid[this.position.x][this.position.y - 1];
                    this.direction = Direction.NORTH;
                } else if (this.position.y != grid[0].length && this.position.y != this.bottomRightBounds.y) { // South
                    targetTile = grid[this.position.x][this.position.y + 1];
                    this.direction = Direction.SOUTH;
                }
            } else { // West - East
                if (rng.nextBoolean() && this.position.x != 0 && this.position.x != this.topLeftBounds.x) { // West
                    targetTile = grid[this.position.x - 1][this.position.y];
                    this.direction = Direction.WEST;
                } else if (this.position.x != grid.length && this.position.x != this.bottomRightBounds.x) { // East
                    targetTile = grid[this.position.x + 1][this.position.y];
                    this.direction = Direction.WEST;
                }
            }
            
            // Check target tile for players
            // Set target to self in that cases.
            if (targetTile == grid[targetTile.player.x][targetTile.player.y]) {
                targetTile = grid[this.position.x][this.position.y];
            }
        }
    }
    
    public void randomTurn() {
        
    }
    
    public enum Direction {
        NORTH, EAST, SOUTH, WEST
    }
}
