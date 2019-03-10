
package thread.main;

import gui.Main;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainThread extends Thread{

    /*public MainThread(){
        this.run();
    }*/
    
    @Override
    public void run() {
        while(true){
            if(Main.selectedCell != null && Main.selectedAction != null){
                
                Main.selectedCell.setIm(Main.selectedAction.getIm());
                Main.selectedAction = null;
                Main.selectedCell = null;
            }
            try {
                this.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(MainThread.class.getName()).log(Level.SEVERE, null, ex);
            }
            Main.posrednic.slide_items();
        }
    }
    
}
