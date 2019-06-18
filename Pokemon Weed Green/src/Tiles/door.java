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
public class door extends Tiles {

    public door(int x, int y, DConsole dc, int sendX, int sendY) {
        super(x, y, false, dc, true, sendX, sendY);
    }
    
    @Override
    public void draw(int x, int y) {
        
    }

    @Override
    public void update(int i, int j) {
        
    }
    
}
