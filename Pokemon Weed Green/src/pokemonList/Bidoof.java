/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonList;


import pokemon.weed.green.Type;
/**
 *
 * @author biggsz
 */
public class Bidoof extends Pokemon {

    public Bidoof(String name, int level) {
        super("Bidoof");
        this.name = "Bidoof";
        this.gender = r.nextInt(2);
        this.level = level;

        this.sprites[0] = "TheTrueGod.png";
        this.sprites[1] = "TheTrueGodb.png";
        
        this.type[0] = new Type(Type.PType.NORMAL);
        this.type[1] = new Type(Type.PType.NULL);

        //hp
        this.base[0] = 59;
        //atk
        this.base[1] = 45;
        //def
        this.base[2] = 40;
        //sp.ack
        this.base[3] = 35;
        //sp. def
        this.base[4] = 40;
        //speed
        this.base[5] = 31;

        //hp
        this.EVYield[0] = 1;
        //atk
        this.EVYield[1] = 0;
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
