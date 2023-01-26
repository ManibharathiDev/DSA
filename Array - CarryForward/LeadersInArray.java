/**
 * Leaders In Array
 * Problem Description

Given an integer array A containing N distinct integers, you have to find all the leaders in array A. An element is a leader if it is strictly greater than all the elements to its right side.

NOTE: The rightmost element is always a leader.

Problem Constraints

1 <= N <= 105
1 <= A[i] <= 108
Input Format

There is a single input argument which a integer array A
Output Format

Return an integer array denoting all the **leader elements** of the array.
NOTE: Ordering in the output doesn't matter.

Example Input

 A = [16, 17, 4, 3, 5, 2]
Example Output

 [17, 2, 5]
Example Explanation

 Element 17 is strictly greater than all the elements on the right side to it.
 Element 2 is strictly greater than all the elements on the right side to it.
 Element 5 is strictly greater than all the elements on the right side to it.
 So we will return this three elements i.e [17, 2, 5], we can also return [2, 5, 17] or [5, 2, 17] or any other ordering.
 */

public class LeadersInArray {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> rightMax = new ArrayList<Integer>();
        rightMax.add(A.get(A.size()-1));
        for(int i = A.size()-2; i>=0; i--)
        {
            if(getMax(rightMax.get(rightMax.size()-1),A.get(i)) != rightMax.get(rightMax.size()-1))
            {
                rightMax.add(A.get(i));
            }
        }
        return rightMax;
    }

    private int getMax(int previous, int current)
    {
        if(current > previous)
            return current;
        return previous;    
    }


    // public int[] solve(int[] A) {
    //     int[] rightMax=new int[A.length];
    //     rightMax[A.length-1] = A[A.length-1];
    //     for(int i = A.length-2; i >= 0; i--)
    //     {
    //         rightMax[i] = getMax(rightMax[i+1],A[i]);
    //     }
    //     return rightMax;
    // }

    // private int getMax(int previous, int current)
    // {
    //     if(current > previous)
    //         return current;
    //     return previous;    
    // }
}
