package LeetCode;

public class LeetCode1480 {
    public static void main(String[] args) {

    }

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
