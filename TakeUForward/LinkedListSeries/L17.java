public class Solution {
    public static Node firstNode(Node head) {
        // Write your code here.
        HashMap<Node ,Integer> map = new HashMap<>();

        Node temp = head;

        while(temp != null)
        {
            if(map.containsKey(temp))
            {
                return temp;
            }
            map.put(temp, map.getOrDefault(temp, 0) +1);
            temp = temp.next;
        }
        return null;
    }
}

//optimised code

public class Solution {
    public static Node firstNode(Node head) {
        // Write your code here.

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast)
            {
                slow = head;
                while(slow != fast)
                {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}