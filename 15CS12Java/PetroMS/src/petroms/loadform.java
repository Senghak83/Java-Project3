/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petroms;

import javax.swing.JPanel;

/**
 *
 * @author senghak
 */
public class loadform {
    private static loadform instance=null;
    public loadform(){instance = this;}
    public static void getInstance(JPanel f, JPanel p ){
       p.removeAll();
       p.add(f);
       p.validate();
       
    }
    
}
