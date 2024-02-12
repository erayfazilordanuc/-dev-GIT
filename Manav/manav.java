import java.util.*;

public class manav {
    public static void main(String[] m){

    System.out.println("\nÜrünlerden kaç kilo alacağınızı giriniz;\n");
    Scanner input=new Scanner(System.in);
    System.out.print("Armut: ");
    int armutkg = input.nextInt();
    System.out.print("Elma: ");
    int elmakg = input.nextInt();
    System.out.print("Domates: ");
    int domatkg = input.nextInt();
    System.out.print("Muz: ");
    int muzkg = input.nextInt();
    System.out.print("Patlıcan: ");
    int patkg = input.nextInt();
    float armut=2.14f,elma=3.67f,domates=1.11f,muz=0.95f,patlican=5;
    float total=(armutkg*armut)+(elmakg*elma)+(domatkg*domates)+(muzkg*muz)+(patkg*patlican);
    System.out.printf("\nAlışverişinizin toplam tutarı = %fTL\n",total);

    }
}
