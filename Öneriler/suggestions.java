
import java.util.*;

public class suggestions {
    public static void main(){
    
    Scanner input = new Scanner(System.in);

    System.out.println("Sıcaklığı giriniz");
    float degree = input.nextFloat();

    if(degree<0){
        System.out.println("Kayak yap ya da kar topu oyna");
        }
    if(degree<=5&&degree>0){
    System.out.println("Otur evde bu havada dışarı çıkılmaz");
    }
    if(degree>5&&degree<15){
        System.out.println("Tam sinema havası");
        }
    if(degree>=15&&degree<25){
        System.out.println("Bu havada ne güzel piknik yapılır he");
        }
    if(degree>=25){
        System.out.println("");}}}
/*Bu programı switch case ile de yazabiliriz ama birçok durum olduğu için 
mesela 15 ile 25 arasındaki 10 sayı gibi her durumu tek tek case'ler halinde yazmak kodu çok uzatabilir 
*/