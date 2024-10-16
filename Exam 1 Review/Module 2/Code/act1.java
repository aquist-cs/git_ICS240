/**
 * Write the code to find the position of the smallest element in an array of integers.
 */

public class act1 {
    public static void main(String[] args) {
        int[] intArr1 = {34, 12, 4, 567, 7, 43, 2, 4, 4}; 
        int small = 234; 

        for (int i = 0; i < intArr1.length; i++) {
            if (intArr1[i] < small) {
                small = intArr1[i]; 
            }
        }

        System.out.println(small); 
    }
}
