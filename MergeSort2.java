import java.util.Arrays;

public class MergeSort2 {
    public static void main(String[] args) {
        int[] arr = {6,4,3,2,1,5};
        arr = Ms(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] Ms(int[]arr){
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length/2;

        int left[] = Ms(Arrays.copyOfRange(arr, 0, mid));
        int right[] = Ms(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);

    }

    private static int[] merge(int[] first, int[] second){
        int[] sorted = new int[first.length + second.length];
        int i = 0, j =0, k =0;

        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                sorted[k] = first[i];
                i++;
            }else{
                sorted[k] = second[j];
                j++;
            }
            k++;
        }
        // now one of them is empty
        while(i < first.length){
            sorted[k] = first[i];
            i++;
            k++;
        }
        while(j < second.length){
            sorted[k] = second[j];
            j++;
            k++;
        }

        return sorted;
    }
}
