/**
 * Even numbers in a range
 * Problem Description
You are given an array A of length N and Q queries given by the 2D array B of size Q*2. Each query consists of two integers B[i][0] and B[i][1].
For every query, the task is to find the count of even numbers in the range A[B[i][0]…B[i][1]].


Problem Constraints
1 <= N <= 105
1 <= Q <= 105
1 <= A[i] <= 109
0 <= B[i][0] <= B[i][1] < N


Input Format
First argument A is an array of integers.
Second argument B is a 2D array of integers.


Output Format
Return an array of integers.


Example Input
Input 1:
A = [1, 2, 3, 4, 5]
B = [   [0,2] 
        [1,4]   ]
Input 2:
A = [2, 1, 8, 3, 9]
B = [   [0,3] 
        [2,4]   ]


Example Output
Output 1:
[1, 2]
Output 2:
[2, 1]


Example Explanation
For Input 1:
The subarray for the first query is [1, 2, 3] which contains 1 even number.
The subarray for the second query is [2, 3, 4, 5] which contains 2 even numbers.
For Input 2:
The subarray for the first query is [2, 1, 8, 3] which contains 2 even numbers.
The subarray for the second query is [8, 3, 9] which contains 1 even number.
 */

public class EvenNumbersRange {
    public int[] solve(int[] A, int[][] B) {
        int[] result = new int[B.length];
       int count = 0;
       for(int i = 0; i < B.length; i++)
       {
           count = 0;
           for(int j = B[i][0]; j <= B[i][1]; j++)
           {
               if(A[j]%2 == 0)
                   count++;
           }
           result[i] = count;
       }
       return result;

   }
}
