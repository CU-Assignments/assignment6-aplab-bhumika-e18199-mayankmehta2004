import java.util.Stack;

class DequeUsingStacks {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void enqueueFront(int data) {
        stack1.push(data);
    }

    public void enqueueRear(int data) {
        while (!stack1.isEmpty()) stack2.push(stack1.pop());
        stack1.push(data);
        while (!stack2.isEmpty()) stack1.push(stack2.pop());
    }

    public int dequeueFront() {
        if (stack1.isEmpty()) throw new RuntimeException("Deque is empty!");
        return stack1.pop();
    }

    public int dequeueRear() {
        if (stack1.isEmpty()) throw new RuntimeException("Deque is empty!");
        while (stack1.size() > 1) stack2.push(stack1.pop());
        int removed = stack1.pop();
        while (!stack2.isEmpty()) stack1.push(stack2.pop());
        return removed;
    }

    public static void main(String[] args) {
        DequeUsingStacks deque = new DequeUsingStacks();
        deque.enqueueFront(10);
        deque.enqueueFront(20);
        deque.enqueueRear(5);
        System.out.println(deque.dequeueFront()); 
        System.out.println(deque.dequeueRear());  
        System.out.println(deque.dequeueFront()); 
    }
}
