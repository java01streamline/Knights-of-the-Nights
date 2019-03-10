package model.gui.main;

import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import model.unit.Entity;

public class Cell extends JButton{
    public static final int WIDTH = 32;
    public static final int HEIGHT = 32;
    private BufferedImage im;
    private Entity entity;

    public Entity getEntity() {
        return entity;
    }

    public void setEntity(Entity entity) {
        this.entity = entity;
    }

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
        this.setIcon(new ImageIcon(im.getScaledInstance(WIDTH, HEIGHT, Image.SCALE_SMOOTH)));
    }
    
    public void updateImage(int width, int height){
        this.setIcon(new ImageIcon(im.getScaledInstance(width, height, Image.SCALE_SMOOTH)));
    }
}
