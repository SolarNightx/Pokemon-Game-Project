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
public class TallGrass extends Tiles {

    public TallGrass(int x, int y, DConsole dc) {
        super(x, y, false, dc);
        filename = "Tiles/thickgrass.png";
    }

    @Override
    public void update(int i, int j) {
        
    }
    
}
