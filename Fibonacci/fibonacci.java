import java.util.*;

public class fibonacci {
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    System.out.println("Enter the amount of elements you want");
    int lenght = input.nextInt();
    int cons=1;
    int cons2=1;
    int cons3=2;
    System.out.print(cons+" ");
    System.out.print(cons2+" ");
    System.out.print(cons3+" ");
    for(;lenght>0;lenght--){
        System.out.print(cons3+cons2+" ");
        cons3=cons2+cons3;
        cons2=cons3-cons2;
    }
}
}