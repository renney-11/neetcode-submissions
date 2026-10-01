class Solution {
    public int[] getConcatenation(int[] nums) {
        int doubleNums[] = new int[2 * nums.length];

        for (int j = 0; j < nums.length; j++) {
            doubleNums[j] = nums[j];
            doubleNums[j + nums.length] = nums[j];
        }
        return doubleNums;
    }
}