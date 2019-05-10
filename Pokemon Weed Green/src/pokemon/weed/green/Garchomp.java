/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon.weed.green;

/**
 *
 * @author zachm
 */
public class Garchomp extends Pokemon {

    public Garchomp(int level) {
        super(level);

         int[] base = new int[6];
        
        this.name = "Garchomp";
        gender = r.nextInt(2);

        this.base[0] = 108;
        this.base[1] = 130;
        this.base[2] = 95;
        this.base[3] = 80;
        this.base[4] = 85;
        this.base[5] = 102;

    }

}
