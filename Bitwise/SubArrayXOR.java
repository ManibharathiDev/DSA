/**
 * Problem Description
Given an array B of length A with elements 1 or 0. Find the number of subarrays such that the bitwise OR of all the elements present in the subarray is 1.


Problem Constraints
1 <= A <= 105


Input Format
The first argument is a single integer A.
The second argument is an integer array B.


Output Format
Return the number of subarrays with bitwise array 1.


Example Input
Input 1:
 A = 3
B = [1, 0, 1]
Input 2:
 A = 2
B = [1, 0]


Example Output
Output 1:
5
Output2:
2


Example Explanation
Explanation 1:
The subarrays are :- [1], [0], [1], [1, 0], [0, 1], [1, 0, 1]
Except the subarray [0] all the other subarrays has a Bitwise OR = 1
Explanation 2:
The subarrays are :- [1], [0], [1, 0]
Except the subarray [0] all the other subarrays has a Bitwise OR = 1
 */
public class Solution {
    public long solve(int A, int[] B) {

        long zeros = 0;
        long count = 0;
        for(int i = 0; i < A; i++)
        {
            if(B[i] == 0)
                zeros++;
            else
            {
                count += (zeros*(zeros+1))/2;
                zeros = 0;
            }    
        }
        count += (zeros*(zeros+1))/2;
        //long totalSubArray = (A*(A+1))/2;
        long totalSubArray = (1L*A*(A+1))/2;
        return totalSubArray - count;


        //Brute Force Solution
        // int count = 0;
        // for(int i = 0; i < A; i++)
        // {
        //     for(int j = i; j < A; j++)
        //     {
        //         int val = 0;
        //         for(int k = i; k <=j; k++)
        //         {   
        //             val = val|B[k];
        //         }
        //         if(val == 1)
        //             count++;
        //     }
        // }
        // return count;

        // int count = 0;
        // for(int i = 0; i < A; i++)
        // {
        //     int val = 0;
        //     for(int j = i; j < A; j++)
        //     {
                
        //         val = val|B[j];
        //         if(val == 1)
        //             count++;
        //     }
        // }
        // return count;
    }
}
