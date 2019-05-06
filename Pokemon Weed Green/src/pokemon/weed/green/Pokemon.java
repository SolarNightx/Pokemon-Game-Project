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
public abstract class Pokemon {
    
    int maxHP;
    int HP;
    int atk;
    int def;
    int specialAtk;
    int specialDef;
    boolean confused;
    
    Moves[] moves = new Moves[4];
    Status status = new Status();
    //Sound cry = new Sound("");
    
}
