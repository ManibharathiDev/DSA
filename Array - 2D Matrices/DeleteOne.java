public class DeleteOne {
    public static void main(String[] args)
    {
        int[] A = {5, 15, 30};
        int[] pfgcd = new int[A.length];
        int[] sfgcd = new int[A.length];
        pfgcd[0] = A[0];
        for(int i = 1;i<A.length;i++)
        {
            pfgcd[i] = gcd(pfgcd[i-1],A[i]);
        }

        sfgcd[A.length-1] = A[A.length-1];
        for(int i = A.length-2; i>=0; i--)
        {
            sfgcd[i] = gcd(sfgcd[i+1],A[i]);
        }

        int ans= Math.max(sfgcd[1],pfgcd[A.length-2]);
        int leftgcd = Integer.MIN_VALUE;
        int rightgcd = Integer.MIN_VALUE;

        for(int i = 0;i<A.length;i++)
        {
                if(i == 0)
                    leftgcd = pfgcd[i];
                else    
                    leftgcd = pfgcd[i-1];
                if(i == A.length-1)
                    rightgcd = sfgcd[A.length-1];    
                else
                    rightgcd = sfgcd[i+1];
                ans = max(ans,gcd(leftgcd, rightgcd));
        }

        System.out.println(ans);

    }

    private static int max(int current,int previous)
    {
        if(current>previous)
            return current;
        return previous;    
    }

    private static int gcd(int A, int B) {
        if(A == 0)
            return B;
        if(B == 0)
            return A;
        return gcd(B,A%B);
    }
}
