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
public class Bridge extends Objects {
    
    public Bridge(int x, int y, DConsole dc) {
        super(x, y, false, dc);
        filename = "Objects/bridge.png";
    }

    @Override
    public void draw(int offX, int offY) {
        dc.drawImage(filename, (x - offX)+120 , (y - offY)-48 );
    }
    
}
