public class arrayaverage {
    static int average(int[] array){
        int total=0;
        for(int a=0;a<array.length;a++){
            total+=array[a];
        }
        return total/array.length;
    }
}
