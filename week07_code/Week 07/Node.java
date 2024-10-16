public class Node<E> {
    private E data; 
    Node<E> link; 
    Node<E> prev; 
    Node<E> next; 

    public E getData() {return data;}
    public Node<E> getLink() {return link;}
    public Node<E> getPrev() {return prev;}
    public Node<E> getNext() {return next;}

    public void setData(E data) {this.data = data;}
    public void setLink(Node<E> link) {this.link = link;}
    public void setPrev(Node<E> prev) {this.prev = prev;}
    public void setNext(Node<E> next) {this.prev = next;}

    /**
     * Removes the first element found that equals target
     * @param target element to look for
     * @param head linked list
     * @return returns the node if found and removed or null if not found
     */
    public E removeFirst(E target, Node<E> head) {
        if (head == null) {
            return null; 
        }

        if (head.getData().equals(target)) {
            E rData = head.getData();
            head = head.getLink();
            return rdata; 
        }

        Node<E> cursor = head; 
        Node<E> prev_cursor = null; 

        while (cursor != null) {
            if (cursor.getData().equals(target)) {
                if (prev_cursor != null) {
                    prev_cursor.setLink(cursor.getLink());
                }
                return cursor.getData(); 
            }
            prev_cursor = cursor; 
            cursor = cursor.getLink();
        }

        return null; 
    }

    /**
     * Removes last instance of element target from the list 
     * @param target target we are looking for 
     * @param head head of linked list
     * @param tail tail of linked list
     * @return returns the data if found and replaced, else return null.
     */
    public E removeLast(E target, Node<E> head, Node<E> tail) {
        if (tail == null) {
            return null;
        }
        
        Node<E> cursor = tail; 

        while (cursor != null) {
            if (cursor.getData().equals(target)) {
                if (cursor.getPrev() != null) {
                    cursor.getPrev().setNext(cursor.getNext()); 
                }
                else {
                    head = cursor.getNext();
                }
                if (cursor.getNext() != null) {
                    cursor.getNext().setPrev(cursor.getPrev());
                }
                else {
                    tail = cursor.getPrev(); 
                }
                return rdata; 
            }
            cursor = cursor.getPrev(); 
        }
        return null; 
    }

    public static void main(String[] args) {
        Node<Integer> head = new Node<Integer>();
        head.setData(20);
        System.out.print(head.removeFirst(0, head)); 
    }
}
