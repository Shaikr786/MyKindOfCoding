class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int[] result = new int[n];
        int m  =  rolls.length;
        int totalSum = mean * (n + m);
        int observedSum = 0;

        for(int i = 0 ; i < rolls.length ; i++)
        {
            observedSum += rolls[i];
        }
        int missingSum = totalSum - observedSum;

        if (missingSum < n || missingSum > 6 * n) {
            return new int[0]; 
        }
        int quotient = missingSum / n;
        int remainder = missingSum % n;

        for(int i = 0 ; i < n ; i++)
        {
            result[i] = quotient + (i < remainder ? 1 : 0);
        }
        return result;
    }
}