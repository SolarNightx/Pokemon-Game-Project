/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon.weed.green;

import DLibX.DConsole;

/**
 *
 * @author Darren H
 */
public class NPCs {

    int x;
    int y;
    boolean battle;
    
    String text;
    String filename;

    DConsole dc;
    
    public TextBox textbox;

    public NPCs(int x, int y, String text, DConsole dc, boolean battle) {
        this.x = x+24;
        this.y = y+24;
        this.dc = dc;
        this.text = text;
        this.battle = battle;
        filename = "NPCs/oldman-d.png";
        textbox = new TextBox(dc, InterfaceType.TEXT_BOX, new String[] {text});
    }

    public void draw(int offX, int offY) {
        dc.drawImage(filename, (x - offX)-24, (y - offY)-24);
    }
    
    public void drawTextBox() {
        textbox.drawTextBox();
    }
    
    public String getText() {
        return this.text;
    }
    
    public boolean getBattle() {
        return battle;
    }

}
