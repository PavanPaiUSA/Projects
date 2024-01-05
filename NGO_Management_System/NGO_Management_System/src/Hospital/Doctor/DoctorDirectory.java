/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital.Doctor;
import Ngo.CareTaker.Caretaker;
import java.util.ArrayList; 

/**
 *
 * @author nitishbelagali
 */
public class DoctorDirectory {
    
    private ArrayList<Doctor> doctorList;
    
    public DoctorDirectory() {
        doctorList = new ArrayList<Doctor>();   
    }

    public ArrayList<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(ArrayList<Doctor> doctorList) {
        this.doctorList = doctorList;
    }
    
    public Doctor addDoctor(){
        Doctor newdoctor = new Doctor();
        doctorList.add(newdoctor);
        return newdoctor;
    }
    
    public void deleteDoctor(Doctor m){
        doctorList.remove(m);
    }
    
    public Doctor findDoctor(String username, String password){
        for(Doctor n: doctorList){
            if(n.getUsername().equals(username) && n.getPassword().equals(password)){
                return n;
            }
            
        }
        return null;
    }
    
    public boolean uiqueDoctorId(String id) {

        for (Doctor d : doctorList) {

            if (id.equals(d.getDoctorId())) {
                return false;
            }
        }
            return true; 
    } 
    
    public boolean uniqueDoctorUsername(String username){
        for (Doctor d: doctorList) {

            if (username.equals(d.getUsername())) {
                return false;
            }
        }
            return true;
    }
    

    public String[] docUsernameArray(){
        String[] docUsername = new String[doctorList.size()+1];
        
        int count = 0;
        for (Doctor d: doctorList){
            docUsername[count] = d.getUsername();
            count++; 
        }
        return docUsername;
    }
    
}
