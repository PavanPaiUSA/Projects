/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package School.Application;

import java.util.ArrayList;

/**
 *
 * @author Soumya
 */
public class ApplicationDirectory {
    private ArrayList<Application> applicationList;

    public ApplicationDirectory() {
        applicationList = new ArrayList<Application>();
        
    }

    public ArrayList<Application> getApplicationList() {
        return applicationList;
    }

    public void setApplicationList(ArrayList<Application> applicationList) {
        this.applicationList = applicationList;
    }
    
    public Application addApplication(){
        Application n = new Application();
        applicationList.add(n);
        return n;
    }
    
    public void deleteApplication(Application m){
        applicationList.remove(m);
    }
    
    public boolean uiqueApplicationId(String id) {

        for (Application d : applicationList) {

            if (id.equals(d.getAppNo())) {
                return false;
            }
        }
            return true; 
    } 
    
}
