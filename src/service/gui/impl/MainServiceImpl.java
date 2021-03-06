package service.gui.impl;

import common.BuildingsView;
import gui.Main;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import model.gui.main.Cell;
import model.resources.Resources;
import model.unit.Entity;
import model.unit.buildings.impl.Mill_1_Impl;
import resources.images.ImageInstance;
import service.gui.MainService;

public class MainServiceImpl implements MainService {

    private static final int ROWS = 20;
    private static final int COLUMNS = 20;

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
        int x = 0, y = 0;
        for(HashMap.Entry<Class, BufferedImage> item : BuildingsView.pairs.entrySet()){
            cell = new Cell(item.getValue());
            cell.setEntity(createEntity(item.getKey()));
            cell.setBounds(x*Cell.WIDTH, y*Cell.HEIGHT, Cell.WIDTH, Cell.HEIGHT);
            cell.addActionListener(new java.awt.event.ActionListener() {
                    @Override
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
    //this method create Entity by name of class
    //it is may be Building or Human
    private Entity createEntity(Class c){
        try {
            return (Entity) Class.forName(c.getName()).newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(MainServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public void setImage(Cell cell, Cell button) {
        cell.setIm(button.getIm());
    }

    @Override
    public void mapBuilding(JPanel map) {
        
    }

    @Override
    public void mapResources(JPanel resourcesPanel, Resources resources) {
        Cell cell;
        HashMap<String, BufferedImage> resourcesIm = ImageInstance.getResources();
        int  x = 0, y = 0;
        for(Map.Entry<String, BufferedImage> pair : resourcesIm.entrySet()){
            cell = new Cell(pair.getValue());
            cell.updateImage(Cell.WIDTH/2, Cell.HEIGHT/2);
            cell.setFont(new Font("Arial", Font.BOLD, 18));
            cell.setText(resources.getResources().get(pair.getKey()).toString());
            cell.setBounds(x*Cell.WIDTH/2, y*Cell.HEIGHT, resourcesPanel.getWidth(), Cell.HEIGHT/2);
            resourcesPanel.add(cell);
            if(x+Cell.WIDTH/2 > resourcesPanel.getWidth()){
                x = 0;
                y++;
            }
            y++;
        }
        /*for(int i = 0, x = 0, y = 0; i < resourcesIm.size(); i++){
            cell = new Cell(resourcesIm.get(i));
            cell.updateImage(Cell.WIDTH/2, Cell.HEIGHT/2);
            
            cell.setFont(new Font("Arial", Font.BOLD, 18));
           
            cell.setBounds(x*Cell.WIDTH/2, y*Cell.HEIGHT, resourcesPanel.getWidth(), Cell.HEIGHT/2);
            
            /*cell.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        Cell cell = (Cell) evt.getSource();
                        Main.selectedAction = cell;
                    }
                });
            
            resourcesPanel.add(cell);
            if(x+Cell.WIDTH/2 > resourcesPanel.getWidth()){
                x = 0;
                y++;
            }
            //x++;
            y++;
        }*/
    }

    
}

/*
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
*/

/*
Cell cell;
        Field[] fields = BuildingsView.class.getDeclaredFields();
        for(int i = 0, x = 0, y = 0; i < fields.length; i++){
            try {
                if(!fields[i].get(BuildingsView.class).getClass().equals(BufferedImage.class)) continue;
                cell = new Cell((BufferedImage) fields[i].get(BuildingsView.class));
                //cell.setEntity(BuildingsView.pairs.get(y));
                if(cell.getIm().getWidth()!=cell.WIDTH || cell.getIm().getHeight()!=cell.HEIGHT){
                    cell.updateImage(cell.WIDTH, cell.HEIGHT);
                }
                cell.setEntity(new MillImpl());
                cell.setBounds(x*Cell.WIDTH, y*Cell.HEIGHT, Cell.WIDTH, Cell.HEIGHT);
                cell.addActionListener(new java.awt.event.ActionListener() {
                    @Override
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
            } catch (IllegalArgumentException ex) {
                Logger.getLogger(MainServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(MainServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
*/