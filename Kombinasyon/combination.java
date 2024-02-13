import java.util.*;

public class combination {

    public static long fact(long x){
        if(x==0){
            return 1;
        }
        int value=1;
      for(;x>0;x--){
       value*=x;
      }return value;
    }

    public static long combination(long a,long b){
     if(b>a){
        return 0;
     }
     return fact(a)/(fact(b)*(fact(a-b)));
    }

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    System.out.println("Enter two numbers to combine like C(First,Second) ");
    System.out.print("First :");
    int f = input.nextInt();
    System.out.print("Second :");
    int s = input.nextInt();

    System.out.println("\nThe combination of "+f+" and "+s+" is = "+combination(f,s));
    System.out.println(("C("+f+","+s+") = ")+combination(f,s)+"\n");

    }
}