/**
 * Second Largest
 * Problem Description
You are given an integer array A. You have to find the second largest element/value in the array or report that no such element exists.


Problem Constraints
1 <= |A| <= 105

0 <= A[i] <= 109



Input Format
The first argument is an integer array A.



Output Format
Return the second largest element. If no such element exist then return -1.



Example Input
Input 1:

 A = [2, 1, 2] 
Input 2:

 A = [2]


Example Output
Output 1:

 1 
Output 2:

 -1 


Example Explanation
Explanation 1:

 First largest element = 2
 Second largest element = 1
Explanation 2:

 There is no second largest element in the array.
 */

public class SecondLargest {
    public int solve(ArrayList<Integer> A) {

        if(A.size() == 1)
            return -1;

        int FIRST_MAX_VALUE = Integer.MIN_VALUE;
        Collections.sort(A);
        for(int i = 0; i < A.size(); i++)
        {
            FIRST_MAX_VALUE = getMaxElement(A.get(i),FIRST_MAX_VALUE);
        }
        int remaining_count = A.size()-getMaxCount(A,FIRST_MAX_VALUE) ;
        if(remaining_count == 0)
        {
            
            return -1;
        }
        return A.get(remaining_count-1);
       
        
    }

    private static int getMaxElement(int first,int second)
    {
        if(first > second)
            return first;
        return second;
    }
    
    private static int getMaxCount(ArrayList<Integer> arr, int max_value)
    {
        int count = 0;
        for(int i = arr.size()-1; i >= 0; i--)
        {
            if(arr.get(i) == max_value)
            {
                count++;
            }
            else
            {
                return count;
            }
        }
        return count;
    }
}
