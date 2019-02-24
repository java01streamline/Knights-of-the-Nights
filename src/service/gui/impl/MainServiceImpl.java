package service.gui.impl;

import gui.Main;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
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
    public void mapActions(JPanel actions) {
        Cell cell;
        ArrayList<BufferedImage> buildings = ImageInstance.getBuildings();
        for(int i = 0, x = 0, y = 0; i < buildings.size(); i++){
            cell = new Cell(buildings.get(i));
            cell.updateImage(Cell.WIDTH/2, Cell.HEIGHT/2);
            cell.setBounds(x*Cell.WIDTH/2, y*Cell.HEIGHT, Cell.WIDTH/2, Cell.HEIGHT/2);
            cell.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        Cell cell = (Cell) evt.getSource();
                        Main.selectedAction = cell;
                    }
                });
            actions.add(cell);
            if(x+Cell.WIDTH/2 > actions.getWidth()){
                x = 0;
                y++;
            }
            x++;
        }
    }

    @Override
    public void setImage(Cell cell, Cell button) {
        cell.setIm(button.getIm());
    }

    @Override
    public void mapBuilding(JPanel map) {
        
    }

    
}
