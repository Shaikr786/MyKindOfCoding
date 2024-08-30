import java.util.* ;
import java.io.*; 

public class Solution {

    static int largestElement(int[] arr, int n) {
        // Write your code here.

        int low = 0 ;
        int high = n-1;
        int max = Integer.MIN_VALUE;

        while(low <= high)
        {
            if(arr[low] > max)
            {
                max = arr[low];
                
            }
            if(arr[high] > max){
                max = arr[high];
               
            }
             low++;
            high--;
        }
        return max;
    }
}


public class Solution {

    static int largestElement(int[] arr, int n) {
        // Write your code here.
        int max = 0;
        for(int i = 0 ; i < n ; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }return max;

    }
}