/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources.images;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author User
 */
public class ImageInstance {
    
    private static String bNames[] = {"archery_tower.png","barrack.png","camp_of_units.png","residential_building.png"};
    
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
    
    public static ArrayList<BufferedImage> getBuildings() throws IOException{
        ArrayList<BufferedImage> buildings = new ArrayList<>();
        //File f=new File("C\\Users\\Admin\\Documents\\NetBeansProjects\\Knights-of-the-Nights\\src\\resources\\images\\buildings");
       
        for(int i = 0; i < bNames.length; i++){
            buildings.add(ImageIO.read(ImageInstance.class.getResourceAsStream("buildings/"+bNames[i])));
        }
        
       
        /*for()
        building.add(ImageIO.read(ImageInstance.class.getResourceAsStream(f+"buildings/camp.of.units")));
        building.add(ImageIO.read(ImageInstance.class.getResourceAsStream(f+"buildings/residential_building.png")));
        building.add(ImageIO.read(ImageInstance.class.getResourceAsStream(f+"buildings/archery_tower.png")));
        building.add(ImageIO.read(ImageInstance.class.getResourceAsStream(f+"buildings/barrack.png")));
        return building;*/
        
        return buildings;
    }
}
