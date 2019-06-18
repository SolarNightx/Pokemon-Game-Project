package pokemon.weed.green;

import DLibX.DConsole;
import java.awt.Point;
import pokemonList.Pokemon;

public class Menu extends Interface {
    boolean nightMode = false;
    
    public Menu(DConsole dc, InterfaceType interfaceType) {
        this.dc = dc;
        this.type = interfaceType; // Set variables
        if (this.type == InterfaceType.MAIN_BATTLE_MENU) {
            this.topLeft = new Point(0, this.consoleSize * 15 / 20);
            this.bottomRight = new Point(this.consoleSize, this.consoleSize);
        } else if (this.type == InterfaceType.BATTLE_MENU) {
            this.topLeft = new Point(0, this.consoleSize * 15 / 20);
            this.bottomRight = new Point(this.consoleSize, this.consoleSize);
        } else if (this.type == InterfaceType.TEXT_MENU) {
            this.topLeft = new Point(this.consoleSize * 15 / 20, this.consoleSize * 12 / 20);
            this.bottomRight = new Point(this.consoleSize * 9 / 10, this.consoleSize * 14 / 20);
        } else if (this.type == InterfaceType.BACKPACK_MENU) {
            
        } else if (this.type == InterfaceType.POKEMON_MENU) {
            
        } else {
            System.out.println("You tried to make a menu become a textbox... What are you doing? Please. Stop. Now.");
            throw new IndexOutOfBoundsException("You've forced my hand...");
        }
    }
    
    public void drawMenu() {
        dc.setOrigin(DConsole.ORIGIN_TOP_LEFT); // Set origin
        if (nightMode) { // Check for night mode and set colour appropriately
            dc.setPaint(textBoxNight);
        } else {
            dc.setPaint(textBoxWhite);
        }
        // Draw the box
        dc.fillRect(topLeft.x, topLeft.y, bottomRight.x - topLeft.x + 1, bottomRight.y - topLeft.y + 1); // Draw the inside of the textbox
        dc.fillRect(0, 0, borderSize, borderSize);
        // Do borders
        dc.setPaint(temporaryBorderColour);
        if (this.type == InterfaceType.BATTLE_MENU || this.type == InterfaceType.MAIN_BATTLE_MENU) {
            // Left borders
            this.topLeft = new Point(0, this.consoleSize * 15 / 20); // Setting size for borders
            this.bottomRight = new Point(this.consoleSize * 6 / 10, this.consoleSize);
            for (int i = 0; i < borderSize; i++) {
                dc.drawRect(topLeft.x + i, topLeft.y - i, bottomRight.x - topLeft.x - i, bottomRight.y - topLeft.y + i);
            }
            // Rights borders
            this.topLeft = new Point(this.consoleSize * 6 / 10 - 10, this.consoleSize * 15 / 20);
            this.bottomRight = new Point(this.consoleSize, this.consoleSize);
            for (int i = 0; i < borderSize; i++) {
                dc.drawRect(topLeft.x + i, topLeft.y - i, bottomRight.x - topLeft.x - i, bottomRight.y - topLeft.y + i);
            }
            // Reset size
            this.topLeft = new Point(0, this.consoleSize * 15 / 20);
            this.bottomRight = new Point(this.consoleSize, this.consoleSize);
            // Depending on which menu, put text places
            if (this.type == InterfaceType.MAIN_BATTLE_MENU) {
                // Fight, Bag, Pokemon, and Flee
                
            } else if (this.type == InterfaceType.BATTLE_MENU) {
                // Four moves... Unused move slots should be a null, and there should be a blank case for that.
                
            }
            
        } else if (this.type == InterfaceType.TEXT_MENU) {
            // Height ^ 4 = (1 / Length(maybe))x ^ 4 + y ^ 4? (Not used)
            
            
        }
    }
}
