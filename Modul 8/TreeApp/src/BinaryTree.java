public class BinaryTree {

    Node root;

    public void add(String data) {
        if (root == null) {
            root = new Node(data);
            return;
        }
        root.add(data);
    }

    public void preTraverse(Node node) {
        if (node == null) return;
        System.out.printf("[%s]", node.data);
        preTraverse(node.left);
        preTraverse(node.right);
    }

    public void inTraverse(Node node) {
        if (node == null) return;
        inTraverse(node.left);
        System.out.printf("[%s]", node.data);
        inTraverse(node.right);
    }

    public void postTraverse(Node node) {
        if (node == null) return;
        postTraverse(node.left);
        postTraverse(node.right);
        System.out.printf("[%s]", node.data);
    }

    public int countNodes(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + countNodes(node.left) + countNodes(node.right);
    }

    public int countLeaves(Node node) {
        if (node == null) return 0;

        if (node.left == null && node.right == null) {
            return 1;
        }
        return countLeaves(node.left) + countLeaves(node.right);
    }

    public int hitungTinggiTree(Node node) {
        if (node == null) return 0;

        int leftHeight = hitungTinggiTree(node.left);
        int rightHeight = hitungTinggiTree(node.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        String[] dataHuruf = {"M", "E", "S", "A", "G", "Q", "Z", "C", "K", "O"};

        for (int i = 0; i < dataHuruf.length; i++) {
            System.out.printf("Nilai %s dimasukkan.\n", dataHuruf[i]);
            tree.add(dataHuruf[i]);
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
        System.out.println("Total Daun: " + tree.countLeaves(tree.root));
        System.out.println("Tinggi Tree: " + tree.hitungTinggiTree(tree.root));
    }

}