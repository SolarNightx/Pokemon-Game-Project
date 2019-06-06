package pokemon.weed.green;

import DLibX.DConsole;
import java.awt.Point;

public class Menu extends Interface {
    boolean nightMode = false;
    
    public Menu(DConsole dc, InterfaceType interfaceType) {
        this.dc = dc;
        this.type = interfaceType; // Set variables
        if (this.type == InterfaceType.BATTLE_MENU) {
            this.topLeft = new Point(this.consoleSize * 6 / 10 - 10, this.consoleSize * 15 / 20);
            this.bottomRight = new Point(this.consoleSize, this.consoleSize);
        } else if (this.type == InterfaceType.TEXT_MENU) {
            this.topLeft = new Point(this.consoleSize * 15 / 20, this.consoleSize * 12 / 20);
            this.bottomRight = new Point(this.consoleSize * 9 / 10, this.consoleSize * 14 / 20);
        } else if (this.type == InterfaceType.BACKPACK_MENU) {
            
        } else if (this.type == InterfaceType.POKEMON_MENU) {
            
        } else {
            System.out.println("You tried to make a menu become a textbox... What are you doing? Please. Stop. Now.");
        }
    }
    
    public void drawMenu() {
        dc.setOrigin(DConsole.ORIGIN_TOP_LEFT); // Set origin
        if (nightMode) { // Check for night mode and set colour appropriately
            dc.setPaint(textBoxNight);
        } else {
            dc.setPaint(textBoxWhite);
        }
        dc.fillRect(topLeft.x, topLeft.y, bottomRight.x - topLeft.x + 1, bottomRight.y - topLeft.y + 1); // Draw the inside of the textbox
        dc.setPaint(temporaryBorderColour);
        if (this.type == InterfaceType.BATTLE_MENU) {
            for (int i = 0; i < borderSize; i++) {
                dc.drawRect(topLeft.x + i, topLeft.y - i, bottomRight.x - topLeft.x - i, bottomRight.y - topLeft.y + i);
            }
        } else if (this.type == InterfaceType.TEXT_MENU) {
            // Height ^ 4 = (1 / Length(maybe))x ^ 4 + y ^ 4? (Not used)
            
            
        }
    }
}
