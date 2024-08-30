public static void plusMinus(List<Integer> arr) {
    int pos = 0;
    int neg = 0;
    int zero = 0;
    int n = arr.size();
        for(int i = 0 ; i < n ; i++)
        {
            if(arr.get(i) > 0)
            {
                pos++;
            }
            else if(arr.get(i) < 0)
            {
                neg++;
            }
            else{
                zero++;
            }
        }
        
        System.out.printf("%.6f\n", (double) pos / n);
    System.out.printf("%.6f\n", (double) neg / n);
    System.out.printf("%.6f\n", (double) zero / n);
    }

}