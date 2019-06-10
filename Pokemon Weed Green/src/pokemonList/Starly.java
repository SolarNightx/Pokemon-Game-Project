package pokemonList;


import pokemon.weed.green.Type;
/**
 *
 * @author biggsz
 */
public class Starly extends Pokemon {

    public Starly(String name, int level) {
        super("Starly");
        this.name = "Starly";
        this.gender = r.nextInt(2);
        this.level = level;

        this.sprites[0] = "396.png";
        this.sprites[1] = "396b.png";
        
        this.type[0] = new Type(Type.PType.NORMAL);
        this.type[1] = new Type(Type.PType.FLYING);

        //hp
        this.base[0] = 40;
        //atk
        this.base[1] = 55;
        //def
        this.base[2] = 30;
        //sp.ack
        this.base[3] = 30;
        //sp. def
        this.base[4] = 30;
        //speed
        this.base[5] = 60;

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
