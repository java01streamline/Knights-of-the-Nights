/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.unit.army;

/**
 *
 * @author 1
 */
public class Soldier extends Human implements SoldierInterface{
    
    public Soldier(String name, int health, int attack, int defense, int satisfaction) {
        super(name, health, attack, defense, satisfaction);
    }

    @Override
    public void fight() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void todesert() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
