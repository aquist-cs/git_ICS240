public class notes2a {
    public static void main(String[] args) {
        // Creating Array
        int[] myArr = new int[5]; 

        for (int i = 0; i < myArr.length; i++) {
            if (i == 0) {
                myArr[i] = 1;
            } 
            else {
                myArr[i] = myArr[i - 1] + 1; 
            }
        }

        // Inserting a value into array
        for (int i = 0; i < myArr.length; i++) {
            if (i == 2) {
                myArr[i + 1] = myArr[i]; 
            }
        }

        for (int i = 0; i < myArr.length; i++) {
            System.out.print(myArr[i] + " "); 
        }
    }
}
