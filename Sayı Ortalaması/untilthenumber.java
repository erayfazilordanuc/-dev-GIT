import java.util.*;

public class untilthenumber {

    static void evenuntil(){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number");
    int a = input.nextInt();
    for(int b=0;b<=a;b++){
        if(b%2==0){
            System.out.println(b);
        }
    }}
    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number");
    int a = input.nextInt();
    int total=0;
    int count=0;
    for(int b=1;b<=a;b++){
        if(b%4==0&&b%3==0){
            total+=b;
            count++;
            System.out.println(b);
        }
    }System.out.println(total/count);
    }
}