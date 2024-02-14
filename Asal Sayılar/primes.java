import java.util.*;

public class firsthundredprime {
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
    public static void main(String[] args){

    wantprime(100);

    }
}