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
public abstract class Moves {
    
    int baseDmg;
    int accuracy;
    MoveType moveType;
    double chanceOfStatus;
    
}

enum MoveType {
    PHYSICAL, SPECIAL, STATUS
}
