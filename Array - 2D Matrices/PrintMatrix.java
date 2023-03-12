public class PrintMatrix {
    public static void main(String[] args){

        int[][] arr = {{1},
                        {2,3},
                        {4,5,6}};
        // System.out.println(arr.length);  
        // System.out.println(arr[0].length);   
        // System.out.println(arr[1].length);                
        // System.out.println(arr[2].length);  
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j<arr[i].length; j++)
            {
                System.out.print(arr[i][j]+"    ");
            }
            System.out.println("");
        }
        // int[][] arr = new int[3][4];
        // arr[0][0] = 1;
        // arr[0][1] = 2;
        // arr[0][2] = 3;
        // arr[0][3] = 56;

        // arr[1][0] = 4;
        // arr[1][1] = 5;
        // arr[1][2] = 6;
        // arr[1][3] = 56;

        // arr[2][0] = 7;
        // arr[2][1] = 8;
        // arr[2][2] = 9;
        // arr[2][3] = 9;

        

        // for(int i = 0; i < arr.length; i++)
        // {
        //     for(int j = 0; j<arr[i].length; j++)
        //     {
        //         System.out.print(arr[i][j]+"    ");
        //     }
        //     System.out.println("");
        // }
    }
}
