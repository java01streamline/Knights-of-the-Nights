package model.items;

public class Item implements ItemFace{
    public static void Item(){
        material mefc = new material();
        mefc.Name="MEFC";
        mefc.Lore="";
        mefc.Desire=0;
        mefc.Lvl_to_use=0;
        mefc.Cost=0;
        mefc.Danger=0;
        mefc.Strenght=90;
        mefc.Strong=5;
        mefc.Accuracy=100;
        mefc.Speed=10;
        
        material wood =new material();
        wood.Name="wood";
        wood.Lore="";
        wood.Desire=1;
        wood.Lvl_to_use=1;
        wood.Cost=5;
        wood.Danger=1;
        wood.Strenght=25;
        wood.Strong=3;
        wood.Accuracy=45;
        wood.Speed=7;
        
        material stone = new material();
        stone.Name="stone";
        stone.Lore="";
        stone.Desire=2;
        stone.Lvl_to_use=1;
        stone.Cost=5;
        stone.Danger=2;
        stone.Strenght=20;
        stone.Strong=6;
        stone.Accuracy=35;;
        stone.Speed=6;
    }
}