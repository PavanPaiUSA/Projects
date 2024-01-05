/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JobApp.Applicant;

import Funding.PublicUser.PublicUserDirectory;
import java.util.ArrayList;

/**
 *
 * @author nitishbelagali
 */
public class ApplicantDirectory {
    
    private ArrayList<Applicant> appList;

    public ApplicantDirectory() {
        appList = new ArrayList<Applicant>();
        
    }

    public ArrayList<Applicant> getAppList() {
        return appList;
    }

    public void setAppList(ArrayList<Applicant> appList) {
        this.appList = appList;
    }
    
    public Applicant addUser(){
        Applicant p = new Applicant();
        appList.add(p);
        return p;
    }
    
    public void deleteUser(Applicant p){
        appList.remove(p);
    }
    
     public Applicant findApplicant(String username, String password){
        for(Applicant p: appList){
            if(p.getUsername().equals(username) && p.getPassword().equals(password)){
                return p;
            }
            
        }
        return null;
    }

     public boolean uiqueApplicantUsername(String id) {

        for (Applicant d : appList) {

            if (id.equals(d.getUsername())) {
                return false;
            }
        }
            return true; 
    } 
            
}
