package pokemon.weed.green;

import DLibX.DConsole;
import java.awt.Point;

public class TextBox extends Interface {
    private static int screenSize = 800;
    
    public TextBox(InterfaceType interfaceType) {
        this.type = interfaceType;
        this.topLeft = new Point(screenSize / 10, screenSize / 10); // Temperary values
        this.bottomRight  = new Point(screenSize * 9 / 10, screenSize * 9 / 10); // Temporary values
    }
    
    public void drawTextBox(DConsole dc) {
        
    }
}
