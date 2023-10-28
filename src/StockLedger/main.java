package Deque.StockLedger;

public class main {
    public static void main(String[] args) {
        StockLedger transaction_1 = new StockLedger();
        transaction_1.buy("AAPL", 20, 45);
        transaction_1.buy("AAPL", 20, 75);
        transaction_1.buy("MSFT", 20, 95);
        transaction_1.Diplay();
        transaction_1.sell("AAPL", 30, 65);
        transaction_1.Diplay();
        transaction_1.sell("AAPL", 10, 65);
        transaction_1.Diplay();
        transaction_1.buy("AAPL", 100, 20);
        transaction_1.buy("AAPL", 20, 24);
        transaction_1.buy("TSLA", 200, 36);
        transaction_1.Diplay();
        transaction_1.sell("AAPL", 10, 65);
        transaction_1.Diplay();
        transaction_1.sell("TSLA", 150, 30);
        transaction_1.Diplay();
        transaction_1.buy("MSFT", 5, 60);
        transaction_1.buy("MSFT", 5, 70);
        transaction_1.Diplay();;
        transaction_1.sell("MSFT", 4, 30);
        transaction_1.Diplay();
        transaction_1.sell("MSFT", 2, 30);
        transaction_1.Diplay();

    }
}