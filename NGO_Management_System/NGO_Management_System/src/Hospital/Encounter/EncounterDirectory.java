/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital.Encounter;

import Ngo.CareTaker.Caretaker;
import Ngo.NgoManager.NgoManager;
import java.util.ArrayList;

/**
 *
 * @author nitishbelagali
 */
public class EncounterDirectory {
    
    private ArrayList<Encounter> hospitalEncounterList;
    
    public EncounterDirectory() {
    hospitalEncounterList = new ArrayList<Encounter>();
    }
    
    public ArrayList<Encounter> getHospitalEncounterList() {
        return hospitalEncounterList;
    }
    
    public void setHospitalEncounterList(ArrayList<Encounter> hospitalEncounterList) {
        this.hospitalEncounterList = hospitalEncounterList;
    }
    
    public Encounter addHospitalEncounter(){
        Encounter newEncounter = new Encounter();
        hospitalEncounterList.add(newEncounter);
        return newEncounter;
    }
    
    public void deleteHospitalEncounter(Encounter m){
        hospitalEncounterList.remove(m);
    }
    
//    public Encounter findHospitalEncounter(String username, String password){
//        for(NgoManager n: ngoManagerList){
//            if(n.getUsername().equals(username) && n.getPassword().equals(password)){
//                return n;
//            }
//            
//        }
//        return null;
//    }
    
    public boolean uiqueEncounterId(String id) {

        for (Encounter d : hospitalEncounterList) {

            if (id.equals(d.getEncounterNo())) {
                return false;
            }
        }
            return true; 
    } 
    
}
