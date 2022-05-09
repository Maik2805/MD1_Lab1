/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.exercises.exercise4.models;

import java.util.ArrayList;

/**
 *
 * @author miccarurb
 */
public class Balance {
    private ArrayList<OrderDetail> orders;
    
    private int utilization;
    private float averageTimeTermination;
    private float systemJobs;
    private float averageDelay;
    private float totalProcessTime;
    private int totalFlowTime;
    private float totalJobDelay;

    public Balance() {
        orders = new ArrayList<OrderDetail>();
    }
    
    
    
    
    public void calcAll(){
        calcTotals();
        calcSummary();
    }
    
    private void calcTotals(){
        totalProcessTime = 0;
        totalFlowTime = 0;
        totalJobDelay = 0;
        for (OrderDetail order : orders) {
            totalProcessTime += order.getProcessTime();
            totalFlowTime += order.getFlowTime();
            totalJobDelay += order.getJobDelay();
        }
    }
    
    private void calcSummary(){
        utilization = Math.round((totalProcessTime/totalFlowTime)*100);
        averageTimeTermination = (float) totalFlowTime / orders.size();
        systemJobs = totalFlowTime / totalProcessTime;
        averageDelay = totalJobDelay / orders.size();
    }
    
    public void addOrder(OrderDetail order){
        orders.add(order);
    }
    
    public void removeOrder(int position){
        orders.remove(position);
    }

    public ArrayList<OrderDetail> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<OrderDetail> orders) {
        this.orders = orders;
    }

    public int getUtilization() {
        return utilization;
    }

    public void setUtilization(int utilization) {
        this.utilization = utilization;
    }

    public float getAverageTimeTermination() {
        return averageTimeTermination;
    }

    public void setAverageTimeTermination(float averageTimeTermination) {
        this.averageTimeTermination = averageTimeTermination;
    }

    public float getSystemJobs() {
        return systemJobs;
    }

    public void setSystemJobs(float systemJobs) {
        this.systemJobs = systemJobs;
    }

    public float getAverageDelay() {
        return averageDelay;
    }

    public void setAverageDelay(float averageDelay) {
        this.averageDelay = averageDelay;
    }

    public float getTotalProcessTime() {
        return totalProcessTime;
    }

    public int getTotalFlowTime() {
        return totalFlowTime;
    }

    public float getTotalJobDelay() {
        return totalJobDelay;
    }
    
    
}
