package Hashing;

import java.util.Arrays;
import java.util.HashMap;

public class LongeshSubArraySum {
    public static void main(String[] args)
    {
        int[] A = {8,-8,6,0,-6,2,9};
        //int[] A = {9, -20, -11, -8, -4, 2, -12, 14, 1};
        System.out.println(solve(A));
    }

    private static int solve(int[] A)
    {
        Long[] pf = new Long[A.length];
        int maxLength = 0;
        pf[0] = (long) A[0];
        for(int i = 1; i < pf.length; i++){
            pf[i] = A[i] + pf[i-1];
        }
        System.out.println(Arrays.toString(pf));

        //HashSet
        HashMap<Long,Integer> hm = new HashMap<>();
        for(int i = 0; i < A.length; i++)
        {
            if(pf[i] == 0)
            {
                maxLength = getMax(i+1,maxLength);
            }
            else if(hm.containsKey(pf[i]))
            {
                maxLength= Math.max(i-hm.get(pf[i]),maxLength); 
            }
            else
            {
                hm.put((long) pf[i],i);
            }
        }
        //return (int) (maxLength%(Math.pow(10,9)+7));
        return maxLength;
    }

    public static int getMax(int current, int previous)
    {
        if(current > previous)
            return current;
        return previous;
    }
}
