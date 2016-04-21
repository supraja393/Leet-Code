public class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        if (words.length != pattern.length()){
            return false;
        }

        HashMap<Character, String> abc = new HashMap();
        HashSet<String> def = new HashSet();

        for (int i = 0; i < words.length; ++i)
        {
            char c = pattern.charAt(i);
            
            if (!abc.containsKey(c)) {
                if (!def.add(words[i])) {
                    return false;
                }
                abc.put(c, words[i]);
            } 
            
            else if (!abc.get(c).equals(words[i])){
            return false;
            }
        }

        return true;
    }
}