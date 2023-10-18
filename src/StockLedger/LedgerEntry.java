package Deque.StockLedger;

public class LedgerEntry {
    private String stockSymbol;
    private int shareBought;

    private double pricePerShare;

    public LedgerEntry(String stockSymbol, int shareBought, double pricePerShare){
        this.stockSymbol = stockSymbol;
        this.shareBought = shareBought;
        this.pricePerShare = pricePerShare;
    }
}
