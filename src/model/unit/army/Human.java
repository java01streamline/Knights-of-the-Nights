/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.unit.army;

import model.unit.Entity;

/**
 *
 * @author User
 */
public abstract class Human extends Entity{
    private int satisfaction;
    private CitizenType type;

    public Human(String name, int health, int attack, int defense, int satisfaction, CitizenType type) {
        super(name, health, attack, defense);
        this.satisfaction = satisfaction;
        this.type = type;
    }

    public int getSatisfaction() {
        return satisfaction;
    }

    public void setSatisfaction(int satisfaction) {
        this.satisfaction = satisfaction;
    }

    public CitizenType getType() {
        return type;
    }

    public void setType(CitizenType type) {
        this.type = type;
    }
}
