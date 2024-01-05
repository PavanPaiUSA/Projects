/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pharmacy.DeliveryMan;

import java.util.ArrayList;

/**
 *
 * @author Soumya
 */
public class DeliveryManDirectory {
    
    private ArrayList<DeliveryMan> deliveryManList;

    public DeliveryManDirectory() {
        deliveryManList = new ArrayList<DeliveryMan>();
        
    }

    public ArrayList<DeliveryMan> getDeliveryManList() {
        return deliveryManList;
    }

    public void setDeliveryManList(ArrayList<DeliveryMan> deliveryManList) {
        this.deliveryManList = deliveryManList;
    }
    
    public DeliveryMan addDeliveryMan(){
        DeliveryMan c = new DeliveryMan();
        deliveryManList.add(c);
        return c;
    }
    
    public void deleteDeliveryMan(DeliveryMan c){
        deliveryManList.remove(c);
    }
    
    public DeliveryMan findDeliveryMan(String username, String password){
        for(DeliveryMan c: deliveryManList){
            if(c.getUsername().equals(username) && c.getPassword().equals(password)){
                return c;
            }
            
        }
        return null;
    }
    
    public boolean uiqueDeliveryManId(String id) {

        for (DeliveryMan d : deliveryManList) {

            if (id.equals(d.getDeliverymanId())) {
                return false;
            }
        }
            return true; 
    } 
    
    public boolean uiqueDeliveryManUsername(String id) {

        for (DeliveryMan d : deliveryManList) {

            if (id.equals(d.getUsername())) {
                return false;
            }
        }
            return true; 
    } 

    public String[] delUsernameArray(){
        String[] carUsername = new String[deliveryManList.size()+1];
        
        int count = 0;
        for (DeliveryMan d: deliveryManList){
            carUsername[count] = d.getUsername();
            count++; 
        }
        return carUsername;
    }
    
}
