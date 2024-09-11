
public class Solution {
    public static int removeDuplicates(int[] arr,int n) {
        // Write your code here.

        if(n == 0 || n == 1)
        {
            return n;
        }
        int len = 1;

        for(int i = 1 ; i < arr.length ; i++)
        {
           if(arr[i] == arr[i -1])
           {
              continue;
           }
           len++;        

        }
        return len;
    }
}


public class Solution {
    public static int removeDuplicates(int[] arr,int n) {
        // Write your code here.

        if(n == 0 || n == 1)
        {
            return n;
        }
        int len = 1;

        for(int i = 1 ; i < arr.length ; i++)
        {
           if(arr[i] != arr[len -1])
           {
               arr[len] = arr[i];
               len++;
           }
        }
        return len;
    }
}





