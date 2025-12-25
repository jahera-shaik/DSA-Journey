//Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

//Return the array in the form [x1,y1,x2,y2,...,xn,yn].
//Input: nums = [1,1,2,2], n = 2
//Output: [1,2,1,2]
 //Constraints:
//1 <= n <= 500
//nums.length == 2n
//1 <= nums[i] <= 10^3
import java.util.Arrays;
class Shuffle_the_array {
    public int[] shuffle(int[] nums, int n) {
        int[] ans=new int[2*n];
        int index=0;
        for(int i=0;i<n;i++){
            ans[index++]=nums[i];
            ans[index++]=nums[i+n];
        }
        return ans;
    }
    public static void main(String[] args) {
        Shuffle_the_array sol=new Shuffle_the_array();
        int[] nums={1,1,2,2};
        int n=2;
        int[] result=sol.shuffle(nums, n);
        System.out.println(Arrays.toString(result));
    }
}