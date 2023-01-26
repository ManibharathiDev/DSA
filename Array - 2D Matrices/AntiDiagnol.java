/**
 * Anti Diagnols
 * Problem Description
Give a N * N square matrix A, return an array of its anti-diagonals. Look at the example for more details.


Problem Constraints
1<= N <= 1000
1<= A[i][j] <= 1e9


Input Format
Only argument is a 2D array A of size N * N.


Output Format
Return a 2D integer array of size (2 * N-1) * N, representing the anti-diagonals of input array A.
The vacant spaces in the grid should be assigned to 0.


Example Input
Input 1:
1 2 3
4 5 6
7 8 9
Input 2:

1 2
3 4


Example Output
Output 1:
1 0 0
2 4 0
3 5 7
6 8 0
9 0 0
Output 2:

1 0
2 3
4 0


Example Explanation
For input 1:
The first anti diagonal of the matrix is [1 ], the rest spaces shoud be filled with 0 making the row as [1, 0, 0].
The second anti diagonal of the matrix is [2, 4 ], the rest spaces shoud be filled with 0 making the row as [2, 4, 0].
The third anti diagonal of the matrix is [3, 5, 7 ], the rest spaces shoud be filled with 0 making the row as [3, 5, 7].
The fourth anti diagonal of the matrix is [6, 8 ], the rest spaces shoud be filled with 0 making the row as [6, 8, 0].
The fifth anti diagonal of the matrix is [9 ], the rest spaces shoud be filled with 0 making the row as [9, 0, 0].
For input 2:

The first anti diagonal of the matrix is [1 ], the rest spaces shoud be filled with 0 making the row as [1, 0, 0].
The second anti diagonal of the matrix is [2, 4 ], the rest spaces shoud be filled with 0 making the row as [2, 4, 0].
The third anti diagonal of the matrix is [3, 0, 0 ], the rest spaces shoud be filled with 0 making the row as [3, 0, 0].
 */

public class AntiDiagnol {
    public int[][] diagonal(int[][] A) {
        int rRowLength = 2*A[0].length-1;
        int rColLength = A[0].length;
        int[][] result = new int[rRowLength][rColLength];
        for(int i = 0; i < rRowLength; i++)
        {
            for(int j = 0; j < rColLength; j++)
            {
                result[i][j] = 0;
            }
        }

        int rows = -1;
        int cols = -1;
        
        for(int i = 0; i < A.length; i++)
        {
            int x = 0;
            int y = i;
            rows++;
            cols = 0;
            
            while(x < A.length && y >=0)
            {
               
                result[rows][cols] = A[x][y];
                cols++;
                x++;
                y--;
            }
        }

        int row = A.length-1;
        int col = 0;
        for(int i = 1; i < A.length; i++){
            int x = i;
            int y = A.length-1;
            row++;
            col = 0;
            while(x < A.length && y >=0)
            {
               
                result[row][col] = A[x][y]; 
                col++;
                x++;
                y--;
            }
        }

        return result;
    }
}
