package Recursion;

public class IthEasy {
    public static void main(String[] args)
    {
        int A = 4;
        int B = 3;
        String s = "0";
        while(A!=0){
            s = easy(s);
            A--;
        }
        System.out.println("Result is =>"+s.charAt(B));

    }

    public static String easy(String A)
    {
        String res = "";
        for(int i = 0; i<A.length(); i++)
        {
            if(A.charAt(i) == '0')
                res += "01";
            if(A.charAt(i) == '1')
                res += "10";    
        }
        return res;
    }
}
