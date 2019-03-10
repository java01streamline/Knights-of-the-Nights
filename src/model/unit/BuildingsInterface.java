/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.unit;

import model.resources.ResourcesType;
import model.unit.buildings.BuildingsType;

/**
 *
 * @author admin
 */
public interface BuildingsInterface {
    
    public abstract int getPrice() ;

    public abstract int getAttack() ;

    public abstract String getName() ;

    public abstract int getHealth() ;

    public abstract int getDefense();

    public abstract int getLevel() ;

    public abstract ResourcesType getProfitType();

    public abstract int getProfit();

    public abstract BuildingsType getType();
}
