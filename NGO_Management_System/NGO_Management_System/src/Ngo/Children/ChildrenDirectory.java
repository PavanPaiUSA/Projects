 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ngo.Children;

import java.util.ArrayList;

/**
 *
 * @author pavanpai
 */
public class ChildrenDirectory {
    private ArrayList<Children> childrenList;

    public ChildrenDirectory() {
        childrenList = new ArrayList<Children>();
        
    }

    public ArrayList<Children> getChildrenList() {
        return childrenList;
    }

    public void setChildrenList(ArrayList<Children> childrenList) {
        this.childrenList = childrenList;
    }

    public Children addChildren(){
        Children c = new Children();
        childrenList.add(c);
        return c;
    }
    
    public void deleteChildren(Children c){
        childrenList.remove(c);
    }
    
    public boolean uiqueChildrenId(String id) {

        for (Children d : childrenList) {

            if (id.equals(d.getChildrenId())) {
                return false;
            }
        }
            return true; 
    } 
    
    
}
