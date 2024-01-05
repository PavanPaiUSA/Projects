/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ngo.CareTaker;


import java.util.ArrayList;

/**
 *
 * @author pavanpai
 */
public class CaretakerDirectory {
    private ArrayList<Caretaker> caretakerList;

    public CaretakerDirectory() {
        caretakerList = new ArrayList<Caretaker>();
        
    }

    public ArrayList<Caretaker> getCaretakerList() {
        return caretakerList;
    }

    public void setCaretakerList(ArrayList<Caretaker> caretakerList) {
        this.caretakerList = caretakerList;
    }
    
    public Caretaker addCaretaker(){
        Caretaker c = new Caretaker();
        caretakerList.add(c);
        return c;
    }
    
    public void deleteCaretaker(Caretaker c){
        caretakerList.remove(c);
    }
    
    public Caretaker findCaretaker(String username, String password){
        for(Caretaker c: caretakerList){
            if(c.getUsername().equals(username) && c.getPassword().equals(password)){
                return c;
            }
            
        }
        return null;
    }
//    
//    public Caretaker findCaretaker(String username){
//        for(Caretaker c: caretakerList){
//            if(c.getUsername().equals(username)){
//                return c;
//            }
//            
//        }
//        return null;
//    }
    
    public boolean uiqueCaretakerId(String id) {

        for (Caretaker d : caretakerList) {

            if (id.equals(d.getCaretakerId())) {
                return false;
            }
        }
            return true; 
    } 
    
    public boolean uniqueCaretakerUsername(String username){
        for (Caretaker d: caretakerList) {

            if (username.equals(d.getUsername())) {
                return false;
            }
        }
            return true;
    }
    
     public String[] carUsernameArray(){
        String[] carUsername = new String[caretakerList.size()+1];
        
        int count = 0;
        for (Caretaker d: caretakerList){
            carUsername[count] = d.getUsername();
            count++; 
        }
        return carUsername;
    }
}
