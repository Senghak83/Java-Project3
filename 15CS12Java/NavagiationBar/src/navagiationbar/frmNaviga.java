
package navagiationbar;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class frmNaviga extends javax.swing.JFrame {

    private final Color hover = new Color(245, 66, 152);
    private final Color exit = new Color(102,102,102);
    private final Color click = new Color(154,154,104);
    private final Color submen = new Color(242,242,242);
    //[242,242,242]
    private boolean hide = true;
    
    // Declaration Panel
    frmInput input = new frmInput();
    frmView v = new frmView();
    CSMDBMS  db = new CSMDBMS();
        
    public frmNaviga() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnavigation = new javax.swing.JPanel();
        psubnavigation = new javax.swing.JPanel();
        pback = new javax.swing.JPanel();
        lblBack = new javax.swing.JLabel();
        psetting = new javax.swing.JPanel();
        lblsetting = new javax.swing.JLabel();
        psubmenu = new javax.swing.JPanel();
        pnavigationheader = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        paddCustomer = new javax.swing.JPanel();
        lblAddCustomer = new javax.swing.JLabel();
        pviewCustomer = new javax.swing.JPanel();
        lblViewCustomer = new javax.swing.JLabel();
        pmain = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnavigation.setBackground(new java.awt.Color(204, 204, 204));
        pnavigation.setPreferredSize(new java.awt.Dimension(240, 510));
        pnavigation.setLayout(new java.awt.BorderLayout());

        psubnavigation.setBackground(new java.awt.Color(102, 102, 102));
        psubnavigation.setPreferredSize(new java.awt.Dimension(50, 510));
        psubnavigation.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pback.setBackground(new java.awt.Color(102, 102, 102));
        pback.setPreferredSize(new java.awt.Dimension(50, 50));

        lblBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/bw.png"))); // NOI18N
        lblBack.setPreferredSize(new java.awt.Dimension(50, 50));
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBackMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pbackLayout = new javax.swing.GroupLayout(pback);
        pback.setLayout(pbackLayout);
        pbackLayout.setHorizontalGroup(
            pbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pbackLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pbackLayout.setVerticalGroup(
            pbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pbackLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        psubnavigation.add(pback, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        psetting.setBackground(new java.awt.Color(102, 102, 102));
        psetting.setPreferredSize(new java.awt.Dimension(50, 50));

        lblsetting.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblsetting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/icons8-sync_settings.png"))); // NOI18N
        lblsetting.setPreferredSize(new java.awt.Dimension(50, 50));
        lblsetting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblsettingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblsettingMouseExited(evt);
            }
        });

        javax.swing.GroupLayout psettingLayout = new javax.swing.GroupLayout(psetting);
        psetting.setLayout(psettingLayout);
        psettingLayout.setHorizontalGroup(
            psettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, psettingLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblsetting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        psettingLayout.setVerticalGroup(
            psettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, psettingLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblsetting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        psubnavigation.add(psetting, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 50, 50));

        pnavigation.add(psubnavigation, java.awt.BorderLayout.LINE_START);

        psubmenu.setForeground(new java.awt.Color(204, 204, 204));
        psubmenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnavigationheader.setBackground(new java.awt.Color(0, 102, 102));
        pnavigationheader.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/cus.png"))); // NOI18N
        jLabel1.setText("SRU TEAM");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel1.setPreferredSize(new java.awt.Dimension(150, 25));
        jLabel1.setSize(new java.awt.Dimension(100, 17));
        pnavigationheader.add(jLabel1, java.awt.BorderLayout.LINE_START);

        psubmenu.add(pnavigationheader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 190, 40));
        psubmenu.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 53, 190, 10));

        paddCustomer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAddCustomer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddCustomer.setText("Add Customer");
        lblAddCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAddCustomerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAddCustomerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAddCustomerMouseExited(evt);
            }
        });
        paddCustomer.add(lblAddCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -3, 170, 30));

        psubmenu.add(paddCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 190, 30));

        pviewCustomer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblViewCustomer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblViewCustomer.setText("View Customer");
        lblViewCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblViewCustomerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblViewCustomerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblViewCustomerMouseExited(evt);
            }
        });
        pviewCustomer.add(lblViewCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -3, 170, 30));

        psubmenu.add(pviewCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 190, 30));

        pnavigation.add(psubmenu, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnavigation, java.awt.BorderLayout.LINE_START);

        pmain.setBackground(new java.awt.Color(255, 255, 255));
        pmain.setLayout(new java.awt.BorderLayout());
        getContentPane().add(pmain, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(806, 586));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseEntered
        // TODO add your handling code here:
        pback.setBackground(hover);
    }//GEN-LAST:event_lblBackMouseEntered

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        // TODO add your handling code here:

        pback.setBackground(click);
        if(hide == true){
            Icon icon = new ImageIcon(getClass().getResource("/ICON/fw.png"));
            lblBack.setIcon(icon);
            this.pnavigation.setPreferredSize(new Dimension(50,pnavigation.getHeight()));
            SwingUtilities.updateComponentTreeUI(this);
            hide = false;

        }
        else{
            Icon icon = new ImageIcon(getClass().getResource("/ICON/bw.png"));
            lblBack.setIcon(icon);
            pnavigation.setPreferredSize(new Dimension(240,pnavigation.getHeight()));
            SwingUtilities.updateComponentTreeUI(this);
            hide = true;
        }
    }//GEN-LAST:event_lblBackMouseClicked

    private void lblBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseExited
        // TODO add your handling code here:
        pback.setBackground(exit);
        
    }//GEN-LAST:event_lblBackMouseExited

    private void lblsettingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblsettingMouseEntered
        // TODO add your handling code here:
        psetting.setBackground(hover);
    }//GEN-LAST:event_lblsettingMouseEntered

    private void lblsettingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblsettingMouseExited
        // TODO add your handling code here:
        psetting.setBackground(exit);
    }//GEN-LAST:event_lblsettingMouseExited

    private void lblAddCustomerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddCustomerMouseEntered
        // TODO add your handling code here:
        this.paddCustomer.setBackground(hover);
        
    }//GEN-LAST:event_lblAddCustomerMouseEntered

    private void lblAddCustomerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddCustomerMouseExited
        // TODO add your handling code here:
        this.paddCustomer.setBackground(this.psubmenu.getBackground());
    }//GEN-LAST:event_lblAddCustomerMouseExited

    private void lblViewCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViewCustomerMouseClicked
        // TODO add your handling code here:
       db = input.getAllCus();          
       v.setDB(db);
       v.ShowData(db.getAllCustomer());

        
        pmain.removeAll();
        
        pmain.add(v);
        pmain.validate();
        pmain.repaint();
        
        
    }//GEN-LAST:event_lblViewCustomerMouseClicked

    private void lblViewCustomerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViewCustomerMouseEntered
        // TODO add your handling code here:
        this.pviewCustomer.setBackground(hover);
    }//GEN-LAST:event_lblViewCustomerMouseEntered

    private void lblViewCustomerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViewCustomerMouseExited
        // TODO add your handling code here:
        this.pviewCustomer.setBackground(this.psubmenu.getBackground());
    }//GEN-LAST:event_lblViewCustomerMouseExited

    private void lblAddCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddCustomerMouseClicked
        // TODO add your handling code here:
        input.setDBMS(db);
        
        pmain.removeAll();
        pmain.add(input);
        pmain.validate();
        pmain.repaint();
        
    }//GEN-LAST:event_lblAddCustomerMouseClicked
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmNaviga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmNaviga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmNaviga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmNaviga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new frmNaviga().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAddCustomer;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblViewCustomer;
    private javax.swing.JLabel lblsetting;
    private javax.swing.JPanel paddCustomer;
    private javax.swing.JPanel pback;
    private javax.swing.JPanel pmain;
    private javax.swing.JPanel pnavigation;
    private javax.swing.JPanel pnavigationheader;
    private javax.swing.JPanel psetting;
    private javax.swing.JPanel psubmenu;
    private javax.swing.JPanel psubnavigation;
    private javax.swing.JPanel pviewCustomer;
    // End of variables declaration//GEN-END:variables
}