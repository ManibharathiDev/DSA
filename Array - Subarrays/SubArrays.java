public class SubArrays {
    public static void main(String[] args)
    {
        int[] A = {1,2,3,4,5};
        for(int i = 0; i< A.length; i++)
        {
            for(int j = i; j < A.length; j++)
            {
                for(int k = i; k<=j; k++)
                {
                    System.out.print(A[k]+" ");
                }
            }
            System.out.println(" ");
        }
    }
}
