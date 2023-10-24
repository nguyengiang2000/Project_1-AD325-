package Deque.StockLedger;

public class main {
    public static void main(String[] args) {
        StockLedger a = new StockLedger();
        System.out.println("Buy 1");
        a.buy("AAPL", 1, 55);
        System.out.println("Buy 2");
        a.buy("AAPL", 1, 55);
        System.out.println("Buy 3");
        a.buy("AAPL", 1, 55);
        System.out.println("Buy 4");
        a.buy("AMNZ", 2, 50);

        double capital = a.sell("AAPL", 2, 150);


        System.out.println("Gain Lose " + capital);
        a.Diplay();







    }
}