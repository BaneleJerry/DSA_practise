class MyQueue<T> {

    public int length;
    private Node<T> head;
    private Node<T> tail;

    public MyQueue() {

        this.head = this.tail = null;
        this.length = 0;

    }

    /**
 * Adds an element to the back of this queue.
 *
 * @param value the element to add
 */
public void push(T value) {
    if (this.length == 0) {
        this.head = this.tail = new Node<T>(value, null);
    } else {
        this.tail.prev = new Node<T>(value, null);
        this.tail = this.tail.prev;
    }
    this.length++;
}

    /**
 * Removes the element at the front of this queue.
 *
 * @throws java.lang.RuntimeException if this queue is empty
 */
public void pop() {
    if (this.length == 0) {
        throw new RuntimeException("Queue is empty");
    }
    this.head = this.head.prev;
    this.length--;
}

    /**
     * Returns the value of the first element in the queue without removing it.
     * 
     * @return the value of the first element in the queue
     */
    public T peek() {
        return this.head.value;
    }

    public void printQueue(){
        Node<T> temp = this.head;
        while (temp!= null) {
            System.out.println(temp.value);
            temp = temp.prev;
        }
    }

    public class Node<T> {
        private T value;
        private Node<T> prev;

        public Node(T value, Node<T> prev) {
            this.value = value;
            this.prev = prev;
        }
    }
}