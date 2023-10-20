package Deque.StockLedger;

public class StockPurchase {
    private String stockSymbol;
    private int shareBought;

    private double pricePerShare;

    /** stockPurchase constructor with 3 elements
     *
     * @param stockSymbol => stock symbol
     * @param shareBought => how many share was in transaction
     * @param pricePerShare => how much per share cost
     */
    public StockPurchase(String stockSymbol, int shareBought, double pricePerShare){
        this.stockSymbol = stockSymbol;
        this.shareBought = shareBought;
        this.pricePerShare = pricePerShare;
    }

    public StockPurchase(String stockSymbol, double pricePerShare){
        this.stockSymbol = stockSymbol;
        this.pricePerShare = pricePerShare;
    }

    public String getStockSymbol(){
        return stockSymbol;
    }

    public int getShareBought(){
        return shareBought;
    }

    public double getPricePerShare(){
        return pricePerShare;
    }

}

