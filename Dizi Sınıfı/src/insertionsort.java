public class insertionsort {

    static void insertion(int[] array){ // 2   1   3
    
    for(int f=0;f<array.length;f++){//Tüm diziye bakar ve en küçüğü en başa yazar ondan sonra ilk indexi işleme almadan bunu tekrarlar
        int cons=0;
    for(int d=0;d<array.length;d++){
     if(array[d]>cons){
        cons=array[d];}

    }for(int c=f;c<array.length;c++){
        if(array[c]<cons){ 
          cons = array[c];
        }
     }if(f==array.length){
        f=array.length-1;
     }
     int k=array[f];
     array[f]=cons;
     for(int p=0;p<array.length;p++){
        if(array[p]==cons){
           array[p]=k;
        }
     }
     array[f]=cons;
    }
    }

    static void insertionv2(int[] array){
     for(int i =1;i<array.length;i++){//yanyana olan indexlerden sağdaki küçükse yerlerini değiştirir

      
     }
    }
}
