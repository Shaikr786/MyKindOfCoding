public class Solution {
    public static Node deleteMiddle(Node head) {
        // Write your code here.
        int count = 0;

        Node temp = head;

        if(temp == null || temp.next == null)
        {
            return null;
        }

        while(temp != null)
        {
            count++;

            temp = temp.next;
        }

        temp = head;

        int middle = count/2;

        while(temp != null)
        {
            middle--;
            if(middle == 0)
            {
                Node mid = temp.next;
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
        return head;

    }
}

//optimal code

public class Solution {
    public static Node deleteMiddle(Node head) {
        // Write your code here.

        if(head == null || head.next == null)
        {
            return null;
        }

        Node slow = head;
        Node fast = head;
        fast = fast.next.next;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        slow.next = slow.next.next;
        return head;
    }
}