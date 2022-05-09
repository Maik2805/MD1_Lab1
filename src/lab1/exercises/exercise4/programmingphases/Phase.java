/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.exercises.exercise4.programmingphases;

import java.io.IOException;
import java.util.ArrayList;
import lab1.exercises.exercise4.models.Order;
import lab1.exercises.exercise4.models.OrderDetail;

/**
 *
 * @author miccarurb
 */
public interface Phase {
    public ArrayList<OrderDetail> calculate(ArrayList<Order> orders) throws IOException;
}
