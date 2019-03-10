/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.unit.buildings.impl;

import java.util.AbstractMap;
import java.util.HashMap;
import model.resources.ResourcesType;
import model.unit.BuildingsInterface;
import model.unit.buildings.BuildingsType;
import model.unit.buildings.Production;
import model.unit.buildings.ProductionBuildingsType;

/**
 *
 * @author admin
 */
public final class MillImpl extends Production {

    public MillImpl() {
        super(
                ProductionBuildingsType.MILL.getName(),
                ProductionBuildingsType.MILL.getHealth(),
                ProductionBuildingsType.MILL.getAttack(),
                ProductionBuildingsType.MILL.getDefense(),
                ProductionBuildingsType.MILL,
                ProductionBuildingsType.MILL.getPrice(),
                ProductionBuildingsType.MILL.getLevel());
    }

    @Override
    public HashMap.SimpleEntry<ResourcesType, Integer> getResource() {
        return new HashMap.SimpleEntry<>(ResourcesType.FOOD, this.getLevel() * ProductionBuildingsType.MILL.getProfit());
    }

    @Override
    public boolean levelUp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
