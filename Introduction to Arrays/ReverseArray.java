/**
 * Problem Description
You are given a constant array A.

You are required to return another array which is the reversed form of the input array.



Problem Constraints
1 <= A.size() <= 10000

1 <= A[i] <= 10000



Input Format
First argument is a constant array A.



Output Format
Return an integer array.



Example Input
Input 1:

A = [1,2,3,2,1]
Input 2:

A = [1,1,10]


Example Output
Output 1:

 [1,2,3,2,1] 
Output 2:

 [10,1,1] 


Example Explanation
Explanation 1:

Reversed form of input array is same as original array
Explanation 2:

Clearly, Reverse of [1,1,10] is [10,1,1]
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArray {
    public ArrayList<Integer> solve(final List<Integer> A) {
       
        ArrayList<Integer> myList = new ArrayList<Integer>();
        for(int i = 0; i < A.size(); i++)
        {
            myList.add(A.get(i));
        }
        int i = 0;
        int j = myList.size()-1;
        while(i<j)
        {
            Collections.swap(myList, i, j);
            i++;
            j--;
 
        }
        return myList;
     }
}
