/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DB.DB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Pubudu Tennakoon
 */
public class Change_Password_GUI extends javax.swing.JFrame {

    /**
     * Creates new form Change_Password_GUI
     */
    public Change_Password_GUI() {
        initComponents();
        setResizable(false);
        
        try
        {
             String us="";
           
            Connection con = DB.myCon();
                Statement S = con.createStatement();
                ResultSet rs = S.executeQuery("SELECT username FROM user WHERE statues='Logged In'");
                
                if(rs.next())
                {
                    us=rs.getString("username");
                    dispalyuser.setText(""+us);
     
                }
                
                
        }
        catch(Exception e)
                {
                    JOptionPane.showMessageDialog(this, ""+e.getMessage()+" Error,!","",JOptionPane.ERROR_MESSAGE);
                }
        
       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        dispalyuser = new javax.swing.JLabel();
        oldpwd = new javax.swing.JPasswordField();
        newpwd = new javax.swing.JPasswordField();
        newpwdverify = new javax.swing.JPasswordField();
        back = new javax.swing.JButton();
        submit = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Change Password");

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Library Management System", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 24))); // NOI18N

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Change Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Enter Old Password");
        jLabel3.setBounds(60, 130, 120, 14);
        jLayeredPane2.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setText("User Name");
        jLabel1.setBounds(60, 70, 90, 20);
        jLayeredPane2.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dispalyuser.setBounds(210, 70, 160, 20);
        jLayeredPane2.add(dispalyuser, javax.swing.JLayeredPane.DEFAULT_LAYER);
        oldpwd.setBounds(210, 130, 210, 20);
        jLayeredPane2.add(oldpwd, javax.swing.JLayeredPane.DEFAULT_LAYER);
        newpwd.setBounds(210, 180, 210, 20);
        jLayeredPane2.add(newpwd, javax.swing.JLayeredPane.DEFAULT_LAYER);

        newpwdverify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newpwdverifyActionPerformed(evt);
            }
        });
        newpwdverify.setBounds(210, 230, 210, 20);
        jLayeredPane2.add(newpwdverify, javax.swing.JLayeredPane.DEFAULT_LAYER);

        back.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/back1.png"))); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        back.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                backPropertyChange(evt);
            }
        });
        back.setBounds(480, 190, 100, 30);
        jLayeredPane2.add(back, javax.swing.JLayeredPane.DEFAULT_LAYER);

        submit.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        submit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/ok.png"))); // NOI18N
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        submit.setBounds(330, 300, 110, 30);
        jLayeredPane2.add(submit, javax.swing.JLayeredPane.DEFAULT_LAYER);

        reset.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/reset.gif"))); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        reset.setBounds(190, 300, 110, 30);
        jLayeredPane2.add(reset, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Verify new Password");
        jLabel2.setBounds(60, 230, 120, 14);
        jLayeredPane2.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Enter New Password");
        jLabel4.setBounds(60, 180, 120, 20);
        jLayeredPane2.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane2.setBounds(80, 50, 610, 410);
        jLayeredPane1.add(jLayeredPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/title ori.jpg"))); // NOI18N

        jMenu2.setText("Navigate");

        jMenuItem8.setText("Home");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuItem2.setText("Manage Members");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Manage Books");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Manage Book Lending");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Manage Inventory");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("Manage Newspaper Reocords");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem7.setText("Manage User Accounts");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jLayeredPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-816)/2, (screenSize.height-638)/2, 816, 638);
    }// </editor-fold>//GEN-END:initComponents

    private void newpwdverifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newpwdverifyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newpwdverifyActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
         oldpwd.setText("");
                         newpwd.setText("");
                         newpwdverify.setText("");
    }//GEN-LAST:event_resetActionPerformed

    private void backPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_backPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_backPropertyChange

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        try
        {
                String password = new String (oldpwd.getPassword());
                String npassword1 = new String (newpwd.getPassword());
                String npassword2 = new String (newpwdverify.getPassword());
             if (password.equals("") || npassword1.equals("")||npassword2.equals("")) 
            {
              JOptionPane.showMessageDialog(this, "Please fill in all fields ", "",JOptionPane.WARNING_MESSAGE);
            }
            else
             {
            
            
            String us="";
            String temp1="";
            Connection con = DB.myCon();
                Statement S = con.createStatement();
                ResultSet rs = S.executeQuery("SELECT username FROM user WHERE statues='Logged In'");
                
                if(rs.next())
                {
                    us=rs.getString("username");
                        
                }
                
                
                    ResultSet rs1 = S.executeQuery("SELECT password FROM user WHERE username='"+us+"'");
                
                        if(rs1.next())
                        {
                                temp1=rs1.getString("password");
                                
                        }
                 if(password.equals(temp1))
                 {
                     if(npassword1.equals(npassword2) )
                     {
                         String query1=  "UPDATE user SET password = '"+npassword1+"' WHERE username = '"+us+"'";
                         S.executeUpdate(query1);
                         JOptionPane.showMessageDialog(this,"Password changed Successfully");
                         
                         oldpwd.setText("");
                         newpwd.setText("");
                         newpwdverify.setText("");
                     }
                     else
                     {
                          JOptionPane.showMessageDialog(this,"Password Verification not matched","",JOptionPane.WARNING_MESSAGE);
                     }
                     
                 }
                 else
                 {
                      JOptionPane.showMessageDialog(this,"Enter the correct old password","",JOptionPane.WARNING_MESSAGE);
                 }
                        
        }
        }
        catch (Exception e) {
                    JOptionPane.showMessageDialog(this, ""+e.getMessage()+" Error,!","",JOptionPane.ERROR_MESSAGE);
                }
    
    }//GEN-LAST:event_submitActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        new Home_GUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new Manage_Members_GUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        new Manage_Books_GUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        new Manage_Book_Lending().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        new Manage_Inventory_GUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        new Manage_Newspaper_GUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        new Manage_User_GUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        new Manage_User_GUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Change_Password_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Change_Password_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Change_Password_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Change_Password_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Change_Password_GUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel dispalyuser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPasswordField newpwd;
    private javax.swing.JPasswordField newpwdverify;
    private javax.swing.JPasswordField oldpwd;
    private javax.swing.JButton reset;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
private void setUser()
{
    try
    {
     String username="";
           
            Connection con = DB.myCon();
                Statement S = con.createStatement();
                ResultSet rs = S.executeQuery("SELECT UserName FROM user WHERE statues='Logged In'");
                
                if(rs.next())
                {
                    username=rs.getString("UserName");
    
                }
                
                dispalyuser.setText(username);
                
    }
    catch (Exception e) {
                    JOptionPane.showMessageDialog(this, ""+e.getMessage()+" Error,!","",JOptionPane.OK_OPTION);
                }
}

}
