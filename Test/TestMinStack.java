import org.junit.Test;

public class TestMinStack {
    @Test
    public void testPush()
    {
        MinStack minStack = new MinStack();
        minStack.push(2);
        minStack.push(-3);
        minStack.push(0);
        minStack.push(40);
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
    }
}
