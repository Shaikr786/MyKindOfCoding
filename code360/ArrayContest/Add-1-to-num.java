public class Solution
{
public static ArrayList<Integer> addOneToNumber(ArrayList<Integer> arr)
    {
        // Write your code here.
        int n = arr.size();
        ArrayList<Integer> newArray = new ArrayList<>();
        int carry = 1;
        

        for(int i = n -1 ; i >= 0 ; i--)
        {
            int sum = arr.get(i) + carry;
            newArray.add(sum%10);
            carry = sum /10;
        }
        
        if(carry > 0)
        {
            newArray.add(carry);
        }

        Collections.reverse(newArray);

        while(newArray.size() > 1 && newArray.get(0) == 0)
        {
            newArray.remove(0);
        }

        return newArray;
    }
}
