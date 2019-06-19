package moveList;

import java.util.Random;
import pokemon.weed.green.MoveType.MType;
import pokemon.weed.green.MoveType;
import pokemon.weed.green.Type;
import pokemon.weed.green.Type.PType;
import pokemonList.Pokemon;

public class baiLol extends Moves {

    public baiLol() {
      power = 999;
      accuracy = 100;
      priority = 50;
      moveType = new MoveType(MType.PHYSICAL);
      chanceOfStatus = 0;
      type = new Type(PType.NORMAL);
      name = "baiLol";
    
    }
}

