import java.util.Scanner;

public class arrayfrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Oluşturmak istediğiniz dizinin uzunluğunu giriniz :");
        int a =input.nextInt();
        int[] list = new int[a];
        for(int b=1;b<=list.length;b++){
            System.out.print("\n"+b+". elemanı giriniz :");
            list[b-1]=input.nextInt();
        }
        evenrepeaters(list);
    }
    
    static void evenrepeaters(int[] array){

    int[] repeaters = new int[array.length];
    int index=0;
    System.out.print("Tekrar eden sayılar : \n");
    for(int a=0;a<array.length;a++){
        int sayac=-1;

        for(int b=0;b<array.length;b++){
            if(array[b]==array[a]){
                sayac++;
            }
        }
    
    if(sayac>0){//Bu kısımdan tekrar eden sayının hangi parametrelerde olacağı değiştirilir
        boolean stat=false;
        for(int f=0;f<repeaters.length;f++){
            if(repeaters[f]==array[a]){
                stat=true;
            } 
            
        }
        if(stat==false){
        repeaters[index]=array[a];
            index++;
            System.out.println(array[a]+" sayısı "+(sayac+1)+" kere geçiyor");}

    }
    }
}

}
