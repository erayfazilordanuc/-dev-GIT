import java.util.*;

public class digits {

    public static int first(int f){
        return f%10;
    }
    public static int second(int s){
        return ((s-s%10)%100)/10;
    }
    public static int third(int t){
        return ((t%1000)-t%100)/100;
    }
    public static int forth(int t){
        return ((t%10000)-t%1000)/1000;
    }
    public static void main(String[] args){
    while(true){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number to separate into digits between 0-9999");
    int a = input.nextInt();
    if(a>9999){
     System.out.println("You entered a number out of range");
     continue;
    }
    System.out.println("The first digit is : "+first(a));
    System.out.println("The second digit is : "+second(a));
    System.out.println("The third digit is : "+third(a));
    System.out.println("The forth digit is : "+forth(a));
    }
    }
}