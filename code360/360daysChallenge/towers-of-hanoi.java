public class Solution 
{
    public static ArrayList < ArrayList<Integer>> towerOfHanoi(int n) 
    {
        //    Write your code here.
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        towers(n ,1 ,3 ,2 ,result);

        return result;

    }

    private static void towers(int n , int fromRod ,int toRod ,int auxil ,ArrayList<ArrayList<Integer>> result)
    {
        if(n == 1)
        {
            ArrayList<Integer> move = new ArrayList<>();

            move.add(fromRod);
            move.add(toRod);
            result.add(move);
            return;
        }

        towers(n -1 ,fromRod ,auxil ,toRod ,result);

        ArrayList<Integer> move = new ArrayList<>();

        move.add(fromRod);
        move.add(toRod);
        result.add(move);

        towers(n -1, auxil, toRod, fromRod, result);

    }
}