class Solution {
    public boolean hasDuplicate(int[] nums) {

        /* for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i+1]) {
                return true;
            }
        }
        return false;

    } */

        Set<Integer> seen = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (!seen.add(nums[i])) { // returns false, if element alr present
                return true;
            }
        }
        return false;
    }
}