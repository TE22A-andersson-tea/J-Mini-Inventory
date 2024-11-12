public class Character {
    String name;
    int hp;
    Inventory backpack;

    public Character(String inName, int inHp){
        name = inName;
        hp = inHp;
        backpack = new Inventory();
        
    }
}