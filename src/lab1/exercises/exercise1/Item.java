/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.exercises.exercise1;

/**
 *
 * @author Maik
 */
public class Item {
    private String name;
    private String reference;
    private float price;
    private StockStat stockStat;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public StockStat getStockStat() {
        return stockStat;
    }

    public void setStockStat(StockStat stockStat) {
        this.stockStat = stockStat;
    }

}
