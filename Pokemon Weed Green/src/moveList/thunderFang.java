package moveList;

import java.util.Random;
import pokemon.weed.green.MoveType.MType;
import pokemon.weed.green.MoveType;
import pokemon.weed.green.Type;
import pokemon.weed.green.Type.PType;
import pokemonList.Pokemon;

public class thunderFang extends Moves {

    public thunderFang() {
      power = 65;
      accuracy = 100;
      priority = 0;
      moveType = new MoveType(MType.PHYSICAL);
      chanceOfStatus = 0;
      type = new Type(PType.ELECTRIC);
      name = "Thunder Fang";
    
    }
}