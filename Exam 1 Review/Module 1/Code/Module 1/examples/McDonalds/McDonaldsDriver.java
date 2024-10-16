public class McDonaldsDriver {
    public static void main(String[] args) {
        // Notice no privacy modifiers becuase we are inside a method. 
        McDonalds store1 = new McDonalds();
        McDonalds store2 = new McDonalds(); 
        McDonalds store3 = new McDonalds(); 
        McDonalds store4 = new McDonalds();  

        System.out.print(store1.equals(store4));
    }
}
