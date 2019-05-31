/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon.weed.green;

import pokemonList.Pokemon;

/**
 *
 * @author Darren H
 */
public class Player {
    
    int x;
    int y;
    int direction;
    int moveX;
    int moveY;
    int walkSpeed;
    
    Backpack backpack = new Backpack();
    Pokemon[] pokemon = new Pokemon[6];
    Pokemon[][] boxPokemon = new Pokemon[6][5]; // This could be a 3D array for more than 1 box. Dunno tho.
    
    public Player(int x, int y) {
        
    }
    
}
