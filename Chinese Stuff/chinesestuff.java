import java.util.*;

public class chinesestuff {
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    System.out.println("Doğum yılınızı giriniz");
    int year = input.nextInt();

    int zodiac = year%12;
    
    String you ="Empty";

    switch (zodiac){
        case 0:you = "Maymun";
        case 1:you = "Horoz";
        case 2:you = "Köpek";
        case 3:you = "Domuz";
        case 4:you = "Fare";
        case 5:you = "Öküz";
        case 6:you = "Kaplan";
        case 7:you = "Tavşan";
        case 8:you = "Ejderha";
        case 9:you = "Yılan";
        case 10:you = "At";
        case 11:you = "Koyun";
    }
    
    System.out.println("Senin çin zodyağına göre burcun "+you);

    }
}