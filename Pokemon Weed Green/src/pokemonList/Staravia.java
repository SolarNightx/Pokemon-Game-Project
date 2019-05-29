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
public class Staravia extends Pokemon {

    public Staravia(String name, int level) {
        super("Staravia");
        this.name = "Staravia";
        this.gender = r.nextInt(2);
        this.level = level;

        this.sprites[0] = "397.png";
        this.sprites[1] = "397b.png";
        
        this.type[0] = PType.NORMAL;
        this.type[0] = PType.FLYING;

        //hp
        this.base[0] = 55;
        //atk
        this.base[1] = 75;
        //def
        this.base[2] = 50;
        //sp.ack
        this.base[3] = 40;
        //sp. def
        this.base[4] = 40;
        //speed
        this.base[5] = 80;

        //hp
        this.EVYield[0] = 0;
        //atk
        this.EVYield[1] = 0;
        //def
        this.EVYield[2] = 0;
        //sp. atk
        this.EVYield[3] = 0;
        //sp def
        this.EVYield[4] = 0;
        //speed
        this.EVYield[5] = 2;

        gender(gender);
        updateStats(this.level, base);

    }

}
