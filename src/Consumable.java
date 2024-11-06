

public class Consumable {
    int usesMax;
    int usesCurrent;

    public void Use(Character target){
        usesMax = 10;
        
        if (usesCurrent < usesMax) {
            target.hp += 10;
            System.out.println("You have now used this item!");
        } 
        
        else if (usesCurrent >= usesMax){
            System.out.println("You have used this item too many times!");
        }
        else{
            System.out.println("Something went wrong... ");
        }
    }
}
