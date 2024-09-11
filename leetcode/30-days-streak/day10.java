class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        
        if(head == null || head.next == null)
        {
            return head;
        }
        ListNode current = head;

        while(current != null && current.next != null)
        {
            int gcdVal = gcd(current.val ,current.next.val);

            ListNode newNode = new ListNode(gcdVal);

            newNode.next = current.next;
            current.next = newNode;

            current = newNode.next;
        }
        return head;
    }

    private static int gcd(int a, int b)
    {
        if(b == 0)
        {
            return a;
        }
        return gcd(b ,a%b);
    }
}