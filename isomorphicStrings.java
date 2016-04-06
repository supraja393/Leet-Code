public class Solution {
    public boolean isIsomorphic(String s, String t){
        if (s == null || t == null){
            return false;
        }
        if (s.length() != t.length()){
            return false;
        }
        HashMap<Character,Character> res = new HashMap<Character,Character>();

        for (int i = 0; i < s.length(); i++){
            if (res.containsKey (s.charAt(i))){
                if(res.get(s.charAt(i)) == t.charAt(i))
                {
                    continue;
                }
                else
                {
                    return false;
                }
            }
            else {
                if(!res.containsValue(t.charAt(i)))
                {
                    res.put(s.charAt(i),t.charAt(i));
                }
                else
                {
                    return false;
                }
            }
        }
        return true;
    }
}