class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            if (i > 0 && a == nums [i-1]) {
                continue;
            }
            int lp = i + 1;
            int rp = nums.length -1;

            while (lp < rp) {
                int threeSum = a + nums[lp] + nums[rp];
                if (threeSum > 0) {
                    rp--;
                } else if (threeSum < 0) {
                    lp++;
                } else {
                    result.add(List.of(a, nums[lp], nums[rp]));
                    lp++;
                    while (nums[lp] == nums[lp-1] && lp < rp) {
                        lp++;
                    }
                }
            }

        }
        return result;
    }
}
