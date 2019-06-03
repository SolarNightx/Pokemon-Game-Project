package itemList;

import pokemonList.Pokemon;

public abstract class Item {
    
    public void useItem(Pokemon target) {
        System.out.println("Default Item Noise");
    }
}
