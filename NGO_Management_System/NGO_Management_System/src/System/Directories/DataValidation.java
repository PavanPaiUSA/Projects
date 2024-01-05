/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System.Directories;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author pavanpai
 */
public class DataValidation {
    
    
    public boolean lengthCheck(String val){
        if(val.length()<=0||val.length()>30){
            return false;
        }
        return true;
    }
    
    public boolean numcheck(String val){
        try{
            int temp = Integer.parseInt(val);
            if(Integer.valueOf(val)<0){
                return false;
            }
        }catch(Exception err){
            return false;
        }
        return true;
    }
    
    
    
     public boolean phnocheck(String val){
        try{
            long temp = Long.parseLong(val);
        }catch(Exception err){
            return false;
        }
        
        if(val.length()!=10){
            return false;
        }
        return true;
    }
    
    public boolean checkStringAndNumber(String toCheck){
        var PATTERN = "^[a-zA-Z0-9]+$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(toCheck);
        if(!match.matches()){
            return false;
        }
        else
         return true;
    }
    public boolean checkNumber(String toCheck){
        var PATTERN = "[0-9]+";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(toCheck);
        if(!match.matches()){
            return false;
        }
        else
         return true;
    } 
    
    public boolean emailCheck(String email){
        if(email.isEmpty()){
            return false;
        }
        
        else if (email.matches("(.*)@(.*).com")){
            return true;
        }
        else{
            
            return false;
        }
    }
    
    public boolean dateCheck(String date){
        
        if(date.isEmpty()){
            return false;
        }
        else if(date.length()>10||date.length()<10){
            return false;
        }
        StringBuffer sBuffer = new StringBuffer(date);
        String mm;
        String dd;
        String yr;

        mm = sBuffer.substring(0,2);
        dd = sBuffer.substring(3,5);
        yr = sBuffer.substring(6,10);

        
        if(mm.matches("0[1-9]|1[0-2]") && dd.matches("0[1-9]|[12][0-9]|3[01]") && yr.matches("(19|20)\\d\\d"))
        {
          return true;
        }
        else
        {
//         JOptionPane.showMessageDialog(this, "Please enter correct date in format mm/dd/yyyy");
         return false;
        }
    }
    
}
