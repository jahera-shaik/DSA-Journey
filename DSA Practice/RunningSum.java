class Solution {
    public int[] runningSum(int[] nums) {
        //Starts from index 1 first element already represents its own running sum
        for(int i=1;i<nums.length;i++){
            // Add the previous element sum to the current element
            nums[i]=nums[i]+nums[i-1];
        }
        // Return the modidied array containing running sums
        return nums;
    }
}

//LeetCode 2 :Running Sum
//Approach: Prefix Sum(In-place)
//Time Complexity: O(n)
//Space Complexity: O(1)
