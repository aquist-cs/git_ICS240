package worksheet_week6; 

public class Exercise2 {
    public static void print_traverse(IntNode head) {
        for (IntNode cursor = head; cursor != null; cursor = cursor.getLink()) {
            System.out.print(cursor.getData() + " -> "); 
        }
    }

    public static void print_h(IntNode node) {
        System.out.println("h = " + node.getData());
    }

    public static void print_n(IntNode node) {
        System.out.println("n = " + node.getData());
    }

    public static void print_m(IntNode node) {
        System.out.println("m = " + node.getData());
    }
    
    public static void main(String[] args) {

        /**
         * Number 21
         */
        System.out.println("Number 21:");
        IntNode h = new IntNode(10,null);
        print_traverse(h);
        System.out.println(); 
        print_h(h); 
        System.out.println(); 

        /**
         * Number 22
         */
        System.out.println("Number 22:");
        h.addNodeAfter(30);
        print_traverse(h);
        System.out.println(); 
        print_h(h);
        System.out.println();

        /**
         * Number 23
         */
        System.out.println("Number 23:");
        h = new IntNode(20, h); 
        print_traverse(h);
        System.out.println(); 
        print_h(h);
        System.out.println();

        /**
         * Number 24
         */
        System.out.println("Number 24:");
        h.addNodeAfter(40);
        print_traverse(h);
        System.out.println(); 
        print_h(h);
        System.out.println();

        /**
         * Number 25
         */
        System.out.println("Number 25:");
        IntNode n = IntNode.listSearch(h, 10); 
        print_traverse(h);
        System.out.println(); 
        print_h(h);
        print_n(n);
        System.out.println();

        /**
         * Number 26
         */
        System.out.println("Number 26:");
        n.addNodeAfter(50);
        print_traverse(h);
        System.out.println(); 
        print_h(h);
        print_n(n);
        System.out.println();

        /*
         * Number 27
         */
        System.out.println("Number 27:");
        h.addNodeAfter(60);
        print_traverse(h);
        System.out.println(); 
        print_h(h);
        print_n(n);
        System.out.println();

        /**
         * Number 28 - this one sets m to the same node as h, effectively h & m refer to the same node. 
         */
        System.out.println("Number 28:");
        IntNode m = IntNode.listPosition(h, 4); 
        print_traverse(h);
        System.out.println(); 
        print_h(h);
        print_n(n);
        print_m(m);
        System.out.println();

        /**
         * Number 29
         */
        System.out.println("Number 29:");
        m.addNodeAfter(70);
        print_traverse(h);
        System.out.println();
        print_h(h);
        print_n(n);
        print_m(m);
        System.out.println();

        /**
         * Number 30
         */
        System.out.println("Number 30:");
        m = h.getLink(); 
        print_traverse(h);
        System.out.println();
        print_h(h);
        print_n(n);
        print_m(m);
        System.out.println();

        /**
         * Number 31
         */
        System.out.println("Number 31:");
        m.removeNodeAfter();
        print_traverse(h);
        System.out.println();
        print_h(h);
        print_n(n);
        print_m(m);
        System.out.println();
    }
}
