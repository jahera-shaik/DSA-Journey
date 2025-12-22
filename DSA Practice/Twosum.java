class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Outer loop: Pick first number (i)
        for (int i = 0; i < nums.length; i++) {
            
            // Inner loop: Pick second number (j)
            // Start from i+1 to avoid using same number twice
            for (int j = i + 1; j < nums.length; j++) {
                
                // Check if these two numbers add up to target
                if (nums[i] + nums[j] == target) {
                    //Return their positions
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }
}