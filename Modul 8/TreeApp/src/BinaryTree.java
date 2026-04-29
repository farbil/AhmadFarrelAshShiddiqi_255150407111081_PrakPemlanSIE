public class BinaryTree {

    Node root;

    public void add(int data) {
        if (root == null) {
            root = new Node(data);
            return;
        }
        root.add(data);
    }

    public void preTraverse(Node node) {
        if (node == null) return;
        System.out.printf("[%d]", node.data);
        preTraverse(node.left);
        preTraverse(node.right);
    }

    public void inTraverse(Node node) {
        if (node == null) return;
        inTraverse(node.left);
        System.out.printf("[%d]", node.data);
        inTraverse(node.right);
    }

    public void postTraverse(Node node) {
        if (node == null) return;
        postTraverse(node.left);
        postTraverse(node.right);
        System.out.printf("[%d]", node.data);
    }

    public int countNodes(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + countNodes(node.left) + countNodes(node.right);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        for (int i = 0; i < 10; i++) {
            int nilai = (int) (Math.random() * 100);
            System.out.printf("Nilai %d dimasukkan.\n", nilai);
            tree.add(nilai);
        }
        System.out.println();
        System.out.print("PreOrder  : ");
        tree.preTraverse(tree.root);
        System.out.print("\nInOrder   : ");
        tree.inTraverse(tree.root);
        System.out.print("\nPostOrder : ");
        tree.postTraverse(tree.root);
        System.out.println();
        System.out.println("Total Node: " + tree.countNodes(tree.root));
    }

}