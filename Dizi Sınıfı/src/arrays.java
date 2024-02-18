import java.util.Arrays;

public class arrays {

    static void printone(int[] array){ // static olduğu zaman main.java dosyasına bir "Array dizi = new Array();" kodu yazmama gerek kalmaz
        System.out.print("[ ");
        for(int i : array){
            System.out.print(i+" ");
        }System.out.print("]");
    }  
    
    static void printmulti(int[][] array){
        System.out.print("[ ");
        for(int i=0;i<array.length;i++){
            for(int a=0;a<array[i].length;a++){
                System.out.print(array[i][a]+" ");
            }
        }System.out.print("]");
    }

    static void fill(int[] array, int index, int outdex, int value){
        for(;index<=outdex;index++){
            array[index]=value;
        }
    }

    static int[] copy(int[] array){
        int[] temp = new int[array.length];
        for(int a=0;a<array.length;a++){
            temp[a]=array[a];
        }
     return temp;
    }
}



