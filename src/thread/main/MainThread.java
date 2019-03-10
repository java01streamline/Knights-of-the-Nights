package thread.main;

import gui.Main;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainThread extends Thread {

    /*public MainThread(){
        this.run();
    }*/
    @Override
    public void run() {
        while (true) {
            if (Main.selectedCell != null && Main.selectedAction != null) {
                if (buy()) {
                    Main.selectedCell.setIm(Main.selectedAction.getIm());
                    Main.selectedAction = null;
                    Main.selectedCell = null;
                }
            }
            try {
                this.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(MainThread.class.getName()).log(Level.SEVERE, null, ex);
            }
            Main.posrednic.slide_items();
        }
    }

    private boolean buy() {
        if (Main.posrednic.getTerritory().getResources().getGold() >= Main.selectedAction.getEntity().getPrice()) {
            Main.posrednic.getTerritory().getResources().setGold(Main.posrednic.getTerritory().getResources().getGold() - Main.selectedAction.getEntity().getPrice());
            System.out.println(Main.posrednic.getTerritory().getResources().getGold());
            return true;
        }
        return false;
    }

}
