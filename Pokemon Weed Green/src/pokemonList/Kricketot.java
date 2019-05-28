/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonList;

/**
 *
 * @author biggsz
 */
public class Kricketot extends Pokemon {

    public Kricketot(String name, int level) {
        super("Kricketot");
        this.name = "Kricketot";
        this.gender = r.nextInt(2);
        this.level = level;

        this.sprites[0] = "401.png";
        this.sprites[1] = "401b.png";
        
        this.type[0] = PType.BUG;
        this.type[0] = PType.NULL;

        //hp
        this.base[0] = 37;
        //atk
        this.base[1] = 25;
        //def
        this.base[2] = 41;
        //sp.ack
        this.base[3] = 25;
        //sp. def
        this.base[4] = 41;
        //speed
        this.base[5] = 25;

        //hp
        this.EVYield[0] = 0;
        //atk
        this.EVYield[1] = 0;
        //def
        this.EVYield[2] = 1;
        //sp. atk
        this.EVYield[3] = 0;
        //sp def
        this.EVYield[4] = 0;
        //speed
        this.EVYield[5] = 0;

        gender(gender);
        updateStats(this.level, base);

    }

}
