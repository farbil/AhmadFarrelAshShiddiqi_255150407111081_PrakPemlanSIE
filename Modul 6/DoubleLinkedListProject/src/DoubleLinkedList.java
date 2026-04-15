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

    // 8a. Mencari node dengan nilai tertentu
    Node findNode(Object data) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(data)) return current;
            current = current.next;
        }
        return null;
    }

    // 8b. Mencari node di posisi ke-n
    Node findNodeByIndex(int index) {
        if (index < 0 || index >= size) return null;
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    // 8c. Menghapus node di posisi ke-n
    void removeByIndex(int index) {
        if (index < 0 || index >= size || isEmpty()) return;
        if (index == 0) {
            head = head.next;
            if (head != null) head.prev = null;
            else tail = null;
        } else if (index == size - 1) {
            tail = tail.prev;
            tail.next = null;
        } else {
            Node target = findNodeByIndex(index);
            target.prev.next = target.next;
            target.next.prev = target.prev;
        }
        size--;
    }

    // 8d. Menghapus node dengan nilai data tertentu
    void removeByData(Object data) {
        Node target = findNode(data);
        if (target == null) return;

        if (target == head) {
            head = head.next;
            if (head != null) head.prev = null;
            else tail = null;
        } else if (target == tail) {
            tail = tail.prev;
            tail.next = null;
        } else {
            target.prev.next = target.next;
            target.next.prev = target.prev;
        }
        size--;
    }

    // 8e. Menambah node di posisi ke-n
    void insertAt(int index, Node data) {
        if (index < 0 || index > size) return;
        if (index == 0) addFirst(data);
        else if (index == size) addLast(data);
        else {
            Node current = findNodeByIndex(index);
            data.prev = current.prev;
            data.next = current;
            current.prev.next = data;
            current.prev = data;
            size++;
        }
    }

    // 8f. Menambah node setelah node dengan nilai tertentu
    void insertAfter(Object key, Node data) {
        Node current = findNode(key);
        if (current != null) {
            if (current == tail) {
                addLast(data);
            } else {
                data.next = current.next;
                data.prev = current;
                current.next.prev = data;
                current.next = data;
                size++;
            }
        }
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

        System.out.println("\n8f. Menambahkan 'C' setelah 'B'");
        list.insertAfter("B", new Node("C"));
        list.print();

        System.out.println("\n8e. Menambahkan 'X' di index 1");
        list.insertAt(1, new Node("X"));
        list.print();

        System.out.println("\n8c. Menghapus index 1");
        list.removeByIndex(1);
        list.print();

        System.out.println("\n8d. Menghapus data 'A'");
        list.removeByData("A");
        list.print();

        System.out.println("\n8a & 8b. Hasil");
        System.out.println("Cari 'C': " + (list.findNode("C") != null ? "Ditemukan" : "Tidak"));
        System.out.println("Cari index 0: " + (list.findNodeByIndex(0) != null ? list.findNodeByIndex(0).data : "Tidak"));

    }

}