public class Solution {
	public static int[] countEvenOdd(int[] arr, int n) {
		// Write your code here.
         HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            frequencyMap.put(arr[i], frequencyMap.getOrDefault(arr[i], 0) + 1);
        }
        
        int oddCount = 0;
        int evenCount = 0;
        
        for (int count : frequencyMap.values()) {
            if (count % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        
        return new int[]{oddCount, evenCount};
	}
}
