// Find pairs with given sum in doubly linked list

public class Solution {
    public static List<List<Integer>> findPairs(Node head, int k) {
        List<List<Integer>> ans = new ArrayList<>();

        if (head == null) {
            return ans;
        }

        Node left = head;
        Node right = findTail(head);

        while (left != null && right != null && left != right && left.prev != right) {
            int sum = left.data + right.data;

            if (sum == k) {
                List<Integer> pair = new ArrayList<>();
                pair.add(left.data);
                pair.add(right.data);
                ans.add(pair);
                
                left = left.next;
                right = right.prev;
            } else if (sum < k) {
                left = left.next;
            } else {
                right = right.prev;
            }
        }
        return ans;
    }

    private static Node findTail(Node head) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return temp;
    }
}
