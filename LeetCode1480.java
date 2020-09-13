package leetcode.LeetCode;

public class LeetCode1480 {

    /*用sum记录前n个数的和，再与第n+1个数相加，得到结果的第n+1个数。*/
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < result.length; i++) {
            result[i] = sum + nums[i];
            sum = result[i];
        }
        return result;
    }
}
