class Solution {
    public boolean increasingTriplet(int[] nums) {

        int first = Integer.MAX_VALUE; // Smallest number so far
        int second = Integer.MAX_VALUE; // Second smallest number so far
        int l = nums.length;

        for (int i = 0;i<l;i++) {
            if (nums[i] <= first) {
                first = nums[i]; // Update the smallest number
            } else if (nums[i] <= second) {
                second = nums[i]; // Update the second smallest number
            } else {
                // Found a number greater than both first and second
                return true;
            }
        }

        return false; // No triplet found
    }
}