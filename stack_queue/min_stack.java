package stack_queue;


import java.util.Stack;

public class min_stack {

    Stack<Integer> stack;
    Stack<Integer> minStack;

    public min_stack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);

        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {
        int removed = stack.pop();

        if (removed == minStack.peek()) {
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {

       min_stack obj = new min_stack();

        obj.push(-2);
        obj.push(0);
        obj.push(-3);

        System.out.println("Minimum: " + obj.getMin());

        obj.pop();

        System.out.println("Top: " + obj.top());
        System.out.println("Minimum: " + obj.getMin());
    }
}
