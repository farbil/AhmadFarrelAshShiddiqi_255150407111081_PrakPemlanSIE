public class CustomStack {
    Node top;
    int size = 0;

    public void push(int x) {
        Node n = new Node(x);
        n.next = top;
        top = n;
        size++;
    }

    public int pop() {
        if (top == null)
            throw new RuntimeException
                    ("Stack is empty.");
        int val = top.data;
        top = top.next;
        size--;
        return val;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty.");
        }
        return top.data;
    }

    public static void main(String[] args) {
        CustomStack stack = new CustomStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        CustomStack stackSementara = new CustomStack();
        while (!stack.isEmpty()) {
            stackSementara.push(stack.pop());
        }

        stack.push(stackSementara.pop());
        stack.push(5);
        stack.push(stackSementara.pop());
        stack.push(stackSementara.pop());
        stack.push(stackSementara.pop());

        CustomStack cetakStack = new CustomStack();
        while (!stack.isEmpty()) {
            cetakStack.push(stack.pop());
        }

        System.out.print("Custom Stack Target: ");
        while (!cetakStack.isEmpty()) {
            System.out.print("[" + cetakStack.pop() + "]");
        }
        System.out.println("End.");
    }
}
