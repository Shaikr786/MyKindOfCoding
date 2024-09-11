public class Solution {
    public static long countOfNumbers(long n) {
		// Write your code here.
		Queue<Long> queue = new LinkedList<>();

		queue.add(1L);

		long count = 0;

		while(!queue.isEmpty())
		{
			long current = queue.poll();

			if(current > n)
			{
				break;
			}

			count++;

			queue.add(current* 10);
			queue.add(current* 10 + 1);
		}

		return count;
	}
}


public class Solution {
    public static long countOfNumbers(long n) {
		// Write your code here.
		Queue<Long> queue = new LinkedList<>();

		queue.add(1L);

		long count = 0;

		while(!queue.isEmpty())
		{
			long current = queue.poll();

			if(current > n)
			{
				continue;
			}

			count++;

			long next0 = current* 10;

			long next1 = current* 10 + 1;

			if(next0 <= n)
			{
				queue.add( current* 10);
			}
			
			if(next1 <= n)
			{
				queue.add( current* 10 + 1);
			}
		}

		return count;

	}
}