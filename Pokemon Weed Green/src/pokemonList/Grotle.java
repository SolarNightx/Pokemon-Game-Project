
package pokemonList;


import pokemon.weed.green.Type;
/**
 *
 * @author biggsz
 */
public class Grotle extends Pokemon {

    public Grotle(String name, int level) {
        super("Grotle");
        this.name = "Grotle";
        this.gender = r.nextInt(2);
        this.level = level;

        this.sprites[0] = "388.png";
        this.sprites[1] = "388b.png";
        
        this.type[0] = new Type(Type.PType.GRASS);
        this.type[1] = new Type(Type.PType.NULL);

        //hp
        this.base[0] = 75;
        //atk
        this.base[1] = 89;
        //def
        this.base[2] = 85;
        //sp.ack
        this.base[3] = 55;
        //sp. def
        this.base[4] = 65;
        //speed
        this.base[5] = 36;

        //hp
        this.EVYield[0] = 0;
        //atk
        this.EVYield[1] = 1;
        //def
        this.EVYield[2] = 1;
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