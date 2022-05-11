/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.exercises.views.tablemodels;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import lab1.exercises.exercise4.models.Balance;
import lab1.exercises.exercise4.models.OrderDetail;

/**
 * Represents a Order Detail Model to show in a Jtable.
 * @author miccarurb
 */
public class OrderDetailTableModel extends AbstractTableModel {
    private List<OrderDetail> orders;
    private String[] columns;

    /**
     * Constructs a new OrderDetailTableModel by no arguments.
     */
    public OrderDetailTableModel() {
        super();
        orders = new ArrayList<>();
        columns = new String[]{
            "Secuencia", "Tiempo de Proceso", "Tiempo de flujo", "Fecha de entrega", "Retraso del trabajo"
        };
    }
    
    /**
     * Calculate the number of columns.
     */
    public int getColumnCount() {
        return columns.length ;
    }
        
    /**
     * Gets the value of the specific cordinates.
     * 
     * @param row row position.
     * @param col columns position.
     * @return Value.
     */
    public Object getValueAt(int row, int col) {
        OrderDetail order = orders.get(row);
        switch(col) {
          case 0: return order.getId();
          case 1: return order.getProcessTime();
          case 2: return order.getFlowTime();
          case 3: return order.getDeliveryTime();
          case 4: return order.getDeliveryTime();
          // to complete here...
          default: return null;
        }   
    }
    
    @Override
    public String getColumnName(int col) {
        return columns[col] ;
    }

    @Override
    public int getRowCount() {
        return orders.size();
    }

    public List<OrderDetail> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderDetail> orders) {
        this.orders = orders;
    }

}
