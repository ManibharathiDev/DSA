/**
 * Row Sum
 * Problem Description
You are given a 2D integer matrix A, return a 1D integer array containing row-wise sums of original matrix.



Problem Constraints

1 <= A.size() <= 103

1 <= A[i].size() <= 103

1 <= A[i][j] <= 103



Input Format
First argument A is a 2D array of integers.(2D matrix).



Output Format
Return an array conatining row-wise sums of original matrix.



Example Input
Input 1:

[1,2,3,4]
[5,6,7,8]
[9,2,3,4]


Example Output
Output 1:

[10,26,18]


Example Explanation
Explanation 1

Row 1 = 1+2+3+4 = 10
Row 2 = 5+6+7+8 = 26
Row 3 = 9+2+3+4 = 18
 */

public class RowSum {
    public int[] solve(int[][] A) {
        int row = A.length;
        int cols = A[0].length;
        int[] resultSum = new int[row];
        for(int i = 0; i<row; i++)
        {
            int sum = 0;
            for(int j = 0; j < cols; j++)
            {
                sum += A[i][j];
            }
            resultSum[i] = sum;
        }
        return resultSum;
    }
}
