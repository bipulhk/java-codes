// import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        // for(int i : arr){
            // System.out.print(i + " ");
        // }
        Arrays.sort(arr);
        // System.out.println(arr.length);
        // System.out.println(Arrays.toString(arr));
        // System.out.println(bs(arr, 0));
        // System.out.print(bsrec(arr, 0, arr.length-1, i)+ ", ");
        for(int i = 0; i <= 21; i++){
            
        }
        
    }
    static int bs(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while (start < end) {
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(target < arr[mid]){
                end = mid;
            }else{
                start = mid+1;
            }
        }

        return -1;
    }

    static int bsrec(int[]arr, int start, int end, int target){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start)/2;
        if(target == arr[mid]){
            return mid;
        }
        if(target < arr[mid]){
            return bsrec(arr, start, mid-1, target);
        }
        return bsrec(arr,mid+1,end, target);
    }
}
