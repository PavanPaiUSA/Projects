/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pharmacy.Medicine;

/**
 *
 * @author Soumya
 */
public class Medicine {
    
    private String itemid;
    private String name;
    private Integer cost;
    private String date;
    private Integer qty;
    private String desc;
    private String av;

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public String getAv() {
        return av;
    }

    public void setAv(String av) {
        this.av = av;
    }
    
    
    
    @Override
    public String toString(){
        String n = String.valueOf(itemid);
        return n;
    }
}
