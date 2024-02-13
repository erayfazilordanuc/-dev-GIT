
import java.util.*;

public class expo {

    static long expo(int a,int b){
        long cons=1;
        if(a==0||b==0)
            cons=0;
        for(;b>0;b--)
            cons*=a;
        return cons;}

    public static void main(String[] e){
    Scanner input = new Scanner(System.in);
    System.out.println("\nEnter the number you want to get its exponent");
    int a = input.nextInt();

    System.out.println("\nEnter the value of power of number");
    int b = input.nextInt();

    System.out.println("\nThe answer is : "+expo(a,b)+"\n");
    }
}
