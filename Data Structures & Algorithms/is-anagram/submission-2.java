class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }
        
        Map<Character, Integer> charCountS = new HashMap<>();
        Map<Character, Integer> charCountT = new HashMap<>();

        for (char ch : s.toCharArray())
            charCountS.put(ch, charCountS.containsKey(ch) ? (charCountS.get(ch) + 1) : 1);

        for (char ch : t.toCharArray())
            charCountT.put(ch, charCountT.containsKey(ch) ? (charCountT.get(ch) + 1) : 1);

        return charCountS.equals(charCountT);

    }
}
