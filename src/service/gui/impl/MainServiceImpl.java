package service.gui.impl;

import gui.Main;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import model.gui.main.Cell;
import resources.images.ImageInstance;
import service.gui.MainService;

public class MainServiceImpl implements MainService {

    private static final int ROWS = 10;
    private static final int COLUMNS = 10;

    @Override
    public void mapInit(JPanel map) {
        Cell cell;
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                cell = new Cell(ImageInstance.getDefault());
                cell.setBounds(i * Cell.WIDTH, j * Cell.HEIGHT, Cell.WIDTH, Cell.HEIGHT);
                cell.setPreferredSize(new Dimension(Cell.WIDTH, Cell.HEIGHT));
                cell.setMaximumSize(new Dimension(Cell.WIDTH, Cell.HEIGHT));
                cell.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        Cell cell = (Cell) evt.getSource();
                        Main.selectedCell = cell;
                    }
                });
                map.add(cell);
            }
        }
    }

    @Override
    public void setImage(Cell cell, Cell button) {
        cell.setIm(button.getIm());
    }
}
