import java.util.*;

public class prime {
    public static int prime(int x){
        int state=1;
        switch(x){
            case 0:state=0;break;
            case 1:state=0;break;
            case 2:state=1;break;
            default: for(int a=2;a<x;a++){
                if(x%a==0){
                 state = 0;
             }}}return state;}
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number");
    int a = input.nextInt();
    System.out.println(prime(a));
    }
}