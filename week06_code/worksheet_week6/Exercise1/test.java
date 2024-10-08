public class test {
    public static void main(String[] args) {
        P p = new P(); 
        Q q = new Q(); 
        R r = new R(); 

        p.data = 1; 
        q.data = 2; 
        r.data = 3; 
        
        System.out.print("\na) Write code to make the “next” field of p point to q. Show the resulting linked list.\n"); 
        System.out.println("p.next = q;");
        p.next = q; 

        System.out.print("\nb) Write code to make the “next” field of p point to q and the “next” field of q point to r. Show the resulting linked list.\n"); 
        System.out.println("q.next = r; "); 
        q.next = r; 

        System.out.print(
            "\nc) Write code to make the” next” field of p point to q, the ” next” field of q point to r, and the ” next” field of r point to p. Show the resulting linked list.\n"
        ); 
        System.out.println("r.next = p;");
        r.next = p; 

        System.out.print("\nWhat is the output of each of the following statements?\n"); 
        System.out.println("System.out.println(p.data); " + "Answer: " + p.data); 
        System.out.println("System.out.println(p.next.data) " + "Answer: " + p.next.data);
        System.out.println("System.out.println(p.next.next.data); " + "Answer: " + p.next.next.data); 
        System.out.println("System.out.println(p.next.next.next.data); " + "Answer: " + p.next.next.next.data); 
        System.out.println("System.out.println(p.next.next.next.next.data); " + "Answer: " + p.next.next.next.next.data);
    }
}
