public class Solution {
    public boolean isAnagram(String s, String t) {
	int l = s.length();
	int m = t.length();
        if (s == null || t == null || l!=m)
            return false;
        int i = 0;
        HashMap<Character,Integer> trial  = new HashMap<Character,Integer>();            
        for(i = 0; i < s.length(); i++)
	{
            if (!trial.containsKey(s.charAt(i)))
            trial.put(s.charAt(i), 1);                   //to specify the count of each character in the first string
            
            else
            trial.put(s.charAt(i), trial.get(s.charAt(i)) + 1);     //increment count 
            
        }
        for(i = 0; i < t.length(); i++)
	{
            if(trial.containsKey(t.charAt(i))){
                int count = trial.get(t.charAt(i));
                if(count == 1)
                trial.remove(t.charAt(i));
                else
                trial.put(t.charAt(i), count - 1);
                
            }

            else
            return false;
            
        }
        if(!trial.isEmpty())
	{
            return false;
        }
        return true;
    }}
