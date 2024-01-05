/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package School.Principal;

import java.util.ArrayList;

/**
 *
 * @author Soumya
 */
public class PrincipalDirectory {
    private ArrayList<Principal> principalList;

    public PrincipalDirectory() {
        principalList = new ArrayList<Principal>();
        
    }

    public ArrayList<Principal> getPrincipalList() {
        return principalList;
    }

    public void setPrincipalList(ArrayList<Principal> principalList) {
        this.principalList = principalList;
    }
    
    public Principal addPrincipal(){
        Principal n = new Principal();
        principalList.add(n);
        return n;
    }
    
    public void deletePrincipal(Principal m){
        principalList.remove(m);
    }
    
    public Principal findPrincipal(String username, String password){
        for(Principal n: principalList){
            if(n.getUsername().equals(username) && n.getPassword().equals(password)){
                return n;
            }
            
        }
        return null;
    }
    
    public boolean uiquePrincipalId(String id) {

        for (Principal d : principalList) {

            if (id.equals(d.getTeacherId())) {
                return false;
            }
        }
            return true; 
    } 
    
    public boolean uniquePrincipalUsername(String username){
        for (Principal d: principalList) {

            if (username.equals(d.getUsername())) {
                return false;
            }
        }
            return true;
    }
}
