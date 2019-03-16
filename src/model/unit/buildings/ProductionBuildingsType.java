package model.unit.buildings;

import model.resources.ResourcesType;
import model.unit.BuildingsInterface;

public enum ProductionBuildingsType implements BuildingsInterface {
    MILL_1(1,"Mill", 500, 100, 0, ResourcesType.FOOD, 1, 10, BuildingsType.PRODUCTION, 10);
    private int ID;
    private String name;
    private int health;
    private int defense;
    private int attack;
    private int level;
    private ResourcesType profitType;
    private int profit;
    private BuildingsType type;
    private int price;

    ProductionBuildingsType(
            int ID,
            String name,
            int health,
            int defense,
            int attack,
            ResourcesType resType,
            int level,
            int profit,
            BuildingsType type,
            int price
    ) {
        this.ID = ID;
        this.name = name;
        this.health = health;
        this.defense = defense;
        this.attack = attack;
        this.profitType = resType;
        this.level = level;
        this.profit = profit;
        this.type = type;
        this.price = price;
    }
    
    public int getID(){
        return ID;
    }
    
    public void setID(){
        this.ID = ID;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public ResourcesType getProfitType() {
        return profitType;
    }

    public void setProfitType(ResourcesType profitType) {
        this.profitType = profitType;
    }

    public int getProfit() {
        return profit;
    }

    public void setProfit(int profit) {
        this.profit = profit;
    }

    public BuildingsType getType() {
        return type;
    }

    public void setType(BuildingsType type) {
        this.type = type;
    }
}
