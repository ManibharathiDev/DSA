package Hashing;

import java.util.HashMap;

public class RepeatElement 
{
    public static void main(String[] args)
    {
        int[] A = {10, 5, 3, 4, 3, 5, 6};
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

        for(int i = 0; i < A.length; i++)
        {
            if(hm.get(A[i]) == 1)
            {
                re
            }
        }

        
    }

    
    
    

}
