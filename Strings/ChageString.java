package Strings;

public class ChageString {
    public static void main(String[] args){
        String A = "AbcaZeoB";
        A = A.concat(A);
        char[] As = A.toCharArray();
        for(int i = 0; i<As.length; i++){
            if(As[i] >= 65 && As[i] <= 90)
            {
                As[i] = 32;
            }
            
            if(As[i] == 'a' || As[i] == 'e' || As[i] == 'i' || As[i] == 'o' || As[i] == 'u')
                As[i] = '#';
        }
        String result = String.valueOf(As);
        result = result.replaceAll("\\s", "");
        System.out.println(result);
        
    }
}
