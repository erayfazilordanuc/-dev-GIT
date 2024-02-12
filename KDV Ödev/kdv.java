import java.util.*;

public class kdv {
 public static void main(String[] x){

    System.out.println("Hesaplatmak istediğiniz sayıyı giriniz");

    Scanner inp = new Scanner(System.in);
    int value = inp.nextInt();

    if(value<0){
        System.out.println("Lütfen sıfırdan büyük bir değer giriniz");
        value = inp.nextInt();}

    double kdv = 18;

    if(value>1000){
        kdv=8;}

    double kdvalue=(kdv*value)/100;
    double kdvli=kdvalue+value;
    System.out.println("");
    System.out.print("Girdiğiniz değerdeki KDV oranı = %");
    System.out.println(kdv);
    System.out.println("");
    System.out.print("Girdiğiniz değerin KDV'siz fiyatı = ");
    System.out.println(value);
    System.out.println("");
    System.out.print("Girdiğiniz değerin KDV tutarı = ");
    System.out.println(kdvalue);
    System.out.println("");
    System.out.print("Girdiğiniz değerin KDV'li fiyatı = ");
    System.out.println(kdvli);
    System.out.println("");
    }
}
