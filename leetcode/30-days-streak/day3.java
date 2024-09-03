// Sum of Digits of String After Convert

class Solution {
    public int getLucky(String s, int k) {

        StringBuilder newStr = new StringBuilder();

        for(char ch : s.toCharArray())
        {
            int num = ch - 'a' + 1;

            newStr.append(num);
        }   

        int sum = 0;
        for(char ch : newStr.toString().toCharArray())
        {
            sum += ch - '0';
        }

        for(int i = 1; i < k ; i++)
        {
            int tempSum = 0;
            while(sum > 0)
            {
                tempSum += sum % 10;
                sum /= 10;
            }
            sum = tempSum;
        }
        return sum;
    }
}