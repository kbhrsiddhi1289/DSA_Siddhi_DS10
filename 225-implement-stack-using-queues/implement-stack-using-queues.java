class MyStack {
    private Queue<Integer> queue = new LinkedList<>();

    public void push(int x) {
        queue.offer(x);
        int size = queue.size();
        // Rotate the queue to move the new element to the front
        while (size-- > 1) {
            queue.offer(queue.poll());
        }
    }

    public int pop() {
        return queue.poll(); // Remove from front
    }

    public int top() {
        return queue.peek(); // Peek at front
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */