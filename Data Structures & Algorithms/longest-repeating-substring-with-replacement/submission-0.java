class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> count = new HashMap<>();
        int result = 0;
        int leftPointer = 0;

        for (int rightPointer = 0; rightPointer < s.length(); rightPointer++) {
            count.put(s.charAt(rightPointer), count.getOrDefault(s.charAt(rightPointer), 0) + 1);

            if ((rightPointer - leftPointer + 1) - Collections.max(count.values()) > k) {
                count.put(s.charAt(leftPointer), count.get(s.charAt(leftPointer)) - 1);
                leftPointer++;
            }

            result = Math.max(result, rightPointer - leftPointer + 1);
        }
        return result;
    }
}
