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
public class House extends Objects {
    
    public House(int x, int y, DConsole dc) {
        super(x, y, true, dc);
        filename = "Objects/house-5.png";
    }

    @Override
    public void draw(int offX, int offY) {
        dc.drawImage(filename, (x - offX)+72 , (y - offY)-72 );
    }
    
}
