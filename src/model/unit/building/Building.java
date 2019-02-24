/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.unit.building;

import model.unit.Entity;

/**
 *
 * @author User
 */
public abstract class Building extends Entity{
    private BuildingType type;

    public Building(String name, int health, int attack, int defense, BuildingType type) {
        super(name, health, attack, defense);
        this.type = type;
    }

    public BuildingType getType() {
        return type;
    }

    public void setType(BuildingType type) {
        this.type = type;
    }
}