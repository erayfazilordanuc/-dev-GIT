import java.util.Scanner;

public class taksimetre {
    public static void main(String[] taximeter){
    
    System.out.println(" ");
    System.out.println("Enter the distance you will travel in km");

    Scanner inp = new Scanner(System.in);
    int km = inp.nextInt();
    double value = (km*2.20);
    if(value<10){
        value=10;
    }
    System.out.println(" ");
    System.out.print("Your cost is ");
    System.out.print(value+10);
    System.out.println("TL");
    System.out.println(" ");
    }
}
