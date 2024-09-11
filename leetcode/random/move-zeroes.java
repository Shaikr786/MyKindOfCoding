class Solution {
    public void moveZeroes(int[] nums) {

        int nonzeroIndex = 0;
        for(int i = 0 ; i <  nums.length ; i++)
        {
            if(nums[i] != 0)
            {
                int temp = nums[nonzeroIndex];
                nums[nonzeroIndex] = nums[i];
                nums[i] = temp;
                nonzeroIndex++; 
            }

        }
    }
}