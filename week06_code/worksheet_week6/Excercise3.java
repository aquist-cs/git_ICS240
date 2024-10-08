package worksheet_week6;

public class Excercise3 {
    public static int listRange(IntNode head) {
        int max = head.getData(); 
        int min = head.getData(); 
        int range; ;
        
        if (head.getLink() == null) {
            return -1; 
        }

        else {
            for (IntNode cursor = head; cursor != null; cursor = cursor.getLink()) {
                if (cursor != null) {
                    if (cursor.getData() > max) {
                        max = cursor.getData(); 
                    }
                    else if (cursor.getData() < min) {
                        min = cursor.getData(); 
                    }
                }
            }
            range = max - min; 
            return range; 
        }
    }

    public static void main(String[] args) {
        IntNode head_null = new IntNode(0, null); 
        IntNode head = new IntNode(20, null); 
        head.addNodeAfter(30); 
        head.addNodeAfter(70);
        head.addNodeAfter(50);
        head.addNodeAfter(10);
        head.addNodeAfter(60);

        for (IntNode cursor = head; cursor != null; cursor = cursor.getLink()) {
            System.out.print(cursor.getData() + " -> "); 
        } 

        System.out.println("\n\nTesting non-null Linked List"); 
        System.out.println(listRange(head) + "\n");   
        System.out.println("Testing null Linked List"); 
        System.out.println(listRange(head_null)); 
    }
}
