package moveList;

import java.util.Random;
import pokemon.weed.green.MoveType.MType;
import pokemon.weed.green.MoveType;
import pokemon.weed.green.Type;
import pokemon.weed.green.Type.PType;
import pokemonList.Pokemon;

//pls forgive for name wuz lazy thx
public class quickAattack extends Moves {

   
    public quickAattack() {
      power = 40;
      accuracy = 100;
      priority = 1;
      moveType = new MoveType(MType.PHYSICAL);
      chanceOfStatus = 0;
      type = new Type(PType.NORMAL);
      name = "Quick Attack";
    
    }
}