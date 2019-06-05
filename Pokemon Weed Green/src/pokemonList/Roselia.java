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
public class Roselia extends Pokemon {

    public Roselia(String name, int level) {
        super("Roselia");
        this.name = "Roselia";
        this.gender = r.nextInt(2);
        this.level = level;

        this.sprites[0] = "407.png";
        this.sprites[1] = "407b.png";
        
        this.type[0] = PType.GRASS;
        this.type[0] = PType.POISON;

        //hp
        this.base[0] = 50;
        //atk
        this.base[1] = 60;
        //def
        this.base[2] = 45;
        //sp.ack
        this.base[3] = 100;
        //sp. def
        this.base[4] = 80;
        //speed
        this.base[5] = 65;

        //hp
        this.EVYield[0] = 0;
        //atk
        this.EVYield[1] = 0;
        //def
        this.EVYield[2] = 0;
        //sp. atk
        this.EVYield[3] = 2;
        //sp def
        this.EVYield[4] = 0;
        //speed
        this.EVYield[5] = 0;

        gender(gender);
        updateStats(this.level, base);

    }

}