public class NonNegative{
    public static void main(String[] args)
    {
        int[] A = {-3674875, 5305422, 7665178, 205505, -7168198, -1398091, 5392310, -1700856, 1259052, -3056006};
        
        int leftStartIndex = 0;
        int rightStartIndex = 0;
        int leftEndIndex = 0;
        int rightEndIndex = 0;
        int ansStartIndex = 0;
        int ansEndIndex = A.length-1;
        int leftCount = 0;
        int rightCount = 0;
        int prevCount = 0;
        for(int i = 0; i < A.length; i++)
        {
            if(A[i] < 0)
            {
                leftCount = 0;
                rightCount = 0;
                if( i-1 != -1 && A[i-1] > 0)
                    leftEndIndex = i-1;
                for(int j = i-1; j >= 0; j--)
                {
                    if(A[j] >= 0)
                    {
                           
                           leftStartIndex = j;
                    }
                    else{
                        break;
                    }
                }
                if(i+1 != A.length && A[i+1] > 0)
                    rightStartIndex = i+1;        
                for(int j = i+1; j < A.length; j++)
                {
                    if(A[j] >= 0)
                    {
                        
                        rightEndIndex = j;
                    }
                    else{
                        break;
                    }
                }
                if(i-1 != -1)
                    leftCount = leftEndIndex - leftStartIndex + 1;
                if(i+1 != A.length)    
                    rightCount = rightEndIndex - rightStartIndex +1;

                System.out.println("Left Count=>"+leftCount);
                System.out.print("Right Count=>"+rightCount);
                    
                if(leftCount > rightCount)
                {
                    if(prevCount < leftCount)
                    {
                        ansStartIndex = leftStartIndex;
                        ansEndIndex = leftEndIndex;
                    }
                    
                }
                else if(rightCount > leftCount)
                {
                    if(prevCount < rightCount)
                    {
                        ansStartIndex = rightStartIndex;
                        ansEndIndex = rightEndIndex;
                    }
                    
                }
                else{
                    ansStartIndex = leftStartIndex;
                    ansEndIndex = leftEndIndex;
                }

                
            }
            
            
        }
        System.out.println("Ans Start Index =>"+ansStartIndex);
        System.out.println("Ans End Index =>"+ansEndIndex);
        int[] B = new int[ansEndIndex-ansStartIndex+1];   
        int j = 0; 
        for(int i = ansStartIndex; i <= ansEndIndex; i++)
        {   
                B[j++] = A[i];
        }

        for(int i = 0; i < B.length; i++)
        {
            System.out.println(B[i]);
        }

        
        
    }

    public static int getMax(int current, int previous)
    {
        if(current > previous)
            return current;
        return previous;
    }
}
