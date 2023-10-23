package Deque.StockLedger;

import Deque.Deque.EmptyQueueException;
import Deque.Deque.LinkedDeque;

import java.util.ArrayList;

public class StockLedger<T> implements StockLedgerInterface {
    ArrayList<LedgerEntry> ledger = new ArrayList<>();
    /** Records a stock purchase in this ledger.
     @param stockSymbol    The stock's symbol.
     @param sharesBought   The number of shares purchased.
     @param pricePerShare  The price per share. */
    @Override
    public void buy(String stockSymbol, int sharesBought, double pricePerShare) {
        LedgerEntry entry = null;

        for (LedgerEntry e : ledger) {
            if (e.getEntrySymbol().equals(stockSymbol)) {
                entry = e;
                break;
            }
        }

        if (entry == null) {
            entry = new LedgerEntry(stockSymbol);
            ledger.add(entry);
        }

        while (sharesBought > 0) {
            StockPurchase purchase = new StockPurchase(stockSymbol, pricePerShare);
            entry.addStockPurchase(purchase);
            sharesBought--;
        }
    }
    /** Removes from this ledger any shares of a particular stock
     that were sold and computes the capital gain or loss.
     @param stockSymbol    The stock's symbol.
     @param sharesSold     The number of shares sold.
     @param pricePerShare  The price per share.
     @return  The capital gain (loss). */
    @Override
    public double sell(String stockSymbol, int sharesSold, double pricePerShare) {
        if (ledger.isEmpty()) {
            throw new EmptyQueueException();
        }

        double saleAmount = sharesSold * pricePerShare;
        double totalCost = 0;


        for( LedgerEntry e : ledger){
            if(e.getEntrySymbol().equals(stockSymbol)){
                while(sharesSold > 0){
                    if(e.isEmpty()){
                        ledger.remove(e);
                    }else {
                        e.getInfo();
                        StockPurchase soldUnit = e.sellStockPurchase();
                        Double priceSold = soldUnit.getPricePerShare();
                        totalCost = totalCost + priceSold;
                    }
                }
            }
        }


        return saleAmount - totalCost;
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

      public void print(){
        for(LedgerEntry e : ledger){
            e.getInfo();
        }
      }

}
