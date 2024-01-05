/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ngo.Budget;

import java.util.ArrayList;

/**
 *
 * @author pavanpai
 */
public class BudgetDirectory {
    
    private ArrayList<Budget> budgetList;
    
    public BudgetDirectory() {
        budgetList = new ArrayList<Budget>();   
    }

    public ArrayList<Budget> getBudgetList() {
        return budgetList;
    }

    public void setBudgetList(ArrayList<Budget> budgetList) {
        this.budgetList = budgetList;
    }
    
    public Budget addBudget(){
        Budget c = new Budget();
        budgetList.add(c);
        return c;
    }
    
    public void deleteBudget(Budget c){
        budgetList.remove(c);
    }
    
    public Budget getMoney(){
        for(Budget b: budgetList){
            if(b.getDonation()!=null || b.getOthers()!=null){
                return b;
            }
            
        }
        return null;
    }
    
    
//    public Budget getFund(){
//        for(Budget b: budgetList){
////            if(b.getTotal()!=null){
//                return b;
////            }
//            
//        }
//        return null;
//    }
    
    public Integer getTotal(){
        for(Budget b: budgetList){
            if(b.getTotal()!=null){
                System.out.println("Need to fix");
                return b.getTotal();
            }
        }
        return null;
    }
}
