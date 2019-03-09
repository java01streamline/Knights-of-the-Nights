/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources.images;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author admin
 */
public class BuildingsImageLoader {
    
    private static String prefix = "buildings/";
    
    /**********BUILDINGS IMAGES**************/
    
    public static BufferedImage getTower(){
        try {
            return ImageIO.read(ImageInstance.class.getResourceAsStream(prefix+"tower.png"));
        } catch (IOException ex) {
            Logger.getLogger(ImageInstance.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static BufferedImage getBarrack(){
        try {
            return ImageIO.read(ImageInstance.class.getResourceAsStream(prefix+"barrack.png"));
        } catch (IOException ex) {
            Logger.getLogger(ImageInstance.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static BufferedImage getMill(){
        try {
            return ImageIO.read(ImageInstance.class.getResourceAsStream(prefix+"mill.png"));
        } catch (IOException ex) {
            Logger.getLogger(ImageInstance.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static BufferedImage getResidentialBuilding(){
        try {
            return ImageIO.read(ImageInstance.class.getResourceAsStream(prefix+"residential_building.png"));
        } catch (IOException ex) {
            Logger.getLogger(ImageInstance.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static BufferedImage getArcheryTower(){
        try {
            return ImageIO.read(ImageInstance.class.getResourceAsStream(prefix+"archery_tower.png"));
        } catch (IOException ex) {
            Logger.getLogger(ImageInstance.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static BufferedImage getCampOfUnits(){
        try {
            return ImageIO.read(ImageInstance.class.getResourceAsStream(prefix+"camp_of_units.png"));
        } catch (IOException ex) {
            Logger.getLogger(ImageInstance.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static BufferedImage getMagicianTower(){
        try {
            return ImageIO.read(ImageInstance.class.getResourceAsStream(prefix+"magician_tower.png"));
        } catch (IOException ex) {
            Logger.getLogger(ImageInstance.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
