public Solution{ 
 
    public static char firstNonRepeatingCharacter(String str) {
        int[] freq = new int[256]; 
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++; 
        }

       
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (freq[ch] == 1) {
                return ch;
            }
        }
        
        return str.charAt(0);
    }

}

//optimal
public class Solution {

	public static char firstNonRepeatingCharacter(String str) {

		// Write your code here
		Map<Character, Integer> frequencyMap = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (frequencyMap.get(ch) == 1) {
                return ch;  
			}
        }

        return str.charAt(0);
	}
}