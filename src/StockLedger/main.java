package Deque.StockLedger;

public class main {
    public static void main(String[] args) {
        StockLedger transaction = new StockLedger();
        transaction.buy("AAPL", 20, 45);
        transaction.buy("AAPL", 20, 75);
        transaction.buy("MSFT", 20, 95);
        transaction.Diplay();
        transaction.sell("AAPL", 30, 65);
        transaction.Diplay();
        transaction.sell("AAPL", 10, 65);
        transaction.Diplay();
        transaction.buy("AAPL", 100, 20);
        transaction.buy("AAPL", 20, 24);
        transaction.buy("TSLA", 200, 36);
        transaction.Diplay();
        transaction.sell("AAPL", 10, 65);
        transaction.Diplay();
        transaction.sell("TSLA", 150, 30);
        transaction.Diplay();
        transaction.buy("MSFT", 5, 60);
        transaction.buy("MSFT", 5, 70);
        transaction.Diplay();;
        transaction.sell("MSFT", 4, 30);
        transaction.Diplay();
        transaction.sell("MSFT", 2, 30);
        transaction.Diplay();

    }
}