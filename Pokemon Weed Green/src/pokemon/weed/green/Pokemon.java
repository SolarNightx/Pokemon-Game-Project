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

    public Pokemon(String name, int gender, int level, int[] base) {
        for (int i = 0; i < 6; i++) {
            this.IVs[i] = r.nextInt(32);
            System.out.println(i);
        }
        this.gender = gender;
        this.level = level;
        this.name = name;
        this.base = base;

        this.maxHP = (Math.abs((2 * base[0] + IVs[0] + (EVs[0] / 4)) * level) / 100) + level + 10;
        this.atk = ((Math.abs((2 * base[1] + IVs[1] + (EVs[1] / 4)) * level) / 100 + 5));
        this.def = ((Math.abs((2 * base[1] + IVs[1] + (EVs[1] / 4)) * level) / 100 + 5));
        this.specialAtk = ((Math.abs((2 * base[1] + IVs[1] + (EVs[1] / 4)) * level) / 100 + 5));
        this.specialDef = ((Math.abs((2 * base[1] + IVs[1] + (EVs[1] / 4)) * level) / 100 + 5));
        this.speed = ((Math.abs((2 * base[1] + IVs[1] + (EVs[1] / 4)) * level) / 100 + 5));

    }

    public void moveSet(Moves[] moves) {
        this.moves = moves;
    }
    public void useMove(int b){
        moves[b].use();
    }
}
