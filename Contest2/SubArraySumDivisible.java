package Contest2;

import java.util.HashMap;

public class SubArraySumDivisible {
    public static void main(String[] args)
    {
        // int[] A = {5,5,15,5,0,2,3,4};
        // int B = 5;
        int[] A = {3,-5,-7,13};
        int B = 3;
        System.out.println(solve(A, B));
    }

    public static int solve(int[] A,int B){
        int ans = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0, 1);
        int sums = 0;
        for(int i = 0; i < A.length; i++)
        {
            sums += A[i];
            int mod = ((sums%B)+B)%B;
            if(hm.containsKey(mod))
            {
                int value = hm.get(mod);
                ans += value;
                hm.put(mod,value+1);
            }
            else
            {
                hm.put(mod,1);
            }
            // if(hm.containsKey(sums))
            // {
            //     int value = hm.get(sums);
            //     hm.put(sums, value+1)
            // }
        }
        return ans;
    }
}
