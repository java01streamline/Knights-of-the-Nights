package thread.main;

import gui.Main;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.resources.Resources;
import model.resources.ResourcesType;
import model.unit.army.Human;
import model.unit.buildings.Building;
import model.unit.buildings.BuildingsType;
import model.unit.buildings.Production;
import territory.Territory;

public class MainThread extends Thread {

    private final Long timeToWait = 10000L;

    /*public MainThread(){
        this.run();
    }*/
    @Override
    public void run() {
        Long time = System.currentTimeMillis();
        while (true) {
            if (Main.selectedCell != null && Main.selectedAction != null) {
                if (checkBuying()) {
                    buyProcess();
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
            if (System.currentTimeMillis() >= time + timeToWait) {
                getResourcesOnTime();
                time = System.currentTimeMillis();
            }
        }
    }

    private boolean checkBuying() {
        if (Main.posrednic.getTerritory().getResources().getGold() >= Main.selectedAction.getEntity().getPrice()) {
            Main.posrednic.getTerritory().getResources().setGold(Main.posrednic.getTerritory().getResources().getGold() - Main.selectedAction.getEntity().getPrice());
            System.out.println(Main.posrednic.getTerritory().getResources().getGold());
            return true;
        }
        return false;
    }

    private void buyProcess() {
        if (Main.selectedAction.getEntity() instanceof Building) {
            buyBuilding();
            return;
        }
        buyHuman();
    }

    private void buyBuilding() {
        Main.posrednic.getTerritory().getBuildings().add((Building) Main.selectedAction.getEntity());
    }

    private void buyHuman() {
        Main.posrednic.getTerritory().getHumans().add((Human) Main.selectedAction.getEntity());
    }

    private void getResourcesOnTime() {
        for (Building b : Main.posrednic.getTerritory().getBuildings()) {
            if (!b.getType().getType().equals(BuildingsType.PRODUCTION)) {
                continue;
            }
            System.out.println("Level:"+((Production) b).getLevel());
            System.out.println("Profit:"+((Production) b).getType().getProfit());
            addResourceToTerritoryResources(((Production) b).getResource());
        }
    }

    private void addResourceToTerritoryResources(HashMap.SimpleEntry<ResourcesType, Integer> resource) {
        Resources res = Main.posrednic.getTerritory().getResources();
        switch (resource.getKey()) {
            case FOOD:
                res.setFood(res.getFood() + resource.getValue().intValue());
                System.out.println("Food:"+res.getFood());
                break;
            case GOLD:
                res.setGold(res.getGold() + resource.getValue());
                break;
            case PEOPLE:
                res.setPeoples(res.getPeoples() + resource.getValue());
                break;
            case SOLDIER:
                res.setSoldiers(res.getSoldiers() + resource.getValue());
                break;
            case STONE:
                res.setStones(res.getStones() + resource.getValue());
                break;
            case WATER:
                res.setWater(res.getWater() + resource.getValue());
                break;
            case WOOD:
                res.setWood(res.getWood() + resource.getValue());
                break;
            case IRON:
                res.setIron(res.getIron() + resource.getValue());
                break;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
