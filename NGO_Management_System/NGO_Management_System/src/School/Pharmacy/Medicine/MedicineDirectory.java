/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pharmacy.Medicine;

import java.util.ArrayList;

/**
 *
 * @author Soumya
 */
public class MedicineDirectory {
    
    private ArrayList<Medicine> medList;

    public MedicineDirectory() {
        medList = new ArrayList<Medicine>();
        
    }

    public ArrayList<Medicine> getMedList() {
        return medList;
    }

    public void setMedList(ArrayList<Medicine> medList) {
        this.medList = medList;
    }

    public Medicine addMed(){
        Medicine newmanager = new Medicine();
        medList.add(newmanager);
        return newmanager;
    }
    
    public void deleteMedicine(Medicine m){
        medList.remove(m);
    }
    
    public boolean uiqueItemId(String id) {

        for (Medicine d : medList) {

            if (id.equals(d.getItemid())) {
                return false;
            }
        }
            return true; 
    } 
    
    public Medicine findMedicine(String name){
        for(Medicine m: medList){
            if(m.getName().equals(name)){
                return m;
            }
            
        }
        return null;
    }
    
     public String[] medArray(){
        String[] med = new String[medList.size()+1];
        
        int count = 0;
        for (Medicine d: medList){
            med[count] = d.getName();
            count++; 
        }
        return med;
    }
}
