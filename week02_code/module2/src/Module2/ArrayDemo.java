package Module2; 

import java.util.Scanner; 

public class ArrayDemo {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		double[] myList = new double[10];
		
		System.out.print("Enter " + myList.length + " values: "); 
		
		for(int i = 0; i < myList.length; i++) {
			myList[i] = input.nextDouble();
		}
		input.close();
		
		for(int i = 0; i < myList.length; i++) {
			System.out.println(myList[i]); 
		}
	}
}