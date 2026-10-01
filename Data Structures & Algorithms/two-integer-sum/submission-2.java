class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int needed = target - nums[i];

            if (seen.containsKey(needed)) {
                return new int[]{seen.get(needed), i};
            }

            seen.put(nums[i], i);
        }

        return new int[0];
        /*for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];*/

        /*Arrays.sort(nums);
        int lp = 0;
        int rp = nums.length - 1;

        while (lp < rp) {
            if (nums[lp] + nums[rp] < target) {
                lp++;
            } else if (nums[lp] + nums[rp] > target) {
                rp--;
            } else {
                return new int[]{lp, rp};
            }
        }
        return new int[0];*/

    }
}
