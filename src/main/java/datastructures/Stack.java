package datastructures;

public class Stack {

    private LinkNode top = null;

    public void push(int i) {
        LinkNode linkNode = new LinkNode(i);
        linkNode.setNext(top);
        top = linkNode;
    }

    public Integer pop() {
        if(top != null) {
            int value = top.getValue();
            top = top.getNext();
            return value;
        }
        return null;
    }
}
