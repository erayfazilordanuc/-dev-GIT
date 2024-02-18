import java.util.Scanner;
import java.util.Arrays;

public class arraysort {
    public static void main(String[] args) {
        info();
    }

    static int expo(int a,int b){

        int cons=1;
        if(a==0||b==0){
            cons=1;}else{
        for(;b>0;b--)
            cons*=a;}
        return cons;}

    static void info(){
    Scanner input = new Scanner(System.in);
    System.out.print("Sıralamak istediğiniz dizinin uzunluğunu giriniz :");
    int length = input.nextInt();
    int[] array = new int[length];
    for(int a=0;a<array.length;a++){
        System.out.print((a+1)+". eleman :");
        int element = input.nextInt();
        array[a]=element;
    }
    System.out.print(Arrays.toString(sort(array)));
    }

    static int[] sort(int[] array){
        for(int a=0;a<array.length;a++){// 5  2  3
            int cons=expo(2,31)-1; // ilk döngüde a sıfır
            int index=0;
            for(int b=a;b<array.length;b++){
                if(array[b]<cons){   //cons dizideki en küçük sayı
                    cons=array[b]; 
                    index=b;
                }
            }
            int temp = array[index];
            array[index]=array[a];
            array[a]=temp;
        }return array;
    }
}
