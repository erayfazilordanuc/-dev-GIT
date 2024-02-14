import java.util.*;

public class fibonacci {
    public static void fibonacciarray(int x){
        int[] array = new int[x];
        if(x==1){
            System.out.print("1");
        }if(x==2){
            System.out.print("1 1");
        }else{
        array[0]=1;
        array[1]=1;
        System.out.print(array[0]+" "+array[1]+" ");
        for(int c=2;c<x;c++){
         array[c]=array[c-1]+array[c-2];
         System.out.print(array[c]+" ");
        }}
    }
    public static void fibonacciclassic(int x){
        int cons=1;
        int cons2=1;
        int cons3=2;
        int lenght = x-3;
        System.out.print(cons+" ");
        System.out.print(cons2+" ");
        System.out.print(cons3+" ");
        for(;lenght>0;lenght--){
         System.out.print(cons3+cons2+" ");
         cons3=cons2+cons3;
         cons2=cons3-cons2;
        }System.out.println("");
    }
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    System.out.println("Enter the amount of elements you want");
    int lenght = input.nextInt();
    fibonacciarray(lenght);
    System.out.println("");
    fibonacciclassic(lenght);
    
}
}