package Sorting;

public class Reverse {
    public static void main(String[] args){
        String A = "Iss am the best";
        System.out.println(A.trim());
        char[] As = A.toCharArray();
        int i = 0;
        int j = As.length-1;
        while(i<j)
        {
            char temp = As[i];
            As[i] = As[j];
            As[j] = temp;
            i++;
            j--;
        }
        System.out.println(String.valueOf(As));
        int startRange = 0;
        //int endRange = 0;
        for(int k = 0; k < As.length; k++)
        {
            
            if(As[k] == 32)
                continue;
            for(int l = k; l < As.length; l++)
            {
                //endRange = l;
                if(As[l]==32)
                {
                    startRange = k;
                    revRange(startRange, l-1, As);
                    k = l-1;
                    break;
                }
                else
                    startRange = k;
            }
            
        }
        //System.out.println(startRange);
        //revRange(startRange, As.length-1, As);
        System.out.println(String.valueOf(As));
    }

    public static char[] revRange(int start,int end, char[] arr){
        int i = start;
        int j = end;
        while(i<j)
        {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }
}
