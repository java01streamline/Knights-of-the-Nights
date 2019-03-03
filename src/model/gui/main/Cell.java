package model.gui.main;

import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Cell extends JButton{
    public static final int WIDTH = 64;
    public static final int HEIGHT = 64;
    private BufferedImage im;

    public Cell(BufferedImage im) {
        this.im = im;
        this.setBorder(null);
        updateImage();
    }

    public BufferedImage getIm() {
        return im;
    }

    public void setIm(BufferedImage im) {
        this.im = im;
        updateImage();
    }
    
    public void updateImage(){
        this.setIcon(new ImageIcon(im));
    }
    
    public void updateImage(int width, int height){
        this.setIcon(new ImageIcon(im.getScaledInstance(width, height, Image.SCALE_SMOOTH)));
    }
}
