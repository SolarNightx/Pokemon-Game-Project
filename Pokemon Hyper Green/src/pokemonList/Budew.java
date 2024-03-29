
package pokemonList;


import pokemon.weed.green.Type;
/**
 *
 * @author biggsz
 */
public class Budew extends Pokemon {

    public Budew(String name, int level) {
        super("Budew");
        this.name = "Budew";
        this.gender = r.nextInt(2);
        this.level = level;

        this.sprites[0] = "Battlers/406.png";
        this.sprites[1] = "Battlers/406b.png";
        
        this.type[0] = new Type(Type.PType.GRASS);
        this.type[1] = new Type(Type.PType.POISON);

        //hp
        this.base[0] = 40;
        //atk
        this.base[1] = 30;
        //def
        this.base[2] = 35;
        //sp.ack
        this.base[3] = 50;
        //sp. def
        this.base[4] = 70;
        //speed
        this.base[5] = 55;

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
        this.EVYield[5] = 0;

        gender(gender);
        updateStats(this.level, base);
        heal();
        
    }

}
