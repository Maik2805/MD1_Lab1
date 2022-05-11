/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.exercises.exercise4.models;

/**
 * Represents an Order with detail data.
 * @author miccarurb
 */
public class OrderDetail extends Order {

    private float flowTime;
    private float jobDelay;

    /**
     * Constructs a new OrderDetail with no Arguments.
     */
    public OrderDetail() {
    }

    /**
     * Constructs a new OrderDetail by an Order object.
     */
    public OrderDetail(Order orderBase) {
        id = orderBase.id;
        processTime = orderBase.processTime;
        deliveryTime = orderBase.deliveryTime;
    }

    public float getFlowTime() {
        return flowTime;
    }

    public void setFlowTime(float flowTime) {
        this.flowTime = flowTime;
    }

    public float getJobDelay() {
        return jobDelay;
    }

    public void setJobDelay(float jobDelay) {
        this.jobDelay = jobDelay;
    }
    
    
    

}
