import java.util.*;

public class threefiveforces {
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.println("Enter a number");
    
    int a = input.nextInt();

    int constant3=3;
    int constant5=5;

    System.out.println("0");
    while(constant3<=a){

        System.out.println(constant3);

        constant3=3*constant3;
    
    }while(constant5<=a){

        System.out.println(constant5);

        constant5=5*constant5;
        }
    }
}