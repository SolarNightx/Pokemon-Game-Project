/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon.weed.green;

import java.util.Random;

/**
 *
 * @author Darren H
 */
public abstract class Pokemon {

    String name;
    String ability;
    int maxHP;
    int HP;
    int atk;
    int def;
    int specialAtk;
    int specialDef;
    int speed;
    int level;
    boolean confused;
    //true = male 
    int gender;
    int[] IVs = new int[6];
    int[] EVs = new int[6];
    int[] base = new int[6];
    Moves[] moves = new Moves[4];
    Status status = new Status();
    //Sound cry = new Sound("");
    Random r = new Random();

<<<<<<< HEAD
    public Pokemon(int level) {

        for (int i = 0; i < 6; i++) {
            this.IVs[i] = r.nextInt(32);
        }

        this.level = level;

        this.maxHP = (Math.abs((2 * base[0] + IVs[0] + (EVs[0] / 4)) * level) / 100) + level + 10;
        this.atk = ((Math.abs((2 * base[1] + IVs[1] + (EVs[1] / 4)) * level) / 100 + 5));
        this.def = ((Math.abs((2 * base[1] + IVs[1] + (EVs[1] / 4)) * level) / 100 + 5));
        this.specialAtk = ((Math.abs((2 * base[1] + IVs[1] + (EVs[1] / 4)) * level) / 100 + 5));
        this.specialDef = ((Math.abs((2 * base[1] + IVs[1] + (EVs[1] / 4)) * level) / 100 + 5));
        this.speed = ((Math.abs((2 * base[1] + IVs[1] + (EVs[1] / 4)) * level) / 100 + 5));
=======
    public Pokemon(String name) {
        
        for (int i = 0; i < 6; i++) {
            this.IVs[i] = r.nextInt(32);
        }
        
        this.name = name;
>>>>>>> 474fef5226974f0c030970b6f54400371797e7fe

    }
    
    public void gender(int gender) {
        this.gender = gender;
    }

<<<<<<< HEAD
=======
    public void updateStats(int level, int[] base) {
        this.level = level;
        this.base = base;
        this.maxHP = (Math.abs((2 * this.base[0] + IVs[0] + (EVs[0] / 4)) * this.level) / 100) + this.level + 10;
        this.atk = (Math.abs((2 * this.base[1] + IVs[1] + (EVs[1] / 4)) * this.level) / 100 + 5);
        this.def = (Math.abs((2 * this.base[2] + IVs[2] + (EVs[2] / 4)) * this.level) / 100 + 5);
        this.specialAtk = (Math.abs((2 * this.base[3] + IVs[3] + (EVs[3] / 4)) * this.level) / 100 + 5);
        this.specialDef = (Math.abs((2 * this.base[4] + IVs[4] + (EVs[4] / 4)) * this.level) / 100 + 5);
        this.speed = (Math.abs((2 * this.base[5] + IVs[5] + (EVs[5] / 4)) * this.level) / 100 + 5);
    }

>>>>>>> 474fef5226974f0c030970b6f54400371797e7fe
    public void moveSet(Moves[] moves) {
        this.moves = moves;
    }

    public void useMove(int b) {
        //moves[b].use();
    }
}
