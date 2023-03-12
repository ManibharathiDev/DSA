package Advanced;

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
