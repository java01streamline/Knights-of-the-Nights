package model.unit.building;

import model.unit.Entity;

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
