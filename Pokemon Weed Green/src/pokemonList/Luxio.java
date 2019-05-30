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
public class Luxio extends Pokemon {

    public Luxio(String name, int level) {
        super("Luxio");
        this.name = "Luxio";
        this.gender = r.nextInt(2);
        this.level = level;

        this.sprites[0] = "404.png";
        this.sprites[1] = "404b.png";
        
        this.type[0] = PType.ELECTRIC;
        this.type[0] = PType.NULL;

        //hp
        this.base[0] = 60;
        //atk
        this.base[1] = 85;
        //def
        this.base[2] = 49;
        //sp.ack
        this.base[3] = 60;
        //sp. def
        this.base[4] = 49;
        //speed
        this.base[5] = 60;

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
