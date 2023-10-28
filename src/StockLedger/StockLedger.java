package Deque.StockLedger;

import Deque.Deque.EmptyQueueException;
import Deque.Deque.LinkedDeque;

import javax.xml.stream.events.EntityReference;
import java.util.ArrayList;

public class StockLedger<T> implements StockLedgerInterface {
    ArrayList<LedgerEntry> ledger = new ArrayList<>();
    /** Records a stock purchase in this ledger.
     @param stockSymbol    The stock's symbol.
     @param sharesBought   The number of shares purchased.
     @param pricePerShare  The price per share. */
    @Override
    public void buy(String stockSymbol, int sharesBought, double pricePerShare) {
        StockPurchase purchase = new StockPurchase(stockSymbol, pricePerShare);
        if(!ledger.contains(purchase.getStockSymbol())){
            LedgerEntry newEntry = new LedgerEntry(stockSymbol);
            while(sharesBought > 0){
                newEntry.addStockPurchase(purchase);
                sharesBought--;
            }
            ledger.add(newEntry);
        }
        else{
            for(LedgerEntry e : ledger){
                while(sharesBought > 0){
                    if(e.getEntrySymbol().equals(stockSymbol)) {
                        e.addStockPurchase(purchase);
                        sharesBought--;
                    }

                }
            }

        }
    }
    /** Removes from this ledger any shares of a particular stock
     that were sold and computes the capital gain or loss.
     @param stockSymbol    The stock's symbol.
     @param sharesSold     The number of shares sold.
     @param pricePerShare  The price per share.
     @return  The capital gain (loss). */


    public double sell(String stockSymbol, int sharesSold, double pricePerShare) {
        double capital = 0;
        double sellCost = sharesSold * pricePerShare;
        double totalOfSold = 0;

        for (LedgerEntry e : ledger) {
            if (e.getEntrySymbol().equals(stockSymbol)) {
                while (sharesSold > 0) {
                    //Be careful, if sharesSold no more left, sold_Unit become null -> throw Exception Error
                    StockPurchase sold_Unit = e.sellStockPurchase();
                    // if sold_Unit remain 0 then break the loop and finish the code
                    // otherwise keep caluclate totalSold
                    if (sold_Unit != null) {
                        double soldCost = sold_Unit.getPricePerShare();
                        // total cost after sold the current shares.
                        totalOfSold = totalOfSold + soldCost;
                        sharesSold--;
                    } else {
                        // break if there is no more unit to sold
                        break;
                    }
                }
            }
        }
        // capital return sell cost - total sold
        return capital = sellCost - totalOfSold;
    }
    /** Returns a boolean on whether the passed in stock symbol is contained in the ledger.
     @param stockSymbol    The stock's symbol.
     @return  Boolean of if the stock exists in the ledger. */
    @Override
    public boolean contains(String stockSymbol) {
        for (LedgerEntry entry : ledger) {
            if (entry.getEntrySymbol().equals(stockSymbol)) {
                return true;
            }
        }
        return false;
    }
    /** Returns a LedgerEntry object based on stock symbol.
     @param stockSymbol    The stock's symbol.
     @return  LedgerEntry object of stock symbol. */
    @Override
    public LedgerEntry getEntry(String stockSymbol) {
        for (LedgerEntry e : ledger) {
            if (e.getEntrySymbol().equals(stockSymbol)) {
                return e;
            }
        }
        return null; // Return null if the stockSymbol is not found
    }

    /**
     * Display each entry in a ledger
     */
    // Test LinkedDeque
    public void Diplay(){
        System.out.println("----- Stock Ledger -----");
        for(LedgerEntry e : ledger){
            e.getCount();
        }

    }


}
