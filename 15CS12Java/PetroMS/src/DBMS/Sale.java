/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBMS;

import java.io.Serializable;


public class Sale extends Person implements Serializable {

    /**
     * @return the invo
     */
    public String getInvo() {
        return invo;
    }

    /**
     * @param invo the invo to set
     */
    public void setInvo(String invo) {
        this.invo = invo;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the qty
     */
    public int getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(int qty) {
        this.qty = qty;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the payment
     */
    public double getPayment() {
        return payment;
    }

    /**
     * @param payment the payment to set
     */
    public void setPayment(double payment) {
        this.payment = payment;
    }
    private String invo;
    private String date;
    private int qty;
    private double price;
    private String type;
    private double payment;
    //---
    public Sale(String name,String invo,String dat,String tye,
            int qty,double price ){
            setName(name); this.invo = invo; date = dat;
            this.qty = qty;
            this.price = price;
    }
    
    public Sale(String d,String invo,String n,double payment){
        date = d; this.invo = invo; setName(n); this.payment = payment;
    }
    
    
    
}
