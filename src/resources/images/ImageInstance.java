/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources.images;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author User
 */
public class ImageInstance {
    
    private static String bNames[] = {"tower","barrack","mill","residential_building"};
    public final static String rNames[] = 
    {   "food",
        "gold",
        "people",
        "soldier",
        "stone",
        "water",
        "wood",
        "iron"
    };
    
    public static BufferedImage getDefault(){
        try {
            return ImageIO.read(ImageInstance.class.getResourceAsStream("default.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(ImageInstance.class.getName()).log(Level.SEVERE, null, ex);
            throw new UnsupportedOperationException();
        }
    }
    
    public static BufferedImage getResidentBuilding(){
        try {
            return ImageIO.read(ImageInstance.class.getResourceAsStream("buildings/residential_building.png"));
        } catch (IOException ex) {
            Logger.getLogger(ImageInstance.class.getName()).log(Level.SEVERE, null, ex);
            throw new UnsupportedOperationException();
        }
    }
    
    public static ArrayList<BufferedImage> getBuildings(){
        ArrayList<BufferedImage> buildings = new ArrayList<>();
        //File f=new File("C\\Users\\Admin\\Documents\\NetBeansProjects\\Knights-of-the-Nights\\src\\resources\\images\\buildings");
       
        for(int i = 0; i < bNames.length; i++){
            try {
                buildings.add(ImageIO.read(ImageInstance.class.getResourceAsStream("buildings/"+bNames[i]+".png")));
            } catch (IOException ex) {
                Logger.getLogger(ImageInstance.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return buildings;
    }
    
    public static HashMap<String, BufferedImage> getResources(){
        HashMap<String, BufferedImage> ret = new HashMap<>();
        //File f=new File("C\\Users\\Admin\\Documents\\NetBeansProjects\\Knights-of-the-Nights\\src\\resources\\images\\buildings");
       
        for(int i = 0; i < rNames.length; i++){
            try {
                ret.put(rNames[i], ImageIO.read(ImageInstance.class.getResourceAsStream("resources/"+rNames[i]+".png")));
            } catch (IOException ex) {
                Logger.getLogger(ImageInstance.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return ret;
    }
}
