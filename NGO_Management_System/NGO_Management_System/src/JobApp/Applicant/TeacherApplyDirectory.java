/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JobApp.Applicant;

import java.util.ArrayList;

/**
 *
 * @author nitishbelagali
 */
public class TeacherApplyDirectory {
    
    private ArrayList<TeacherApply> appList;

    public TeacherApplyDirectory() {
        appList = new ArrayList<TeacherApply>();
        
    }

    public ArrayList<TeacherApply> getAppList() {
        return appList;
    }

    public void setAppList(ArrayList<TeacherApply> appList) {
        this.appList = appList;
    }
    
    public TeacherApply addApp(){
        TeacherApply p = new TeacherApply();
        appList.add(p);
        return p;
    }
    
    public void deleteApp(TeacherApply p){
        appList.remove(p);
    }
    
    public boolean uiqueJobAppId(String id) {

        for (TeacherApply d : appList) {

            if (id.equals(d.getAppId())) {
                return false;
            }
        }
            return true; 
    } 
 

}
