/**
 * Maximum Sub Array
 * Problem Description
You are given an integer array C of size A. Now you need to find a subarray (contiguous elements) so that the sum of contiguous elements is maximum.
But the sum must not exceed B.


Problem Constraints
1 <= A <= 103
1 <= B <= 109
1 <= C[i] <= 106


Input Format
The first argument is the integer A.
The second argument is the integer B.
The third argument is the integer array C.


Output Format
Return a single integer which denotes the maximum sum.


Example Input
Input 1:
A = 5
B = 12
C = [2, 1, 3, 4, 5]
Input 2:

A = 3
B = 1
C = [2, 2, 2]


Example Output
Output 1:
12
Output 2:

0


Example Explanation
Explanation 1:
We can select {3,4,5} which sums up to 12 which is the maximum possible sum.
Explanation 2:

All elements are greater than B, which means we cannot select any subarray.
Hence, the answer is 0.
 */

public class MaxSubArray {
    public int maxSubarray(int A, int B, int[] C) {
        int[] PF = new int[A];
        PF[0] = C[0];
        int MAX = 0;
        for(int i = 1; i < C.length; i++)
        {
            PF[i] = PF[i-1]+C[i];
        }

        for(int i = 0; i < A; i++)
        {
            for(int e = i; e<A; e++)
            {
                int sum = pfSum(PF,i,e);
                if(sum <= B)
                {
                    MAX = getMax(sum,MAX);
                } 
            }
        }
        return MAX;
    }

    private int getMax(int current, int previous)
    {
        if(current > previous)
            return current;
        return previous;
    }
    
    private int pfSum(int[] PF,int start, int end)
    {
        if(start == 0)
            return PF[end];
        else
            return PF[end]-PF[start-1];
    }
}
