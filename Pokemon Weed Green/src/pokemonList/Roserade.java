package pokemonList;


import pokemon.weed.green.Type;
/**
 *
 * @author biggsz
 */
public class Roserade extends Pokemon {

    public Roserade(String name, int level) {
        super("Roserade");
        this.name = "Roserade";
        this.gender = r.nextInt(2);
        this.level = level;

        this.sprites[0] = "407.png";
        this.sprites[1] = "407b.png";
        
        this.type[0] = new Type(Type.PType.GRASS);
        this.type[1] = new Type(Type.PType.POISON);

        //hp
        this.base[0] = 60;
        //atk
        this.base[1] = 70;
        //def
        this.base[2] = 65;
        //sp.ack
        this.base[3] = 125;
        //sp. def
        this.base[4] = 105;
        //speed
        this.base[5] = 90;

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

    }

}
