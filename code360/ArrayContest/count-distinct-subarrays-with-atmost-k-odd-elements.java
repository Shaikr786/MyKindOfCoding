import java.util.HashMap;
import java.util.Map;

public class Solution {
   public static int distinctSubKOdds(int[] arr, int k) {
        int n = arr.length;
        int count = 0;
        int oddCount = 0;
        HashMap<Integer, Integer> prefixCount = new HashMap<>();
        
        // Initial state: prefix sum of 0 has been seen once
        prefixCount.put(0, 1);
        
        for (int num : arr) {
            // Update the count of odd numbers
            if (num % 2 != 0) {
                oddCount++;
            }
            
            // Calculate the number of subarrays with exactly k odd numbers
            int target = oddCount - k;
            if (prefixCount.containsKey(target)) {
                count += prefixCount.get(target);
            }
            
            // Update the prefix count map
            prefixCount.put(oddCount, prefixCount.getOrDefault(oddCount, 0) + 1);
        }
        
        return count;
    }
}