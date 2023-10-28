package Deque.StockLedger;

import Deque.Deque.EmptyQueueException;
import Deque.Deque.LinkedDeque;
import java.util.HashMap;
import java.util.Map;
public class LedgerEntry<T> extends LinkedDeque {

    private String stockSymbol;

    private LinkedDeque<StockPurchase> entry;



    /**
     * Constructor Ledger Entry with only 1 param - stockSymbol
     * @param stockSymbol
     */
    public LedgerEntry(String stockSymbol){
        this.stockSymbol = stockSymbol;
        this.entry = new LinkedDeque();
    }

    /**
     * get Entry Symbol
     * @return stockSymbol
     */
    public String getEntrySymbol(){

        return this.stockSymbol;
    }

    /**
     * addToFront Stockpurchase object into front if Linked Deque is empty
     * addToBack stockpurchase object into back if Linked Deque is not empty
     * @param purchase
     */
    public void addStockPurchase(StockPurchase purchase){
        if(entry.isEmpty()){
            entry.addToFront(purchase);

        }
        else{
            entry.addToBack(purchase);
        }
    }

    /**
     * remove stockpurchase object at the front of linked deque
     * @return stockpurchase that been removed
     */
    public StockPurchase sellStockPurchase() {
        if (entry.isEmpty()) {
            // Handle the case where the deque is empty
            return null; // or you can throw an exception if you prefer
        } else {
            return entry.removeFront();

        }
    }

    /**
     * count amount of individual stock and group together with same price
     */
    public void getCount(){
        // create map table name priceAmountMap
        Map<Double, Integer> priceAmountMap = new HashMap<>();

        for (StockPurchase purchase : entry) {
            double price = purchase.getPricePerShare();
            // start counting from 1
            int amount = 1;
            // if map table already contain price as key, amount++
            if (priceAmountMap.containsKey(price)) {
                amount += priceAmountMap.get(price);
            }
            // add amount counting and price into a set in a map
            priceAmountMap.put(price, amount);
        }
        // LOOP object map through map priceAmoutnMap and set price and totalAmount with key and value then print out
        for (Map.Entry<Double, Integer> map : priceAmountMap.entrySet()) {
            double price = map.getKey();
            int totalAmount = map.getValue();
            System.out.println("    "+ getEntrySymbol() + " " + price + " (" + totalAmount + ") ");
        }

        }



    }












