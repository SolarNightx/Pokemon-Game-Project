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
public class Stairs extends Objects {
    
    public Stairs(int x, int y, DConsole dc) {
        super(x, y, false, dc);
        filename = "Objects/stairs.png";
    }

    @Override
    public void draw(int offX, int offY) {
        dc.drawImage(filename, (x - offX)+48, y - offY);
    }
    
}
