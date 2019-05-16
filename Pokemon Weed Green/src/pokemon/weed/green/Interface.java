package pokemon.weed.green;

import DLibX.DConsole;
import java.awt.Color;
import java.awt.Point;

public abstract class Interface {
    Point topLeft;
    Point bottomRight;
    
    InterfaceType type;
    
    int consoleSize = 800;
    static int borderSize = 10;
    
    // Colours
    public static Color textBoxWhite = new Color(180, 180, 250);
    public static Color textBoxNight = new Color(0, 0, 30);
    public static Color temporaryBorderColour = new Color(150, 150, 200);
}

enum InterfaceType {
    TEXT_BOX, TEXT_MENU, // NPC and cutscene text interfaces
    BATTLE_TEXT_BOX, BATTLE_MENU // Battle text interfaces
}