class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Put the keys into an array
        Integer[] numbers = freq.keySet().toArray(new Integer[0]);

        Arrays.sort(numbers, (a, b) -> freq.get(b) - freq.get(a));

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = numbers[i];
        }

        return result;

    }
}
