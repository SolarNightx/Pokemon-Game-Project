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
public class Chimchar extends Pokemon {

    public Chimchar(String name, int level) {
        super("Chimchar");
        this.name = "Chimchar";
        this.gender = r.nextInt(2);
        this.level = level;

        this.sprites[0] = "390.png";
        this.sprites[1] = "390b.png";
        
        this.type[0] = PType.FIRE;
        this.type[0] = PType.NULL;

        //hp
        this.base[0] = 44;
        //atk
        this.base[1] = 58;
        //def
        this.base[2] = 44;
        //sp.ack
        this.base[3] = 58;
        //sp. def
        this.base[4] = 44;
        //speed
        this.base[5] = 61;

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
        this.EVYield[5] = 1;

        gender(gender);
        updateStats(this.level, base);

    }

}
