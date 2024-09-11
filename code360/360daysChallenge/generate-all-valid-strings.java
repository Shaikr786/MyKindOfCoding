public solution
{
    public static ArrayList<String> minRemovaltoMakeStringValid(String str) 
        {
            // Write your code here.
            ArrayList<String> result = new ArrayList<>();
            if(str == null)
            {
                return result;
            }
            Set<String> visited = new HashSet<>();
            Queue<String> queue = new LinkedList<>();
            boolean foundValue = false;

            queue.add(str);

            visited.add(str);

            while(!queue.isEmpty())
            {
                String current = queue.poll();

                if(isValid(current))
                {
                    result.add(current);
                    foundValue = true;
                }

                if(foundValue == true)
                {
                    continue;
                }

                for(int i = 0 ; i < current.length() ; i++)
                {
                    if(current.charAt(i) != '(' && current.charAt(i) != ')')
                    {
                        continue;
                    }
                    String next = current.substring(0 ,i) + current.substring(i +1);

                    if(!visited.contains(next))
                    {
                        queue.add(next);
                        visited.add(next);
                    }
                }
            }
            return result;
        }
    private static boolean isValid(String s)
    {
        int count = 0;
        for(char c : s.toCharArray())
        {
            if(c == '(')
            {
                count++;
            }else if(c == ')')
            {
                count--;
            }
            if(count < 0)
            {
                return false;
            }
        }
        return count == 0;
    }
}