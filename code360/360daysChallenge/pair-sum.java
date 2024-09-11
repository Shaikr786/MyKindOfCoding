public class Solution{
    public static List<int[]> pairSum(int[] arr, int s) {
        // Write your code here.

        List<int[]> result = new ArrayList<>();

        for(int i = 0 ; i < arr.length ; i++)
        {
            for(int j = i + 1 ; j < arr.length ; j++)
            {
                if(arr[i] + arr[j] == s)
                {
                    result.add(new int[]{Math.min(arr[i] ,arr[j]) ,Math.max(arr[i] ,arr[j])});
                }
            }
        }

        result.sort((pair1 ,pair2) -> {
            if(pair1[0] != pair2[0])
            {
                return Integer.compare(pair1[0], pair2[0]);
            } else {
                return Integer.compare(pair1[1], pair2[1]);
            }
        });
        return result;

    }
}
