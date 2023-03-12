package Contest2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentMarks {
    public static void main(String[] args)
    {
        ArrayList<String> A = new ArrayList<String>();
        A.add("harsh80");
        A.add("shivam95");
        A.add("adarsh95");
        A.add("adarsh99");
        A.add("adarsh100");
        Collections.sort(A, new SortComparator());
        for(int i = 0; i < A.size(); i++)
        {
            System.out.println(A.get(i));
        }

    }

    static class SortComparator implements Comparator<String>
    {

        @Override
        public int compare(String o1, String o2) {
            if(SplitFactor(o1)>SplitFactor(o2))
                return -1;
            else if(SplitFactor(o1)<SplitFactor(o2))
                return 1;    
            return 0;
        }
        
    }

    private static int SplitFactor(String value)
    {
        String numString = "";

		for (int i = 0; i < value.length(); i++) {
			int ascii = value.charAt(i);
			if (ascii >= 48 && ascii <= (57)) {
				numString += (char) ascii;
			}
		}
		int numbers = Integer.parseInt(numString);
        return numbers;
        
    }

    

}
