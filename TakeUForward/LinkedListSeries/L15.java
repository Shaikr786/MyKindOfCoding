public class Solution
{
    public static int lengthOfLoop(Node head) {
        // Write your code here

        Node temp = head;

        HashMap<Node ,Integer> map = new HashMap<>();
        int timer = 1;

        while(temp != null)
        {
            if(map.containsKey(temp))
            {
                int value = map.get(temp);
                return timer - value;
            }
            map.put(temp, timer++);
            temp = temp.next;
        }
        return 0;
    }
}

//optimal check

public class Solution
{
    public static int lengthOfLoop(Node head) {
        // Write your code here
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;

            if(slow == fast)
            {
                return findLength(slow ,fast);
            }
        }
        return 0;
    }

    private static int findLength(Node slow , Node fast)
    {
        int count = 1;
        fast = fast.next;
        while(slow != fast)
        {
            count++;
            fast = fast.next;
        }
        return count;
    }
}