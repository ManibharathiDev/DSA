public class SwapOnes {
    public static void main(String[] args)
    {
        //int[] A = {1,1,1,0,1,0};
        String A = "1111111111111";
        char[] Arr = A.toCharArray();
        int total_one = 0;
        int leftC=0;
        int rightC = 0;
        int ans = 0;
        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] == '1')
            {
                total_one++;
            }
        }
        //ans = total_one;

        if(total_one == Arr.length)
            {
                System.out.println(total_one);
                return;
            }
        
        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] == '0')
            {
                leftC = 0;
                for(int j = i-1; j>=0; j--){
                    if(Arr[j] == '1'){
                        leftC++;
                    }
                    else
                        break;
                    
                }
                rightC= 0;
                for(int j = i+1; j < Arr.length; j++)
                {
                    if(Arr[j] == '1')
                        rightC++;
                    else
                        break;    
                }
            }
            

            if(leftC+rightC < total_one)
                ans = getMax(ans, leftC+rightC+1);
            else
                ans = getMax(ans, leftC+rightC);    
        }

        System.out.println("The result is =>"+ans);
        
    }

    public static int getMax(int current, int previous)
    {
        if(current > previous)
            return current;
        return previous;
    }
}
