package pokeworldbuilder;

import DLibX.DConsole;
import Tiles.*;
import Objects.*;

public class PokeWorldBuilder {

    public static void main(String[] args) {
        DConsole dc = new DConsole();
        dc.setOrigin(DConsole.ORIGIN_CENTER);

        int sizeX = 48;
        int sizeY = 48;

        int x = 240 * sizeX;
        int y = 240 * sizeY;
        int playerX;
        int playerY;

        char direction = 'd';

        Decode decode = new Decode("World.txt");

        Tiles[][] worldTiles = new Tiles[decode.getX()][decode.getY()];
        Objects[][] worldObjects = new Objects[decode.getX()][decode.getY()];
        NPCs[][] worldNPCs = new NPCs[decode.getX()][decode.getY()];

        if (decode.getOpen() == true) {

            int[][] preTiles = decode.fromFile();
            int[][] preObjects = decode.fromFile();
            int[][] preNPCs = decode.fromFile();

            x = (decode.getX() * sizeX) / 2;
            y = (decode.getY() * sizeY) / 2;

            playerX = decode.singleVal();
            playerY = decode.singleVal();

        }

        for (int i = 0; i < worldTiles.length; i++) {
            for (int j = 0; j < worldTiles[i].length; j++) {
                worldTiles[i][j] = new Grass(i * sizeX, j * sizeY, false, dc);
            }
        }

        while (true) {

            if (dc.isKeyPressed(38)) { // up
                y-=4;
                direction = 'u';
            } else if (dc.isKeyPressed(40)) { // down
                y+=4;
                direction = 'd';
            }

            if (dc.isKeyPressed(39)) { // right
                x+=4;
                direction = 'r';
            } else if (dc.isKeyPressed(37)) { // left
                x -= 4;
                direction = 'l';
            }

            // ---------- Drawing ------------
            dc.clear();
            for (int i = 0; i < worldTiles.length; i++) {
                for (int j = 0; j < worldTiles[i].length; j++) {
                    if (worldTiles[i][j] != null) {
                        worldTiles[i][j].draw(x, y);
                    }
                }
            }
            switch (direction) {
                case 'd':
                    dc.drawImage("NPCs/player-d.png", 450, 300);
                    break;
                case 'u':
                    dc.drawImage("NPCs/player-u.png", 450, 300);
                    break;
                case 'l':
                    dc.drawImage("NPCs/player-l.png", 450, 300);
                    break;
                case 'r':
                    dc.drawImage("NPCs/player-r.png", 450, 300);
                    break;
            }
            dc.redraw();

        }

    }

}
