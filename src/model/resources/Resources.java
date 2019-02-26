/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.resources;

import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author User
 */
public class Resources {
    private int food;
    private int gold;
    private int people;
    private int soldier;
    private int stone;
    private int water;
    private int wood;
    private int iron;

    public Resources(int food, int gold, int peoples, int soldiers, int stones, int water, int wood, int iron) {
        this.food = food;
        this.gold = gold;
        this.people = peoples;
        this.soldier = soldiers;
        this.stone = stones;
        this.water = water;
        this.wood = wood;
        this.iron = iron;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getPeoples() {
        return people;
    }

    public void setPeoples(int peoples) {
        this.people = peoples;
    }

    public int getSoldiers() {
        return soldier;
    }

    public void setSoldiers(int soldiers) {
        this.soldier = soldiers;
    }

    public int getStones() {
        return stone;
    }

    public void setStones(int stones) {
        this.stone = stones;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getWood() {
        return wood;
    }

    public void setWood(int wood) {
        this.wood = wood;
    }

    public int getIron() {
        return iron;
    }

    public void setIron(int iron) {
        this.iron = iron;
    }
    
    public HashMap<String, Integer> getResources(){
        HashMap<String, Integer> ret = new HashMap<>();
        ret.put("food", food);
        ret.put("gold", gold);
        ret.put("people", people);
        ret.put("soldier", soldier);
        ret.put("stone", stone);
        ret.put("water", water);
        ret.put("wood", wood);
        ret.put("iron", iron);
        return ret;
    }
}
