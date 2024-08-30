public class Solution {

    public static int chessTournament(int[] positions, int n,  int c) 
	{
        // Write your code here. 
        Arrays.sort(positions);

        int count = 1;
        int result = 0;
        int low = 0;
        int high = positions[n -1] - positions[0];

        while(low <= high)
        {
            int mid = low + (high - low) /2;

            if(canPlace(positions ,n , c, mid))
            {
                result = mid;
                low = mid +1;
            }
            else{
                high = mid -1;
            }
        }
        return result;

    }

    private static boolean canPlace(int[] pos , int n , int c ,int min)
    {
        int count = 1;
        int lastPlaced = pos[0];

        for(int i = 1 ; i < pos.length ; i++)
        {
            if(pos[i] - lastPlaced >= min)
            {
                count++;
                lastPlaced = pos[i];
            }

            if(count >= c)
            {
                return true;
            }
        }

        return false;
    }

}