import java.util.Arrays;

public class harmonic {

    static double arrayharmonic(int[] array){
    double total=0;
    for(int a=0;a<array.length;a++){
        total+=1.0/array[a];
    }return array.length/total;
    }
}
