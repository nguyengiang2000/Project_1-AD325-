package Deque.Deque;

public class EmptyQueueException extends RuntimeException {
    /**
     * throw new exception and print out "The Queue is empty"
     */
    public EmptyQueueException(){

        this("The Queue is empty!");
    }

    /**
     * throw new exception and print out the string of error
     * @param s
     */
    public EmptyQueueException(String s) {

        super(s);
    }
}
