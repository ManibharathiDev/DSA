package Hashing;

import java.util.Arrays;
import java.util.HashMap;

public class SubarraySum {
    public static void main(String[] args){
        int[] A = {1,-1};
        int[] pf = new int[A.length];

        pf[0] = A[0];
        for(int i = 1; i<A.length; i++)
        {
            pf[i] = A[i] + pf[i-1];
            if(pf[i] == 0)
            {
                System.out.println("Yes available");
                return;
            }
        }
       
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0; i < pf.length; i++)
        {
            
            if(hm.containsKey(pf[i]))
            {
                int value = hm.get(pf[i]);
                hm.put(pf[i],++value);
            }
            else
                hm.put(pf[i], 1);
        }

        for(int i = 0; i < pf.length; i++)
        {
            if(hm.get(pf[i]) > 1)
                return 1;
        }

        // for(int i = 0; i < pf.length; i++)
        // {
        //     if(hm.get(pf[i]) > 1)
        //         System.out.println("Available");
        // }

        System.out.println("No Subarray Sum is 0 available");
    }
}
