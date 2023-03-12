package Contest2;

public class BinaryNumber {
    public static void main(String[] args)
    {
        int A = 18;
        int B = 2;
        String nums = "";
        Long binary = 0L;
        for(int i = 0; i < A; i++)
        {
            nums += "1";
        }

        for(int i = 0; i < B; i++)
        {
            nums += "0";
        }
        //String binaryString = "00111111111111111101111111111111111111111";
        long number = Long.parseLong(nums, 2);
        System.out.println(number); // 549751619583
        /*binary = Long.parseLong(nums);
        
        System.out.println(binary);
        int sum = 0;
        int i = 0;
        while(binary > 0)
        {
            Long remainder = binary%10;
            sum += remainder*(Math.pow(2,i));
            binary = binary/10;
            i++;
        }
        System.out.println(sum);
        */
    }
}
