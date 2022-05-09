/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.exercises.exercise4.models;

/**
 *
 * @author miccarurb
 */
public class Order {
    String id;
    float  processTime;
    int deliveryTime;

    public Order() {
    }
    
    public Order(String id, float processTime, int deliveryTime) {
        this.id = id;
        this.processTime = processTime;
        this.deliveryTime = deliveryTime;
    }
    
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getProcessTime() {
        return processTime;
    }

    public void setProcessTime(float processTime) {
        this.processTime = processTime;
    }

    public int getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(int deliveryTime) {
        this.deliveryTime = deliveryTime;
    }
    
    
    
}
