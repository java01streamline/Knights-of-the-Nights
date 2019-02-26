
package service.gui;

import javax.swing.JPanel;
import model.gui.main.Cell;
import model.resources.Resources;

public interface MainService {
    
    void mapInit(JPanel map);
    
    void mapActions(JPanel actions);
    
    void mapResources(JPanel resourcesPanel, Resources resources);
    
    void setImage(Cell cell, Cell button);
    
    void mapBuilding(JPanel map);
}
