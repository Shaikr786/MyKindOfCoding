//finding the middle of the node 

//Naive approach
public class Solution
{
    public static Node findMiddle(Node head)
    {
        // Write your code here.
        int count = 0;
        Node temp = head;
       while(temp != null)
       {
           count ++;
           temp = temp.next;
       }

       int middle = (count /2)+1;

       temp = head;
       while(temp != null)
       {
           middle = middle -1;
           if(middle == 0)
           {
               break;
           }
           temp = temp.next;
       }

       return temp;
    }
}

//optimal approach
public class Solution
{
    public static Node findMiddle(Node head)
    {
        // Write your code here.

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}