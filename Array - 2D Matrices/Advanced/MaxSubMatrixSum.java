package Advanced;

public class MaxSubMatrixSum {
    public static void main(String[] args)
    {
        // int[][] A = {
        //     {-1,2,3},
        //     {2,2,4}
        // };
        int[][] A = {
            {-35},
            {-5}
        };
        //int[][] A = {{14}};

        if(A.length == 1 && A[0].length == 1)
         {
            System.out.println(A[0][0]);
            return;
         }   

        long[][] pf = new long[A.length][A[0].length];
        //int mod = 1000000007;
        //pf[0][0] = A[0][0];
        //Row Wise Sum
        for(int i = 0; i < A.length; i++)
        {
            pf[i][0] = A[i][0];
            for(int j = 1; j < A[i].length; j++)
            {
                pf[i][j] = (A[i][j] + pf[i][j-1]);
            }
        }
        //Col Wise Sum

        for(int j = 0; j < pf[0].length; j++)
        {
            pf[0][j] = pf[0][j];
            for(int i = 1;i<pf.length; i++)
            {
                pf[i][j] = (pf[i][j]+pf[i-1][j]);
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

        long ans = Integer.MIN_VALUE;
        for(int i = 0; i < A.length; i++)
        {
            for(int j = 0; j < A[i].length; j++)
            {
                int a1 = i;
                int b1 = j;
                int a2 = A.length-1;
                int b2 = A[i].length-1;
                long sum = 0;
                sum += pf[a2][b2];
                if(b1-1 >= 0)
                    sum -= pf[a2][b1-1];
                if(a1-1 >= 0)
                    sum -= pf[a1-1][b2];
                if(a1-1 >=0 && b1-1 >= 0)
                    sum += pf[a1-1][b1-1];

                ans = getMax(sum, ans);
                // sum += pf[D[i]-1][E[i]-1];
                // if(a2-1 >= 0)
                //     sum -= (pf[D[i]-1][(C[i]-1)-1])%mod;
                // if(b1-1 >= 0)
                //     sum -= pf[(B[i]-1)-1][E[i]-1]%mod;
                // if((C[i]-1)-1 >= 0 && (B[i]-1)-1 >= 0)  
                //     sum +=  pf[(B[i]-1)-1] [(C[i]-1)-1]%mod;  
            }
        }
        System.out.println(ans);

    }

    private static long getMax(long current,long previous)
    {
        if(current > previous)
            return current;
        return previous;
    }
    
}
