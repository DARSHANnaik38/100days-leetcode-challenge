class MinStack {
    private Stack<Integer> minstack;
    private Stack<Integer> stack;

    public MinStack() {
        minstack=new Stack<>(); 
        stack=new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(minstack.isEmpty() || val <= minstack.peek()){
            minstack.push(val);
        }
    }
    
    public void pop() {
        int poppedval=stack.pop();
        if(poppedval == minstack.peek()){
            minstack.pop();
        }
        
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minstack.peek();
    }
}

