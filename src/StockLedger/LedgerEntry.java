package Deque.StockLedger;

import Deque.Deque.EmptyQueueException;
import Deque.Deque.LinkedDeque;

public class LedgerEntry<T> extends LinkedDeque {

    private String stockSymbol;
    private LinkedDeque<StockPurchase> entry;

    public LedgerEntry(String stockSymbol){
        this.stockSymbol = stockSymbol;
        this.entry = new LinkedDeque();
    }

    public String getEntrySymbol(){
        return this.stockSymbol;
    }

    public void addStockPurchase(StockPurchase purchase){
        if(entry.isEmpty()){
            entry.addToFront(purchase);

        }
        else{
            entry.addToBack(purchase);
        }
    }

    public StockPurchase sellStockPurchase() {
        if (entry.isEmpty()) {
            // Handle the case where the deque is empty
            return null; // or you can throw an exception if you prefer
        } else {
            return entry.removeFront();
        }
    }

    public void getInfo(){
        for(StockPurchase i : entry){
            System.out.println("Stock of " + i.getStockSymbol() + " price " + i.getPricePerShare());
        }
    }





}

