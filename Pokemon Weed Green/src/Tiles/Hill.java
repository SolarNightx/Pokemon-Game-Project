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
public class Hill extends Tiles {
    
    String center = "Tiles/hill-c.png";
    String top = "Tiles/hill-t.png";
    String left = "Tiles/hill-l.png";
    String right = "Tiles/hill-r.png";
    String bottom = "Tiles/hill-b.png";
    String tl = "Tiles/hill-tl.png";
    String tr = "Tiles/hill-tr.png";
    String bl = "Tiles/hill-bl.png";
    String br = "Tiles/hill-br.png";
    String ctl = "Tiles/hill-cl.png";
    String ctr = "Tiles/hill-cr.png";

    public Hill(int x, int y, DConsole dc, Tiles[][] tiles) {
        super(x, y, true, dc);
        this.tiles = tiles;
        newFile(center);
    }
    
    @Override
    public void update(int i, int j) {
        if (tiles[i][j - 1] instanceof Hill && tiles[i][j + 1] instanceof Hill && tiles[i - 1][j] instanceof Hill && tiles[i + 1][j] instanceof Hill && tiles[i - 1][j + 1] instanceof Hill && tiles[i + 1][j + 1] instanceof Hill && tiles[i - 1][j - 1] instanceof Hill && tiles[i + 1][j - 1] instanceof Hill) {
            newFile(center);//center
        } else if (tiles[i][j - 1] instanceof Hill != true && tiles[i - 1][j] instanceof Hill != true && tiles[i][j + 1] instanceof Hill && tiles[i + 1][j] instanceof Hill) {
            newFile(tl);//tl
        } else if (tiles[i][j - 1] instanceof Hill != true && tiles[i - 1][j] instanceof Hill && tiles[i][j + 1] instanceof Hill && tiles[i + 1][j] instanceof Hill != true) {
            newFile(tr);//tr
        } else if (tiles[i][j - 1] instanceof Hill != true) {
            newFile(top);//top
        } else if (tiles[i][j - 1] instanceof Hill && tiles[i + 1][j] instanceof Hill && tiles[i + 1][j - 1] instanceof Hill != true) {
            newFile(ctr);//ctr
        } else if (tiles[i][j - 1] instanceof Hill && tiles[i - 1][j] instanceof Hill && tiles[i - 1][j - 1] instanceof Hill != true) {
            newFile(ctl);//ctl
        } else if (tiles[i][j - 1] instanceof Hill && tiles[i - 1][j] instanceof Hill != true && tiles[i][j + 1] instanceof Hill != true && tiles[i + 1][j] instanceof Hill) {
            newFile(bl);//bl
        } else if (tiles[i][j - 1] instanceof Hill && tiles[i - 1][j] instanceof Hill && tiles[i][j + 1] instanceof Hill != true && tiles[i + 1][j] instanceof Hill != true) {
            newFile(br);//br
        } else if (tiles[i][j + 1] instanceof Hill != true) {
            newFile(bottom);//bottom
        } else if (tiles[i][j - 1] instanceof Hill && tiles[i - 1][j] instanceof Hill && tiles[i][j + 1] instanceof Hill && tiles[i + 1][j] instanceof Hill != true) {
            newFile(right);//right
        } else if (tiles[i][j - 1] instanceof Hill && tiles[i][j + 1] instanceof Hill) {
            newFile(left);//left
        } else {

        }
    }
    
}
