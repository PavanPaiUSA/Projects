/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ngo.Order;

import java.util.ArrayList;

/**
 *
 * @author pavanpai
 */
public class NgoOrderDirectory {
    private ArrayList<NgoOrder> NgoOrderList;

    public NgoOrderDirectory() {
        NgoOrderList = new ArrayList<NgoOrder>();
        
    }

    public ArrayList<NgoOrder> getNgoOrderList() {
        return NgoOrderList;
    }

    public void setNgoOrderList(ArrayList<NgoOrder> NgoOrderList) {
        this.NgoOrderList = NgoOrderList;
    }

    public NgoOrder addNgoOrder(){
        NgoOrder o = new NgoOrder();
        NgoOrderList.add(o);
        return o;
    }
    
    public void deleteNgoOrder(NgoOrder m){
        NgoOrderList.remove(m);
    }
    
    public boolean uiqueNgoOrderId(String id) {

        for (NgoOrder d : NgoOrderList) {

            if (id.equals(d.getOrderid())) {
                return false;
            }
        }
       return true;
      }
    
    
}
