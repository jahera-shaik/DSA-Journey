class Solution {
    public int maximumWealth(int[][] accounts) {
        // Stores the maximum wealth 
        int maxWealth=0;
        // Iterate over each customer
        for (int i = 0; i < accounts.length; i++) {
            //Calculate wealth of current customer
            int currentWealth = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                currentWealth += accounts[i][j]; 
            }
            // Update maximum wealth if currentwealth is higher
            if (currentWealth > maxWealth) {  
                maxWealth = currentWealth;
            }
        }
        // Return the richest customers wealth
        return maxWealth;
    }
}
//Question 3:
//Approach: Calculate total wealth of each customer and track the maximum wealth
//Time Complexity:O(m x n) where m=customers,n=accounts per customer
//Space Complexity: O(1)
