public class Solution {
	public static int slotScore(String original, String guess) {
		// Write your code here.
		int total = 0;

		int[] originalString = new int[original.length()];

		int[] guessString = new int[guess.length()];

		String color = "RYGB";

		for(int i = 0 ; i < original.length() ; i++)
		{
			if(original.charAt(i) == guess.charAt(i))
			{
				total +=2;
			}
			else{
				originalString[color.indexOf(original.charAt(i))]++;
				guessString[color.indexOf(guess.charAt(i))]++;
			}


		}

		for(int i = 0 ; i < 4 ; i++)
		{
			total += Math.min(originalString[i], guessString[i]);
		}
		return total;
	}
}