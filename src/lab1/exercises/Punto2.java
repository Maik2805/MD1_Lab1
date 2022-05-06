package lab1.exercises;

import lab1.exercises.exercise2.Item;
import lab1.exercises.exercise2.StockStat;

/**
 *
 * @author Maik
 */
public class Punto2 {
    
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        demo();
    }
    
    private static void demo(){
        Item product = new Item();
        product.setName("Producto 1");
        product.setPrice(50f);
        product.setReference("ID1");
        StockStat statistics = new StockStat();
        statistics.setMinUsedDaily(62f);
        statistics.setResupplyPeriod(6);
        statistics.setMaxUsedDaily(135f);
        statistics.setAverageUsed(1182f);
        statistics.setCurrentAmount(260f);
        statistics.setAverageUsed(87f);
        statistics.calcAll();
        product.setStockStat(statistics);
        
        System.out.println(statistics.toString()); 
        System.out.println("Punto de pedido:" + statistics.getOrderPoint());
        System.out.println("Cantidad de pedido:" + statistics.getOrderAmount());
    }
    
    
}
