class Solution {
    public int trap(int[] height) {

        int n = height.length;
        int[] maxRight = new int[n];
        int[] maxLeft = new int[n];

        maxLeft[0] = height[0];
        maxRight[n -1] = height[n -1];

        for(int i = 1 ; i < n ; i++)
        {
            maxLeft[i] = Math.max(maxLeft[i -1] ,height[i]);
        }

        for(int i = n -2 ; i >= 0 ; i--)
        {
            maxRight[i] = Math.max(maxRight[i +1] ,height[i]);
        }

        int water = 0;
        for(int i = 0 ; i < n ; i++)
        {
            water += Math.min(maxLeft[i] ,maxRight[i]) - height[i];
        }

        return water;
    }
}