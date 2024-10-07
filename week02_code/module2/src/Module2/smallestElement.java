package Module2; 

public class smallestElement {
	public static void main(String[] args) {
		int[] num = {20, 12, 1, 14, 25};
		int min = num[0];
		
		for(int i = 0; i < num.length; i++) {
			if(num[i] < min) {
				min = num[i];
			}
		}
		System.out.print(min);
	}
}