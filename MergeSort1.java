import java.util.Arrays;

public class MergeSort1 {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        arr = mergesort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergesort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length/2;
        // System.out.println(Arrays.toString(Arrays.copyOfRange(arr, 0, mid)));
        int[] left = mergesort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergesort(Arrays.copyOfRange(arr, mid, arr.length));
        
        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] sorted = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;
        // System.out.println(Arrays.toString(first));
        // System.out.println(Arrays.toString(second));

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                // System.out.print(first[i] + " ");
                sorted[k] = first[i];
                i++;
            } else {
                sorted[k] = second[j];
                // System.out.print(second[j] + " ");
                j++;
            }
            k++;
        }

        // now one of them is empty
        while (i < first.length) {
            sorted[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length) {
            sorted[k] = second[j];
            j++;
            k++;
        }
        return sorted;
    }
}
