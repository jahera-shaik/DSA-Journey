// Problem Statement: Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it.
// Return the answer in an array.
// Example: Input: nums = [8,1,2,2,3] Output: [4,0,1,1,3]
// Approach: Nested loops to count smaller elements for each element
// Time Complexity: O(n^2) where n is the number of elements in nums
// Space Complexity: O(1) ignoring output array

public class Smaller_than_Current {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        // Iterate through each element in the array
        for (int i = 0; i < n; i++) {
            int count = 0;
            // Compare with every other element
            for (int j = 0; j < n; j++) {
                if (nums[j] < nums[i]) {
                    count++;
                }
            }
            result[i] = count; // Store the count of smaller numbers
        }
        
        return result;
    }