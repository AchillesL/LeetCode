package leetcode.LeetCode;

public class LeetCode1572 {
    /*注意要判断奇偶*/
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int len = mat[0].length;
        for (int i = 0; i < len; i++) {
            sum += mat[i][i];
        }
        for (int i = 0; i < len; i++) {
            sum += mat[i][len - i - 1];
        }
        if (len % 2 == 1) {
            return sum - mat[len / 2][len / 2];
        } else {
            return sum;
        }
    }
}
