package datastructures;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void shouldPushToStack() throws Exception {
        Stack stack = new Stack();
        stack.push(1);
    }

    @Test
    public void shouldPopLatestPushedData() throws Exception {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(5);

        assertEquals((Integer) 5, stack.pop());
        assertEquals((Integer) 20, stack.pop());
        assertEquals((Integer) 10, stack.pop());
        assertNull(stack.pop());
        assertNull(stack.pop());

        stack.push(200);
        stack.push(300);

        assertEquals((Integer) 300, stack.pop());
        assertEquals((Integer) 200, stack.pop());

    }
}