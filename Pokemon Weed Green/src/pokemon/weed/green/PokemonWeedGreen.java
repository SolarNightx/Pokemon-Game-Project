package pokemon.weed.green;

import DLibX.DConsole;
import java.awt.Color;
import pokemonList.*;

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
        Pokemon[] pokemon1 = new Pokemon[6];
        Pokemon[] pokemon2 = new Pokemon[6];
        pokemon1[0] = new Empoleon("Empoleon", 36); // NOTE: It says that these are not Pokemon and casting doesn't work. Figure it out.
        pokemon1[1] = new Luxray("Luxray", 40);
        pokemon2[0] = new Bidoof("Bidoof", 12);
        
        Battle battle = new Battle(dc, pokemon1, pokemon2);

        while (true) { // Testing Area
            battle.drawPokemon();
            battle.drawMainMenu();
            dc.redraw();
            dc.pause(30);
            dc.clear();
        }

    }

}
