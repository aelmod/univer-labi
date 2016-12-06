package laba5;

public class Stack<E> {
    private Node<E> head = null;

    public void push(E e) {
        Node<E> firstEl = new Node<>(e, head);
        head = firstEl;
    }

    public E pop() {
        if (head == null) {
            throw new IllegalStateException();
        }
        Node<E> lastEl = this.head;
        head = head.next;
        return lastEl.value;
    }

    public boolean isEmpty(){
        return head == null;
    }

    private class Node<T> {
        T value;
        Node<T> next;

        public Node(T value, Node<T> next) {
            this.value = value;
            this.next = next;
        }
    }
}