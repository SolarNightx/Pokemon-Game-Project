package pokemon.weed.green;

import DLibX.DConsole;
import java.awt.Color;
import pokemonList.*;
import moveList.*;

public class PokemonWeedGreen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int consoleSize = 800; // Console Size

        DConsole dc = new DConsole(consoleSize, consoleSize);
        dc.setOrigin(DConsole.ORIGIN_CENTER);
        dc.setResizable(true);
        
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
        
        pokemon1[0] = new Empoleon("Empoleon", 36);
        pokemon1[0].setMove(0, new Surf());
        pokemon1[0].setMove(1, new flashCannon());
        pokemon1[0].setMove(2, new Tackle());
        pokemon1[0].setMove(3, new quickAattack());
        
        pokemon1[1] = new Luxray("Luxray", 40);
        pokemon1[1].setMove(0, new thunderFang());
        pokemon1[1].setMove(1, new quickAattack());
        
        pokemon2[0] = new Bidoof("Bidoof", 100);
        pokemon2[0].setMove(0, new Tackle());
        pokemon2[0].setMove(1, new baiLol());
        pokemon2[0].setMove(2, new quickAattack());
        
        Battle battle = new Battle(dc, pokemon1, pokemon2);
        battle.drawMainMenu();
        
        while (true) { // Testing Area
            battle.drawPokemon();
            battle.drawMenu();
            battle.drawHealthBars();
            battle.checkInputs();
            dc.redraw();
            dc.pause(30);
            dc.clear();
        }

    }

}
