package Recursion;

import java.util.ArrayList;

public class CoinSumInfinity {
    public static void main(String[] args) {
        int[] A = {1,2,3};
        int B = 4;
        solve(A,0, B, new ArrayList<Integer>());
    }  

    private static void solve(int[] A,int s,int B,ArrayList<Integer>path)
    {
        if(B == 0)
        {
            System.out.println(path.toString());
            return;
        }

        if(B-A[s]>=0)
        {
        path.add(A[s]);
        solve(A,s,B-A[s],path);
        path.remove(path.size()-1);
        }
       
        if(B-A[s+1] >= 0)
        {
            path.add(A[s+1]);
            solve(A,s+1,B-A[s+1],path);
            path.remove(path.size()-1);
        }
    }
}
