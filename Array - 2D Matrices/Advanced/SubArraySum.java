package Advanced;

import java.util.Arrays;

public class SubArraySum {
    public static void main(String[] args)
    {
        int[] A = {5,10,20,100,105};
        int B = 110;
        int i = 0;
        int j = 0;
        int sum = A[0];
        int result[] = {};
        while(j<A.length)
        {
            if(sum == B)
            {
                System.out.println("Found");
                System.out.println("I =>"+i);
                System.out.println("J =>"+j);
                result = new int[j-i+1];
                int r = 0;
                for(int k = i; k<=j;k++)
                {
                    result[r] = A[k];
                    r++;
                }
                break;
            }
            else if(sum < B)
            {
                j++;
                // if(j == A.length)
                //     break;
                sum += A[j];
            }
            else
            {
                sum -= A[i];
                i++;
            }
        }

        System.out.println(Arrays.toString(result));
    }
}
