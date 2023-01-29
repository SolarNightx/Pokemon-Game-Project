package pokemonList;


import pokemon.weed.green.Type;
/**
 *
 * @author biggsz
 */
public class Monferno extends Pokemon {

    public Monferno(String name, int level) {
        super("Monferno");
        this.name = "Monferno";
        this.gender = r.nextInt(2);
        this.level = level;

        this.sprites[0] = "391.png";
        this.sprites[1] = "391b.png";
        
        this.type[0] = new Type(Type.PType.FIRE);
        this.type[1] = new Type(Type.PType.FIGHTING);

        //hp
        this.base[0] = 64;
        //atk
        this.base[1] = 78;
        //def
        this.base[2] = 52;
        //sp.ack
        this.base[3] = 78;
        //sp. def
        this.base[4] = 52;
        //speed
        this.base[5] = 81;

        //hp
        this.EVYield[0] = 0;
        //atk
        this.EVYield[1] = 0;
        //def
        this.EVYield[2] = 0;
        //sp. atk
        this.EVYield[3] = 1;
        //sp def
        this.EVYield[4] = 0;
        //speed
        this.EVYield[5] = 1;

        gender(gender);
        updateStats(this.level, base);

    }

}
