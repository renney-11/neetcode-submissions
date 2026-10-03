class Solution {
    public boolean isPalindrome(String s) {
        int lp = 0;
        int rp = s.length()-1;

        while (lp < rp) {
            while (lp < rp && !alphaNums(s.charAt(lp))) {
                lp++;
            }
            while (lp < rp && !alphaNums(s.charAt(rp))) {
                rp--;
            }
            if (Character.toLowerCase(s.charAt(lp)) != Character.toLowerCase(s.charAt(rp))) {
                return false;
            }
            rp--;
            lp++;
        }
        return true;
    }
    public boolean alphaNums(char c) {
        return (c>= 'A' && c<= 'Z' || c>= 'a' && c<= 'z' || c>= '0' && c<= '9');
    }
}
