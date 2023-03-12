package Hashing;

import java.util.HashMap;

public class Pair {
    public static void main(String[] args){
        int A = 4;
        int[] B = {3, 5, 1, 2};
        System.out.println(solve(A,B));
    }

    public static int solve(int A, int[] B) {
        //Create Frequence HM
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0; i < B.length; i++){
            if(hm.containsKey(B[i]))
            {
                int pValue = hm.get(B[i]);
                hm.put(B[i], pValue+1);
            }
            else
                hm.put(B[i],1);
        }
        int count = 0;
        for(int i = 0; i < B.length; i++){
            int a = B[i];
            //int b = A-a;
            int b = a-A;
            if(a==b){
                if(hm.get(b) >= 2)
                    {
                        //return 1;
                        count += hm.get(b);
                    }
            }
            else{
                if(hm.containsKey(b))
                    {
                        //return 1;
                        count += hm.get(b);
                    }
            }
        }

        return count;
    }
}
