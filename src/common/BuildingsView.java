/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;
import model.unit.buildings.impl.MillImpl;
import resources.images.BuildingsImageLoader;

/**
 *
 * @author admin
 */
public class BuildingsView {
    public static HashMap<Class, BufferedImage> pairs;
    
    
    public static BufferedImage tower;
    public static BufferedImage barrack;
    public static BufferedImage mill;
    public static BufferedImage archeryTower;
    public static BufferedImage campOfUnits;
    public static BufferedImage magicianTower;
    public static BufferedImage residential_building;
    
    public static void initPairs(){
        pairs = new HashMap<>();
        pairs.put(MillImpl.class, BuildingsImageLoader.getMill());
    }
}
