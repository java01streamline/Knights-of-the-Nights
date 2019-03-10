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
public class ResourcesImageLoader{
    
    private static String prefix = "resources/";
    /**********RESOURCES IMAGES**************/
    
    public static BufferedImage getFood(){
        try {
            return ImageIO.read(ImageInstance.class.getResourceAsStream(prefix+"food.png"));
        } catch (IOException ex) {
            Logger.getLogger(ImageInstance.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static BufferedImage getGold(){
        try {
            return ImageIO.read(ImageInstance.class.getResourceAsStream(prefix+"gold.png"));
        } catch (IOException ex) {
            Logger.getLogger(ImageInstance.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static BufferedImage getPeople(){
        try {
            return ImageIO.read(ImageInstance.class.getResourceAsStream(prefix+"people.png"));
        } catch (IOException ex) {
            Logger.getLogger(ImageInstance.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static BufferedImage getSoldier(){
        try {
            return ImageIO.read(ImageInstance.class.getResourceAsStream(prefix+"soldier.png"));
        } catch (IOException ex) {
            Logger.getLogger(ImageInstance.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static BufferedImage getStone(){
        try {
            return ImageIO.read(ImageInstance.class.getResourceAsStream(prefix+"stone.png"));
        } catch (IOException ex) {
            Logger.getLogger(ImageInstance.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static BufferedImage getWater(){
        try {
            return ImageIO.read(ImageInstance.class.getResourceAsStream(prefix+"food.png"));
        } catch (IOException ex) {
            Logger.getLogger(ImageInstance.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static BufferedImage getWood(){
        try {
            return ImageIO.read(ImageInstance.class.getResourceAsStream(prefix+"wood.png"));
        } catch (IOException ex) {
            Logger.getLogger(ImageInstance.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static BufferedImage getIron(){
        try {
            return ImageIO.read(ImageInstance.class.getResourceAsStream(prefix+"iron.png"));
        } catch (IOException ex) {
            Logger.getLogger(ImageInstance.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
