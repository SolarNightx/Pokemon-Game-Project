package pokemonList;


import pokemon.weed.green.Type;
/**
 *
 * @author biggsz
 */
public class Infernape extends Pokemon {

    public Infernape(String name, int level) {
        super("Infernape");
        this.name = "Infernape";
        this.gender = r.nextInt(2);
        this.level = level;

        this.sprites[0] = "Battlers/392.png";
        this.sprites[1] = "Battlers/392b.png";
        
        this.type[0] = new Type(Type.PType.FIRE);
        this.type[1] = new Type(Type.PType.FIGHTING);

        //hp
        this.base[0] = 76;
        //atk
        this.base[1] = 104;
        //def
        this.base[2] = 71;
        //sp.ack
        this.base[3] = 104;
        //sp. def
        this.base[4] = 71;
        //speed
        this.base[5] = 108;

        //hp
        this.EVYield[0] = 0;
        //atk
        this.EVYield[1] = 1;
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
        heal();
        
    }

}
