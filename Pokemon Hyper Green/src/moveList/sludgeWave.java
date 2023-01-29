package moveList;

import java.util.Random;
import pokemon.weed.green.MoveType.MType;
import pokemon.weed.green.MoveType;
import pokemon.weed.green.Type;
import pokemon.weed.green.Type.PType;
import pokemonList.Pokemon;

public class sludgeWave extends Moves {

    public sludgeWave() {
      power = 95;
      accuracy = 100;
      priority = 0;
      moveType = new MoveType(MType.SPECIAL);
      chanceOfStatus = 0;
      type = new Type(PType.POISON);
      name = "Sludge Wave";
    
    }
}