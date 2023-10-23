package Deque.StockLedger;

public class StockPurchase {
    private String stockSymbol;
    private int shareBought;
    private double pricePerShare;

    public StockPurchase(String stockSymbol, double pricePerShare, int shareBought){
        this.stockSymbol = stockSymbol;
        this.pricePerShare = pricePerShare;
        this.shareBought = shareBought;
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

    public String toString(){
        return "Stock: " + stockSymbol + " price per share " + pricePerShare;
    }

}

