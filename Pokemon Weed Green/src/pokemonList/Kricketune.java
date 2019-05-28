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
public class Kricketune extends Pokemon {

    public Kricketune(String name, int level) {
        super("Kricketune");
        this.name = "Kricketune";
        this.gender = r.nextInt(2);
        this.level = level;

        this.sprites[0] = "402.png";
        this.sprites[1] = "402b.png";
        
        this.type[0] = PType.BUG;
        this.type[0] = PType.NULL;

        //hp
        this.base[0] = 77;
        //atk
        this.base[1] = 85;
        //def
        this.base[2] = 51;
        //sp.ack
        this.base[3] = 55;
        //sp. def
        this.base[4] = 51;
        //speed
        this.base[5] = 65;

        //hp
        this.EVYield[0] = 0;
        //atk
        this.EVYield[1] = 2;
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
