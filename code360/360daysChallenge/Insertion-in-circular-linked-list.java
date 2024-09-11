public class Solution {

    static Node insert(int k, int val, Node head) {
        // Write your code here.

        Node newNode = new Node(val);

        if(k == 0)
        {
            if(head == null)
            {
                newNode.next = newNode;
                return newNode;
            }
            else{
                Node temp = head;

                while(temp.next != head)
                {
                    temp = temp.next;
                }
                temp.next = newNode;
                newNode.next = head;
                return newNode;
            }
        }

        Node current = head;
        int count = 0;

        while(count < k -1)
        {
            current = current.next;
            count ++;
        }
        newNode.next = current.next;
        current.next = newNode;
        return head;
    }
}