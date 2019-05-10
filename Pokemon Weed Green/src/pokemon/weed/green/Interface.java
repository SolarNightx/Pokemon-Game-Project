package pokemon.weed.green;

import DLibX.DConsole;
import java.awt.Point;

public abstract class Interface {
    private DConsole dc;
    
    Point topLeft;
    Point bottomRight;
    
    InterfaceType type;
}

enum InterfaceType {
    TEXT_BOX, BATTLE_TEXT_BOX
}
