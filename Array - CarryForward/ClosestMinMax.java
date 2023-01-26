/**
 * Problem Description
Given an array A, find the size of the smallest subarray such that it contains at least one occurrence of the maximum value of the array

and at least one occurrence of the minimum value of the array.



Problem Constraints
1 <= |A| <= 2000



Input Format
First and only argument is vector A



Output Format
Return the length of the smallest subarray which has at least one occurrence of minimum and maximum element of the array



Example Input
Input 1:

A = [1, 3]
Input 2:

A = [2]


Example Output
Output 1:

 2
Output 2:

 1


Example Explanation
Explanation 1:

 Only choice is to take both elements.
Explanation 2:

 Take the whole array.
 */

public class ClosestMinMax {
    public int solve(int[] A) {
        int MAX_VALUE = Integer.MIN_VALUE;
        int MIN_VALUE = Integer.MAX_VALUE;
        
        for(int i = 0; i<A.length; i++)
        {
            MAX_VALUE = getMaxElement(MAX_VALUE,A[i]);
            MIN_VALUE = getMinElement(MIN_VALUE,A[i]);
        }
        
        
        int LAST_MAX_IDX = Integer.MIN_VALUE;
        int LAST_MIN_IDX = Integer.MIN_VALUE;
        int ans = Integer.MAX_VALUE;
        
        for(int i = 0; i < A.length; i++)
        {
            if(A[i] == MAX_VALUE)
            {
                LAST_MAX_IDX = i;
            }
            
            if(A[i] == MIN_VALUE)
            {
                LAST_MIN_IDX = i;
            }
            
            if(LAST_MAX_IDX == Integer.MIN_VALUE || LAST_MIN_IDX == Integer.MIN_VALUE)
                continue;
            else
            {
                if(A[i] == MAX_VALUE)
                {
                    ans = getMinElement(ans,i-LAST_MIN_IDX+1);
                    
                }
                else if(A[i] == MIN_VALUE)
                {
                    ans = getMinElement(ans,i-LAST_MAX_IDX+1);
                }
            }
        } 
        
        return ans;
        }
    
        private static int getMinElement(int previous,int current)
        {
            if(current < previous)
                return current;
            return previous;
        }
        
        private static int getMaxElement(int previous, int current)
        {
            if(current > previous)
                return current;
            return previous;
        }
}
