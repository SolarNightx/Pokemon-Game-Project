/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tiles;

import DLibX.DConsole;

/**
 *
 * @author Darren H
 */
public class Road extends Tiles {
    
    String center = "Tiles/tileroad-c.png";
    String top = "Tiles/tileroad-t.png";
    String left = "Tiles/tileroad-l.png";
    String right = "Tiles/tileroad-r.png";
    String bottom = "Tiles/tileroad-b.png";
    String tl = "Tiles/tileroad-tl.png";
    String tr = "Tiles/tileroad-tr.png";
    String bl = "Tiles/tileroad-bl.png";
    String br = "Tiles/tileroad-br.png";
    String ctl = "Tiles/tileroad-ctl.png";
    String ctr = "Tiles/tileroad-ctr.png";
    String cbl = "Tiles/tileroad-cbl.png";
    String cbr = "Tiles/tileroad-cbr.png";

    public Road(int x, int y, DConsole dc, Tiles[][] tiles) {
        super(x, y, false, dc);
        this.tiles = tiles;
        newFile(center);
    }
    
    @Override
    public void update(int i, int j) {
        if (tiles[i][j - 1] instanceof Road && tiles[i][j + 1] instanceof Road && tiles[i - 1][j] instanceof Road && tiles[i + 1][j] instanceof Road && tiles[i - 1][j + 1] instanceof Road && tiles[i + 1][j + 1] instanceof Road && tiles[i - 1][j - 1] instanceof Road && tiles[i + 1][j - 1] instanceof Road) {
            newFile(center);//center
        } else if (tiles[i][j - 1] instanceof Road != true && tiles[i - 1][j] instanceof Road != true && tiles[i][j + 1] instanceof Road && tiles[i + 1][j] instanceof Road) {
            newFile(tl);//tl
        } else if (tiles[i][j - 1] instanceof Road != true && tiles[i - 1][j] instanceof Road && tiles[i][j + 1] instanceof Road && tiles[i + 1][j] instanceof Road != true) {
            newFile(tr);//tr
        } else if (tiles[i][j - 1] instanceof Road != true) {
            newFile(top);//top
        } else if (tiles[i][j - 1] instanceof Road && tiles[i + 1][j] instanceof Road && tiles[i + 1][j - 1] instanceof Road != true) {
            newFile(ctr);//ctr
        } else if (tiles[i][j - 1] instanceof Road && tiles[i - 1][j] instanceof Road && tiles[i - 1][j - 1] instanceof Road != true) {
            newFile(ctl);//ctl
        } else if (tiles[i][j + 1] instanceof Road && tiles[i - 1][j] instanceof Road && tiles[i - 1][j + 1] instanceof Road != true) {
            newFile(cbl);//cbl
        } else if (tiles[i][j + 1] instanceof Road && tiles[i + 1][j] instanceof Road && tiles[i + 1][j + 1] instanceof Road != true) {
            newFile(cbr);//cbr
        } else if (tiles[i][j - 1] instanceof Road && tiles[i - 1][j] instanceof Road != true && tiles[i][j + 1] instanceof Road != true && tiles[i + 1][j] instanceof Road) {
            newFile(bl);//bl
        } else if (tiles[i][j - 1] instanceof Road && tiles[i - 1][j] instanceof Road && tiles[i][j + 1] instanceof Road != true && tiles[i + 1][j] instanceof Road != true) {
            newFile(br);//br
        } else if (tiles[i][j + 1] instanceof Road != true) {
            newFile(bottom);//bottom
        } else if (tiles[i][j - 1] instanceof Road && tiles[i - 1][j] instanceof Road && tiles[i][j + 1] instanceof Road && tiles[i + 1][j] instanceof Road != true) {
            newFile(right);//right
        } else if (tiles[i][j - 1] instanceof Road && tiles[i][j + 1] instanceof Road) {
            newFile(left);//left
        } else {

        }
    }
    
}
