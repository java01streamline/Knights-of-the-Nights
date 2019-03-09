package model.unit.buildings;

import model.unit.BuildingsInterface;
import model.unit.Entity;

public abstract class Building extends Entity{
    private BuildingsInterface type;

    public Building(String name, int health, int attack, int defense, BuildingsInterface type, int price, int level) {
        super(name, health, attack, defense, price, level);
        this.type = type;
    }

    public BuildingsInterface getType() {
        return type;
    }

    public void setType(BuildingsInterface type) {
        this.type = type;
    }
}
