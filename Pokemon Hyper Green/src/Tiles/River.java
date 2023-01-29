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
public class River extends Tiles {
    
    String center = "Tiles/river-c.png";
    String top = "Tiles/river-t.png";
    String left = "Tiles/river-l.png";
    String right = "Tiles/river-r.png";
    String bottom = "Tiles/river-b.png";
    String tl = "Tiles/river-tl.png";
    String tr = "Tiles/river-tr.png";
    String bl = "Tiles/river-bl.png";
    String br = "Tiles/river-br.png";
    String ctl = "Tiles/river-ctl.png";
    String ctr = "Tiles/river-ctr.png";
    String cbl = "Tiles/river-cbl.png";
    String cbr = "Tiles/river-cbr.png";

    public River(int x, int y, DConsole dc, Tiles[][] tiles) {
        super(x, y, true, dc);
        this.tiles = tiles;
        newFile(center);
    }
    
    @Override
    public void update(int i, int j) {
        if (tiles[i][j - 1] instanceof River && tiles[i][j + 1] instanceof River && tiles[i - 1][j] instanceof River && tiles[i + 1][j] instanceof River && tiles[i - 1][j + 1] instanceof River && tiles[i + 1][j + 1] instanceof River && tiles[i - 1][j - 1] instanceof River && tiles[i + 1][j - 1] instanceof River) {
            newFile(center);//center
        } else if (tiles[i][j - 1] instanceof River != true && tiles[i - 1][j] instanceof River != true && tiles[i][j + 1] instanceof River && tiles[i + 1][j] instanceof River) {
            newFile(tl);//tl
        } else if (tiles[i][j - 1] instanceof River != true && tiles[i - 1][j] instanceof River && tiles[i][j + 1] instanceof River && tiles[i + 1][j] instanceof River != true) {
            newFile(tr);//tr
        } else if (tiles[i][j - 1] instanceof River != true) {
            newFile(top);//top
        } else if (tiles[i][j - 1] instanceof River && tiles[i + 1][j] instanceof River && tiles[i + 1][j - 1] instanceof River != true) {
            newFile(ctr);//ctr
        } else if (tiles[i][j - 1] instanceof River && tiles[i - 1][j] instanceof River && tiles[i - 1][j - 1] instanceof River != true) {
            newFile(ctl);//ctl
        } else if (tiles[i][j + 1] instanceof River && tiles[i - 1][j] instanceof River && tiles[i - 1][j + 1] instanceof River != true) {
            newFile(cbl);//cbl
        } else if (tiles[i][j + 1] instanceof River && tiles[i + 1][j] instanceof River && tiles[i + 1][j + 1] instanceof River != true) {
            newFile(cbr);//cbr
        } else if (tiles[i][j - 1] instanceof River && tiles[i - 1][j] instanceof River != true && tiles[i][j + 1] instanceof River != true && tiles[i + 1][j] instanceof River) {
            newFile(bl);//bl
        } else if (tiles[i][j - 1] instanceof River && tiles[i - 1][j] instanceof River && tiles[i][j + 1] instanceof River != true && tiles[i + 1][j] instanceof River != true) {
            newFile(br);//br
        } else if (tiles[i][j + 1] instanceof River != true) {
            newFile(bottom);//bottom
        } else if (tiles[i][j - 1] instanceof River && tiles[i - 1][j] instanceof River && tiles[i][j + 1] instanceof River && tiles[i + 1][j] instanceof River != true) {
            newFile(right);//right
        } else if (tiles[i][j - 1] instanceof River && tiles[i][j + 1] instanceof River) {
            newFile(left);//left
        } else {

        }
    }
    
}
