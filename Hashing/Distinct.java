package Hashing;

import java.util.HashSet;

public class Distinct {
    public static void main(String[] args){
        int[] A = {3, 4, 3, 6, 6};
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i < A.length; i++)
        {
            hs.add(A[i]);
        }
        System.out.println(hs.size());
    }
}
