package pokemonList;


import pokemon.weed.green.Type;
/**
 *
 * @author biggsz
 */
public class Torterra extends Pokemon {

    public Torterra(String name, int level) {
        super("Torterra");
        this.name = "Torterra";
        this.gender = r.nextInt(2);
        this.level = level;

        this.sprites[0] = "Battlers/389.png";
        this.sprites[1] = "Battlers/389b.png";
        
        this.type[0] = new Type(Type.PType.GRASS);
        this.type[1] = new Type(Type.PType.GROUND);

        //hp
        this.base[0] = 95;
        //atk
        this.base[1] = 109;
        //def
        this.base[2] = 105;
        //sp.ack
        this.base[3] = 75;
        //sp. def
        this.base[4] = 85;
        //speed
        this.base[5] = 56;

        //hp
        this.EVYield[0] = 0;
        //atk
        this.EVYield[1] = 2;
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
        heal();
    }

}