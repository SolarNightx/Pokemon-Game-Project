/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tiles;

import DLibX.DConsole;

/**
 *
 * @author Darren H
 */
public abstract class Tiles {
    
    int x;
    int y;
    boolean collide;
    boolean door;
    int sendX;
    int sendY;
    String filename;

    DConsole dc;
    
    public Tiles(int x, int y, boolean collide, DConsole dc) { 
        this(x, y, collide, dc, false, 0, 0);
    }
    
    public Tiles(int x, int y, boolean collide, DConsole dc, boolean door, int sendX, int sendY) {
        this.x = x;
        this.y = y;
        this.collide = collide;
        this.dc = dc;
        this.door = door;
        this.sendX = sendX;
        this.sendY = sendY;
    }
    
    public boolean getDoor() {
        return this.door;
    }
    
    public void draw(int offX, int offY) {
        dc.drawImage(filename, x - offX, y - offY);
    }
}
