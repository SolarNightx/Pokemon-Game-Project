package pokemon.weed.green;

import Objects.*;
import Tiles.*;
import DLibX.DConsole;
import pokemonList.*;
import moveList.*;

public class PokemonWeedGreen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int consoleSize = 800; // Console Size
        final int size =  48;

        DConsole dc = new DConsole(consoleSize, consoleSize);
        dc.setOrigin(DConsole.ORIGIN_CENTER);
        dc.setResizable(true);
        
        int playerX = 0;
        int playerY = 0;
        int x = 240;
        int y = 240;
        int goalX = 240;
        int goalY = 240;
        int playerI = (400+x)/size;
        int playerJ = (400+y)/size;
        
        char direction = 'd';

        Decode decode = new Decode("World.txt");

        Tiles[][] worldTiles = new Tiles[decode.getX()][decode.getY()];
        Objects[][] worldObjects = new Objects[decode.getX()][decode.getY()];
        NPCs[][] worldNPCs = new NPCs[decode.getX()][decode.getY()];

        int[][] tiles = new int[decode.getX()][decode.getY()];
        int[][] objects = new int[decode.getX()][decode.getY()];
        int[][] npcs = new int[decode.getX()][decode.getY()];

        if (decode.getOpen() == true) {

            int[][] preTiles = decode.fromFile();
            int[][] preObjects = decode.fromFile();
            int[][] preNPCs = decode.fromFile();

            for (int i = 0; i < preTiles.length; i++) {
                for (int j = 0; j < preTiles[i].length; j++) {
                    switch (preTiles[i][j]) {
                        case 0:
                            worldTiles[i][j] = null;
                            break;
                        case 1:
                            worldTiles[i][j] = new Grass(i * size, j * size, dc, worldTiles);
                            break;
                        case 2:
                            worldTiles[i][j] = new Dirt(i * size, j * size, dc, worldTiles);
                            break;
                        case 3:
                            worldTiles[i][j] = new Sand(i * size, j * size, dc, worldTiles);
                            break;
                        case 4:
                            worldTiles[i][j] = new Road(i * size, j * size, dc, worldTiles);
                            break;
                        case 5:
                            worldTiles[i][j] = new River(i * size, j * size, dc, worldTiles);
                            break;
                        case 6:
                            worldTiles[i][j] = new Hill(i * size, j * size, dc, worldTiles);
                            break;
                        case 7:
                            worldTiles[i][j] = new TallGrass(i * size, j * size, dc);
                            break;
                        case 8:
                            worldTiles[i][j] = new door(i * size, j * size, dc, 1, 1);
                            break;
                        default:
                            break;
                    }
                }
            }

            for (int i = 0; i < preObjects.length; i++) {
                for (int j = 0; j < preObjects[i].length; j++) {
                    switch (preObjects[i][j]) {
                        case 0:
                            worldObjects[i][j] = null;
                            break;
                        case 1:
                            worldObjects[i][j] = new Rock(i * size, j * size, dc);
                            break;
                        case 2:
                            worldObjects[i][j] = new Tree(i * size, j * size, dc);
                            break;
                        case 3:
                            worldObjects[i][j] = new Stairs(i * size, j * size, dc);
                            break;
                        case 4:
                            worldObjects[i][j] = new Bridge(i * size, j * size, dc);
                            break;
                        case 5:
                            worldObjects[i][j] = new House(i * size, j * size, dc);
                            break;
                        case 6:
                            worldObjects[i][j] = new Pokecenter(i * size, j * size, dc);
                            break;
                        default:
                            break;
                    }
                }
            }

            for (int i = 0; i < worldTiles.length; i++) {
                for (int j = 0; j < worldTiles[i].length; j++) {
                    if (worldTiles[i][j] != null) {
                        worldTiles[i][j].update(i, j);
                    }
                }
            }

            x = (decode.getX() * size) / 2;
            y = (decode.getY() * size) / 2;
            goalX = (decode.getX() * size) / 2;
            goalY = (decode.getY() * size) / 2;

            playerX = decode.singleVal();
            playerY = decode.singleVal();

            for (int i = 0; i < preNPCs.length; i++) {
                for (int j = 0; j < preNPCs[i].length; j++) {
                    switch (preNPCs[i][j]) {
                        case 0:
                            worldNPCs[i][j] = null;
                            break;
                        case 1:
                            System.out.println(decode.singleString());
                            worldNPCs[i][j] = new NPCs(i * size, j * size, decode.singleString(), dc, decode.singleBoolean());
                            break;
                    }
                }
            }

        } else {

            for (int i = 0; i < worldTiles.length; i++) {
                for (int j = 0; j < worldTiles[i].length; j++) {
                    worldTiles[i][j] = new Grass(i * size, j * size, dc, worldTiles);
                }
            }

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
<<<<<<< HEAD
            battle.drawPokemon();
            battle.drawMenu();
            battle.drawHealthBars();
            battle.checkInputs();
=======
            
            playerI = (400+x)/size;
            playerJ = (448+y)/size;
            System.out.println(playerI);
            System.out.println(playerJ);
            
            if (goalX > x) {
                x += size/3;
            } else if (goalX < x) {
                x -= size/3;
            } else if (goalY > y) {
                y += size/3;
            } else if (goalY < y) {
                y -= size/3;
            }
            
            if (dc.isKeyPressed(38) && goalX == x && goalY == y && worldTiles[playerI][playerJ-1].getCollide() == false) { // up
                System.out.println('u');
                goalY -= size;
                direction = 'u';
            } else if (dc.isKeyPressed(40) && goalX == x && goalY == y && worldTiles[playerI][playerJ+1].getCollide() == false) { // down
                System.out.println('d');
                goalY += size;
                direction = 'd';
            }

            if (dc.isKeyPressed(39) && goalX == x && goalY == y && worldTiles[playerI+1][playerJ].getCollide() == false) { // right
                System.out.println('r');
                goalX += size;
                direction = 'r';
            } else if (dc.isKeyPressed(37) && goalX == x && goalY == y && worldTiles[playerI-1][playerJ].getCollide() == false) { // left
                System.out.println('l');
                goalX -= size;
                direction = 'l';
            }
            
            //------------------- Drawing -----------------------
            
            dc.clear();
            dc.setOrigin(DConsole.ORIGIN_CENTER);
            for (int i = 0; i < worldTiles.length; i++) {
                for (int j = 0; j < worldTiles[i].length; j++) {
                    if (worldTiles[i][j] != null) {
                        worldTiles[i][j].draw(x, y);
                        if (worldTiles[i][j].getCollide() == true) {
                            dc.fillRect((i*size) - x, (j*size) - y, size, size);
                        System.out.println("i : " + i);
                        System.out.println("j : " + j);
                    }
                    }
                }
            }
            for (int i = 0; i < worldObjects.length; i++) {
                for (int j = 0; j < worldObjects[i].length; j++) {
                    if (worldObjects[i][j] != null) {
                        worldObjects[i][j].draw(x, y);
                    }
                }
            }
            for (int i = 0; i < worldNPCs.length; i++) {
                for (int j = 0; j < worldNPCs[i].length; j++) {
                    if (worldNPCs[i][j] != null) {
                        worldNPCs[i][j].draw(x, y);
                    }
                }
            }
            switch (direction) {
                case 'd':
                    dc.drawImage("NPCs/player-d.png", 400, 400+12);
                    break;
                case 'u':
                    dc.drawImage("NPCs/player-u.png", 400, 400+12);
                    break;
                case 'l':
                    dc.drawImage("NPCs/player-l.png", 400, 400+12);
                    break;
                case 'r':
                    dc.drawImage("NPCs/player-r.png", 400, 400+12);
                    break;
            }
            
            //battle.drawPokemon();
            //battle.drawMenu();
            
>>>>>>> 52735dc40f193adb7b52568b63704f3c3cbff456
            dc.redraw();
            dc.pause(30);
            
            
            
        }

    }

}
