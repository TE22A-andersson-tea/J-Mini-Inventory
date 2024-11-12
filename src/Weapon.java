import java.util.Random;

public class Weapon extends Item{
    int minDamage;
    int maxDamage;
    private Random generator = new Random();

    public Weapon(int minDamage, int maxDamage){
        minDamage = 1;
        maxDamage = 12;
    }

    
    public int Attack(){
       int attack = generator.nextInt(minDamage, maxDamage +1 );
       return attack;
    }
}
