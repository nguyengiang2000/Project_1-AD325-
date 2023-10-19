package Deque.Deque;

import Deque.StockLedger.StockPurchase;

import java.util.Iterator;

public class LinkedDeque implements DequeInterface {

    private DLNode firstNode;
    private DLNode lastNode;

    public LinkedDeque(){
        /**
         * firstNode reference to first Node in Linked Deque
         * lastNode reference to last Node in Linked Deque
         */
        firstNode = null;
        lastNode = null;
    }

    public class DLNode{

        private StockPurchase data;
        private DLNode next;
        private DLNode previous;

        public DLNode() {
            this.data = null;
            this.next = null;
            this.previous = null;
        }

        public DLNode(StockPurchase data){
            this.data = data;
            this.next = null;
            this.previous = null;
        }
        public StockPurchase getData(){
            return data;
        }

        public void setData(StockPurchase data) {
            this.data = data;
        }

        public DLNode getNext() {
            return next;
        }

        public void setNext(DLNode next) {
            this.next = next;
        }

        public DLNode getPrevious() {
            return previous;
        }

        public void setPrevious(DLNode previous) {
            this.previous = previous;
        }

    }

    public class IteratorForLinkedList implements Iterator{
        private DLNode currentNode;

        public boolean hasNext(){
            return currentNode != null;
        }

        public StockPurchase next(){
            if(!hasNext()){
                throw new EmptyQueueException();
            }





            return x;
        }
    }



    /**
     * Adds a new entry to the front of back of this deque.
     *
     * @param newEntry An object to be added.
     */
    @Override
    public void addToFront(Object newEntry) {

    }

    @Override
    public void addToBack(Object newEntry) {

    }

    /**
     * Removes and returns the front or back entry of this deque.
     *
     * @return The object at the front or back of the deque.
     * @throws EmptyQueueException if the deque is empty before the operation.
     */
    @Override
    public Object removeFront() {
        return null;
    }

    @Override
    public Object removeBack() {
        return null;
    }

    /**
     * Detects whether this deque is empty.
     *
     * @return True if deque is empty, or false otherwise.
     */
    @Override
    public boolean isEmpty() {
        return false;
    }

    /**
     * Returns the front or back entry's data.
     *
     * @return Entry data for front of back node.
     */
    @Override
    public Object getFront() {
        return null;
    }

    @Override
    public Object getBack() {
        return null;
    }

    @Override
    public void clear() {

    }

    /**
     * Creates iterators to iterate through deque.
     *
     * @return Returns an iterator for use.
     */
    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Iterator getIterator() {
        return null;
    }
}
