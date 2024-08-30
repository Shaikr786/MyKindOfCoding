	
 //logic number 1   
    
    public static ArrayList<ArrayList<Integer>> numberPattern(int n) {

		// Write your code here.
		ArrayList<ArrayList<Integer>> pattern = new ArrayList<>();

		int currentNum = 1;
		for(int i = 1 ; i <= n ; i++)
		{
			ArrayList<Integer> row = new ArrayList<>();

			for(int j = 1 ; j < n -i+1 ; j++)
			{
				row.add(-1);
			}

			for(int j = 1 ; j <= i ; j++)
			{
				row.add(currentNum);
				currentNum = (currentNum%9)+1;
			
			}
			pattern.add(row);
		}

		// printPattern(pattern ,n);

		return pattern;
	}
	


//