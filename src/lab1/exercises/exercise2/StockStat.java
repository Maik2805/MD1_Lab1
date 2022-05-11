/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.exercises.exercise2;

/**
 * Represents an Stock Status.
 *
 * @author Maik
 */
public class StockStat {

    private float maxUsedDaily;
    private float minUsedDaily;
    private float averageUsed;
    private float currentAmount;
    private float minAmount;
    private float maxAmount;
    private float orderPoint;
    private float orderAmount;
    private int resupplyPeriod;

    /**
     * Constructs a new StockStat with no Arguments.
     */
    public StockStat() {
    }

    /**
     * Constructs a new OrderDetail by the basic attributes as arguments.
     */
    public StockStat(int resupplyPeriod, float currentAmount, float averageUsed, float maxUsedDaily, float minUsedDaily) {
        this.maxUsedDaily = maxUsedDaily;
        this.minUsedDaily = minUsedDaily;
        this.averageUsed = averageUsed;
        this.currentAmount = currentAmount;
        this.resupplyPeriod = resupplyPeriod;
    }

    /**
     * Calculate every attribute on the StockStat.
     *
     * @return void.
     */
    public void calcAll() {
        calcMinimumAmount();
        calcMaximumAmount();
        calcOrderPoint();
        calcOrderAmount();
    }

    /**
     * Calculate minAmount attribute and returns it.
     *
     * @return minAmount.
     */
    public float calcMinimumAmount() {
        minAmount = minUsedDaily * resupplyPeriod;
        return minAmount;
    }

    /**
     * Calculate maxAmount attribute and returns it.
     *
     * @return maxAmount.
     */
    public float calcMaximumAmount() {
        maxAmount = (maxUsedDaily * resupplyPeriod) + minAmount;
        return maxAmount;
    }

    /**
     * Calculate orderPoint attribute and returns it.
     *
     * @return orderPoint.
     */
    public float calcOrderPoint() {
        orderPoint = (averageUsed * resupplyPeriod) + minAmount;
        return orderPoint;
    }

    /**
     * Calculate orderAmount attribute and returns it.
     *
     * @return orderAmount.
     */
    public float calcOrderAmount() {
        orderAmount = maxAmount - currentAmount;
        return orderAmount;
    }

    public float getMaxUsedDaily() {
        return maxUsedDaily;
    }

    public void setMaxUsedDaily(float maxUsedDaily) {
        this.maxUsedDaily = maxUsedDaily;
    }

    public float getMinUsedDaily() {
        return minUsedDaily;
    }

    public void setMinUsedDaily(float minUsedDaily) {
        this.minUsedDaily = minUsedDaily;
    }

    public float getAverageUsed() {
        return averageUsed;
    }

    public void setAverageUsed(float averageUsed) {
        this.averageUsed = averageUsed;
    }

    public float getCurrentAmount() {
        return currentAmount;
    }

    public void setCurrentAmount(float currentAmount) {
        this.currentAmount = currentAmount;
    }

    public int getResupplyPeriod() {
        return resupplyPeriod;
    }

    public void setResupplyPeriod(int resupplyPeriod) {
        this.resupplyPeriod = resupplyPeriod;
    }

    public float getMinAmount() {
        return minAmount;
    }

    public float getMaxAmount() {
        return maxAmount;
    }

    public float getOrderPoint() {
        return orderPoint;
    }

    public float getOrderAmount() {
        return orderAmount;
    }

    @Override
    public String toString() {
        return "StockStat{" + "maxUsedDaily=" + maxUsedDaily + ", minUsedDaily=" + minUsedDaily + ", averageUsed=" + averageUsed + ", currentAmount=" + currentAmount + ", minAmount=" + minAmount + ", maxAmount=" + maxAmount + ", orderPoint=" + orderPoint + ", orderAmount=" + orderAmount + ", resupplyPeriod=" + resupplyPeriod + '}';
    }

}
