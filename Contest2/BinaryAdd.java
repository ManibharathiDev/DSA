package Contest2;

public class BinaryAdd {
    public static void main(String[] args)
    {
        String A = "abc123b4";
        int sum = 0;
        String numString = "";
        Boolean flag = false;
        for(int i = 0; i < A.length(); i++)
        {
            int ascii = A.charAt(i);
            
            if(ascii >=48 && ascii <= 57 )
            {
                numString += (char) ascii;
                
            }
            else{
                flag = true;
                if(!numString.isEmpty())
                {
                    sum += Integer.parseInt(numString);
                }
                numString = "";
            }
        }
        if(flag)
            {
                sum += Integer.parseInt(numString);
                System.out.println(sum);
            }
        else
            System.out.println(A);
    }
    

    // private static int SplitFactor(String value)
    // {
    //     String numString = "";

	// 	for (int i = 0; i < value.length(); i++) {
	// 		int ascii = value.charAt(i);
	// 		if (ascii >= 48 && ascii <= (57)) {
	// 			numString += (char) ascii;
	// 		}
	// 	}
	// 	int numbers = Integer.parseInt(numString);
    //     return numbers;
        
    // }
}
