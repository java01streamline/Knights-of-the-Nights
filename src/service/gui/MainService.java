
package service.gui;

import javax.swing.JPanel;
import model.gui.main.Cell;

public interface MainService {
    
    void mapInit(JPanel map);
    
    void createBuilding(Cell cell);
}
