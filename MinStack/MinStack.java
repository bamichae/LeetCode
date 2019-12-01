import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

class MinStack {

    private PriorityQueue<Integer> minQueue = new PriorityQueue<>();
    private List<Integer> stack = new LinkedList<>();

    public MinStack() {

    }

    public void push(int x) {
        stack.add(x);
        minQueue.add(x);
    }

    public void pop() {
        Integer element = null;
        if (!stack.isEmpty()) {
           element = stack.remove(stack.size() - 1);
        }
        if (!minQueue.isEmpty()) {
            minQueue.remove(element);
        }
    }

    public Integer top() {
        if (!stack.isEmpty()) {
            return stack.get(stack.size() - 1);
        }
        return null;
    }

    public Integer getMin() {
        if (!minQueue.isEmpty()) {
            return minQueue.peek();
        }
        return null;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */