/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon.weed.green;

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
    
    Items[] items = new Items[20];
    Pokemon[] pokemon = new Pokemon[6];
    Pokemon[][] boxPokemon = new Pokemon[6][5];
    
    public Player(int x, int y) {
        
    }
    
}
