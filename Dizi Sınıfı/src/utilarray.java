import java.util.Arrays;

public class utilarray {
    public static void main(String[] args) {
        int[] list = {1,2,3};
        int[] list1 = {1,2,3};
        int[] list2 = {5,4,3,6,7,1};
        int[] list3 = {2,1,3,4,7,5,6};
        int[] list4 = {8,3,6,2,4,1,5,7};
        int[][] liste = {{1,2},{3,4}};
        System.out.println(Arrays.toString(list));

        arrays.fill(list,1,2,5);
        System.out.println(Arrays.toString(list));
        //aynı işlevi alttaki Arrays kütüphanesi de görüyor
        Arrays.fill(list1,1,2,5);
        System.out.println(Arrays.toString(list1));
        Arrays.sort(list2);
        System.out.println(Arrays.toString(list2));
        int[] copylist = arrays.copy(list2);// soldaki benim yazdığım sağdaki hazır kütüphane int[] copylist = Arrays.copyOf(list2,5);
        System.out.println(Arrays.toString(copylist));
        mergesort.merge(list3);
        // int[] right = Arrays.copyOfRange(list3,0,2);
        System.out.println(Arrays.toString(list3));
        insertionsort.insertion(list4);
        System.out.println(Arrays.toString(list4));
        arrays dizi = new arrays();
        int[] list5 = {1,2,3};
        int[][] liste2 = {{1,2},{3,4}};// liste[0][0]=1 , liste[1][1]=4
        dizi.printone(list);
        System.out.println("\n");
        dizi.printmulti(liste);
        System.out.println("\n");
        // static sınıf fonskiyonları şağıdaki gibi de kulanılabilir (Array dizi = new Array(); yazamadan)
        arrays.printone(list);
        arrays.printmulti(liste);
        int average = arrayaverage.average(list4);
        System.out.println("\n");
        System.out.println(average);
        insertionsort.insertion(list4);
        int search = binarysearch.binary(list4,6);
        System.out.println(search);
        maxmin.maxmin(list4);

    }
}
