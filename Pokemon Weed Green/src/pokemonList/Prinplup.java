package pokemonList;


import pokemon.weed.green.Type;
/**
 *
 * @author biggsz
 */
public class Prinplup extends Pokemon {

    public Prinplup(String name, int level) {
        super("Prinplup");
        this.name = "Prinplup";
        this.gender = r.nextInt(2);
        this.level = level;

        this.sprites[0] = "394.png";
        this.sprites[1] = "394b.png";
        
        this.type[0] = new Type(Type.PType.WATER);
        this.type[1] = new Type(Type.PType.NULL);

        //hp
        this.base[0] = 64;
        //atk
        this.base[1] = 66;
        //def
        this.base[2] = 68;
        //sp.ack
        this.base[3] = 81;
        //sp. def
        this.base[4] = 76;
        //speed
        this.base[5] = 50;

        //hp
        this.EVYield[0] = 0;
        //atk
        this.EVYield[1] = 0;
        //def
        this.EVYield[2] = 0;
        //sp. atk
        this.EVYield[3] = 2;
        //sp def
        this.EVYield[4] = 0;
        //speed
        this.EVYield[5] = 0;

        gender(gender);
        updateStats(this.level, base);

    }

}
