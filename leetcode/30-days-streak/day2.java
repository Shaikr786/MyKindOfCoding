//construct 2 d array;

class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {

        if(original.length != m*n)
        {
            return new int[][]{};
        }
        int[][] array = new int[m][n];
        int index = 0;
        for(int i = 0 ; i < m ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                array[i][j] = original[index++];
            }
        }
        return array;
    }
}