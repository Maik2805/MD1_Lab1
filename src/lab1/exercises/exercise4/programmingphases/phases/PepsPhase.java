/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.exercises.exercise4.programmingphases.phases;

import java.io.IOException;
import java.util.ArrayList;
import lab1.exercises.exercise4.models.Order;
import lab1.exercises.exercise4.models.OrderDetail;
import lab1.exercises.exercise4.programmingphases.Phase;

/**
 *
 * @author miccarurb
 */
public class PepsPhase implements Phase{

    @Override
    public ArrayList<OrderDetail> calculate(ArrayList<Order> orders) throws IOException {
        ArrayList<OrderDetail> result = new ArrayList<>();
        float flowTime = 0;
        for (Order order : orders) {
            OrderDetail orderDetail = new OrderDetail(order);
            flowTime += orderDetail.getProcessTime();
            orderDetail.setFlowTime(flowTime);
            orderDetail.setJobDelay(calculateDelay(flowTime, order.getDeliveryTime()));
            result.add(orderDetail);
        }
        
        return result;
    }
    
    private float calculateDelay(float current,float desired){
        return current - desired < 0 ?  0 : current - desired;
    }
    
}
