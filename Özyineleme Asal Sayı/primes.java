import java.util.*;

public class primes {
    public static int prime(int x){
        int state=1;
        switch(x){
            case 0:state=0;break;
            case 1:state=0;break;
            case 2:state=1;break;
            default: for(int a=2;a<x;a++){
                if(x%a==0){
                 state = 0;
             }}}return state;}// Çıktı 1 ise asal, 0 ise asal değil
    public static void wantprime(int x){
        for(int a=0;a<=x;a++){
            if(prime(a)==1){
                System.out.print(a+" ");
            }
        }
    }
    static int recursiveprimehelp(int a,int b){
        if (b==1){
          return 1;
        }if(a%b==0){
            return 0;
        }else{
            return recursiveprimehelp(a,b-1);
        }
    }
    static void recursiveprime(int a){
            if(recursiveprimehelp(a,a/2)==1){
                System.out.println("\n"+a+"\nAsal");
            }else{
                System.out.println("\n"+a+" Asal değil");
            }
    }
    public static void main(String[] args){
     
    Scanner input = new Scanner(System.in);
    System.out.println("Bir sayı giriniz");
    int a = input.nextInt();
    wantprime(a);
    recursiveprime(a);
    }
}