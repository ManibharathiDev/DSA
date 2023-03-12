package Advanced;

public class SearchValue {
    public static void main(String[] args)
    {
        int[][] A = {
            {2,8,8,8},
            {2,8,8,8},
            {2,8,8,8}
        };
        int B = 8;
        System.out.println(solve(A, B));
    }

    public static int solve(int[][] A, int B) {
        
        int i = 0;
        int j = A[0].length-1;
        boolean isFound = false;
        int ans = Integer.MAX_VALUE;
        while(i<A.length && j >=0)
        {
            if(A[i][j] == B)
            {
                isFound = true;
                ans = getMin((i+1)*1009+(j+1),ans);
                j--;
            }
            else if(A[i][j] > B)
                j--;
            else
                i++;        
        }
        if(!isFound)
            return -1;
        else
            return ans;    
    }

    private static int getMin(int current, int previous)
    {
        if(current < previous)
            return current;
        return previous;
    }

    
}
