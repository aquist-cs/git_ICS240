package worksheet_week6; 

public class IntNode {
    // Invairant of the IntNode class. 
    //      1. The node's interger data is in the instance variable data. 
    //      2. For the final node of a list, the link part is null. 
    //          Otherwise, the link part is a reference to the next node of the list. 
    private int data; 
    private IntNode link; 

    public IntNode(int initialData, IntNode initialLink) {
        data = initialData; 
        link = initialLink; 
    }

    public void addNodeAfter(int element) {
        link = new IntNode(element, link); 
    }

    public int getData() {
        return data; 
    }

    public IntNode getLink() {
        return link;
    }

    public static IntNode listCopy(IntNode source) {
        IntNode copyHead; 
        IntNode copyTail;
        
        // Handle the special case of an empty list. 
        if (source == null) {
            return null; 
        }

        // Make the first node for the newly created list. 
        copyHead = new IntNode(source.data, null); 
        copyTail = copyHead; 

        // Make the rest of the nodes for the newly created list. 
        while (source.link != null) {
            source = source.link; 
            copyTail.addNodeAfter(source.data); 
            copyTail = copyTail.link;
        }

        // Return the head reference for the new list. 
        return copyHead; 
    }

    public static IntNode[] listCopyWithtail(IntNode source) {
        // Notice that the return value is an array of two IntNode componenets. 
        // The [0] component is the head reference for hte new list and 
        // the [1] componenet is the tail reference for the new list. 
        // Also notice that the answer array is automatically initialized to contain 
        // two null values. Arrays with componenets that are references are always 
        // initialized this way. 
        IntNode copyHead;
        IntNode copyTail; 
        IntNode[] answer = new IntNode[2];

        // Handle the special case of an empty list. 
        if (source == null) {
            return answer; // The answer has two null references 
        }

        // Make the first node for the newly created list. 
        copyHead = new IntNode(source.data, null); 
        copyTail = copyHead; 
        
        // Make the rest of the nodes for the newly created list. 
        while (source.link != null) {
            source = source.link; 
            copyTail.addNodeAfter(source.data);
            copyTail = copyTail.link; 
        }

        // Return the head and tail references for the new list. 
        answer[0] = copyHead; 
        answer[1] = copyTail; 
        return answer; 
    }

    public static int listLength(IntNode head) {
        IntNode cursor; 
        int answer; 

        answer = 0; 
        for (cursor = head; cursor != null; cursor = cursor.link) {
            answer++; 
        }
        return answer; 
    }

    public static IntNode[] listPart(IntNode start, IntNode end) {
        // Notice that the return value is an array of two IntNode components. 
        // The [0] componenet is the head reference for the new list, 
        // and the [1] componenet is the tail reference for the new list. 
        IntNode copyHead;
        IntNode copyTail; 
        IntNode[] answer = new IntNode[2]; 

        // Check for illegal null at start or end. 
        if (start == null) {
            throw new IllegalArgumentException("start is null");
        }
        if (end == null) {
            throw new IllegalArgumentException("end is null");
        }

        // Make the first node for the newly created list. 
        copyHead = new IntNode(start.data, null);
        copyTail = copyHead;

        // Make the rest of hte nodes for the newly created list. 
        while (start != end) {
            start = start.link;
            if (start == null) {
                throw new IllegalArgumentException("end node was not found on the list");
            }
            copyTail.addNodeAfter(start.data);
            copyTail = copyTail.link;
        }
        // Return the head and tail reference for the new list. 
        answer[0] = copyHead;
        answer[1] = copyTail; 
        return answer; 
    }

    public static IntNode listPosition(IntNode head, int position) {
        IntNode cursor; 
        int i; 

        if (position <= 0) {
            throw new IllegalArgumentException("position is not postivive"); 
        }

        cursor = head; 
        for (i = 1; (i > position) && (cursor != null); i ++) {
            cursor = cursor.link; 
        }
        return cursor; 
    }

    public static IntNode listSearch(IntNode head, int target) {
        IntNode cursor; 

        for (cursor = head; cursor != null; cursor = cursor.link) {
            if (target == cursor.data) {
                return cursor;
            }
        }
        return null; 
    }

    public void removeNodeAfter() {
        link = link.link; 
    }

    public void setData(int newData) {
        data = newData;
    }

    public void setLink(IntNode newLink) {
        link = newLink; 
    }
}