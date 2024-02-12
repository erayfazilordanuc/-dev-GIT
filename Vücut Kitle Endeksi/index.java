
import java.util.*;

public class index {
    public static void main(String[] i){
    
    Scanner input = new Scanner(System.in);

    System.out.println(" ");
    System.out.println("Enter your height in cm");
    float boy = input.nextInt();
    boy/=100;
    
    System.out.println(" ");
    System.out.println("Enter your weight in kg");
    float kilo = input.nextInt();
    
    double BMI=kilo/(boy*boy);
    System.out.println(" ");
    System.out.print("Your Body Mass Index = ");
    System.out.println(BMI);
    System.out.println(" ");

    if(BMI<0){
        System.out.println("Ölüsün kardeş");
    }
    if(BMI>0&&BMI<18.5){
        System.out.println("Az ekmek ye");
    }
    if(BMI>=18.5&&BMI<24.9){
        System.out.println("İyisin iyi böyle devam");
    }
    if(BMI>24.9&&BMI<29.9){
        System.out.println("Biraz fazlalık var onları attın mı tamam");
    }
    if(BMI>29.9&&BMI<39.9){
        System.out.println("Senin durum vahim cankuş");
    }
    if(BMI>39.9){
        System.out.println("GG");
    }
    System.out.println(" ");
    }
}
