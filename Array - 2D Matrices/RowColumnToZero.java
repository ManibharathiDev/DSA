/**
 * Row Column To Zero
 * Problem Description
You are given a 2D integer matrix A, make all the elements in a row or column zero if the A[i][j] = 0. Specifically, make entire ith row and jth column zero.



Problem Constraints
1 <= A.size() <= 103

1 <= A[i].size() <= 103

0 <= A[i][j] <= 103



Input Format
First argument is a vector of vector of integers.(2D matrix).



Output Format
Return a vector of vector after doing required operations.



Example Input
Input 1:

[1,2,3,4]
[5,6,7,0]
[9,2,0,4]


Example Output
Output 1:

[1,2,0,0]
[0,0,0,0]
[0,0,0,0]


Example Explanation
Explanation 1:

A[2][4] = A[3][3] = 0, so make 2nd row, 3rd row, 3rd column and 4th column zero.
 */

public class RowColumnToZero {
    public int[][] solve(int[][] A) {
        int[][] result = new int[A.length][A[0].length];
        
        
        for(int i = 0; i < A.length; i++)
        {
            for(int j = 0; j < A[0].length; j++)
            {
                    result[i][j] = A[i][j];
            }
        }

        for(int i = 0; i < A.length; i++)
        {
            for(int j = 0; j < A[0].length; j++)
            {
                if(A[i][j] == 0)
                {
                    
                    
                    for(int k = 0; k < A[0].length; k++)
                    {
                        result[i][k] = 0;
                    }
                    
                    for(int l = 0; l < A.length; l++)
                    {
                        result[l][j] = 0;
                    }
                    
                }
                
            }
        }

        return result;
    }
}
