class MyStack {
    private int top;
    private int[] stack;

    public MyStack() {
        top = -1;
        stack = new int[100];
    }

    public void push(int x) {
        if (top < stack.length - 1) {  // Ensure stack does not overflow
            top++;
            stack[top] = x;
        }
    }

    public int pop() {
        if (top >= 0) {  // Ensure stack is not empty before popping
            int poppedValue = stack[top];
            top--;
            return poppedValue;
        }
        return -1;  // Return -1 to indicate an empty stack (alternative: throw an exception)
    }

    public int top() {
        if (top >= 0) {
            return stack[top];
        }
        return -1;  // Return -1 if the stack is empty
    }

    public boolean empty() {
        return top == -1;
    }
}
