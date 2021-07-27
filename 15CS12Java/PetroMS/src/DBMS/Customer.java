
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
    // p = new customer()
    // c = new Person()
    public Customer(){
        super();
    }
    public Customer(Person p, String station_name,String address,String phone){
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
