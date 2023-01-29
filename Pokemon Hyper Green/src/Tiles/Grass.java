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
    
    public Grass(int x, int y, DConsole dc, Tiles[][] tiles) {
        super(x, y, false, dc);
        this.tiles = tiles;
        filename = "Tiles/grass.png";
    }
    
    @Override
    public void update(int i, int j) {
        
    }
    
}
