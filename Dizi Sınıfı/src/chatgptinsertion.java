import java.util.Arrays;

public class chatgptinsertion {
    public static void insertionSort(int[] array) {        // 4   2   1   3          yanyana olan indexlerden sağdaki küçükse yerlerini değiştirir
        int n = array.length;

        for (int i = 1; i < n; i++) {
            int key = array[i];               // 1
            int j = i - 1;                // index 0 = 4

            // Elemanları, key'in doğru konumunu bulana kadar bir sağa kaydır
            while (j >= 0 && array[j] > key) { // array[j] = 4 yanyana olan iki indexten soldaki sağdakinden büyük olduğu sürece yerlerini değiştir
                array[j + 1] = array[j];
                j--;
            }

            // key'i doğru konuma yerleştir
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6};
        System.out.println("Unsorted Array: " + Arrays.toString(array));

        insertionSort(array);

        System.out.println("Sorted Array: " + Arrays.toString(array));
    }
}
