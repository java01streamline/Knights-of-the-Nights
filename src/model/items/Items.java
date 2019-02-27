package model.items;

public class Items {
    public static void Items(){
        material mefc = new material();
        mefc.Name="MEFC";
        mefc.Lore="";
        mefc.Cost=0;
        mefc.Lvl_to_use=0;
        mefc.Danger=0;
        mefc.Strenght=90;
        mefc.Strong=5;
        mefc.Speed=10;
        mefc.Accuracy=100;
        mefc.Desire="all";
        
        material wood =new material();
        wood.Name="wood";
        wood.Lore="";
        wood.Cost=5;
        wood.Lvl_to_use=1;
        wood.Danger=1;
        wood.Desire="wooder";
    }
}

class item {
    String Name;
    String Lore;
    int How_are_you_have;
    int Danger;
    int Cost;
    int Lvl_to_use;
    String Desire;
}

class material extends item{
    int Strong;
    int Strenght;
    int Speed;
    int Accuracy;
}