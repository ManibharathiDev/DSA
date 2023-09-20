package Hashing;

import java.util.Arrays;
import java.util.HashMap;

public class PairDiff {
    public static void main(String[] args)
    {
        int[] A = {5,2,2,4,9,8,5,3,8,8,10,4,2,10,9,7,6,1,3,9,7,1,3,5};
        int B = 3;
        int i = 0;
        int j = i+1;
        int count = 0;
        Arrays.sort(A);
        System.out.println(Arrays.toString(A));
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int k = 0; k < A.length; k++)
        {
            if(hm.containsKey(A[k]))
            {
                int value = hm.get(A[k]);
                hm.put(A[k],value+1);
            }
            else
            {
                hm.put(A[k],1);
            }
        }
        System.out.println(hm.toString());
        while(i<j && j<A.length)
        {
            int diff = A[j]-A[i];
            if(diff == B)
            {
                count += 1;
                i = i+hm.get(A[i]);
                j = j+hm.get(A[j]);
                
                //i++;
                //j++;
            }
            else if(diff < B)
            {
               
                    j = j+hm.get(A[j]);
            }
            else
            {
                
                i = i+hm.get(A[i]);
            }
        }
        System.out.println(count);
    }
}
