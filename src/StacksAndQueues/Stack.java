package StacksAndQueues;

public class Stack {
    int[] arr;
    int top;
    int size;
    Stack(int n) {
        arr = new int[n];
        size = n;
        top = -1;
    }

    public void push(int x) {
        if (isFull()) {
            System.exit(-1);
        }
        arr[++top] = x;
    }

    public int pop() {
        if(isEmpty()) {
            System.exit(-1);
        }
        return arr[top--];
    }

    public int peek() {
        if (!isEmpty()) {
            return arr[top];
        }
        else {
            System.exit(-1);
        }
        return -1;
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }
}
