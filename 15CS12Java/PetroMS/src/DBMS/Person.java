
package DBMS;

import java.io.Serializable;

public class Person implements Serializable{
    private String id;
    private String name;
    private String sex;
    
    public Person(){} // new Person();
    public Person(Person p){ // 
         id = p.getID(); name = p.getName(); sex = p.getSex();
    }
    public Person(String id, String name, String sex){ // new Person(id,n,s)
       this.id = id; this.name = name; this.sex = sex;
    }
    public void setId(String id){this.id = id;}
    public void setName(String name){this.name = name;}
    public void setSex(String sex){this.sex = sex;}
    //------
    public String getID(){return id;}
    public String getName(){return name;}
    public String getSex(){return sex;}
    
    
}
