public class UndoRedo {

    Stack<String> undoStack = new Stack<>();
    Stack<String> redoStack = new Stack<>();

    public void action(String command) {
        System.out.println("Action: " + command);
        undoStack.push(command);
        redoStack.clear();
        UndoRedo.print(undoStack);
    }

    public void undo() {
        if (undoStack.isEmpty())
            System.out.println("Nothing to undo.");
        else {}
        UndoRedo.print(undoStack);
    }

    public void redo() {
        if (redoStack.isEmpty())
            System.out.println("Nothing to redo.");
        else {}
        UndoRedo.print(undoStack);
    }

    public static void print(Stack<String> stack) {
        System.out.print("Stack Undo: ");
        for(String s: stack)
            System.out.print(s + " ");
        System.out.println();
    }
}