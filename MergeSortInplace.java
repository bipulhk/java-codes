import java.util.*;
public class MergeSortInplace {
    public static void main(String[] args) {
        int[] arr = {6,4,3,97,77,2,1,5};
        Ms(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void Ms(int[]arr, int s, int end){
        if(end - s == 1){
            return;
        }
        int mid = s + (end-s)/2;
        Ms(arr,s, mid);
        Ms(arr,mid, end);
        merge(arr, s, mid, end);
    }
    static void merge(int[]arr, int s, int m, int e){
        int[] mix = new int[e - s];
        int i = s, j = m, k= 0;
        while(i < m && j < e){
            if(arr[i] < arr[j]){
                mix[k]=arr[i];
                i++;
            }else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        } 
        // one of them is empty
        while(i < m){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j < e){
            mix[k] = arr[j];
            j++;
            k++;
        }

        for(int l = 0; l< mix.length; l++){
            arr[s+l] = mix[l];
        }
    }
}
