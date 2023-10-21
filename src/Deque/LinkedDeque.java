package Deque.Deque;

import Deque.StockLedger.StockPurchase;

import java.util.Iterator;

public class LinkedDeque<StockPurchase> implements DequeInterface <StockPurchase> {

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

    private class DLNode<StockPurchase>{

        private StockPurchase data;
        private DLNode<StockPurchase> nextNode;
        private DLNode<StockPurchase> previousNode;

        public DLNode() {
            this.data = data;
            this.nextNode = null;
            this.previousNode = null;
        }

        public DLNode(StockPurchase data, DLNode nextNode, DLNode previousNode){
            this.data = data;
            this.nextNode = nextNode;
            this.previousNode = previousNode;
        }
        public StockPurchase getData(){

            return this.data;
        }

        public void setData(StockPurchase data) {

            this.data = data;
        }

        public DLNode getNextNode() {

            return nextNode;
        }

        public void setNextNode(DLNode next) {

            this.nextNode = next;
        }

        public DLNode getPreviousNode() {

            return previousNode;
        }

        public void setPreviousNode(DLNode previous) {

            this.previousNode = previous;
        }


    }


    /**
     * Adds a new entry to the front of back of this deque.
     *
     * @param newEntry An object to be added.
     */
    @Override
    public void addToFront(StockPurchase newEntry) {

    }

    /**
     * Adds a new entry to the front of back of this deque.
     *
     * @param newEntry An object to be added.
     */


    @Override
    public void addToBack(StockPurchase newEntry) {
    }


    /**
     * Removes and returns the front or back entry of this deque.
     *
     * @return The object at the front or back of the deque.
     * @throws EmptyQueueException if the deque is empty before the operation.
     */
    @Override
    public StockPurchase removeFront() {

        return null;
    }


    @Override
    public StockPurchase removeBack() {
        return null;
    }

    /**
     * Detects whether this deque is empty.
     *
     * @return True if deque is empty, or false otherwise.
     */
    @Override
    public boolean isEmpty() {
        return firstNode == null && lastNode == null;
    }

    /**
     * Returns the front or back entry's data.
     *
     * @return Entry data for front of back node.
     */
    @Override
    public StockPurchase getFront() {
        return null;
    }

    @Override
    public StockPurchase getBack() {
        if(isEmpty()){
            throw new EmptyQueueException();
        }
        return null;
    }

    @Override
    public void clear() {
        firstNode = null;
        lastNode = null;
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
