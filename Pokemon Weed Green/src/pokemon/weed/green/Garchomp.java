/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon.weed.green;

import java.util.Random;

/**
 *
 * @author zachm
 */
public class Garchomp extends Pokemon{
    
    int[] base = new int[6];
    Random r = new Random();
    String name;
    int gender;
    int level;
    
    public Garchomp(String name,int level) {
        super("Garchomp");
        this.name = "Garchomp";
        this.gender = r.nextInt(2);
        this.level = level;
        
        this.base[0] = 108;
        this.base[1] = 130;
        this.base[2] = 95;
        this.base[3] = 80;
        this.base[4] = 85;
        this.base[5] = 102;
        
        gender(gender);
        updateStats(this.level, base);
        
    }
    
}
