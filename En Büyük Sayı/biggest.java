import java.util.Scanner;

public class sorting {
    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    System.out.print("Enter how many numbers do you want to compare :");
    int x =input.nextInt();

    int[] list = new int[x];
    
    for (int r=0;r<=x-1;r++){
        int l=r+1;
        System.out.print(l+". sayı :");
        list[r] =input.nextInt();
    }

    int constant=list[x-1];
    
    for (int k=x-2;k>=0;k--){
        if (constant<list[k])
        {constant=list[k];}}

    System.out.println("The biggset number is "+constant);
    }
}    