class Solution {
    public int maxArea(int[] heights) {
        int leftPointer = 0;
        int result = 0;
        int rightPointer = heights.length-1;

        while (leftPointer < rightPointer) {
            int area = (rightPointer - leftPointer) * Math.min(heights[rightPointer], heights[leftPointer]);
            result = Math.max(result, area);
            if (heights[leftPointer] < heights[rightPointer]) {
                leftPointer++;
            } else {
                rightPointer--;
            }
        }
        return result;
    }
}
