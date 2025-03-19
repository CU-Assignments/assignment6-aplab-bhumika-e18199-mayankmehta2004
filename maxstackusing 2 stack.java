import java.util.Stack;

class MaxStack {
    Stack<Integer> mainStack = new Stack<>();
    Stack<Integer> maxStack = new Stack<>();

    public void push(int val) {
        mainStack.push(val);
        if (maxStack.isEmpty() || val >= maxStack.peek()) maxStack.push(val);
    }

    public void pop() {
        if (mainStack.pop().equals(maxStack.peek())) maxStack.pop();
    }

    public int top() {
        return mainStack.peek();
    }

    public int getMax() {
        return maxStack.peek();
    }

    public static void main(String[] args) {
        MaxStack maxStack = new MaxStack();
        maxStack.push(5);
        maxStack.push(10);
        maxStack.push(3);
        System.out.println(maxStack.getMax()); 
        maxStack.pop();
        System.out.println(maxStack.getMax()); 
        maxStack.pop();
        System.out.println(maxStack.getMax()); 
    }
}
