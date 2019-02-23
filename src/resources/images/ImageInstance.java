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
 * @author User
 */
public class ImageInstance {
    
    public static BufferedImage getDefault(){
        try {
            return ImageIO.read(ImageInstance.class.getResourceAsStream("default.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(ImageInstance.class.getName()).log(Level.SEVERE, null, ex);
            throw new UnsupportedOperationException();
        }
    }
}
