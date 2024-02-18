import java.util.Arrays;

public class mergesort {

    static void merge(int[] array){            // mesela 2,1
    int l = array.length;
    if(l>1){
       int mid = l/2;
       int[] left = Arrays.copyOfRange(array,0,mid);
       int[] right = Arrays.copyOfRange(array,mid,l);

       merge(left);
       merge(right);

       mergeSort(array,left,right);

    }

    }

    static void mergeSort(int[] array,int[] left,int[]right){
        int a=0,b=0,c=0;
        while(a<left.length&&b<right.length){
            if(right[b]<left[a]){
                array[c++]=right[b++];
            }else{
                array[c++]=left[a++];
            }
        }
        while(a<left.length){
            array[c++]=left[a++];
        }
        while(b<right.length){
            array[c++]=right[b++];
        }
    }

}



