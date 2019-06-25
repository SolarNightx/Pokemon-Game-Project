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
public class collide extends Tiles {

    public collide(int x, int y, DConsole dc) {
        super(x, y, true, dc);
        filename="Tiles/river-c.png";
    }

    @Override
    public void update(int i, int j) {
        
    }
    
}
