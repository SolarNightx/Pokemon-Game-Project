package pokemon.weed.green;

import java.awt.Image;
import java.awt.Point;
import java.util.Random;

public abstract class NPC {
    Random rng = new Random();
    
    Point position;
    Point topLeftBounds;
    Point bottomRightBounds;
    int direction = 0;
    boolean moving;
    
    String text;
    
    TextBox textBox = new TextBox(InterfaceType.TEXT_BOX);
    Image sprite;
    
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
                } else if (this.position.y != grid[0].length && this.position.y != this.bottomRightBounds.y) { // South
                    targetTile = grid[this.position.x][this.position.y + 1];
                }
            } else { // West - East
                if (rng.nextBoolean() && this.position.x != 0 && this.position.x != this.topLeftBounds.x) { // West
                    targetTile = grid[this.position.x - 1][this.position.y];
                } else if (this.position.x != grid.length && this.position.x != this.bottomRightBounds.x) { // East
                    targetTile = grid[this.position.x + 1][this.position.y];
                }
            }
            
            // Check target tile for players
            // Set target to self in that cases.
            if (targetTile == grid[targetTile.player.x][targetTile.player.y]) {
                targetTile = grid[this.position.x][this.position.y];
            }
        }
    }
}
