class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int leftPointer = 0;
        int maxLengthOfSubstring = 0;

        for (int rightPointer = 0; rightPointer < s.length(); rightPointer++) {
            while  (set.contains(s.charAt(rightPointer))) {
                set.remove(s.charAt(leftPointer));
                leftPointer +=1;
            }
            set.add(s.charAt(rightPointer));
            maxLengthOfSubstring = Math.max(maxLengthOfSubstring, rightPointer - leftPointer +1);
        }
        return maxLengthOfSubstring;
    }
}
