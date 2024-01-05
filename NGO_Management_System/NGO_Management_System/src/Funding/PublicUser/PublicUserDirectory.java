/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funding.PublicUser;

import java.util.ArrayList;

/**
 *
 * @author pavanpai
 */
public class PublicUserDirectory {
    private ArrayList<PublicUser> publicUserList;

    public PublicUserDirectory() {
        publicUserList = new ArrayList<PublicUser>();
        
    }

    public ArrayList<PublicUser> getPublicUserList() {
        return publicUserList;
    }

    public void setPublicUserList(ArrayList<PublicUser> publicUserList) {
        this.publicUserList = publicUserList;
    }
    
    public PublicUser addUser(){
        PublicUser p = new PublicUser();
        publicUserList.add(p);
        return p;
    }
    
    public void deleteUser(PublicUser p){
        publicUserList.remove(p);
    }
    
     public PublicUser findPublicUser(String username, String password){
        for(PublicUser p: publicUserList){
            if(p.getUsername().equals(username) && p.getPassword().equals(password)){
                return p;
            }
            
        }
        return null;
    }
     
    public boolean uniquePublicUserUsername(String username){
        for (PublicUser d: publicUserList) {

            if (username.equals(d.getUsername())) {
                return false;
            }
        }
            return true;
    } 
}
