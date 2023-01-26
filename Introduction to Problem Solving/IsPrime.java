/*
 * Problem Description
Given an Integer A. Return 1 if A is prime and return 0 if not.


Problem Constraints
1 <= A <= 1012


Input Format
The first argument is a single integer A.


Output Format
Return 1 if A is prime else return 0.


Example Input
Input 1:
A = 5
Input 2:

A = 10


Example Output
Output 1:
1
Output 2:

0


Example Explanation
Explanation 1:
5 is a prime number.
Explanation 2:

10 is not a prime number.
 */
public class IsPrime {
    public int solve(Long A) {
        int count = 0;
        for(long i = 1; i*i<=A;i++)
        {
            if(A%i == 0)
            {
                if(i == A/i)
                    count += 1;
                else
                    count += 2;    
            }
        }
        if(count == 2)
            return 1;
        else
            return 0;
    }
}
