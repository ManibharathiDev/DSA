/**
 * Generate all subarrays
 * Problem Description
You are given an array A of N integers.
Return a 2D array consisting of all the subarrays of the array


Problem Constraints
1 <= N <= 100
1 <= A[i] <= 105


Input Format
First argument A is an array of integers.


Output Format
Return a 2D array of integers


Example Input
Input 1:
A = [1, 2, 3]
Input 2:
A = [5, 2, 1, 4]


Example Output
Output 1:
[[1], [1, 2], [1, 2, 3], [2], [2, 3], [3]]
Output 2:
[[1 ], [1 4 ], [2 ], [2 1 ], [2 1 4 ], [4 ], [5 ], [5 2 ], [5 2 1 ], [5 2 1 4 ] ]


Example Explanation
For Input 1:
All the subarrays of the array are returned. There are a total of 6 subarrays.
For Input 2:
All the subarrays of the array are returned. There are a total of 10 subarrays.
 */

public class GenerateSubArray {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> resultList = new ArrayList<>();
        // for(int i = 0; i < A.size(); i++)
        //   {
        //       ArrayList<Integer> resultLists = new ArrayList<Integer>();
        //       resultLists.add(A.get(i)*(i+1)*(A.size()-i));
        //       resultList.add(resultLists);
              
        //   }
        for(int i = 0; i < A.size(); i++)
          {
              for(int j = i; j < A.size(); j++)
              {
                  resultList.add(printSubArray(A,i,j));
              }
          }
          return resultList;
    }

    private ArrayList<Integer> printSubArray(ArrayList<Integer> arr, int start, int end){
        
        ArrayList<Integer> resultList = new ArrayList<Integer>();
        for(int i = start; i <= end; i++)
        {
            resultList.add(arr.get(i));
        }
        return resultList;
    }
}
