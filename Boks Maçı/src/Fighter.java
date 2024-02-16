import java.util.Random;

public class Fighter {
    Random rand = new Random();
    String name,nickname;
    int maxdamage,mindamage,health,criticalDamage;
    
    Fighter(String name, String nickname, int maxdamage,int mindamage, int health, int criticalDamage){
        this.name = name;
        this.nickname = nickname;
        this.maxdamage = maxdamage;
        this.mindamage = mindamage;
        this.health = health;
        this.criticalDamage = criticalDamage;
    }
    
    int hit(Fighter foe){
        int int_random = rand.nextInt(this.maxdamage-this.mindamage+1)+this.mindamage; 
        System.out.println("\n"+this.name+" "+(int_random)+" hasar vurdu");
        if((foe.health-int_random)<=0){
            System.out.println(foe.name+" canı 0 kaldı");
            return 0;
        }else{
          System.out.println(foe.name+" canı "+(foe.health-(int_random))+" kaldı");
          return foe.health-(int_random);}
    }
}