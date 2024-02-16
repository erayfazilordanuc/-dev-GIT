import java.util.Random;

public class Match {

    Fighter f1;
    Fighter f2;
    int minweight;
    int maxweight;

    Match(Fighter f1,Fighter f2,int minweight,int maxweight){
        this.f1 = f1;
        this.f2 = f2;
        this.minweight = minweight;
        this.maxweight = maxweight;

    }

    void run(){
        Random rand = new Random();
        int random = rand.nextInt(1);
    if((this.f1.health>=this.minweight && this.f1.health<=this.maxweight) && (this.f2.health>=this.minweight && this.f2.health<=this.maxweight)){
        System.out.println(this.f1.name+" canı "+this.f1.health);
        System.out.println(this.f2.name+" canı "+this.f2.health);
        while(this.f2.health>0 && this.f1.health>0){
           this.f2.health = f1.hit(this.f2);
           if(this.f2.health==0){
            break;
           }
           this.f1.health = f2.hit(this.f1);
           }
           if(this.f2.health==0){
            System.out.println("\n"+this.f1.name+" kazandı\n");
           }
           if(this.f1.health==0){
            System.out.println("\n"+this.f2.name+" kazandı\n");
           }
          }else{
     System.out.println("Sporcuların sikletleri uyuşmuyor");}
    }
}
