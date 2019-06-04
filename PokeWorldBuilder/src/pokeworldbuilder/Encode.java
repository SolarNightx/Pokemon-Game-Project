/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokeworldbuilder;

import java.io.File;
import java.io.PrintStream;

/**
 *
 * @author Darren H
 */
public class Encode {

    PrintStream output;

    public Encode(String filename, int x, int y) {
        
        try {
            output = new PrintStream(new File(filename));
        } catch (Exception e) {
            // handle the error here
            System.out.println("Something bad happened");
        }

        output.println(x);
        output.println(y);

    }

    public void toFile(int[][] world) {
        
        for (int i = 0; i < world.length; i++) {
            for (int j = 0; j < world[i].length; j++) {
                output.println(world[i][j]);
            }
        }
        
    }
    
    public void singleVal(int x) {
        output.println(x);
    }

}
