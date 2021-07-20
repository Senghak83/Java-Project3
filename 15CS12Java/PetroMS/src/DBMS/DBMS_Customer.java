/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBMS;

import java.awt.HeadlessException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DBMS_Customer {
    private ArrayList<Customer> db = new ArrayList();
    private String fn ;
    private boolean ch= false;
    
    public DBMS_Customer(String fn){ // DBMS_Customer("txt.dat")
        this.fn = fn;
        try{
            ObjectInputStream oin = new ObjectInputStream( new FileInputStream(fn));   
            ch = true;
            Customer cu;
            while(true){
                cu = (Customer)oin.readObject();
                if(cu==null)break;
                db.add(cu);
                }
            oin.close();
         
           }catch(IOException | ClassNotFoundException exp){
                if(ch==false){
                    try{
                        ObjectOutputStream out = new ObjectOutputStream(
                        new FileOutputStream(fn));
                        JOptionPane.showMessageDialog(null,"Create New file"); 
                        out.close();
                    }catch(HeadlessException | IOException ex){
                    JOptionPane.showMessageDialog(null,"Cannot create file");}
                }// end if
         }// end catch
    }// end constructor
  //-------
   public void addCustomer(Customer cu){db.add(cu);}// 1,2,4,10
   public void updateCustomer(int index, Customer cu){db.set(index, cu);}// (2,10)
   public void removeCustomer(int index){db.remove(index);}
   public Customer getCustomer(int index){return db.get(index);}
   public int getCus_ID_Index(String id){
        for(int i =0 ; i<db.size(); i++){
            if(id.equals(db.get(i).getID()))return i;
        }
        return -1;
   }
   
   public ArrayList<Customer> getAllCustomer(){return db;}
   public int getSize(){return db.size();}
   
   public void InsertDataToFile(){
     try{
         ObjectOutputStream ob = new ObjectOutputStream(
         new FileOutputStream(fn));
         //-------
         for(Customer c : this.getAllCustomer())
             ob.writeObject(c);
         ob.close();
     }catch(IOException exp){
         JOptionPane.showMessageDialog(null,exp.toString());
     }
   }   
 
//---
   public ArrayList<Customer> getFilterName(String name){
        ArrayList<Customer> ls = new ArrayList();
        if(name.length()==0)return db;
        for(Customer c : this.getAllCustomer()){// ab , abc acmn
            String n = c.getName();
            if(n.length()<name.length())continue;
            n = n.substring(0,name.length());
            if(n.equals(name))ls.add(c);
        }
        
        return ls;     
   }// end methods filter
   
}
