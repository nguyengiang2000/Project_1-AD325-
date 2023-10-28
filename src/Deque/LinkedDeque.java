package Deque.Deque;

import java.util.Iterator;

public class LinkedDeque <T> implements DequeInterface <T> {

    private DLNode<T> head;
    private DLNode<T> tail;


    public class DLNode <T>{

        T data;
        private DLNode<T> next;
        private DLNode<T> previous;

        /**
         * Create constructure of DLNode with 1 param - Data
         * @param data
         */
        public DLNode(T data){
            this.data = data;
            this.next = null;
            this.previous = null;
        }

    }

    /**
     * Adds a new entry to the front of back of this deque.
     *
     * @param newEntry An object to be added.
     */

    /**
     * Add new node to the front of Linked Deque
     * @param newEntry An object to be added.
     */
    @Override
    public void addToFront(T newEntry) {
        DLNode newNode = new DLNode(newEntry);
        if(isEmpty()){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = head;
            head.previous = newNode;
            head = newNode;

        }
    }

    /**
     * Add new node to the back of Linked Deque
     * @param newEntry An object to be added.
     */
    @Override
    public void addToBack(T newEntry) {
        DLNode newNode = new DLNode(newEntry);

        if(isEmpty()){
            head = newNode;
            tail = newNode;
        }else{
            newNode.previous = tail;
            tail.next = newNode;
            tail = newNode;

        }
    }

    /**
     * Removes and returns the front entry of this deque.
     *
     * @return The object at the front or back of the deque.
     * @throws EmptyQueueException if the deque is empty before the operation.
     */
    @Override
    public T removeFront() {
        if (isEmpty()) {
            throw new EmptyQueueException();
        }else {
            T data = head.data;
            head = head.next;
            if (head == null) {
                tail = null;
            } else {
                head.previous = null;

            }
            return data;
        }

    }

    /**
     * Removes and returns the back entry of this deque.
     *
     * @return The object at the front or back of the deque.
     * @throws EmptyQueueException if the deque is empty before the operation.
     */
    @Override
    public T removeBack() {
            if(isEmpty()){
                throw new EmptyQueueException();
            }

                T data = tail.data;
                tail = tail.previous;
                if(tail == null){
                    head = null;

                }
                else{
                    tail.next = null;

                }

        return data;
    }

    /**
     * Detects whether this deque is empty.
     *
     * @return True if deque is empty, or false otherwise.
     */
    @Override
    public boolean isEmpty() {

        return head == null;
    }

    /**
     * Returns the front entry's data.
     *
     * @return Entry data for front of back node.
     */
    @Override
    public T getFront() {
        T data = head.data;
        return data;
    }


    /**
     * Returns the back entry's data.
     *
     * @return Entry data for front of back node.
     */
    @Override
    public T getBack() {
        T data = tail.data;
        return data;
    }

    /**
     * clear
     * set head and tail node = null
     */
    @Override
    public void clear() {
        head = null;
        tail = null;
    }

    /**
     * Creates iterators to iterate through deque.
     *
     * @return Returns an iterator for use.
     */
    @Override
    public Iterator<T> iterator() {
        return new IteratorForLinkedList();
    }

    @Override
    public Iterator getIterator() {
        return iterator();
    }

    private class IteratorForLinkedList implements Iterator<T>{
        private DLNode<T> nextNode;

        private IteratorForLinkedList(){
            nextNode = head;
        }

        /**
         * Returns {@code true} if the iteration has more elements.
         * (In other words, returns {@code true} if {@link #next} would
         * return an element rather than throwing an exception.)
         *
         * @return {@code true} if the iteration has more elements
         */
        @Override
        public boolean hasNext() {
            return nextNode != null;
        }


        /**
         * Returns the next element in the iteration.
         *
         * @return the next element in the iteration
         * @throws EmptyQueueException() if the iteration has no more elements
         */
        @Override
        public T next() {
            if(nextNode == null){
                throw new EmptyQueueException();
            }

                T data = nextNode.data;
                nextNode = nextNode.next;
            return data;
        }
    }
}
