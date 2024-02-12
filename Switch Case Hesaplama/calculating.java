import java.util.Scanner;

public class calculating {
    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);

    System.out.print("1=Toplama\n2=Çıkarma\n3=Çarpma\n4=Bölme\nChoose the number of process you will do");
     int choice=input.nextInt();
    System.out.println("Enter the first number");
     int f=input.nextInt();
    System.out.println("Enter the second number");
     int s=input.nextInt();
    switch (choice){
        case 1:System.out.println("Answer is "+(f+s));
        break;
        case 2:System.out.println("Answer is "+(f-s));
        break;
        case 3:System.out.println("Answer is "+(f*s));
        break;
        case 4:System.out.println("Answer is "+(f/s));
        break;
    }
    }
}
