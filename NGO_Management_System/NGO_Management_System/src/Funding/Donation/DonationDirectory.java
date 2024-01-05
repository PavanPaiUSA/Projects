/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funding.Donation;

import java.util.ArrayList;

/**
 *
 * @author pavanpai
 */
public class DonationDirectory {
    
    private ArrayList<Donation> donationList;

    public DonationDirectory() {
        donationList = new ArrayList<Donation>();
        
    }

    public ArrayList<Donation> getDonationList() {
        return donationList;
    }

    public void setDonationList(ArrayList<Donation> donationList) {
        this.donationList = donationList;
    }
    
    public Donation addDonation(){
        Donation f = new Donation();
        donationList.add(f);
        return f;
    }
    
    public void deleteDonation(Donation f){
        donationList.remove(f);
    }
    
}
