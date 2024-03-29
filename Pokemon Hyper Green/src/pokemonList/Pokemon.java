/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonList;

import java.util.Random;
import moveList.Moves;
import pokemon.weed.green.Status;
import pokemon.weed.green.Type;

/**
 *
 * @author Darren H
 */
public abstract class Pokemon {

    String name;
    String ability;
    public int maxHP;
    public int HP;
    public int atk;
    public int def;
    public int specialAtk;
    public int specialDef;
    public int speed;
    public int level;
    
    public String[] sprites = {"000.png", "000b.png"};
    
    boolean confused;
    //true = male 
    public Type[] type = new Type[2];
    int gender;
    int[] EVYield = new int[6];
    int[] IVs = new int[6];
    int[] EVs = new int[6];
    int[] base = new int[6];
    Moves[] moves = new Moves[4];
    Status status = new Status();
    //Sound cry = new Sound("");
    Random r = new Random();

    public Pokemon(String name) {
        
        for (int i = 0; i < 6; i++) {
            this.IVs[i] = r.nextInt(32);
        }
        
        this.name = name;

    }
    
    public void gender(int gender) {
        this.gender = gender;
    }


    public void updateStats(int level, int[] base) {
        this.level = level;
        this.base = base;
        this.maxHP = (Math.abs((2 * this.base[0] + IVs[0] + (EVs[0] / 4)) * this.level) / 100) + this.level + 10;
        this.atk = (Math.abs((2 * this.base[1] + IVs[1] + (EVs[1] / 4)) * this.level) / 100 + 5);
        this.def = (Math.abs((2 * this.base[2] + IVs[2] + (EVs[2] / 4)) * this.level) / 100 + 5);
        this.specialAtk = (Math.abs((2 * this.base[3] + IVs[3] + (EVs[3] / 4)) * this.level) / 100 + 5);
        this.specialDef = (Math.abs((2 * this.base[4] + IVs[4] + (EVs[4] / 4)) * this.level) / 100 + 5);
        this.speed = (Math.abs((2 * this.base[5] + IVs[5] + (EVs[5] / 4)) * this.level) / 100 + 5);
        System.out.println(this.name + ": Speed - " + this.speed);
    }
    
    public void setEVYield(int[] EVYield){
        this.EVYield = EVYield;
    }
    
    public int[] getEVYield() {
        return EVYield;
    }
    
    public int[] getEVs() {
        return this.EVs;
    }

    public void moveSet(Moves[] moves) {
        this.moves = moves;
    }

    public Moves getMove(int moveSlot) {
        if (moveSlot < 0 || moveSlot > 3) {
            return null;
        }
        return moves[moveSlot];
    }
    
    public void setMove(int slot, Moves move) {
        moves[slot] = move;
    }
    
    public void heal(){
        this.HP = this.maxHP;
    }
}
