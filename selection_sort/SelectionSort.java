import java.util.Arrays;

public class SelectionSort {
    public static int[] sort(int[] array) {
        for (int m = 0; m < array.length; m++) {
            for (int n = 1; n < array.length - m; n++) {
                int smallest = array[m];
                if (smallest > array[m + n]) {
                    array[m] = array[m + n];
                    array[m + n] = smallest;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = { 2, 8, 2, 14, 11, 5, 1, 9, 0, 4 };
        System.out.println(Arrays.toString(SelectionSort.sort(array)));
    }

}