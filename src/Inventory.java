import java.util.ArrayList;

public class Inventory {
    public ArrayList<Item> items = new ArrayList<>();

    public Inventory(){
        items.add(new Weapon(1, 2));
        items.add(new Consumable(1,0));
    }

    public void Display(){
        for (Item item: items){
            System.out.println(item);
        }
    }

    public void addItem(Item item){
        items.add(item);
    }


}
