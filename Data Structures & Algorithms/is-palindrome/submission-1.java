class Solution {
    public boolean isPalindrome(String s) {
        int lp = 0;
        int rp = s.length() - 1;

        while (lp < rp) {
            while (lp < rp && !alphaNum(s.charAt(lp))) {
                lp++;
            }
            while (lp < rp && !alphaNum(s.charAt(rp))) {
                rp--;
            }
            if (Character.toLowerCase(s.charAt(rp)) != Character.toLowerCase(s.charAt(lp))) {
                return false;
            }
            lp++;
            rp--;
        }
        return true;
    }
    public boolean alphaNum(char c) {
        return (
            c >= 'A' && c<= 'Z' || c >= 'a' && c<= 'z' || c >= '0' && c<= '9'
        );
    }
}
