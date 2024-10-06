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
}