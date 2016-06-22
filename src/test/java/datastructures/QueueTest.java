package datastructures;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class QueueTest {

    @Test
    public void shouldConsumeEarliestValueAdded() throws Exception {
        Queue queue = new Queue();

        queue.enqueue(10);
        queue.enqueue(3);
        queue.enqueue(5);

        assertEquals((Integer) 10, queue.dequeue());
        assertEquals((Integer) 3, queue.dequeue());
        assertEquals((Integer) 5, queue.dequeue());
        assertNull(queue.dequeue());
        assertNull(queue.dequeue());

        queue.enqueue(100);
        queue.enqueue(30);

        assertEquals((Integer) 100, queue.dequeue());
        assertEquals((Integer) 30, queue.dequeue());
    }

}





