package pokemon.weed.green;

import DLibX.DConsole;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Point;

public abstract class Interface {
    Point topLeft;
    Point bottomRight;
    DConsole dc;
    
    InterfaceType type;
    
    int consoleSize = 800;
    static int borderSize = 10;
    
    // Colours
    public static Color textBoxWhite = new Color(180, 180, 250);
    public static Color textBoxNight = new Color(0, 0, 30);
    public static Color temporaryBorderColour = new Color(150, 150, 200);
    public static Color healthBarGreen = new Color(150, 250, 200);
    public static Color blackText = new Color(0, 0, 1);
    
    // Fonts
    public static Font menuFont = new Font("Comic Sans", Font.PLAIN, 20);
    public static Font healthBarFont = new Font("Comic Sans", Font.BOLD, 12);
    public static Font textFont = new Font("Comic Sans", Font.ITALIC, 22);
}

enum InterfaceType {
    TEXT_BOX, TEXT_MENU, // NPC and cutscene text interfaces
    MAIN_BATTLE_MENU, BATTLE_TEXT_BOX, BATTLE_MENU, HEALTH_BAR, // Battle text interfaces
    BACKPACK_MENU, POKEMON_MENU, BOX_MENU // Other interfaces
}
