package lesson_10;

public class RecursiveLinkedList<T> {

    private Node<T> head;

    public void add(T element) {
        if (head == null) {
            head = new Node<>(element);
            return;
        }
        addHelper(head, element);
    }

    public int size() {
        return sizeHelper(head);
    }

    private int sizeHelper(Node<T> node) {
        if (node == null) {
            return 0;
        }
        return 1 + sizeHelper(node.next);
    }

    private void addHelper(Node<T> node, T element) {
        if (node.next == null) {
            node.next = new Node<>(element);
            return;
        }
        addHelper(node.next, element);
    }

    public void printAll() {
        printAll(head);
    }

    private void printAll(Node<T> node) {
        if (node != null) {
            System.out.println(node.value);
            printAll(node.next);
        }
    }

    // Additional HW: implement inserting at index
    // Removing an element at index
    // Contains (T elem)
    // IndexOf (T elem)

    private static class Node<T> {
        T value;
        Node<T> next;

        public Node(T element) {
            value = element;
        }
    }
}
