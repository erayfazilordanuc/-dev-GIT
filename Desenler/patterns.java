import java.util.*;

public class trianglepattern {

    public static long expo(long a,long b){
        long cons=1;
        if(a==0||b==0)
            cons=0;
        for(;b>0;b--)
            cons*=a;
        return cons;}

    public static void trianglepattern(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of layers you want");
        int a = input.nextInt();
        int d;
        for(int b=1;b<=a;b++){
         int f=b-1;
        for(int k=1;k<=a-b;k++) {
         System.out.print(" ");
        }for(d=f*2+1;d>0;d--){
         if(f==0){
           System.out.print("*");
           break;
        }
        System.out.print("*");
        }
        System.out.println("");
    }
    }

    public static void reversetrianglepattern(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of layers you want");
        int a = input.nextInt();
        int g=a;
        for(;a>0;a--){
           for(int c=0;c<(g-a);c++){
            System.out.print(" ");
        }
            for(int b=2*a-1;b>0;b--){
                System.out.print("*");
            }System.out.println("");}
        
        }

    public static void diamond(){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of layers you want type of odd numbers");
        int j = input.nextInt();
        int a=(j+1)/2;
        int d;
        for(int b=1;b<=a;b++){
         int f=b-1;
        for(int k=1;k<=a-b;k++) {
         System.out.print(" ");
        }for(d=f*2+1;d>0;d--){
         if(f==0){
           System.out.print("*");
           break;
        }
        System.out.print("*");
        }
        System.out.println("");
    }
        int h=a-1;
        int g=h+1;
        for(;h>0;h--){
           for(int c=0;c<(g-h);c++){
            System.out.print(" ");
        }
            for(int b=2*h-1;b>0;b--){
                System.out.print("*");
            }System.out.println("");}
    }
    public static void main(String[] args){

    trianglepattern();

    reversetrianglepattern();
    
    diamond();

    }
}


