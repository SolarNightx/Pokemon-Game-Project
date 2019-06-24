package pokemonList;


import pokemon.weed.green.Type;
/**
 *
 * @author biggsz
 */
public class Luxray extends Pokemon {

    public Luxray(String name, int level) {
        super("Luxray");
        this.name = "Luxray";
        this.gender = r.nextInt(2);
        this.level = level;

        this.sprites[0] = "Battlers/405.png";
        this.sprites[1] = "Battlers/405b.png";
        
        this.type[0] = new Type(Type.PType.ELECTRIC);
        this.type[1] = new Type(Type.PType.NULL);

        //hp
        this.base[0] = 80;
        //atk
        this.base[1] = 120;
        //def
        this.base[2] = 79;
        //sp.ack
        this.base[3] = 95;
        //sp. def
        this.base[4] = 79;
        //speed
        this.base[5] = 70;

        //hp
        this.EVYield[0] = 0;
        //atk
        this.EVYield[1] = 3;
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
        heal();
    }

}
