package Deque.StockLedger;

public class StockPurchase {
    private String stockSymbol;
    private int shareBought;
    private double pricePerShare;

    /**
     * Constructor with 3 params
     * @param stockSymbol
     * @param pricePerShare
     * @param shareBought
     */
    public StockPurchase(String stockSymbol, double pricePerShare, int shareBought){
        this.stockSymbol = stockSymbol;
        this.pricePerShare = pricePerShare;
        this.shareBought = shareBought;
    }

    /**
     *  Constructor with 2 params
     * @param stockSymbol
     * @param pricePerShare
     */
    public StockPurchase(String stockSymbol, double pricePerShare){
        this.stockSymbol = stockSymbol;
        this.pricePerShare = pricePerShare;
    }

    /**
     * get Stock Symbol
     * @return string of stockSymbol
     */
    public String getStockSymbol(){

        return stockSymbol;
    }

    /**
     * get Share bought number
     * @return int
     */
    public int getShareBought(){

        return shareBought;
    }

    /**
     * get Price of individual share
     * @return double
     */
    public double getPricePerShare(){

        return pricePerShare;
    }

    /**
     * print out Stock name and price
     * @return string
     */
    public String toString(){
        return "Stock: " + stockSymbol + " price per share " + pricePerShare;
    }

}

