import java.util.Arrays;

public class binarysearch {

    static int binary(int[] array,int x){ //    1  2  3  4  5  6  7  8
        int stat=-1;
        int l = array.length;
        int m = l/2;
        while(m>1&&array[m]!=x){
           if(array[m]<x){
            m = (m+l)/2;
           }else{
            m = m/2;
           }
        }if(array[m]==x){
            stat = m;}
        return stat;
    }
    
}
