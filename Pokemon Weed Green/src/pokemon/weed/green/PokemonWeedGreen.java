package pokemon.weed.green;

import DLibX.DConsole;
import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class PokemonWeedGreen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int consoleSize = 800; // Console Size
        
        DConsole dc = new DConsole(consoleSize, consoleSize);
        dc.setOrigin(DConsole.ORIGIN_CENTER);
        
        PrintStream output = null;

        Scanner fileReader = null;

        boolean open = true;

        try {
            fileReader = new Scanner(new File("World.txt"));
        } catch (Exception e) {
            System.out.println("Couldn't open that file");
            open = false;
        }

        int sizeX = 60;
        int sizeY = 40;
        int t = 0;

        if (open == true) {
            sizeX = fileReader.nextInt();
            sizeY = fileReader.nextInt();
        }

        Tile[][] worldTiles = new Tile[sizeX][sizeY];
        Objects[][] worldObjects = new Objects[sizeX][sizeY];
        NPC[][] worldNPCs = new NPC[sizeX][sizeY];

        if (open == true) {
            for (int i = 0; i < worldTiles.length; i++) {
                for (int j = 0; j < worldTiles[i].length; j++) {
                    t = fileReader.nextInt();
                }
            }
        
            for (int i = 0; i < worldObjects.length; i++) {
                for (int j = 0; j < worldObjects[i].length; j++) {
                    t = fileReader.nextInt();
                }
            }
        
            for (int i = 0; i < worldNPCs.length; i++) {
                for (int j = 0; j < worldNPCs[i].length; j++) {
                    t = fileReader.nextInt();
                    if (t == 0) {
                        worldNPCs[i][j] = null;
                    }
                }
            }
            
            Player player = new Player(fileReader.nextInt(), fileReader.nextInt());
        }
        
    }
    
}
