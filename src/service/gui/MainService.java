
package service.gui;

import javax.swing.JPanel;
import model.gui.main.Cell;

public interface MainService {
    
    void mapInit(JPanel map);
    
    void mapActions(JPanel actions);
    
    void setImage(Cell cell, Cell button);
    
    void mapBuilding(JPanel map);
}
