package ModulosArithmetic;

import java.util.Arrays;
import java.util.HashMap;

public class PariSumDivisible {
    public static void main(String[] args)
    {
        //int[] A = {2,3,4,8,6,15,5,12,17,7,18,10,9};
        int[] A = {5,7,100,11};
        int M = 28;
        int mods = 1000000007;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0; i < A.length; i++)
        {
            int mod = A[i]%M;
            if(hm.containsKey(mod))
            {
                hm.put(mod, hm.get(mod)+1);
            }
            else
            {
                hm.put(mod, 1);
            }
        }
        System.out.println(hm);
        long ans = 0;
        if(hm.containsKey(0))
        {
            int f = hm.get(0);
            ans += (f*(f-1))/2;
        }

        if(M%2 == 0)
        {
            System.out.println(M/2);
            if(hm.containsKey(M/2))
            {
                int f = hm.get(M/2);
                ans += (f*(f-1))/2;
            }
        }

        for(int i = 1; i < M-1; i++)
        {
            if(hm.containsKey(i) && hm.containsKey(M-i))
                ans += (hm.get(i)* hm.get(M-i));
        }

        //normal cases
        // int i=1;
        // int j = M-1;

        // while(i<j)
        // {
        //     if(hm.containsKey(i) && hm.containsKey(j))
        //     {
        //         ans += (hm.get(i)* hm.get(j));
        //     }
        //     i++;
        //     j--;
        // }

        System.out.println(ans%mods);
        
    }
}
