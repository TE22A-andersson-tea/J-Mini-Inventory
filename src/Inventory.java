import java.util.ArrayList;

public class Inventory {
    public ArrayList<Item> items = new ArrayList<>();

    public void Display(){
        for (Item item: items){
            System.out.println(item);
        }
    }
}
