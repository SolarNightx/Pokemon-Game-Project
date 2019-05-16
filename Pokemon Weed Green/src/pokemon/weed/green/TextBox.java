package pokemon.weed.green;

import DLibX.DConsole;
import java.awt.Color;
import java.awt.Point;

public class TextBox extends Interface {
    private boolean nightMode = false;
    private String[] text;
    
    public TextBox(InterfaceType interfaceType) {
        this.type = interfaceType; // Set variables
        if (this.type == InterfaceType.BATTLE_TEXT_BOX) {
            this.topLeft = new Point(0, this.consoleSize * 15 / 20);
            this.bottomRight = new Point(this.consoleSize * 6 / 10, this.consoleSize);
        } else if (this.type == InterfaceType.TEXT_BOX) {
            this.topLeft = new Point(this.consoleSize / 10, this.consoleSize * 7 / 10); // Temperary values
            this.bottomRight  = new Point(this.consoleSize * 9 / 10, this.consoleSize * 9 / 10); // Temporary values
        }
    }
    
    public void drawTextBox(DConsole dc, String[] text) {
        dc.setOrigin(DConsole.ORIGIN_TOP_LEFT); // Set origin
        if (nightMode) { // Check for night mode and set colour appropriately
            dc.setPaint(textBoxNight);
        } else {
            dc.setPaint(textBoxWhite);
        }
        dc.fillRect(topLeft.x, topLeft.y, bottomRight.x - topLeft.x + 1, bottomRight.y - topLeft.y + 1); // Draw the inside of the textbox
        dc.setPaint(temporaryBorderColour);
        if (this.type == InterfaceType.BATTLE_TEXT_BOX) {
            for (int i = 0; i < borderSize; i++) {
                dc.drawRect(topLeft.x + i, topLeft.y - i, bottomRight.x - topLeft.x - i, bottomRight.y - topLeft.y + i);
            }
        } else if (this.type == InterfaceType.TEXT_BOX) {
            
        }
    }
}
