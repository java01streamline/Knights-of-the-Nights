/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.gui.main;

import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author User
 */
public class Cell extends JButton{
    public static final int WIDTH = 64;
    public static final int HEIGHT = 64;
    private BufferedImage im;

    public Cell(BufferedImage im) {
        this.im = im;
        this.setIcon(new ImageIcon(im));
    }

    public BufferedImage getIm() {
        return im;
    }

    public void setIm(BufferedImage im) {
        this.im = im;
    }
}
