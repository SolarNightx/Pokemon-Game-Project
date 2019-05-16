/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonList;

/**
 *
 * @author zachm
 */
public class Garchomp extends Pokemon {

    public Garchomp(String name, int level) {
        super("Garchomp");
        this.name = "Garchomp";
        this.gender = r.nextInt(2);
        this.level = level;

        this.type[0] = PType.DRAGON;
        this.type[0] = PType.GROUND;

        //hp
        this.base[0] = 108;
        //atk
        this.base[1] = 130;
        //def
        this.base[2] = 95;
        //sp.ack
        this.base[3] = 80;
        //sp. def
        this.base[4] = 85;
        //speed
        this.base[5] = 102;

        //hp
        this.EVYield[0] = 0;
        //atk
        this.EVYield[1] = 3;
        //def
        this.EVYield[2] = 0;
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
