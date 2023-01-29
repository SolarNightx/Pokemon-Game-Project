/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon.weed.green;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Darren H
 */
public class Decode {
    
    String filename;
    int x;
    int y;
    boolean open;
    Scanner fileReader = null;
    
    public Decode(String filename) {
        this.filename = filename;

        this.open = true;

        try {
            this.fileReader = new Scanner(new File(filename));
        } catch (Exception e) {
            System.out.println("Couldn't open that file");
            this.open = false;
        }

        this.x = 480;
        this.y = 480;

        if (this.open == true) {
            this.x = this.fileReader.nextInt();
            this.y = this.fileReader.nextInt();
        }

    }
    
    public int[][] fromFile() {

        int[][] world = new int[this.x][this.y];

        if (this.open == true) {
            for (int i = 0; i < world.length; i++) {
                for (int j = 0; j < world[i].length; j++) {
                    world[i][j] = this.fileReader.nextInt();
                }
            }
        }
        
        return world;
        
    }
    
    public double[][] fromFileDouble() {
        
        double[][] world = new double[this.x][this.y];
        
        if (this.open == true) {
            for (int i = 0; i < world.length; i++) {
                for (int j = 0; j < world[i].length; j++) {
                    world[i][j] = this.fileReader.nextDouble();
                }
            }
        }
        
        return world;
    }
    
    public boolean getOpen() {
        return open;
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public int singleVal() {
        return this.fileReader.nextInt();
    }
    
    public String singleString() {
        return this.fileReader.nextLine();
    }
    
    public boolean singleBoolean() {
        return this.fileReader.nextBoolean();
    }
    
}
