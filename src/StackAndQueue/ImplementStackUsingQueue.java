package StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueue {
    Queue<Integer> queue1;
    Queue<Integer> queue2;
    public ImplementStackUsingQueue() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }
    public void push(int x) {
        while (!queue1.isEmpty()) {
            queue2.add(queue1.poll());
        }
        queue1.add(x);
        while (!queue2.isEmpty()) {
            queue1.add(queue2.poll());
        }
    }
    public int pop() {
        if (queue1.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return queue1.poll();
    }
    public int peek() {
        if (queue1.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return queue1.peek();
    }
    public boolean empty() {
        return queue1.isEmpty();
    }

    public static void main(String[] args) {
        ImplementStackUsingQueue stack = new ImplementStackUsingQueue();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop());   // 30
        System.out.println(stack.peek());  // 20
        System.out.println(stack.empty()); // false
    }
}
