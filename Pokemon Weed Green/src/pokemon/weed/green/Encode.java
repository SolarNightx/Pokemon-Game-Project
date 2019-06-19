/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon.weed.green;

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
            this.output = new PrintStream(new File(filename));
        } catch (Exception e) {
            // handle the error here
            System.out.println("Something bad happened");
        }

        this.output.println(x);
        this.output.println(y);

    }

    public void toFile(int[][] world) {
        
        for (int i = 0; i < world.length; i++) {
            for (int j = 0; j < world[i].length; j++) {
                this.output.println(world[i][j]);
            }
        }
        
    }
    
    public void singleVal(int x) {
        this.output.println(x);
    }
    
    public void singleString(String string) {
        this.output.println(string);
    }
    
    public void singleBoolean(boolean b) {
        this.output.println(b);
    }

}
