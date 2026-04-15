public class DoubleLinkedList {
    Node head, tail;
    int size = 0;

    void init() { head = null; }
    boolean isEmpty() { return size == 0; }
    int size() { return size; }

    void addFirst(Node data) {
        if (isEmpty()) {
            head = data;
            tail = data;
        } else {
            data.next = head;
            head.prev = data;
            head = data;
        }
        size++;
    }

    void addLast(Node data) {
        if (isEmpty()) {
            head = data;
            tail = data;
        } else {
            tail.next = data;
            data.prev = tail;
            tail = data;
        }
        size++;
    }

    // 7. Menampilkan urutan elemen dari belakang
    void printFromBack() {
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.prev;
        }
        System.out.println("null");
    }

    void print() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();

        Node nodeA = new Node("A");
        Node nodeB = new Node("B");
        Node nodeC = new Node("C");

        list.addLast(nodeA);
        System.out.println("head: " + list.head.data);
        System.out.println("tail: " + list.tail.data);

        list.addLast(nodeB);
        System.out.println("head: " + list.head.data);
        System.out.println("tail: " + list.tail.data);

        list.addLast(nodeC);
        System.out.println("head: " + list.head.data);
        System.out.println("tail: " + list.tail.data);

        list.print();

        System.out.println("Next of B: " + nodeB.next.data);
        System.out.println("Prev of B: " + nodeB.prev.data);

        System.out.println("\n7. Menampilkan urutan elemen dari belakang");
        list.printFromBack();
    }

}