package pokemon.weed.green;

import java.awt.Point;

public class Menu extends Interface {
    
    public Menu(InterfaceType interfaceType) {
        this.type = interfaceType; // Set variables
        if (this.type == InterfaceType.BATTLE_MENU) {
            this.topLeft = new Point(this.consoleSize * 6 / 10, this.consoleSize * 15 / 20);
            this.bottomRight = new Point(this.consoleSize * 6 / 10, this.consoleSize);
        }
    }
}
