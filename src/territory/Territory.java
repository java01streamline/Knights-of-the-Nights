/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package territory;

import java.util.ArrayList;
import model.resources.Resources;
import model.unit.army.Human;
import model.unit.buildings.Building;

/**
 *
 * @author 1
 */
public class Territory {
    private int userId;
    private String name;
    private int id;
    //int Trophies;
    private Resources resources;
    private int age;
    private ArrayList<Building> buildings;
    private ArrayList<Human> humans;

    public ArrayList<Building> getBuildings() {
        return buildings;
    }

    public void setBuildings(ArrayList<Building> buildings) {
        this.buildings = buildings;
    }

    public ArrayList<Human> getHumans() {
        return humans;
    }

    public void setHumans(ArrayList<Human> humans) {
        this.humans = humans;
    }

    public Territory(int userId, String name, int id, Resources resources, int age) {
        this.userId = userId;
        this.name = name;
        this.id = id;
        this.resources = resources;
        this.age = age;
    }

    public Territory(String name, int id, Resources resources, int age) {
        this.name = name;
        this.id = id;
        this.resources = resources;
        this.age = age;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Resources getResources() {
        return resources;
    }

    public void setResources(Resources resources) {
        this.resources = resources;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
}
