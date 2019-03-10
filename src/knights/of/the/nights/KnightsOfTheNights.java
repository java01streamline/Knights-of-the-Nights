package knights.of.the.nights;

import common.BuildingsView;
import common.ResourcesView;
import gui.Main;
import java.awt.Image;
import model.resources.Resources;
import resources.images.BuildingsImageLoader;
import resources.images.ResourcesImageLoader;
import territory.Territory;
import zametki.frames.test;

public class KnightsOfTheNights {

    public static void main(String[] args) {
        init();
        Resources res = new Resources(50, 50, 10, 0, 50, 20, 50, 10);
        Territory ter = new Territory("Example", 0, res, 0);
           new Main(ter).setVisible(true);
    }
    
    private static void init(){
        BuildingsView.initPairs();
        
        ResourcesView.food = ResourcesImageLoader.getFood();
        ResourcesView.gold = ResourcesImageLoader.getGold();
        ResourcesView.iron = ResourcesImageLoader.getIron();
        ResourcesView.people = ResourcesImageLoader.getPeople();
        ResourcesView.soldier = ResourcesImageLoader.getSoldier();
        ResourcesView.stone = ResourcesImageLoader.getStone();
        ResourcesView.water = ResourcesImageLoader.getWater();
        ResourcesView.wood = ResourcesImageLoader.getWood();
        
        BuildingsView.archeryTower = BuildingsImageLoader.getArcheryTower();
        BuildingsView.barrack = BuildingsImageLoader.getBarrack();
        BuildingsView.campOfUnits = BuildingsImageLoader.getCampOfUnits();
        BuildingsView.magicianTower = BuildingsImageLoader.getMagicianTower();
        BuildingsView.mill = BuildingsImageLoader.getMill();
        BuildingsView.residential_building = BuildingsImageLoader.getResidentialBuilding();
        BuildingsView.tower = BuildingsImageLoader.getTower();
    }
    
}
