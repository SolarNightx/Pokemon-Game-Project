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
    
    Tiles[][] tiles;

    DConsole dc;
    
    public Tiles(int x, int y, boolean collide, DConsole dc) {
        this.x = x+24;
        this.y = y+24;
        this.collide = collide;
        this.dc = dc;
    }
    
    public boolean getCollide() {
        return this.collide;
    }
    
    public void draw(int offX, int offY) {
        if ((x - offX) > -48 && (x - offX) < 900 && (y - offY) > -48 && (y - offY) < 900) {
            dc.drawImage(filename, x - offX, y - offY);
        }
    }
    
    public void newFile(String filename) {
        this.filename = filename;
    }
    
    public abstract void update(int i, int j); // makes diffrent shape of tile based on surroundings
    
}
