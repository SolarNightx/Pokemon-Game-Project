package moveList;

import java.util.Random;
import pokemon.weed.green.MoveType.MType;
import pokemon.weed.green.MoveType;
import pokemon.weed.green.Type;
import pokemon.weed.green.Type.PType;
import pokemonList.Pokemon;

public class seedBomb extends Moves {

    public seedBomb() {
      power = 80;
      accuracy = 100;
      priority = 0;
      moveType = new MoveType(MType.PHYSICAL);
      chanceOfStatus = 0;
      type = new Type(PType.GRASS);
      name = "Seed Bomb";
    
    }
}