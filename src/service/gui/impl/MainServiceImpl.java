
package service.gui.impl;

import java.awt.Dimension;
import javax.swing.JPanel;
import model.gui.main.Cell;
import resources.images.ImageInstance;
import service.gui.MainService;

public class MainServiceImpl implements MainService{
    private static final int ROWS = 10;
    private static final int COLUMNS = 10;
    
    @Override
    public void mapInit(JPanel map) {
        Cell cell;
        for(int i = 0; i < ROWS; i++){
            for(int j = 0; j < COLUMNS; j++){
                cell = new Cell(ImageInstance.getDefault());
                cell.setBounds(i*Cell.WIDTH, j*Cell.HEIGHT, Cell.WIDTH, Cell.HEIGHT);
                cell.setPreferredSize(new Dimension(Cell.WIDTH, Cell.HEIGHT));
                cell.setMaximumSize(new Dimension(Cell.WIDTH, Cell.HEIGHT));
                map.add(cell);
            }
        }
    }

    @Override
    public void createBuilding(Cell cell) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
