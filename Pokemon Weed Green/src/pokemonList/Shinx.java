package pokemonList;


import pokemon.weed.green.Type;
/**
 *
 * @author biggsz
 */
public class Shinx extends Pokemon {

    public Shinx(String name, int level) {
        super("Shinx");
        this.name = "Shinx";
        this.gender = r.nextInt(2);
        this.level = level;

        this.sprites[0] = "403.png";
        this.sprites[1] = "403.b.png";
        
        this.type[0] = new Type(Type.PType.ELECTRIC);
        this.type[1] = new Type(Type.PType.NULL);

        //hp
        this.base[0] = 45;
        //atk
        this.base[1] = 65;
        //def
        this.base[2] = 34;
        //sp.ack
        this.base[3] = 40;
        //sp. def
        this.base[4] = 34;
        //speed
        this.base[5] = 45;

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
