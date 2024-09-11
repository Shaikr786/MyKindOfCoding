class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {

        List<String> result = new ArrayList<>();
        int index = 0;

        while(index < words.length)
        {
           int totalChars = words[index].length();

           int last = index +1;

           //determining no of words fit into current line
           while(last < words.length)
           {
              if(totalChars + words[last].length() + 1 > maxWidth)
              {
                break;
              }
              totalChars += words[last].length() + 1;
              last++;
           }

           StringBuilder line = new StringBuilder();
           int wordCount = last -index -1; //no of words -1

           //last line or the line with 1 word
           if(last == words.length || wordCount == 0)
           {
                for(int i = index ; i < last ; i++)
                {
                    line.append(words[i]).append(" ");
                }

                line.setLength(line.length() -1);
                while(line.length() < maxWidth)
                {
                    line.append(" ");//append remaining space
                }
           }
           else{
                //distribute spaces between words
                int spaces = (maxWidth - totalChars ) / wordCount;

                int extraSpaces = (maxWidth - totalChars) % wordCount;

                for(int i = index ; i < last -1 ; i++)
                {
                    line.append(words[i]).append(" ");
                    for(int j = 0 ; j < spaces +(i -index < extraSpaces ? 1 : 0) ; j++)
                    {
                        line.append(" ");
                    }
                }
                line.append(words[last -1]);
           }
           result.add(line.toString());
           index = last;
        }
        return result;
    }
}