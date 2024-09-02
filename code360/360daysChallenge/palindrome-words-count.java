public class Solution 
{
    public static int countNumberOfPalindromeWords(String s) 
	{
        // Write your code here!
        int count = 0;
        if(!s.isEmpty())
        {
            String[] str = s.split("\\s+");
            for(String word: str)
            {
                if(isPalindrome(word))
                {
                    count++;
                }
            }
        }
        return count;
    }

    private static boolean isPalindrome(String word)
    {
        int start = 0;
        int end = word.length() -1;
        while(start < end)
        {
            if(Character.toLowerCase(word.charAt(start)) != Character.toLowerCase(word.charAt(end)))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

//Instead of splitting the string into words and storing them,
// we can process the string directly word by word, minimizing memory usage.

