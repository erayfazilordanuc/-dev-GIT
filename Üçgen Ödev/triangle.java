import java.util.Scanner;

public class triangle {
    public static void main(String[] hipo){

    System.out.println("  ");

    System.out.println("Dik üçgenin 1. dik kenarının uzunluğunu giriniz");
    Scanner inp = new Scanner(System.in);
    int bir = inp.nextInt();

    System.out.println("  ");

    System.out.println("Dik üçgenin 2. dik kenarının uzunluğunu giriniz");
    int iki = inp.nextInt();

    double hippo = Math.sqrt(iki*iki+bir*bir);
    double field = bir*iki/2;
    double perimeter = bir+iki+hippo;

    System.out.println("  ");
    
    System.out.print("Dik üçgenin hipotenüs uzunluğu = ");
    System.out.println(hippo);

    System.out.println("  ");

    System.out.print("Dik üçgenin çevresi = ");
    System.out.println(perimeter);

    System.out.println("  ");

    System.out.print("Dik üçgenin alanı = ");
    System.out.println(field);
    
    System.out.println("  ");
    }
}
