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
public class Dirt extends Tiles {

    String center = "Tiles/dirt-c.png";
    String top = "Tiles/dirt-t.png";
    String left = "Tiles/dirt-l.png";
    String right = "Tiles/dirt-r.png";
    String bottom = "Tiles/dirt-b.png";
    String tl = "Tiles/dirt-tl.png";
    String tr = "Tiles/dirt-tr.png";
    String bl = "Tiles/dirt-bl.png";
    String br = "Tiles/dirt-br.png";
    String ctl = "Tiles/dirt-ctl.png";
    String ctr = "Tiles/dirt-ctr.png";
    String cbl = "Tiles/dirt-cbl.png";
    String cbr = "Tiles/dirt-cbr.png";

    public Dirt(int x, int y, DConsole dc, Tiles[][] tiles) {
        super(x, y, false, dc);
        this.tiles = tiles;
        newFile(center);
    }

    @Override
    public void update(int i, int j) {
        if (tiles[i][j - 1] instanceof Dirt && tiles[i][j + 1] instanceof Dirt && tiles[i - 1][j] instanceof Dirt && tiles[i + 1][j] instanceof Dirt && tiles[i - 1][j + 1] instanceof Dirt && tiles[i + 1][j + 1] instanceof Dirt && tiles[i - 1][j - 1] instanceof Dirt && tiles[i + 1][j - 1] instanceof Dirt) {
            newFile(center);//center
        } else if (tiles[i][j - 1] instanceof Dirt != true && tiles[i - 1][j] instanceof Dirt != true && tiles[i][j + 1] instanceof Dirt && tiles[i + 1][j] instanceof Dirt) {
            newFile(tl);//tl
        } else if (tiles[i][j - 1] instanceof Dirt != true && tiles[i - 1][j] instanceof Dirt && tiles[i][j + 1] instanceof Dirt && tiles[i + 1][j] instanceof Dirt != true) {
            newFile(tr);//tr
        } else if (tiles[i][j - 1] instanceof Dirt != true) {
            newFile(top);//top
        } else if (tiles[i][j - 1] instanceof Dirt && tiles[i + 1][j] instanceof Dirt && tiles[i + 1][j - 1] instanceof Dirt != true) {
            newFile(ctr);//ctr
        } else if (tiles[i][j - 1] instanceof Dirt && tiles[i - 1][j] instanceof Dirt && tiles[i - 1][j - 1] instanceof Dirt != true) {
            newFile(ctl);//ctl
        } else if (tiles[i][j + 1] instanceof Dirt && tiles[i - 1][j] instanceof Dirt && tiles[i - 1][j + 1] instanceof Dirt != true) {
            newFile(cbl);//cbl
        } else if (tiles[i][j + 1] instanceof Dirt && tiles[i + 1][j] instanceof Dirt && tiles[i + 1][j + 1] instanceof Dirt != true) {
            newFile(cbr);//cbr
        } else if (tiles[i][j - 1] instanceof Dirt && tiles[i - 1][j] instanceof Dirt != true && tiles[i][j + 1] instanceof Dirt != true && tiles[i + 1][j] instanceof Dirt) {
            newFile(bl);//bl
        } else if (tiles[i][j - 1] instanceof Dirt && tiles[i - 1][j] instanceof Dirt && tiles[i][j + 1] instanceof Dirt != true && tiles[i + 1][j] instanceof Dirt != true) {
            newFile(br);//br
        } else if (tiles[i][j + 1] instanceof Dirt != true) {
            newFile(bottom);//bottom
        } else if (tiles[i][j - 1] instanceof Dirt && tiles[i - 1][j] instanceof Dirt && tiles[i][j + 1] instanceof Dirt && tiles[i + 1][j] instanceof Dirt != true) {
            newFile(right);//right
        } else if (tiles[i][j - 1] instanceof Dirt && tiles[i][j + 1] instanceof Dirt) {
            newFile(left);//left
        } else {

        }
    }

}
