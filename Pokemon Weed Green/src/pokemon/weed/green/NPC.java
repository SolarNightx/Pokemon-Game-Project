package pokemon.weed.green;

import java.awt.Image;

public abstract class NPC {
    
    int x = 0;
    int y = 0;
    int direction = 0;
    
    String text;
    
    TextBox textBox = new TextBox(InterfaceType.TEXT_BOX);
    Image sprite;
    
    public void startConversation() {
        
    }
}
