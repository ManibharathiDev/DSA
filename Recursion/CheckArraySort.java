package Recursion;

/**
 * Check if array is sorted or not
 */
public class CheckArraySort {
    public static void main(String[] args)
    {
        int[] a = {1,2,3,8,5,6,7,8};
        System.out.println(sorts(0, a));
    }

    static boolean sorts(int index, int[] a)
    {
        if(index == a.length-1)
        {
            return true;
        }
        return (a[index]<=a[index+1]) && sorts(index+1,a);
    }
}
