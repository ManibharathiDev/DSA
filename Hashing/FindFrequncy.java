package Hashing;

import java.util.Arrays;
import java.util.HashMap;

public class FindFrequncy {
    public static void main(String[] args)
    {
        int[] A = {6, 3, 3, 6, 7, 8, 7, 3, 7};
        int[] B = {10,9,8};

        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0; i < A.length; i++)
        {
            if(hm.containsKey(A[i]))
            {
                int value = hm.get(A[i]);
                hm.put(A[i],++value);
            }
            else
                hm.put(A[i], 1);
        }
        System.out.println(hm);
        int[] result = new int[B.length];
        for(int i = 0; i < B.length; i++)
        {
            int value = 0;
            if(hm.containsKey(B[i]))
                value = hm.get(B[i]);
            result[i] = value;
        }

        System.out.println(Arrays.toString(result));

    }
}
