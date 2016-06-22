package datastructures;

public class Queue {
    private LinkNode rear = null;
    private LinkNode front = null;


    public void enqueue(int i) {
        LinkNode linkNode = new LinkNode(i);
        if(front == null && rear == null) {
            front = linkNode;
            rear = linkNode;
        } else {
            front.setNext(linkNode);
            front = linkNode;
        }
    }

    public Integer dequeue() {
        Integer value = null;
        if(rear == null) {
            front = null;
            rear = null;
        } else {
            value = rear.getValue();
            rear = rear.getNext();
        }

        return value;
    }
}
