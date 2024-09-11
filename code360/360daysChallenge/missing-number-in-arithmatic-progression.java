public class Solution 
{
    public static int missingNumber(int[] arr, int n) 
    {
        // Write your code here
        int result = 0;
        int diff = 0;
        int first = arr[0];

        for(int i =  1; i < n ; i++)
        {
            int current = arr[i] - arr[i -1];
            if(current == diff)
            {
                first = arr[i];
                break;
            } 
            diff = current;
        }

        for(int i = 1 ; i < n ; i++)
        {
            if(arr[i] - arr[i -1] == diff)
            {
                continue;
            }else{
                result = arr[i -1]+ diff;
            }
        }
        return result;
    }
}

//optimal

public class Solution 
{
    public static int missingNumber(int[] arr, int n) 
    {
        // Write your code here
        int exprectedDiff = (arr[n -1] - arr[0]) /n;

        for(int i = 1 ; i < n ; i++)
        {
            if(arr[i] - arr[i -1] != exprectedDiff)
            {
                return arr[i] -exprectedDiff;
            }
        }
        return -1;
    }
}
