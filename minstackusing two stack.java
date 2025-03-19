import java.util.Stack;

class MinStack {
    Stack<Integer> mainStack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public void push(int val) {
        mainStack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) minStack.push(val);
    }

    public void pop() {
        if (mainStack.pop().equals(minStack.peek())) minStack.pop();
    }

    public int top() {
        return mainStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(5);
        minStack.push(2);
        minStack.push(3);
        System.out.println(minStack.getMin()); 
        minStack.pop();
        System.out.println(minStack.getMin()); 
        minStack.pop();
        System.out.println(minStack.getMin()); 
    }
}
