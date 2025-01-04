import java.util.Arrays;

class Solution {
    public int maxOperations(int[] nums, int k) {
        // Step 1: Sort the array
        Arrays.sort(nums);
        
        // Step 2: Initialize two pointers
        int left = 0;
        int right = nums.length - 1;
        int operations = 0;

        // Step 3: Use the two-pointer approach
        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == k) {
                // Found a valid pair
                operations++;
                left++;
                right--;
            } else if (sum < k) {
                // Sum is too small, move the left pointer to the right
                left++;
            } else {
                // Sum is too large, move the right pointer to the left
                right--;
            }
        }

        // Step 4: Return the total number of operations
        return operations;
    }
}
