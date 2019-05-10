package pokemon.weed.green;

import DLibX.DConsole;
import java.awt.Point;

public abstract class Interface {
    Point topLeft;
    Point bottomRight;
    
    InterfaceType type;
    
    int consoleSize = 800;
}

enum InterfaceType {
    TEXT_BOX, TEXT_MENU, // NPC and cutscene text interfaces
    BATTLE_TEXT_BOX, BATTLE_MENU // Battle text interfaces
}
