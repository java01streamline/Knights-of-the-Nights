package resources.images;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

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
           int random_default = (int)(Math.random()*19+1);
          System.out.println("[build_tera]: "+random_default);
           
        try {
            if(random_default<=4){return ImageIO.read(ImageInstance.class.getResourceAsStream("defaults/dafault_"+random_default+".png"));}
            else {return ImageIO.read(ImageInstance.class.getResourceAsStream("defaults/dafault.png"));}
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
