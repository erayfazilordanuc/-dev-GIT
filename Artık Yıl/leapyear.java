import java.util.*;

public class leapyear {
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    while(true){
    System.out.println("Enter a number");
    int year = input.nextInt();
    int durum;
    if(year%100==0){
        if(year%400==0){
            durum=1;
        }else{durum=0;}
    }else{
        if(year%4==0){
            durum=1;
        }else{durum=0;}
    }if(durum==1){
        System.out.println("\nBu yıl bir artık yıl\n");
    }else{
        System.out.println("\nBu yıl bir artık yıl değil\n");
    }
    }
}}