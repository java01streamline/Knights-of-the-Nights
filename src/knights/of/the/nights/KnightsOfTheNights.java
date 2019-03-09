package knights.of.the.nights;

import gui.Main;
import model.resources.Resources;
import territory.Territory;
import zametki.frames.test;

public class KnightsOfTheNights {

    public static void main(String[] args) {
        Resources res = new Resources(50, 50, 10, 0, 50, 20, 50, 10);
        Territory ter = new Territory("Example", 0, res, 0);
           new Main(ter).setVisible(true);
    }
    
}
