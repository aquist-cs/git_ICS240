package dogApplication;

public class DogDriver {
	
	public static void main(String[] args) {
		Dog myDog = new Dog(false, 8);
		
		System.out.println(myDog.isBulldog);
		System.out.println(myDog.age);
		
		Dog yourDog = new Dog(true, 2); 
		
		System.out.println(yourDog.isBulldog);
		System.out.println(yourDog.age);
		
		System.out.print(myDog.toString()); 
	}
}
