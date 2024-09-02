class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int i = 0;
        while(true)
        {
            if(i == chalk.length)
            {
                i = 0;
            } 
            if(k < chalk[i])
            {
                return i;
            }
            k = k - chalk[i];
            i++;
        }
        
    }
}//happy coz done without any help