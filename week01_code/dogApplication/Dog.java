package dogApplication; 

/**
 * Class for dog objects
 * @param isBulldog is this a bulldog or any other type? 
 * @param age how old is the dog in years? 
 * @param id ID of the dog in the system. 
 * @param counter static count of the number of dogs in the system
 */
public class Dog {
	boolean isBulldog; 
	int age; 
	int id = 0; 
	static int counter = 0;
	
	/**
	 * Construct a new dog object
	 * @param bulldog
	 * @param a
	 */
	
	public Dog(boolean isBullDog, int age) {
		this.isBulldog = isBullDog;
		this.age = age; 
		this.id = counter++; 
	}
	
	
	// Mutators/Setters
	
	/**
	 * getID()
	 * @return the ID of the dog in the system
	 */
	public int getID() { return id; }
	
	/**
	 * getIsBulldog()
	 * @return true if bulldog, else false
	 */
	public Boolean getIsBulldog() { return isBulldog; }
	
	/**
	 * getAge()
	 * @return the age of the dog in years
	 */
	public int getAge() { return age; }
	
	/**
	 * setID() - This would only be used to change a dog's ID if needed
	 * @param id change the ID of the dog in the system
	 */
	public void setID(int id) { this.id = id; }
	
	/**
	 * setIsBulldog()
	 * @param isBulldog whether or not this is a bulldog
	 */
	public void setIsBulldog(boolean isBulldog) { this.isBulldog = isBulldog; }
	
	/**
	 * setIsAge()
	 * @param age the age of the dog is years
	 */
	public void isAge(int age) { this.age = age; }
	
	public String toString() {
		String output= new String(); // Could use StringBuilder
		output += "This dog is " + age + " years old ";
		if(isBulldog) {
			output += " and is a bulldog."; 
		}
		else {
			output += "and is not a bulldog.";
		}
		return output; 
	}
	 
	/** Two digs are equal if they have the same id
	 * @param other the other dog
	 * @return true if same ID, else false
	 */
	@Override
	public boolean equals(Object other) {
		boolean result = false; 
		if(other instanceof Dog) {
			Dog d = (Dog)other; 
			if(this.id == d.id) {
				result = true; 
			}
			else {
				result = false; 
			}
		}
		return result;
	}

}	