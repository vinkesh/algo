package datastructures;

class LinkNode {
    private final int value;
    private LinkNode next;

    public LinkNode(int value) {
        this.value = value;
        this.next = null;
    }

    public void setNext(LinkNode next) {
        this.next = next;
    }

    public int getValue() {
        return this.value;
    }

    public LinkNode getNext() {
        return this.next;
    }
}
