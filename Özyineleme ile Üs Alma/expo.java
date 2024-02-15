
import java.util.*;

public class expo {
    
    public static long expo(long a,long b){
        long cons=1;
        if(a==0||b==0){
            cons=1;}else{
        for(;b>0;b--)
            cons*=a;}
        return cons;}

    static long recursionexpo(long c,long d){
        if(d==1){
            return c;
        }
        return c*recursionexpo(c,d-1);
    }

    public static void main(String[] e){

    Scanner input = new Scanner(System.in);

    System.out.print("\nEnter the number you want to get its exponent :");
    int a = input.nextInt();

    System.out.print("\nEnter the value of power of number :");
    int b = input.nextInt();

    System.out.println("\nThe answer is : "+recursionexpo(a,b)+"\n");
    
    }
}
