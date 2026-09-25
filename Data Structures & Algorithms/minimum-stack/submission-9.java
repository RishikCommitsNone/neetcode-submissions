class MinStack {
    Stack<Long> stack;
    long curr_min = Long.MAX_VALUE;
    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        if(stack.isEmpty()){
            curr_min = val;
            stack.push((long)val);
        }
        else{
            if(val >= curr_min){
                stack.push((long)val);
            }
            else{
                long new_val = 2L*val - curr_min;
                stack.push(new_val);
                curr_min = val;
            }
        }
    }
    
    public void pop() {
        //isEmpty()
        long x = stack.peek();

        if(x < curr_min){
            curr_min = 2L*curr_min - x;
        }
        stack.pop();
    }
    
    public int top() {
        long x = stack.peek();
        if(x < curr_min){
            return (int)curr_min;
        }
        return (int)x;
    }
    
    public int getMin() {
        return (int)curr_min;
    }
}
