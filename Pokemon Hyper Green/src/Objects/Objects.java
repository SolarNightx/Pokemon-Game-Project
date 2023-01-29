/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import DLibX.DConsole;

/**
 *
 * @author Darren H
 */
public abstract class Objects {
    
    int x;
    int y;
    boolean collide;
    
    String filename;
    
    Objects[][] objects;

    DConsole dc;
    
    public Objects(int x, int y, boolean collide, DConsole dc) {
        this.x = x+24;
        this.y = y+24;
        this.collide = collide;
        this.dc = dc;
    }
    
    //public void draw(int offX, int offY) {
    //    dc.drawImage(filename, x - offX, y - offY);
    //}
    
    public abstract void draw(int offX, int offY);
    
    public void newFile(String filename) {
        this.filename = filename;
    }
    
}
