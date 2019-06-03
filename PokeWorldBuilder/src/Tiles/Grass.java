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
public class Grass extends Tiles {
    
    public Grass(int x, int y, boolean collide, DConsole dc) {
        super(x, y, collide, dc);
        filename = "Tiles/grass.png";
    }
    
}
