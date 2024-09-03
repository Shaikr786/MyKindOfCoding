public class Solution {
    public static Node deleteAllOccurrences(Node head, int k) {
        // Write your code here.
        Node temp = head;

        while(temp != null)
        {
            if(temp.data == k)
            {
                if(temp == head)
                {
                    head = temp.next;
                }
                Node previous = temp.prev;
                Node nextNode = temp.next;

                if(nextNode != null)
                {
                    nextNode.prev = previous;
                }
                if(previous != null)
                {
                    previous.next = nextNode;
                }
                temp = nextNode;
            }
            else{
                temp = temp.next;
            }
        }
        return head;

    }
}
