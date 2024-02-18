public class maxmin {

    static void maxmin(int[] array){
        int max=0,min=0;
        for(int a=0;a<array.length;a++){
            if(array[a]>max){
                max=array[a];
            }
        }min=max;
        for(int a=0;a<array.length;a++){
            if(array[a]<min){
                  min=array[a];
            }
        }
        System.out.println("Min :"+min);
        System.out.println("Max :"+max);
    }
    
}
