package Contest2;

import java.util.HashMap;

public class RightAngle {
    public static void main(String[] args)
    {
        int[] A = {1,1,2};
        int[] B = {1,2,1};
        System.out.println(solve(A, B));
    }

    public static int solve(int[] A, int[] B) {
        long mod = 1000000007;
        HashMap<Integer,Integer> hmX = new HashMap<>();
        HashMap<Integer,Integer> hmY = new HashMap<>();
        for(int i = 0; i < A.length; i++)
        {
            if(hmX.containsKey(A[i]))
            {
                int xValue = hmX.get(A[i]);
                xValue = xValue+1;
                hmX.put(A[i],xValue);
            }
            else
            {
                hmX.put(A[i],1);
            }

            if(hmY.containsKey(B[i]))
            {
                int yValue = hmY.get(B[i]);
                yValue = yValue+1;
                hmY.put(B[i],yValue);
            }
            else
            {
                hmY.put(B[i],1);
            }
        }

        System.out.println(hmX.toString());
        System.out.println(hmY.toString());

        long ans = 0;
        for(int i = 0; i < A.length; i++)
        {
            int vCount = hmX.get(A[i])-1;
            if(vCount <= 0)
                vCount = 0;
            int hCount = hmY.get(B[i])-1;
            if(hCount <=0)
                hCount = 0;
            ans += (vCount*hCount)%mod;        
            
        }

        return (int)ans;


    }
}
