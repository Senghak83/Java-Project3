/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBMS;

import java.io.Serializable;

/**
 *
 * @author senghak
 */
public class Customer extends Person implements Serializable{
    
    private String add;
    private String station_name;
    private String phone;
    //-- cunstuctor
    public Customer(){
        super();
    }
    public Customer(Person p,String address, String station_name,String phone){
        super(p);
        this.add = address; this.station_name = station_name;
        this.phone = phone;
    }
    public void setAddress(String address){this.add = address;}
    public void setStation_name(String name){this.station_name = name;}
    public void setPhone(String phone){this.phone = phone;}
    
    public String getAdress(){return add;}
    public String getStation_name(){return station_name;}
    public String getPhone(){return phone;}
}
