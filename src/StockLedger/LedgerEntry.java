package Deque.StockLedger;

import Deque.Deque.DequeInterface;
import Deque.Deque.LinkedDeque;

import java.util.Deque;

public class LedgerEntry {
    private String stockSymbol;

    private LinkedDeque entry;

    public LedgerEntry(String stockSymbol){
        this.stockSymbol = stockSymbol;
    }

    public LedgerEntry(){
        this.stockSymbol = stockSymbol;
        this.entry = entry;
    }

    public String getStockSymbol(){
        return stockSymbol;
    }

}
