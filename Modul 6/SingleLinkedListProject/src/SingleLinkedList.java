public class SingleLinkedList {

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
            tail = data;
        }
        size++;
    }

    // a. Mencari node dengan nilai tertentu
    Node findNode(Object data) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(data)) return current;
            current = current.next;
        }
        return null;
    }

    // b. Mencari node di posisi ke-n (index mulai dari 0)
    Node findNodeByIndex(int index) {
        if (index < 0 || index >= size) return null;
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    // c. Menghapus node di posisi (index) ke-n
    void removeByIndex(int index) {
        if (index < 0 || index >= size || isEmpty()) return;
        if (index == 0) {
            head = head.next;
            if (head == null) tail = null;
        } else {
            Node prev = head;
            for (int i = 0; i < index - 1; i++) {
                prev = prev.next;
            }
            prev.next = prev.next.next;
            if (prev.next == null) tail = prev;
        }
        size--;
    }

    // d. Menghapus node dengan nilai data tertentu
    void removeByData(Object data) {
        if (isEmpty()) return;
        if (head.data.equals(data)) {
            head = head.next;
            if (head == null) tail = null;
            size--;
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.data.equals(data)) {
                current.next = current.next.next;
                if (current.next == null) tail = current;
                size--;
                return;
            }
            current = current.next;
        }
    }

    static void cetakList(SingleLinkedList list) {
        Node current = list.head;
        while(current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        SingleLinkedList list = new SingleLinkedList();
        list.addLast(new Node("A"));
        list.addLast(new Node("B"));
        list.addLast(new Node("D"));
        cetakList(list);

        System.out.println("d. Menghapus node dengan data 'X'");
        list.removeByData("X");
        cetakList(list);

        System.out.println("c. Menghapus node di index 0");
        list.removeByIndex(0);
        cetakList(list);

        System.out.println("a. Mencari node 'C'");
        Node found = list.findNode("C");
        System.out.println("Hasil pencarian data: " + (found != null ? found.data : null));

        System.out.println("b. Mencari node di index 2");
        Node foundIndex = list.findNodeByIndex(2);
        System.out.println("Hasil pencarian index 2: " + (foundIndex != null ? foundIndex.data : null));

    }

}