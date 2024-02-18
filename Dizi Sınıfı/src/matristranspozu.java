import java.util.Scanner;
import java.util.Arrays;

public class matristranspozu {

    static int[][] transpoz(int[][] array){
        int[][] copy = new int[array[1].length][array.length];
        for(int b=0;b<array.length;b++){
         for(int a=0;a<array[1].length;a++){
            copy[a][b]=array[b][a];
        }}return copy;
    }

    static void transpozprint(){
    Scanner input = new Scanner(System.in);
    int[][] Matris = new int[2][3];
    for(int a=0;a<2;a++){
        for(int b=0;b<3;b++){
            System.out.print("Matris["+a+"]["+b+"] = ");
            int value = input.nextInt();
            Matris[a][b] = value;
        }
    }System.out.println(" ");
    for(int[] i:Matris){
        for(int v:i){
            System.out.print(v+" ");
        }
        System.out.println("");
    }System.out.println("");
    for(int[] i:transpoz(Matris)){
    for(int v:i){
        System.out.print(v+" ");
    }
    System.out.println("");
    }
    System.out.println("");   
    }

    public static void main(String[] args) {
        
        transpozprint();
     
}
}