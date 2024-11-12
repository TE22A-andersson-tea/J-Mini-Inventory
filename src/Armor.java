public class Armor extends Item{
    float protection;
    String name;

    public Armor(float inProtection, String inName){
        protection = inProtection;
        name = inName;
    }

    Armor helmet = new Armor(2, "Helmet");

    public void pickUpItem(String itemName, float itemProtection){
       Armor armor = new Armor(itemProtection, itemName);
        System.out.println("You have found a new piece of armor!");
        System.out.println("Do you wish to pick up this " + itemName + ", that has protection " + itemProtection + "?");

    }
}
