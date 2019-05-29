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
public class Luxray extends Pokemon {

    public Luxray(String name, int level) {
        super("Luxray");
        this.name = "Luxray";
        this.gender = r.nextInt(2);
        this.level = level;

        this.sprites[0] = "405.png";
        this.sprites[1] = "405b.png";
        
        this.type[0] = PType.ELECTRIC;
        this.type[0] = PType.NULL;

        //hp
        this.base[0] = 80;
        //atk
        this.base[1] = 120;
        //def
        this.base[2] = 79;
        //sp.ack
        this.base[3] = 95;
        //sp. def
        this.base[4] = 79;
        //speed
        this.base[5] = 70;

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
