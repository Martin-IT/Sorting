import java.util.Arrays;
public class InsertionSort {

    public static int[] sort(int[] array) {

        int temp;

        for (int outer = 1; outer < array.length; outer++) {

            int pointer = outer;

            for (int inner = outer; inner > 0; inner--) {

                if (array[pointer - 1] > array[pointer]) {
                    temp = array[pointer];
                    array[pointer] = array[pointer - 1];
                    array[pointer - 1] = temp;
                    pointer -= 1;
                }

            }

        }

        return array;

    }

    public static void main(String[] args) {
        int[] array = { 2, 8, 2, 14, 11, 5, 1, 9, 0, 4 };
        System.out.println(Arrays.toString(InsertionSort.sort(array)));
    }

}