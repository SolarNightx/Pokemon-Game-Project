package pokemonList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author biggsz
 */
public class Turtwig extends Pokemon{

    public Turtwig(String name, int level) {
        super("Turtwig");
        this.name = "Turtwig";
        this.gender = r.nextInt(2);
        this.level = level;

        this.sprites[0] = "387.png";
        this.sprites[1] = "387b.png";
        
        this.type[0] = PType.GRASS;
        this.type[0] = PType.NULL;

        //hp
        this.base[0] = 55;
        //atk
        this.base[1] = 68;
        //def
        this.base[2] = 64;
        //sp.ack
        this.base[3] = 45;
        //sp. def
        this.base[4] = 55;
        //speed
        this.base[5] = 31;

        //hp
        this.EVYield[0] = 0;
        //atk
        this.EVYield[1] = 1;
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
