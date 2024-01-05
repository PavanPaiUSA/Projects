/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital.Encounter;

import java.util.ArrayList;

/**
 *
 * @author nitishbelagali
 */
public class AppointmentDirectory {
    private ArrayList<Appointment> hosAppList;

    public AppointmentDirectory() {
        hosAppList = new ArrayList<Appointment>();
        
    }

    public ArrayList<Appointment> getHosAppList() {
        return hosAppList;
    }

    public void setHosAppList(ArrayList<Appointment> hosAppList) {
        this.hosAppList = hosAppList;
    }
    
    public Appointment addAppointment(){
        Appointment newmanager = new Appointment();
        hosAppList.add(newmanager);
        return newmanager;
    }
    
    public void deleteAppointment(Appointment m){
        hosAppList.remove(m);
    }
    
    public boolean uiqueAppId(String id) {

        for (Appointment d : hosAppList) {

            if (id.equals(d.getAppNo())) {
                return false;
            }
        }
            return true; 
    } 
}
