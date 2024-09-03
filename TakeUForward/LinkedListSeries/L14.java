public class Solution {

    public static boolean detectCycle(Node head) {
        //Your code goes here
        Node temp = head;

        HashMap<Node ,Integer> map = new HashMap<>();

        while(temp != null)
        {
            if(map.containsKey(temp))
            {
                return true;
            }
            map.put(temp, map.getOrDefault(temp, 0) +1);
            temp = temp.next;
        }
        return false;
    }
}

//optimsed code

 public static boolean detectCycle(Node head) {
        //Your code goes here
        Node slow = head;
        Node fast = head;
        while( fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast)
            {
                return true;
            }
        }
        return false;
    }