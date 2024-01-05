/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package School.Teacher;


import java.util.ArrayList;

/**
 *
 * @author Soumya
 */
public class TeacherDirectory {
    private ArrayList<Teacher> teacherList;

    public TeacherDirectory() {
        teacherList = new ArrayList<Teacher>();
        
    }

    public ArrayList<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(ArrayList<Teacher> teacherList) {
        this.teacherList = teacherList;
    }
    
    public Teacher addTeacher(){
        Teacher newmanager = new Teacher();
        teacherList.add(newmanager);
        return newmanager;
    }
    
    public void deleteTeacher(Teacher m){
        teacherList.remove(m);
    }
    
    public Teacher findTeacher(String username, String password){
        for(Teacher n: teacherList){
            if(n.getUsername().equals(username) && n.getPassword().equals(password)){
                return n;
            }
            
        }
        return null;
    }
    
    public boolean uiqueTeacherId(String id) {

        for (Teacher d : teacherList) {

            if (id.equals(d.getTeacherId())) {
                return false;
            }
        }
            return true; 
    } 
    
    public boolean uniqueTeacherUsername(String username){
        for (Teacher d: teacherList) {

            if (username.equals(d.getUsername())) {
                return false;
            }
        }
            return true;
    }
    
     public String[] teaUsernameArray(){
        String[] carUsername = new String[teacherList.size()+1];
        
        int count = 0;
        for (Teacher d: teacherList){
            carUsername[count] = d.getUsername();
            count++; 
        }
        return carUsername;
    }
}
