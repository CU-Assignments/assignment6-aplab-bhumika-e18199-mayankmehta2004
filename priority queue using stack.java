import java.util.Stack;

class PriorityQueueUsingStack {
    Stack<Integer> mainStack = new Stack<>();
    Stack<Integer> tempStack = new Stack<>();

    public void push(int val) {
        while (!mainStack.isEmpty() && mainStack.peek() > val) {
            tempStack.push(mainStack.pop());
        }
        mainStack.push(val);
        while (!tempStack.isEmpty()) {
            mainStack.push(tempStack.pop());
        }
    }

    public int pop() {
        if (mainStack.isEmpty()) throw new RuntimeException("Priority Queue is empty!");
        return mainStack.pop();
    }

    public int peek() {
        if (mainStack.isEmpty()) throw new RuntimeException("Priority Queue is empty!");
        return mainStack.peek();
    }

    public boolean isEmpty() {
        return mainStack.isEmpty();
    }

    public static void main(String[] args) {
        PriorityQueueUsingStack pq = new PriorityQueueUsingStack();
        pq.push(5);
        pq.push(1);
        pq.push(3);
        pq.push(2);
        System.out.println(pq.pop()); 
        System.out.println(pq.pop()); 
        System.out.println(pq.pop()); 
        System.out.println(pq.pop()); 
    }
}
