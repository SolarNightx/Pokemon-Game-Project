package itemList;

import pokemonList.Pokemon;

public abstract class HealingItem extends Item{
    public void useItem(Pokemon target) {
        System.out.println("It had no effect!");
    }
}
