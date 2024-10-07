package dogApplication; 

/**
 * Class for Dog objects
 * @param isBulldog is this a bulldog or another type? 
 * @param age how old is the dog in years? 
 * @paarm id ID of the dog in the system.
 * @param counter static count of the number of dogs in the system.  
 */

public class Dog {
	private boolean isBulldog; 
	private int age; 
	private int id; 
	private static int counter = 0; 
	
	/**
	 * Construct a new Dog object.
	 * @param isBulldog
	 * @param age
	 */
	public Dog(Boolean isBulldog, int age) {
		this.isBulldog = isBulldog;
		this.age = age; 
		this.id = ++counter; 
	}
	
	/**
	 * getIsBulldog()
	 * @return true if bulldog, else false.
	 */
	public boolean getIsBulldog() {return isBulldog;}
	
	/**
	 * getAge()
	 * @return the age of the dog in years.
	 */
	public int getAge() {return age;}
	
	/**
	 * getID()
	 * @return the ID of the dog in the system. 
	 */
	public int getID() {return id;}
	
	/**
	 * setIsBulldog()
	 * @param setIsBullDog whether or not this a bulldog 
	 */
	public void setIsBulldog(boolean isBulldog) {this.isBulldog = isBulldog;}
}

