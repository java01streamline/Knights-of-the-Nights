/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package territory;

import model.resources.Resources;

/**
 *
 * @author 1
 */
public class Territory {
    private String name;
    int id;
    //int Trophies;
    private Resources resources;
    int age;

    public Territory(String name, int id, Resources resources, int age) {
        this.name = name;
        this.id = id;
        this.resources = resources;
        this.age = age;
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
