/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.exercises;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import lab1.exercises.exercise4.controllers.OrderController;
import lab1.exercises.exercise4.models.Balance;
import lab1.exercises.exercise4.models.Order;
import lab1.exercises.exercise4.models.OrderDetail;

/**
 *
 * @author miccarurb
 */
public class Punto4 {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        demo();
    }
    
    public static void demo(){
        Order ordenA = new Order("A",2f,7);
        Order ordenB = new Order("B",8f,5);
        Order ordenC = new Order("C",5f,6);
        Order ordenD = new Order("D",7f,11);
        
        OrderController controller = new OrderController();
        ArrayList<Order> orders = new ArrayList<>(Arrays.asList(ordenA,ordenB, ordenC, ordenD));
        try {
            Balance balance = controller.generatePepsBalance(orders);
            controller.showBalance(balance);
        } catch (IOException ex) {
            Logger.getLogger(Punto4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
