package pokemon.weed.green;

import DLibX.DConsole;
import java.awt.Color;
import java.awt.Point;
import java.util.HashSet;
import java.util.Set;
import pokemonList.Pokemon;

public class TextBox extends Interface {
    private boolean nightMode = false;
    private String[] text;
    
    public TextBox(DConsole dc, InterfaceType interfaceType, String[] text) {
        this.type = interfaceType; // Set variables
        this.dc = dc;
        this.text = text;
        if (this.type == InterfaceType.BATTLE_TEXT_BOX) {
            this.topLeft = new Point(0, this.consoleSize * 15 / 20);
            this.bottomRight = new Point(this.consoleSize * 6 / 10, this.consoleSize);
        } else if (this.type == InterfaceType.TEXT_BOX) {
            this.topLeft = new Point(this.consoleSize / 10, this.consoleSize * 15 / 20); // Temperary values
            this.bottomRight  = new Point(this.consoleSize * 9 / 10, this.consoleSize * 19 / 20); // Temporary values
        } else if (this.type == InterfaceType.HEALTH_BAR) {
            System.out.println("If you have not already, please manually give this coordinates.");
            this.topLeft = new Point();
            this.bottomRight = new Point();
        } else {
            System.out.println("You tried to make a textbox become a menu. Wanna know what I say to that? YEET that command outta here. You know what? Have an error.");
            throw new IndexOutOfBoundsException("There ya go!");
        }
    }
    
    public void drawTextBox(String[] text) {
        dc.setOrigin(DConsole.ORIGIN_TOP_LEFT); // Set origin
        // Check for night mode and set colour appropriately
        if (nightMode) { 
            dc.setPaint(textBoxNight);
        } else {
            dc.setPaint(textBoxWhite);
        }
        // Draw Box
        dc.fillRect(topLeft.x, topLeft.y, bottomRight.x - topLeft.x + 1, bottomRight.y - topLeft.y + 1); // Draw the inside of the textbox
        dc.setPaint(temporaryBorderColour);
        // Borders
        if (this.type == InterfaceType.BATTLE_TEXT_BOX) {
            for (int i = 0; i < borderSize; i++) {
                dc.drawRect(topLeft.x + i, topLeft.y - i, bottomRight.x - topLeft.x - i, bottomRight.y - topLeft.y + i);
            }
        } else if (this.type == InterfaceType.TEXT_BOX) {
            // Untested
            dc.drawRect(topLeft.x, topLeft.y, bottomRight.x - topLeft.x, bottomRight.y - topLeft.y);
            dc.fillRect(topLeft.x, (bottomRight.y - topLeft.y) * 19 / 20 + topLeft.y, bottomRight.x - topLeft.x, (bottomRight.y - topLeft.y) * 19 / 20); 
            dc.fillRect((bottomRight.x - topLeft.x) * 19 / 20 + topLeft.x, topLeft.y, (bottomRight.x - topLeft.x) * 19 / 20, bottomRight.y - topLeft.y);
        }
    }
    
    public void drawHealthBar(Pokemon mon) {
        
        if (this.type == InterfaceType.HEALTH_BAR) {
            dc.setOrigin(DConsole.ORIGIN_TOP_LEFT); // Set origin
            // Check for night mode and set colour appropriately
            if (nightMode) { 
                dc.setPaint(textBoxNight);
            } else {
                dc.setPaint(textBoxWhite);
            }
            // Draw Box
            dc.fillRect(topLeft.x, topLeft.y, bottomRight.x - topLeft.x + 1, bottomRight.y - topLeft.y + 1); // Draw the inside of the textbox
            dc.setPaint(temporaryBorderColour);
            // Border
            for (int i = 0; i < 2; i++) {
                dc.drawRect(topLeft.x + i, topLeft.y - i, bottomRight.x - topLeft.x - i, bottomRight.y - topLeft.y + i);
            }
            // Text and bar
            dc.setPaint(blackLikeOurSouls);
            dc.setFont(healthBarFont);
            dc.drawString("HP: " + mon.HP + " / " + mon.maxHP, topLeft.x + 10, topLeft.y + 10);
            dc.setPaint(healthBarGreen);
            
            
        } else {
            throw new IndexOutOfBoundsException("No! No! NO! NOOOOOOOOOO!");
        }
    }
    
    public void setNewCoordinates(Point newTopLeft, Point newBottomRight) {
        System.out.println(newTopLeft.getX());
        this.topLeft.setLocation(consoleSize * newTopLeft.getX() / 20, consoleSize * newTopLeft.getY() / 20);
        this.bottomRight.setLocation(consoleSize * newBottomRight.getX() / 20, consoleSize * newBottomRight.getY() / 20);
    }
}
