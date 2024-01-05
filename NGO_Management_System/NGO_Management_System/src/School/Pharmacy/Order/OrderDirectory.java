/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pharmacy.Order;

import java.util.ArrayList;

/**
 *
 * @author Soumya
 */
public class OrderDirectory {
    
   private ArrayList<Order> orderList;

    public OrderDirectory() {
        orderList = new ArrayList<Order>();
        
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }
    
    public Order addOrder(){
        Order o = new Order();
        orderList.add(o);
        return o;
    }
    
    public void deleteOrder(Order m){
        orderList.remove(m);
    }
    
    public boolean uiqueNgoOrderId(String id) {

        for (Order d : orderList) {

            if (id.equals(d.getOrderid())) {
                return false;
            }
        }
       return true;
      }
    
}
