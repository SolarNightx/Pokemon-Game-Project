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
public class Piplup extends Pokemon {

    public Piplup(String name, int level) {
        super("Piplup");
        this.name = "Piplup";
        this.gender = r.nextInt(2);
        this.level = level;

        this.type[0] = PType.WATER;
        this.type[0] = PType.NULL;

        //hp
        this.base[0] = 53;
        //atk
        this.base[1] = 51;
        //def
        this.base[2] = 53;
        //sp.ack
        this.base[3] = 61;
        //sp. def
        this.base[4] = 56;
        //speed
        this.base[5] = 40;

        //hp
        this.EVYield[0] = 0;
        //atk
        this.EVYield[1] = 0;
        //def
        this.EVYield[2] = 0;
        //sp. atk
        this.EVYield[3] = 1;
        //sp def
        this.EVYield[4] = 0;
        //speed
        this.EVYield[5] = 0;

        gender(gender);
        updateStats(this.level, base);

    }

}
