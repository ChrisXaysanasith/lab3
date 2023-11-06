import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.*;

public class LinkedListTest {

    @Test
    public void testPrepend() {
        LinkedList list = new LinkedList();
        list.prepend(1);
        assertEquals("1 ", list.toString());
        list.prepend(2);
        assertEquals("2 1 ", list.toString());
        list.prepend(3);
        assertEquals("3 2 1 ", list.toString());
    }

    @Test
    public void testAppend() {
        LinkedList list = new LinkedList();
        list.append(1);
        assertEquals("1 ", list.toString());
        list.append(2);
        assertEquals("1 2 ", list.toString());
        list.append(3);
        assertEquals("1 2 3 ", list.toString());
    }

    @Test
    public void testFirst() {
        LinkedList list = new LinkedList();
        list.append(1);
        assertEquals(1, list.first());
        list.prepend(2);
        assertEquals(2, list.first());
    }
    
    @Test
    public void testLast() {
        LinkedList list = new LinkedList();
        list.append(1);
        assertEquals(1, list.last());
        list.append(2);
        assertEquals(2, list.last());
        list.prepend(3);
        assertEquals(2, list.last()); // Last should remain the same after prepend
    }

    @Test
    public void testLength() {
        LinkedList list = new LinkedList();
        assertEquals(0, list.length());
        list.append(1);
        assertEquals(1, list.length());
        list.prepend(2);
        assertEquals(2, list.length());
        list.append(3);
        assertEquals(3, list.length());
    }
}