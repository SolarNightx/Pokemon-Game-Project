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
public abstract class Tile {
    
    int x;
    int y;
    boolean collide;
    boolean door;
    int sendX;
    int sendY;
    
    Player player;
    DConsole dc;
    
    public Tile(int x, int y, boolean collide, Player player, DConsole dc) {
        this(x, y, collide, player, dc, false, 0, 0);

    }
    
    public Tile(int x, int y, boolean collide, Player player, DConsole dc, boolean door, int sendX, int sendY) {
        this.x = x;
        this.y = y;
        this.collide = collide;
        this.player = player;
        this.dc = dc;
        this.door = door;
        this.sendX = sendX;
        this.sendY = sendY;
    }
    
    public boolean getDoor() {
        return this.door;
    }
    
}
