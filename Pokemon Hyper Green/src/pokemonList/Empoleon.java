
package pokemonList;


import pokemon.weed.green.Type;
/**
 *
 * @author biggsz
 */
public class Empoleon extends Pokemon {

    public Empoleon(String name, int level) {
        super("Empoleon");
        this.name = "Empoleon";
        this.gender = r.nextInt(2);
        this.level = level;

        this.sprites[0] = "Battlers/395.png";
        this.sprites[1] = "Battlers/395b.png";
        
        this.type[0] = new Type(Type.PType.WATER);
        this.type[1] = new Type(Type.PType.STEEL);

       
        //hp
        this.base[0] = 84;
        //atk
        this.base[1] = 86;
        //def
        this.base[2] = 88;
        //sp.ack
        this.base[3] = 111;
        //sp. def
        this.base[4] = 101;
        //speed
        this.base[5] = 60;

        //hp
        this.EVYield[0] = 0;
        //atk
        this.EVYield[1] = 0;
        //def
        this.EVYield[2] = 0;
        //sp. atk
        this.EVYield[3] = 3;
        //sp def
        this.EVYield[4] = 0;
        //speed
        this.EVYield[5] = 0;

        gender(gender);
        updateStats(this.level, base);
        heal();
    }

}
