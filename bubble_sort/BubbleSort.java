import java.util.Arrays;

public class BubbleSort {

    public static int[] sort(int[] array) {
        int temp;
        for (int m = 1; m < array.length - 1; m++) {
            for (int n = 0; n < array.length - m; n++) {
                if (array[n] > array[n + 1]) {
                    temp = array[n];
                    array[n] = array[n + 1];
                    array[n + 1] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = { 2, 8, 2, 14, 11, 5, 1, 9, 0, 4 };
        System.out.println(Arrays.toString(BubbleSort.sort(array)));
    }

}