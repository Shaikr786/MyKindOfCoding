public class Solution {
	
	public static void inplaceRotate(int[][] arr, int n) {
		// Write your code here.
        //transpose array 
		   for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                // Swap elements (i, j) with (j, i)
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        //rotate array with anti-clockwise drection
         for (int j = 0; j < n; j++) {
            int top = 0;
            int bottom = n - 1;
            while (top < bottom) {
                // Swap elements at top and bottom
                int temp = arr[top][j];
                arr[top][j] = arr[bottom][j];
                arr[bottom][j] = temp;
                top++;
                bottom--;
            }
        }

        //for rotation using clockwise direction
         // Step 2: Reverse each row
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;
            while (left < right) {
                // Swap elements at left and right
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
                left++;
                right--;
            }
        }
	}

}