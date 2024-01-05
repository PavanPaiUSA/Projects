/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pharmacy.Pharmacist;

import java.util.ArrayList;

/**
 *
 * @author Soumya
 */
public class PharmacistDirectory {
    private ArrayList<Pharmacist> pharList;

    public PharmacistDirectory() {
        pharList = new ArrayList<Pharmacist>();
        
    }

    public ArrayList<Pharmacist> getPharList() {
        return pharList;
    }

    public void setPharList(ArrayList<Pharmacist> pharList) {
        this.pharList = pharList;
    }
    
    public Pharmacist addPharmacist(){
        Pharmacist c = new Pharmacist();
        pharList.add(c);
        return c;
    }
    
    public void deletePharmacist(Pharmacist c){
        pharList.remove(c);
    }
    
    public Pharmacist findPharmacist(String username, String password){
        for(Pharmacist c: pharList){
            if(c.getUsername().equals(username) && c.getPassword().equals(password)){
                return c;
            }
            
        }
        return null;
    }
    
    public boolean uiquePharmacistId(String id) {

        for (Pharmacist d : pharList) {

            if (id.equals(d.getCaretakerId())) {
                return false;
            }
        }
            return true; 
    } 
    
    public boolean uiquePharmacistUsername(String id) {

        for (Pharmacist d : pharList) {

            if (id.equals(d.getUsername())) {
                return false;
            }
        }
            return true; 
    } 
    
     public String[] pharUsernameArray(){
        String[] carUsername = new String[pharList.size()+1];
        
        int count = 0;
        for (Pharmacist d: pharList){
            carUsername[count] = d.getUsername();
            count++; 
        }
        return carUsername;
    }
}
