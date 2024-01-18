/**
 * Mystack
 */
public class Mystack<T> {

    public int length;
    private Node<T> head;

    public Mystack() {

        this.head = null;
        this.length = 0;
    }

    /**
     * Pushes an element onto the top of the stack.
     * 
     * @param data the element to be pushed onto the stack
     */
    void push(T data) {
        if (this.length == 0) {
            this.head = new Node<T>(data, null);
        } else {
            Node<T> newNode = new Node<T>(data,this.head);
            this.head = newNode;
        }
        this.length++;
    }

    public void pop(){
        if (this.length == 0) {
            throw new RuntimeException("Stack is empty");
        }
        this.head = this.head.prev;
        this.length--;
    }

    /**
     * Returns the top element of the stack without removing it.
     * 
     * @return the top element of the stack
     */
    public T peek() {
        return this.head.data;
    }

    public class Node<T> {
        private T data;
        private Node<T> prev;

        public Node(T data, Node<T> prev) {
            this.data = data;
            this.prev = prev;
        }

    }
}