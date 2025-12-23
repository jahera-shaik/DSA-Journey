// Question: Given an array nums of integers, return how many of them contain an even number of digits.
// Example: Input: nums = [12,345,2,6,7896] Output: 2
// Approach: Count digits in each number and check if even
// Time Complexity: O(n * d) where n is number of elements and d is average digits in each number
// Space Complexity: O(1)
class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        
        for (int num : nums) {
            int digitCount = countDigits(num);
            
            if (digitCount % 2 == 0) {
                count++;
            }
        }
        
        return count;
    }
    
    private int countDigits(int num) {
        int count = 0;
        
        while (num > 0) {
            num = num / 10;
            count++;
        }
        
        return count;
    }
}