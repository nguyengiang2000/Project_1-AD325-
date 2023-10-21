package Deque.StockLedger;

public class main {
    public static void main(String[] args) {
        StockLedger a = new StockLedger();
        a.buy("Apple", 20, 35);
        a.buy("AMNZ", 20, 35);
        System.out.println(a);
    }
}