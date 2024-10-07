public class test {
    public static void main(String[] args) {
        isTaylorMade g1 = new isTaylorMade("Iron", 1, true); 
        isTaylorMade g2 = new isTaylorMade("Iron", 1, false); 

        System.out.print(g1.equals(g2)); 
    }
}
