
package pokemonList;


import pokemon.weed.green.Type;
/**
 *
 * @author biggsz
 */
public class Bibarel extends Pokemon {

    public Bibarel(String name, int level) {
        super("Bibarel");
        this.name = "Bibarel";
        this.gender = r.nextInt(2);
        this.level = level;

        this.sprites[0] = "400.png";
        this.sprites[1] = "400b.png";
        
        this.type[0] = new Type(Type.PType.NORMAL);
        this.type[1] = new Type(Type.PType.WATER);

        //hp
        this.base[0] = 79;
        //atk
        this.base[1] = 85;
        //def
        this.base[2] = 60;
        //sp.ack
        this.base[3] = 55;
        //sp. def
        this.base[4] = 60;
        //speed
        this.base[5] = 71;

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
