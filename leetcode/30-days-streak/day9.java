class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        
        int[][] result = new int[m][n];

        for(int i = 0 ; i < m ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                result[i][j] = -1;
            }
        }

        ListNode current = head;
        int left = 0;
        int top = 0;
        int bottom = m -1;
        int right = n -1;

        while(left <= right && current != null && top <= bottom)
        {
            //left to right traversal
            for(int i = left ; i <= right && current != null ; i++)
            {
                result[top][i] = current.val;
                current = current.next;
            }
            top++;

            //top to bottom
            for(int i = top ; i <= bottom && current != null ; i++)
            {
                result[i][right] = current.val;
                current = current.next;
            }
            right--;

            //right to left
            for(int i = right ; i >= left && current != null ; i--)
            {
                result[bottom][i] = current.val;
                current = current.next;
            }
            bottom--;

            //bottom to top
            for(int i = bottom ; i >= top && current != null ; i--)
            {
                result[i][left] = current.val;
                current = current.next;
            }
            left++;
        }
        return result;
    }
}