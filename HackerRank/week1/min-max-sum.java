public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    long min = Integer.MAX_VALUE;
    long max = Integer.MIN_VALUE;
    long sum = 0;
        for(int i = 0 ; i < arr.size() ; i++)
        {
            long num = arr.get(i);
            if(num < min)
            {
                min = arr.get(i);
            }
            if(num > max)
            {
                max = arr.get(i);
            }
            sum += arr.get(i);
        }
        long minsum = sum - max;
        long maxsum = sum - min;
        
        System.out.print(minsum + " " + maxsum);
       

    }

}