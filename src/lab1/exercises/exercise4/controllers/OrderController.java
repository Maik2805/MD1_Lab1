/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.exercises.exercise4.controllers;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import lab1.exercises.exercise4.models.Balance;
import lab1.exercises.exercise4.models.Order;
import lab1.exercises.exercise4.models.OrderDetail;
import lab1.exercises.exercise4.programmingphases.Phase;
import lab1.exercises.exercise4.programmingphases.phases.PepsPhase;

/**
 *
 * @author miccarurb
 */
public class OrderController {
    public Balance generatePepsBalance(ArrayList<Order> orders) throws IOException{
        Phase phase = new PepsPhase();
        ArrayList<OrderDetail> ordersDetails = phase.calculate(orders);
        
        Balance result = new Balance();
        result.setOrders(ordersDetails);
        result.calcAll();
        return result;
    }
    public static void showBalance(Balance balance){
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("--- BALANCE ---"); 
        System.out.println("- ORDENES -"); 
        System.out.println("Secuencia   | Tiempo de Proceso   | Tiempo de Flujo   " +
                "| Fecha de entrega   | Retraso del trabajo");
        for (OrderDetail order : balance.getOrders()) {
            System.out.println(order.getId() + "   | " + order.getProcessTime()+ "   | " +
                    order.getFlowTime() + "   | " + order.getDeliveryTime() + "   | " + order.getJobDelay());
        }
        System.out.println("Total   | " + balance.getTotalProcessTime()+ "   | " +
                    balance.getTotalFlowTime()+ "   |       | " + balance.getTotalJobDelay());
        System.out.println("-- RESUMEN --"); 
        System.out.println("Utilización: " + df.format(balance.getUtilization()) + "%");
        System.out.println("Tiempo medio de terminación: " + df.format(balance.getAverageTimeTermination()));
        System.out.println("Trabajos en el sistema: " + df.format(balance.getSystemJobs()));
        System.out.println("Retraso promedio: " + df.format(balance.getAverageDelay()));
    }
}
