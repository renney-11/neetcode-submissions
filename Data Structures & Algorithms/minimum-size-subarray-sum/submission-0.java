class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        /*
        1. start at 0, move right until we r bigger than equal that target
        2. move left (so it is smaller)
            3. if still bigger or equal move left again
            else move right
        
        */

        int result = Integer.MAX_VALUE;
        int leftPointer = 0;
        int currentSum = 0;

        for (int rightPointer = 0; rightPointer < nums.length; rightPointer++) {
            
            currentSum += nums[rightPointer];

            while (currentSum >= target) {
                result = Math.min(result, rightPointer-leftPointer +1);

                currentSum -= nums[leftPointer];
                leftPointer++;
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }
}