public class DogDriver {
    public static void main(String[] args) {
        Dog myDog = new Dog(false, 15); 
        Dog yourDog = new Dog(true, 2);


        System.out.println(myDog.toString());
        System.out.println(yourDog.toString());

        System.out.println(myDog.equals(yourDog)); 
    }
}