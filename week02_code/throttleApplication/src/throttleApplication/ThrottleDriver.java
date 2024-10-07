package throttleApplication;

public class ThrottleDriver {
	public static void main(String[] args) {
		
		Throttle t1 = new Throttle(1); 
		System.out.print(t1.getFlow());
	}
}
