/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package School.Student;

import java.util.ArrayList;

/**
 *
 * @author Soumya
 */
public class StudentDirectory {
    private ArrayList<Student> studentList;

    public StudentDirectory() {
        studentList = new ArrayList<Student>();
        
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }
    
    public Student addStudent(){
        Student s = new Student();
        studentList.add(s);
        return s;
    }
    
    public void deleteStudent(Student m){
        studentList.remove(m);
    }
    
    public boolean uiqueStudentId(String id) {

        for (Student d : studentList) {

            if (id.equals(d.getStudentId())) {
                return false;
            }
        }
            return true; 
    } 
    

}
