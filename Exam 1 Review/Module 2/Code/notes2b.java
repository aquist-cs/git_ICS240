import java.util.Scanner; 

public class notes2b {
    public static void main(String[] args) {
        /*
         * Create an array from user input 
         */

        // Scanner input = new Scanner(System.in);
        // double[] mylist = new double[10]; 

        // System.out.print("Enter " + mylist.length + " values: "); 

        // for (int i = 0; i < mylist.length; i++) {
        //     mylist[i] = input.nextDouble(); 
        // }
        
        // input.close();

        /**
         * Array Traversal 
         * Note: Not initialzing values[0] yet.
         */
        int[] values = new int[5]; 

        for (int i = 1; i < 5; i++) {
            values[i] = i + values[i - 1]; 
        }

        values[0] = values[1] + values[4]; 

        for (int i = 0; i < 5; i++) {
            System.out.println(i + "\t" + values[i]); 
        }
    }
}
