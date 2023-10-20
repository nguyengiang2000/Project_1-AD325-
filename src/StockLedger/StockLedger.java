package Deque.StockLedger;


import java.util.ArrayList;


public class StockLedger implements StockLedgerInterface {

    private ArrayList<LedgerEntry> ledger;

    public StockLedger(){

        ledger = new ArrayList<>();
    }
    /**
     * Records a stock purchase in this ledger.
     *
     * @param stockSymbol   The stock's symbol.
     * @param sharesBought  The number of shares purchased.
     * @param pricePerShare The price per share.
     */


    /**
     * Records a stock purchase in this ledger.
     *
     * @param stockSymbol   The stock's symbol.
     * @param sharesBought  The number of shares purchased.
     * @param pricePerShare The price per share.
     */
    @Override
    public void buy(String stockSymbol, int sharesBought, double pricePerShare) {

        if(!ledger.contains(stockSymbol)){
            LedgerEntry entry = new LedgerEntry();
            while(sharesBought > 0){
                StockPurchase purchase = new StockPurchase(stockSymbol, pricePerShare);
                entry.addToBack(purchase);
                sharesBought--;
            }
            ledger.add(entry);
        }
        else{
            for(LedgerEntry e : ledger){
                if(e.getStockSymbol().equals(stockSymbol)){
                    while(sharesBought > 0){
                        StockPurchase purchase = new StockPurchase(stockSymbol, pricePerShare);
                        e.addToBack(purchase);
                        sharesBought--;

                    }

                }
            }
        }
    }

    /**
     * Removes from this ledger any shares of a particular stock
     * that were sold and computes the capital gain or loss.
     *
     * @param stockSymbol   The stock's symbol.
     * @param sharesSold    The number of shares sold.
     * @param pricePerShare The price per share.
     * @return The capital gain (loss).
     */
    @Override
    public double sell(String stockSymbol, int sharesSold, double pricePerShare) {
        double saleAmount = sharesSold * pricePerShare;
        double totalCost = 0;
        while(sharesSold > 0){

        }


        return 0;
    }


    /**
     * Returns a boolean on whether the passed in stock symbol is contained in the ledger.
     *
     * @param stockSymbol The stock's symbol.
     * @return Boolean of if the stock exists in the ledger.
     */
    @Override
    public boolean contains(String stockSymbol) {
           for(LedgerEntry entry : ledger){
               if(entry.getStockSymbol().equals(stockSymbol)){
                   return true;
               }
        }
        return false;
    }


    /**
     * Returns a LedgerEntry object based on stock symbol.
     *
     * @param stockSymbol The stock's symbol.
     * @return LedgerEntry object of stock symbol.
     */
    @Override
    public LedgerEntry getEntry(String stockSymbol) {
        LedgerEntry temp = new LedgerEntry();
        for(LedgerEntry e : ledger){
            if (e.getStockSymbol().equals(stockSymbol)) {
                temp = e;
            }
        }
        return temp;
    }
}

