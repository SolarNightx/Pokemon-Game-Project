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
public class Staraptor extends Pokemon {

    public Staraptor(String name, int level) {
        super("Staraptor");
        this.name = "Staraptor";
        this.gender = r.nextInt(2);
        this.level = level;
        
        this.sprites[0] = "398.png";
        this.sprites[1] = "398b.png";

        this.type[0] = PType.NORMAL;
        this.type[0] = PType.FLYING;

        //hp
        this.base[0] = 85;
        //atk
        this.base[1] = 120;
        //def
        this.base[2] = 70;
        //sp.ack
        this.base[3] = 50;
        //sp. def
        this.base[4] = 60;
        //speed
        this.base[5] = 100;

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
