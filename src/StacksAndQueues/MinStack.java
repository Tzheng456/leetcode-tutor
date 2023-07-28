package StacksAndQueues;

import StacksAndQueues.Stack;

public class MinStack {
    Stack stack = new Stack(10);
    Stack minStack = new Stack(10);
    public void push(int x) {
        stack.push(x);
        if (minStack.isEmpty() || x <= minStack.top) {
            minStack.push(x);
        }
    }
    public void pop() {
        stack.pop();
        if (stack.peek() == minStack.peek()) {
            minStack.pop();
        }
    }

    public int top() {
        return stack.pop();
    }

    public int getMin() {
        return minStack.pop();
    }
}
