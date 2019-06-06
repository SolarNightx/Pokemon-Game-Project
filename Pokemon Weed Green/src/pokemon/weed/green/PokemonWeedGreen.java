package pokemon.weed.green;

import DLibX.DConsole;
import java.awt.Color;

public class PokemonWeedGreen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int consoleSize = 800; // Console Size

        DConsole dc = new DConsole(consoleSize, consoleSize);
        dc.setOrigin(DConsole.ORIGIN_CENTER);
        
        Decode decode = new Decode("World.txt");

        Tile[][] worldTiles = new Tile[decode.getX()][decode.getY()];
        Objects[][] worldObjects = new Objects[decode.getX()][decode.getY()];
        NPC[][] worldNPCs = new NPC[decode.getX()][decode.getY()];

        if (decode.getOpen() == true) {
            
            int[][] preTiles = decode.fromFile();
            int[][] preObjects = decode.fromFile();
            int[][] preNPCs = decode.fromFile();

            Player player = new Player(decode.singleVal(), decode.singleVal());

        }

        dc.setOrigin(DConsole.ORIGIN_TOP_LEFT);
        TextBox testBox = new TextBox(InterfaceType.TEXT_BOX);
        Menu testMenu = new Menu(InterfaceType.TEXT_MENU);

        while (true) { // Interfaces Testing
            dc.setPaint(new Color(255, 255, 255));
            dc.fillRect(0, 0, consoleSize, consoleSize);
            testBox.drawTextBox(dc, new String[1]);
            testMenu.drawMenu(dc);
            dc.redraw();
            dc.clear();
        }

    }

}
