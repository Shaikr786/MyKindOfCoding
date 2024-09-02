public class Solution {
    public static void reverse(Queue<Integer> queue, int k){
        // Write your code here.
        if(queue == null || k > queue.size() || k < 0)
        {
            return;
        }

        Stack<Integer> stack = new Stack<>();

        for(int i = 0 ; i < k ; i++)
        {
            stack.push(queue.poll());
        }

        while(!stack.isEmpty())
        {
            queue.add(stack.pop());
        }

        for(int i = 0 ; i < queue.size() -k ; i++)
        {
            queue.add(queue.poll());
        }
    }
}