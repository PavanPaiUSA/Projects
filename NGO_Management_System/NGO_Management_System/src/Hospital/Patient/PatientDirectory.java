/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital.Patient;
import Ngo.CareTaker.Caretaker;
import java.util.ArrayList;

/**
 *
 * @author nitishbelagali
 */
public class PatientDirectory {
    
     private ArrayList<Patient> patientList;
    
    public PatientDirectory() {
        patientList = new ArrayList<Patient>();   
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }
    
    public Patient addPatient(){
        Patient newpatient = new Patient();
        patientList.add(newpatient);
        return newpatient;
    }
    
    public void deletePatient(Patient m){
        patientList.remove(m);
    }
    
    public Patient findPatient(String username, String password){
        for(Patient n: patientList){
            if(n.getUsername().equals(username) && n.getPassword().equals(password)){
                return n;
            }
            
        }
        return null;
    }
    
    public boolean uiquePatientId(String id) {

        for (Patient d : patientList) {

            if (id.equals(d.getPatientId())) {
                return false;
            }
        }
            return true; 
    } 
    
    public boolean uniquePatientUsername(String username){
        for (Patient d: patientList) {

            if (username.equals(d.getUsername())) {
                return false;
            }
        }
            return true;
    }

    
      public String[] patUsernameArray(){
        String[] patUsername = new String[patientList.size()+1];
        
        int count = 0;
        for (Patient d: patientList){
            patUsername[count] = d.getUsername();
            count++; 
        }
        return patUsername;
    }
}
