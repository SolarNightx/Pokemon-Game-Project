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
<<<<<<< HEAD
public class Garchomp extends Pokemon {

    public Garchomp(int level) {
        super(level);

         int[] base = new int[6];
        
        this.name = "Garchomp";
        gender = r.nextInt(2);

=======
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
        
>>>>>>> 474fef5226974f0c030970b6f54400371797e7fe
        this.base[0] = 108;
        this.base[1] = 130;
        this.base[2] = 95;
        this.base[3] = 80;
        this.base[4] = 85;
        this.base[5] = 102;
<<<<<<< HEAD

=======
        
        gender(gender);
        updateStats(this.level, base);
        
>>>>>>> 474fef5226974f0c030970b6f54400371797e7fe
    }

}
