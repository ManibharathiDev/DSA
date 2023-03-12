package Sorting;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args){
        String A = "secures";
        String B = "rescue";

        char[] As = A.toCharArray();
        char[] Bs = B.toCharArray();

        int[] Ascount = new int[26];
        int[] Bscount = new int[26];

        for(int i = 0; i < Ascount.length; i++)
        {
            Ascount[i] = 0;
            Bscount[i] = 0;
        }

        //Get Ascount char count
        for(int i = 0; i < As.length; i++)
        {
            int idx = As[i]-97;
            Ascount[idx]++;
        }

        for(int i = 0; i < Bs.length; i++){
            int idx = Bs[i]-97;
            Bscount[idx]++;
        }

        for(int i = 0; i < 26; i++)
        {
            if(Ascount[i] != Bscount[i])
            {
                System.out.println("Not a anagrams");
                break;
            }
        }
        

        System.out.println(Arrays.toString(Ascount));
        System.out.println(Arrays.toString(Bscount));


    }
}
