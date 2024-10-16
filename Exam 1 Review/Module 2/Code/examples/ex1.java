package examples;

/**
 * Filling an array: 
 *      - Create an empty array 
 *      - Create with values 
 *      - Put values in a loop 
 *      - Put values in one at a time (add an element) 
 */

public class ex1 {
    public static void main(String[] args) {
        String[] nullArr = new String[10]; 
        int[] zeroArr = new int[10];
        
        // Null Array
        System.out.println();
        System.out.println("Null Array");
        for (int i = 0; i < nullArr.length; i++) {
            nullArr[i] = null; 
            System.out.println(nullArr[i]); 
        }

        // Zero Array
        System.out.println();
        System.out.println("Zero Array");
        for (int i = 0; i < zeroArr.length; i++) {
            System.out.println(zeroArr[i]);
        }

        // Create with values/Put values in one at a time (add an element)
        System.out.println();
        System.out.println("Create with values");
        int[] valIntArr = new int[2]; 
        valIntArr[0] = 100;
        valIntArr[1] = 101; 

        for (int i = 0; i < valIntArr.length; i++) {
            System.out.println(valIntArr[i]); 
        }

        // Add values in with a Loop
        System.out.println();
        System.out.println("Add values in with a Loop");
        int[] intValArr = new int[100]; 

        for (int i = 0; i < intValArr.length; i++) {
            intValArr[i] = i; 
        }

        for (int i = 0; i < intValArr.length; i++) {
            System.out.println(intValArr[i]); 
        }
    }
}
