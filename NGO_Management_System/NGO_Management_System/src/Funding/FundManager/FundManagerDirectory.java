/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funding.FundManager;

import java.util.ArrayList;

/**
 *
 * @author pavanpai
 */
public class FundManagerDirectory {
    private ArrayList<FundManager> fundManagerList;

    public FundManagerDirectory() {
        fundManagerList = new ArrayList<FundManager>();
        
    }

    public ArrayList<FundManager> getFundManagerList() {
        return fundManagerList;
    }

    public void setFundManagerList(ArrayList<FundManager> fundManagerList) {
        this.fundManagerList = fundManagerList;
    }
    
    public FundManager addFundManager(){
        FundManager f = new FundManager();
        fundManagerList.add(f);
        return f;
    }
    
    public void deleteFundManager(FundManager f){
        fundManagerList.remove(f);
    }
    
    public FundManager findFundManager(String username, String password){
        for(FundManager f: fundManagerList){
            if(f.getUsername().equals(username) && f.getPassword().equals(password)){
                return f;
            }
            
        }
        return null;
    }
    
    public boolean uniqueFundManId(String id) {

        for (FundManager d : fundManagerList) {

            if (id.equals(d.getFundManagerId())) {
                return false;
            }
        }
            return true; 
    } 
    
    public boolean uniqueFundManUsername(String username){
        for (FundManager d: fundManagerList) {

            if (username.equals(d.getUsername())) {
                return false;
            }
        }
            return true;
    }
}
