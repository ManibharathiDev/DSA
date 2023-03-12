package Advanced;
/**
 * Sub-matrix Sum Queries
 * Problem Description
Given a matrix of integers A of size N x M and multiple queries Q, for each query, find and return the submatrix sum.

Inputs to queries are top left (b, c) and bottom right (d, e) indexes of submatrix whose sum is to find out.

NOTE:

Rows are numbered from top to bottom, and columns are numbered from left to right.
Sum may be large, so return the answer mod 109 + 7.


Problem Constraints
1 <= N, M <= 1000
-100000 <= A[i] <= 100000
1 <= Q <= 100000
1 <= B[i] <= D[i] <= N
1 <= C[i] <= E[i] <= M



Input Format
The first argument given is the integer matrix A.
The second argument given is the integer array B.
The third argument given is the integer array C.
The fourth argument given is the integer array D.
The fifth argument given is the integer array E.
(B[i], C[i]) represents the top left corner of the i'th query.
(D[i], E[i]) represents the bottom right corner of the i'th query.



Output Format
Return an integer array containing the submatrix sum for each query.



Example Input
Input 1:

 A = [   [1, 2, 3]
         [4, 5, 6]
         [7, 8, 9]   ]
 B = [1, 2]
 C = [1, 2]
 D = [2, 3]
 E = [2, 3]
Input 2:

 A = [   [5, 17, 100, 11]
         [0, 0,  2,   8]    ]
 B = [1, 1]
 C = [1, 4]
 D = [2, 2]
 E = [2, 4]


Example Output
Output 1:

 [12, 28]
Output 2:

 [22, 19]


Example Explanation
Explanation 1:

 For query 1: Submatrix contains elements: 1, 2, 4 and 5. So, their sum is 12.
 For query 2: Submatrix contains elements: 5, 6, 8 and 9. So, their sum is 28.
Explanation 2:

 For query 1: Submatrix contains elements: 5, 17, 0 and 0. So, their sum is 22.
 For query 2: Submatrix contains elements: 11 and 8. So, their sum is 19.
 
 */
import java.util.Arrays;

public class PFTwoD {
    public static void main(String[] args)
    {
        // int[][] A = {
        //     {2,3,8,0},
        //     {1,4,5,9},
        //     {2,3,5,6},
        //     {8,9,10,12},
        //     {24,2,3,4}
        // };
        int[][] A = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int[] B = {1, 2};
        int[] C = {1, 2};
        int[] D = {2, 3};
        int[] E = {2, 3};
        int[][] pf = new int[A.length][A[0].length];
        int mod = 1000000007;
        //pf[0][0] = A[0][0];
        //Row Wise Sum
        for(int i = 0; i < A.length; i++)
        {
            pf[i][0] = A[i][0]%mod;
            for(int j = 1; j < A[i].length; j++)
            {
                pf[i][j] = (A[i][j]%mod + pf[i][j-1]%mod)%mod;
            }
        }
        //Col Wise Sum

        for(int j = 0; j < pf[0].length; j++)
        {
            pf[0][j] = pf[0][j]%mod;
            for(int i = 1;i<pf.length; i++)
            {
                pf[i][j] = (pf[i][j]%mod+pf[i-1][j]%mod)%mod;
            }
        }

        for(int i = 0; i < pf.length; i++)
        {
            for(int j = 0; j < pf[i].length; j++)
            {
                System.out.print(pf[i][j]+"     ");
            }
            System.out.println("");
        }
        int[] result = new int[B.length];
        
        for(int i = 0; i < B.length; i++)
        {
            // System.out.println("TL=>"+B[i]+" "+C[i]);
            // System.out.println("BR=>"+D[i]+" "+E[i]);
            int a1=B[i]-1;
            int a2=D[i]-1;
            int b1=C[i]-1;
            int b2=E[i]-1;
            result[i]=pf[a2][b2];
            if(a1>0 && b1>0){
                result[i]=( result[i]+pf[a1-1][b1-1])%mod;//sum+=prefix[a1-1][b1-1]%mod; it will error
            }
            if(a1>0){
                result[i]=( result[i]-pf[a1-1][b2])%mod;
            }
            if(b1>0){
                result[i]=( result[i]-pf[a2][b1-1])%mod;
            }
            if( result[i]<0){
                result[i]=( result[i]+mod)%mod;
            }
            
            // result[i] += pf[D[i]-1][E[i]-1];
            // if((C[i]-1)-1 >= 0)
            //     result[i] -= (pf[D[i]-1][(C[i]-1)-1])%mod;
            // if((B[i]-1)-1 >= 0)
            //     result[i] -= pf[(B[i]-1)-1][E[i]-1]%mod;
            // if((C[i]-1)-1 >= 0 && (B[i]-1)-1 >= 0)  
            //     result[i] +=  pf[(B[i]-1)-1] [(C[i]-1)-1]%mod;  
            //result[i] = sum;    
        }
        System.out.println(Arrays.toString(result));
    }
}
