/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package School.FinalResult;

import java.util.ArrayList;

/**
 *
 * @author Soumya
 */
public class FinalResultDirectory {
     private ArrayList<FinalResult> resultList;

    public FinalResultDirectory() {
        resultList = new ArrayList<FinalResult>();
        
    }

    public ArrayList<FinalResult> getResultList() {
        return resultList;
    }

    public void setResultList(ArrayList<FinalResult> resultList) {
        this.resultList = resultList;
    }
    
    public FinalResult addFinalResult(){
        FinalResult s = new FinalResult();
        resultList.add(s);
        return s;
    }
    
    public void deleteFinalResult(FinalResult m){
        resultList.remove(m);
    }
    
}
