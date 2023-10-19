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
    @Override
    public void buy(String stockSymbol, int sharesBought, double pricePerShare) {
        StockPurchase purchase = new StockPurchase(stockSymbol,sharesBought,pricePerShare);
        // if ledger array is then create new LedgerEntry object and add it into ledger
        if(ledger.isEmpty()){
            LedgerEntry newEntry = new LedgerEntry(stockSymbol);
            newEntry.add(purchase);
            ledger.add(newEntry);
        }
        else{
            for(LedgerEntry e : ledger){
                if(e.getStockSymbol().equals(purchase.getStockSymbol())){
                    e.add(purchase);
                }
                else{
                    LedgerEntry newEntry = new LedgerEntry(stockSymbol);
                    newEntry.add(purchase);
                    ledger.add(newEntry);
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
        while(!ledger.isEmpty()){
            if(ledger.contains(stockSymbol)){
                System.out.println(stockSymbol + " is exist !");
                return true;
            }
            else {
                System.out.println(stockSymbol + " is not exist !");
                return false;
            }
        }
        System.out.println(" The ledge is empty! ");
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
        return null;
    }
}

