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
public class Sand extends Tiles {
    
    String center = "Tiles/sand-c.png";
    String top = "Tiles/sand-t.png";
    String left = "Tiles/sand-l.png";
    String right = "Tiles/sand-r.png";
    String bottom = "Tiles/sand-b.png";
    String tl = "Tiles/sand-tl.png";
    String tr = "Tiles/sand-tr.png";
    String bl = "Tiles/sand-bl.png";
    String br = "Tiles/sand-br.png";
    String ctl = "Tiles/sand-ctl.png";
    String ctr = "Tiles/sand-ctr.png";
    String cbl = "Tiles/sand-cbl.png";
    String cbr = "Tiles/sand-cbr.png";

    public Sand(int x, int y, DConsole dc, Tiles[][] tiles) {
        super(x, y, false, dc);
        this.tiles = tiles;
        newFile(center);
    }
    
    @Override
    public void update(int i, int j) {
        if (tiles[i][j - 1] instanceof Sand && tiles[i][j + 1] instanceof Sand && tiles[i - 1][j] instanceof Sand && tiles[i + 1][j] instanceof Sand && tiles[i - 1][j + 1] instanceof Sand && tiles[i + 1][j + 1] instanceof Sand && tiles[i - 1][j - 1] instanceof Sand && tiles[i + 1][j - 1] instanceof Sand) {
            newFile(center);//center
        } else if (tiles[i][j - 1] instanceof Sand != true && tiles[i - 1][j] instanceof Sand != true && tiles[i][j + 1] instanceof Sand && tiles[i + 1][j] instanceof Sand) {
            newFile(tl);//tl
        } else if (tiles[i][j - 1] instanceof Sand != true && tiles[i - 1][j] instanceof Sand && tiles[i][j + 1] instanceof Sand && tiles[i + 1][j] instanceof Sand != true) {
            newFile(tr);//tr
        } else if (tiles[i][j - 1] instanceof Sand != true) {
            newFile(top);//top
        } else if (tiles[i][j - 1] instanceof Sand && tiles[i + 1][j] instanceof Sand && tiles[i + 1][j - 1] instanceof Sand != true) {
            newFile(ctr);//ctr
        } else if (tiles[i][j - 1] instanceof Sand && tiles[i - 1][j] instanceof Sand && tiles[i - 1][j - 1] instanceof Sand != true) {
            newFile(ctl);//ctl
        } else if (tiles[i][j + 1] instanceof Sand && tiles[i - 1][j] instanceof Sand && tiles[i - 1][j + 1] instanceof Sand != true) {
            newFile(cbl);//cbl
        } else if (tiles[i][j + 1] instanceof Sand && tiles[i + 1][j] instanceof Sand && tiles[i + 1][j + 1] instanceof Sand != true) {
            newFile(cbr);//cbr
        } else if (tiles[i][j - 1] instanceof Sand && tiles[i - 1][j] instanceof Sand != true && tiles[i][j + 1] instanceof Sand != true && tiles[i + 1][j] instanceof Sand) {
            newFile(bl);//bl
        } else if (tiles[i][j - 1] instanceof Sand && tiles[i - 1][j] instanceof Sand && tiles[i][j + 1] instanceof Sand != true && tiles[i + 1][j] instanceof Sand != true) {
            newFile(br);//br
        } else if (tiles[i][j + 1] instanceof Sand != true) {
            newFile(bottom);//bottom
        } else if (tiles[i][j - 1] instanceof Sand && tiles[i - 1][j] instanceof Sand && tiles[i][j + 1] instanceof Sand && tiles[i + 1][j] instanceof Sand != true) {
            newFile(right);//right
        } else if (tiles[i][j - 1] instanceof Sand && tiles[i][j + 1] instanceof Sand) {
            newFile(left);//left
        } else {

        }
    
    }
    
}
