public class Product {
    public static void main(String[] args)
    {
        int[] A = {1,2,3,4};
        int[] pf = new int[A.length];
        int[] result = new int[A.length];
        pf[0] = A[0];
        for(int i = 1; i < A.length; i++)
        {
            pf[i] = (int) ((int)(pf[i-1] * A[i])%(Math.pow(10,7)));
        }

        for(int i = 0; i < A.length; i++)
        {
            result[i] = pf[A.length-1]/A[i];
            System.out.println(result[i]+" ");
            
        }
    }
}
