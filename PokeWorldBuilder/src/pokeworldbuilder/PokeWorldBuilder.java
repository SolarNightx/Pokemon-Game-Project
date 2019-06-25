package pokeworldbuilder;

import DLibX.DConsole;
import Tiles.*;
import Objects.*;
import java.util.Scanner;

public class PokeWorldBuilder {

    public static void main(String[] args) {
        DConsole dc = new DConsole();
        dc.setOrigin(DConsole.ORIGIN_CENTER);

        final int size = 48;

        int x = 240 * size;
        int y = 240 * size;
        int playerX = 240 * size;
        int playerY = 240 * size;
        int mouseX;
        int mouseY;
        int mode = 1;
        int modeTwo = 1;
        String tempS;
        boolean tempB;

        char direction = 'd';

        Decode decode = new Decode("World.txt");
        Scanner sc = new Scanner(System.in);

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
                            tempS = decode.singleString();
                            tempB = decode.singleBoolean();
                            worldNPCs[i][j] = new NPCs(i * size, j * size, tempS, dc, tempB);
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

        int mouseRow;
        int mouseCol;

        while (true) {

            mouseX = dc.getMouseXPosition() + size / 2; // Find mouse position
            mouseY = dc.getMouseYPosition() + size / 2;

            mouseRow = mouseY / size;
            mouseCol = mouseX / size;

            if (dc.getKeyPress('1')) {
                mode = 1;
            } else if (dc.getKeyPress('2')) {
                mode = 2;
            } else if (dc.getKeyPress('3')) {
                mode = 3;
            } else if (dc.getKeyPress('4')) {
                mode = 4;
            } else if (dc.getKeyPress('5')) {
                mode = 5;
            } else if (dc.getKeyPress('6')) {
                mode = 6;
            } else if (dc.getKeyPress('7')) {
                mode = 7;
            } else if (dc.getKeyPress('8')) {
                mode = 8;
            } else if (dc.getKeyPress('9')) {
                mode = 9;
            } else if (dc.getKeyPress('0')) {
                mode = 0;
            }

            if (dc.isKeyPressed(38)) { // up
                y -= size;
                direction = 'u';
            } else if (dc.isKeyPressed(40)) { // down
                y += size;
                direction = 'd';
            }

            if (dc.isKeyPressed(39)) { // right
                x += size;
                direction = 'r';
            } else if (dc.isKeyPressed(37)) { // left
                x -= size;
                direction = 'l';
            }

            if (dc.isKeyPressed('i')) { // tiles
                modeTwo = 1;
            } else if (dc.isKeyPressed('o')) { // objects
                modeTwo = 2;
            } else if (dc.isKeyPressed('p')) { // npcs
                modeTwo = 3;
            }

            if (dc.isMouseButton(1) && modeTwo == 1) {
                switch (mode) {
                    case 0:
                        worldTiles[mouseCol + (x / size)][mouseRow + (y / size)] = null;
                        break;
                    case 1:
                        worldTiles[mouseCol + (x / size)][mouseRow + (y / size)] = new Grass((mouseCol + (x / size)) * size, (mouseRow + (y / size)) * size, dc, worldTiles);
                        break;
                    case 2:
                        worldTiles[mouseCol + (x / size)][mouseRow + (y / size)] = new Dirt((mouseCol + (x / size)) * size, (mouseRow + (y / size)) * size, dc, worldTiles);
                        break;
                    case 3:
                        worldTiles[mouseCol + (x / size)][mouseRow + (y / size)] = new Sand((mouseCol + (x / size)) * size, (mouseRow + (y / size)) * size, dc, worldTiles);
                        break;
                    case 4:
                        worldTiles[mouseCol + (x / size)][mouseRow + (y / size)] = new River((mouseCol + (x / size)) * size, (mouseRow + (y / size)) * size, dc, worldTiles);
                        break;
                    case 5:
                        worldTiles[mouseCol + (x / size)][mouseRow + (y / size)] = new Hill((mouseCol + (x / size)) * size, (mouseRow + (y / size)) * size, dc, worldTiles);
                        break;
                    case 6:
                        worldTiles[mouseCol + (x / size)][mouseRow + (y / size)] = new Road((mouseCol + (x / size)) * size, (mouseRow + (y / size)) * size, dc, worldTiles);
                        break;
                    case 7:
                        worldTiles[mouseCol + (x / size)][mouseRow + (y / size)] = new TallGrass((mouseCol + (x / size)) * size, (mouseRow + (y / size)) * size, dc);
                        break;
                    case 8:
                        worldTiles[mouseCol + (x / size)][mouseRow + (y / size)] = new door((mouseCol + (x / size)) * size, (mouseRow + (y / size)) * size, dc, 1, 1);
                        break;
                }
                for (int i = 0; i < worldTiles.length; i++) {
                    for (int j = 0; j < worldTiles[i].length; j++) {
                        if (worldTiles[i][j] != null) {
                            worldTiles[i][j].update(i, j);
                        }
                    }
                }
            } else if (dc.isMouseButton(1) && modeTwo == 2) {
                switch (mode) {
                    case 0:
                        worldObjects[mouseCol + (x / size)][mouseRow + (y / size)] = null;
                        break;
                    case 1:
                        worldObjects[mouseCol + (x / size)][mouseRow + (y / size)] = new Rock((mouseCol + (x / size)) * size, (mouseRow + (y / size)) * size, dc);
                        break;
                    case 2:
                        worldObjects[mouseCol + (x / size)][mouseRow + (y / size)] = new Tree((mouseCol + (x / size)) * size, (mouseRow + (y / size)) * size, dc);
                        break;
                    case 3:
                        worldObjects[mouseCol + (x / size)][mouseRow + (y / size)] = new Stairs((mouseCol + (x / size)) * size, (mouseRow + (y / size)) * size, dc);
                        break;
                    case 4:
                        worldObjects[mouseCol + (x / size)][mouseRow + (y / size)] = new Bridge((mouseCol + (x / size)) * size, (mouseRow + (y / size)) * size, dc);
                        break;
                    case 5:
                        worldObjects[mouseCol + (x / size)][mouseRow + (y / size)] = new House((mouseCol + (x / size)) * size, (mouseRow + (y / size)) * size, dc);
                        break;
                    case 6:
                        worldObjects[mouseCol + (x / size)][mouseRow + (y / size)] = new Pokecenter((mouseCol + (x / size)) * size, (mouseRow + (y / size)) * size, dc);
                        break;
                }
            } else if (dc.isMouseButton(1) && modeTwo == 3) {
                System.out.println("text");
                switch (mode) {
                    case 0:
                        worldNPCs[mouseCol + (x / size)][mouseRow + (y / size)] = null;
                        break;
                    case 1:
                        worldNPCs[mouseCol + (x / size)][mouseRow + (y / size)] = new NPCs((mouseCol + (x / size)) * size, (mouseRow + (y / size)) * size, sc.nextLine(), dc, false);
                        break;
                    case 2:
                        worldNPCs[mouseCol + (x / size)][mouseRow + (y / size)] = new NPCs((mouseCol + (x / size)) * size, (mouseRow + (y / size)) * size, sc.nextLine(), dc, true);
                        break;
                }
            }

            if (dc.getKeyPress(27)) { // encode / save
                Encode encode = new Encode("World.txt", 480, 480);
                for (int i = 0; i < tiles.length; i++) {
                    for (int j = 0; j < tiles[i].length; j++) {
                        if (worldTiles[i][j] == null) {
                            tiles[i][j] = 0;
                        } else if (worldTiles[i][j] instanceof Grass) {
                            tiles[i][j] = 1;
                        } else if (worldTiles[i][j] instanceof Dirt) {
                            tiles[i][j] = 2;
                        } else if (worldTiles[i][j] instanceof Sand) {
                            tiles[i][j] = 3;
                        } else if (worldTiles[i][j] instanceof Road) {
                            tiles[i][j] = 4;
                        } else if (worldTiles[i][j] instanceof River) {
                            tiles[i][j] = 5;
                        } else if (worldTiles[i][j] instanceof Hill) {
                            tiles[i][j] = 6;
                        } else if (worldTiles[i][j] instanceof TallGrass) {
                            tiles[i][j] = 7;
                        } else if (worldTiles[i][j] instanceof door) {
                            tiles[i][j] = 8;
                        }
                    }
                }

                for (int i = 0; i < objects.length; i++) {
                    for (int j = 0; j < objects[i].length; j++) {
                        if (worldObjects[i][j] == null) {
                            objects[i][j] = 0;
                        } else if (worldObjects[i][j] instanceof Rock) {
                            objects[i][j] = 1;
                        } else if (worldObjects[i][j] instanceof Tree) {
                            objects[i][j] = 2;
                        } else if (worldObjects[i][j] instanceof Stairs) {
                            objects[i][j] = 3;
                        } else if (worldObjects[i][j] instanceof Bridge) {
                            objects[i][j] = 4;
                        } else if (worldObjects[i][j] instanceof House) {
                            objects[i][j] = 5;
                        } else if (worldObjects[i][j] instanceof Pokecenter) {
                            objects[i][j] = 6;
                        }
                    }
                }

                for (int i = 0; i < npcs.length; i++) {
                    for (int j = 0; j < npcs[i].length; j++) {
                        if (worldNPCs[i][j] == null) {
                            npcs[i][j] = 0;
                        } else {
                            npcs[i][j] = 1;
                        }
                    }
                }

                encode.toFile(tiles);
                encode.toFile(objects);
                encode.toFile(npcs);

                encode.singleVal(playerX);
                encode.singleVal(playerY);

                for (int i = 0; i < npcs.length; i++) {
                    for (int j = 0; j < npcs[i].length; j++) {
                        if (worldNPCs[i][j] != null) {
                            encode.singleString(worldNPCs[i][j].getText());
                            encode.singleBoolean(worldNPCs[i][j].getBattle());
                        }
                    }
                }

                System.exit(0);

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
            dc.pause(10);

        }

    }

}
