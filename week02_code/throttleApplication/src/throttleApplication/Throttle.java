package throttleApplication;

public class Throttle {
	private int top; // the topmost position of the throttle.
	private int position; // the current position of the throttle. 
	
	public Throttle(int size) {
		if(size <= 0) {
			throw new IllegalArgumentException("Size <= 0 :" + size);
		}
		top = size;
		// No assignment needed for position - it gets the default value of zero. 
	}
	
	public double getFlow() {
		return (double) position / (double) top; 
  	}
	
	public boolean isOn() {
		return (getFlow() > 0); 
	}
	
	public void shift(int amount) {
		if(amount > top - position) {
			position = top; 
		} // adding amount makes position below zero. 
		else if(position + amount == 0) {
			position = 0; // adding amount make position below zero. 
		}
		else {
			position += amount; // adding amount puts position in the range [0 ... top].
		}
	}

	public void shutOff() {
		position = 0;
	}
}
