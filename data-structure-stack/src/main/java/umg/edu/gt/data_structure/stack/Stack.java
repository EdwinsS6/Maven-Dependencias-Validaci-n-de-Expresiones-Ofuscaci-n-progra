package umg.edu.gt.data_structure.stack;

public class Stack {

    private Node top;
    private int count;

    public Stack() {
        this.top = null;
        this.count = 0;
    }

    public void push(char value) {
        Node node = new Node(value);
        node.next = top;
        top = node;
        count++;
    }

    public char pop() {
        if (isEmpty()) {
            return '\0';
        }
        char value = top.value;
        top = top.next;
        count--;
        return value;
    }

    public boolean isEmpty() {
        return top == null;
    }

    // Métodos solicitados en la tarea
    public int getCount() {
        return count;
    }

    public int getSize() {
        return count;
    }

    public int length() {
        return count;
    }

    public Node getNodeInit() {
        if (top == null) return null;
        Node current = top;
        while (current.next != null) {
            current = current.next;
        }
        return current;
    }
}