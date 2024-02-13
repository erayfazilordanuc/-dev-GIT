import java.util.*;

public class flightbill {
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    
    System.out.println("Gideceğiniz mesafeyi km türünden giriniz :");
    int km = input.nextInt();
    if(km<0){
        System.out.println("Hatalı veri girdniz !");
      }
    System.out.println("Yaşınızı giriniz :");
    int age = input.nextInt();
    if(age<0){
        System.out.println("Hatalı veri girdniz !");
      }
    System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ) :");
    int type = input.nextInt();
    if(type!=1&&type!=2){
      System.out.println("Hatalı veri girdniz !");
    }

    float tutar=km*0.1f;

     if(age<12){
        tutar/=2;
    }if(age>=12&&age<=24){
        tutar=tutar*9/10;
    }if(age>=65){
        tutar=tutar*7/10;
    }if(type==2){
        tutar=tutar*8/5;
    }System.out.println("Toplam tutar = "+tutar);
    }
}