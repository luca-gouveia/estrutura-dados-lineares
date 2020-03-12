package lse;

/**
 *
 * @author luca
 */
public class SLinkedList {
    private Node head;
    private Node tail;
    private long size;
    
    public SLinkedList () {
        head = null;
        tail = null;
        size =  0;
    }
    
    public void addFirst (Object element) {
        Node node = new Node(element, head);
        head = node;
        size++;
    }
    
    public void addLast (Object element) {
        Node node = new Node(element, null);
            
    }
}
