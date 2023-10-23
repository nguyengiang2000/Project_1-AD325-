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
            throw new EmptyQueueException();
        }
        return entry.removeFront() ;
    }

    public void getInfo(){
        while(!entry.isEmpty()){
            for( StockPurchase e : entry){
                System.out.println("Stock of " + e.getStockSymbol() + " Price per unit is " + e.getPricePerShare());
            }
        }
    }




}

