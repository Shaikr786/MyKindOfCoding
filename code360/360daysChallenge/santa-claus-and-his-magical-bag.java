public class Solution {
	public static int[] giftsLeft(int n, int k, int q, int[] demands) {
		// Write your code here.

		int[] result = new int[q];
		int init = n;

		for(int i = 0 ; i < q ; i++)
		{
			if(demands[i] > init)
			{
				result[i] = -1;
			}
			else{
				init = init - demands[i];
				if(init < k)
				{
					init = n;
				}
				result[i] = init;
			}
			
			
		}
		return result;
	}
}