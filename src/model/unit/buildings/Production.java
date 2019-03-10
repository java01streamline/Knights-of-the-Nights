/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.unit.buildings;

import java.util.HashMap;
import model.resources.ResourcesType;
import model.unit.BuildingsInterface;

/**
 *
 * @author admin
 */
public abstract class Production extends Building{

    public Production(String name, int health, int attack, int defense, BuildingsInterface type, int price, int level) {
        super(name, health, attack, defense, type, price, level);
    }
    
    public abstract HashMap.SimpleEntry<ResourcesType, Integer> getResource();
    
    public abstract boolean levelUp();
}