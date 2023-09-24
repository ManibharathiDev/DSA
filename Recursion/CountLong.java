package Recursion;

import java.util.Arrays;

public class CountLong{
    static int count;
    static int result = Integer.MIN_VALUE;
    static int min = Integer.MIN_VALUE;
    public static void main(String[] args)
    {
        int[] a  = {1,1,2,2,3,3,4,4,5,5,100,101,102,103,104,105,106,107};
        Arrays.sort(a);
        getCount(0,a[0], a);
        result = Math.max(result,count);
        System.out.println(result);
    }

    static void getCount(int i,int number, int[] a)
    {
        if(i == a.length)
        {
           
            return;
        }

        if(number == a[i])
        {
            count = count+1;
            int cNumber = number;
            int j = i+1;
            while(j<a.length && cNumber == a[j])
            {
                j++;
            }
            getCount(j,number+1,a);
        }
        else{
            result = Math.max(result, count);
            count = 0;
            getCount(i, a[i], a);
        }

        // if(a[i]<a[i+1])
        // {
        //     count = count+1;
        //     getCount(i+1, a);
        // }
        // else
        // {
        //     count = Math.max(min,count);
        //     count = 0;
        //     getCount(i+1,a);
        // }
    }
}