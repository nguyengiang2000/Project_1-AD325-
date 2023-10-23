package Deque.Deque;

public class EmptyQueueException extends RuntimeException {
    public EmptyQueueException(){

        this("The Queue is empty!");
    }

    public EmptyQueueException(String s) {

        super(s);
    }
}
