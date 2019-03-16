package model.unit.buildings.impl;

import java.util.AbstractMap;
import java.util.HashMap;
import model.resources.ResourcesType;
import model.unit.BuildingsInterface;
import model.unit.buildings.BuildingsType;
import model.unit.buildings.Production;
import model.unit.buildings.ProductionBuildingsType;

public final class Mill_1_Impl extends Production {

    public Mill_1_Impl() {
        super(
                ProductionBuildingsType.MILL_1.getID(),
                ProductionBuildingsType.MILL_1.getName(),
                ProductionBuildingsType.MILL_1.getHealth(),
                ProductionBuildingsType.MILL_1.getAttack(),
                ProductionBuildingsType.MILL_1.getDefense(),
                ProductionBuildingsType.MILL_1,
                ProductionBuildingsType.MILL_1.getPrice(),
                ProductionBuildingsType.MILL_1.getLevel());
    }

    @Override
    public HashMap.SimpleEntry<ResourcesType, Integer> getResource() {
        return new HashMap.SimpleEntry<>(ResourcesType.FOOD, this.getLevel() * ProductionBuildingsType.MILL_1.getProfit());
    }

    @Override
    public boolean levelUp() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
