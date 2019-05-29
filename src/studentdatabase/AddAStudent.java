/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdatabase;

import java.sql.*;
import javax.swing.JOptionPane;
import java.util.Date;
import javax.swing.JTextField;

/**
 *
 * @author IceFox
 */
public class AddAStudent extends javax.swing.JFrame {
       String url = "jdbc:mysql://127.0.0.1:3306/";
       String dbName = "studentresultdb";
       String driver = "com.mysql.jdbc.Driver";
       String userName = "root";
       String password = "root";
       
       
       
       
       
    /**
     * Creates new form AddAStudent
     */
    public AddAStudent() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        SID = new javax.swing.JTextField();
        SName = new javax.swing.JTextField();
        SAddress = new javax.swing.JTextField();
        SPhone = new javax.swing.JTextField();
        SClass = new javax.swing.JTextField();
        SCourse = new javax.swing.JTextField();
        AddBT = new javax.swing.JButton();
        CloseBT = new javax.swing.JButton();
        DeleteBT = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        SearchBT = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        DOBTF = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Student ID:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 24, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText(" Name:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 53, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Address:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 79, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Date of Birth:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 105, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Phone:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 131, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Class Group:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 157, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Course Enlisted To:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 184, -1, 20));

        SID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SIDActionPerformed(evt);
            }
        });
        SID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SIDKeyTyped(evt);
            }
        });
        getContentPane().add(SID, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 21, 168, -1));

        SName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SNameKeyTyped(evt);
            }
        });
        getContentPane().add(SName, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 53, 168, -1));
        getContentPane().add(SAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 79, 168, -1));

        SPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SPhoneKeyTyped(evt);
            }
        });
        getContentPane().add(SPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 131, 168, -1));
        getContentPane().add(SClass, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 157, 168, -1));
        getContentPane().add(SCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 183, 168, -1));

        AddBT.setText("Add Student");
        AddBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBTActionPerformed(evt);
            }
        });
        getContentPane().add(AddBT, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 214, -1, 30));

        CloseBT.setText("Close");
        CloseBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseBTActionPerformed(evt);
            }
        });
        getContentPane().add(CloseBT, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 214, -1, 30));

        DeleteBT.setText("Delete Student");
        DeleteBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBTActionPerformed(evt);
            }
        });
        getContentPane().add(DeleteBT, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 15, 117, 32));

        jLabel8.setText("by ID");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, -1, -1));

        SearchBT.setText("Search a Student");
        SearchBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBTActionPerformed(evt);
            }
        });
        getContentPane().add(SearchBT, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 150, 32));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 102, -1, -1));

        try {
            DOBTF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(DOBTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 102, 168, -1));

        jLabel9.setText("(DD/MM/YYYY)");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 105, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentdatabase/Blue-Abstract-Background-Design.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -7, 460, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CloseBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseBTActionPerformed
        dispose();
    }//GEN-LAST:event_CloseBTActionPerformed

    private void SearchBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBTActionPerformed
        SearchStudent S = new SearchStudent();
        S.setVisible(true);
    }//GEN-LAST:event_SearchBTActionPerformed
     
    private void AddBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBTActionPerformed
       
        
        try {
            Class.forName(driver).newInstance();

            System.out.println("Connecting to the Database " + dbName + "....");
            Connection conn = DriverManager.getConnection(url + dbName, userName, password);
            System.out.println("Database Connection Successful");

            String sql = "INSERT INTO Student Values (?,?,?,?,?,?,?)";
            PreparedStatement prest = conn.prepareStatement(sql);
            prest.setString(1, SID.getText());
            prest.setString(2, SName.getText());
            prest.setString(3, SAddress.getText());
                      
            prest.setString(4, DOBTF.getText());
            prest.setString(5, SPhone.getText());
            prest.setString(6, SClass.getText());
            prest.setString(7, SCourse.getText());
            prest.executeUpdate();
            JOptionPane.showMessageDialog(null, "New Student Added");
            
 
            prest.close();
            conn.close();

        } catch (Exception e) {
            
            e.printStackTrace();
        }
        
        
    }//GEN-LAST:event_AddBTActionPerformed

    private void DeleteBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBTActionPerformed
         try {
            Class.forName(driver).newInstance();

            System.out.println("Connecting to the Database " + dbName + "....");
            Connection conn = DriverManager.getConnection(url + dbName, userName, password);
            System.out.println("Database Connection Successful");

            String sql = "Delete From Student Where StudentID = (?)";
            PreparedStatement prest = conn.prepareStatement(sql);
            prest.setString(1, SID.getText());
            
            prest.executeUpdate();
            JOptionPane.showMessageDialog(null,"You Deleted StudentID : " + SID.getText());
            
 
            prest.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
            
        }


    }//GEN-LAST:event_DeleteBTActionPerformed

    private void SIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SIDKeyTyped
        char chartyped = evt.getKeyChar();
        if(!(Character.isDigit(chartyped)||Character.isISOControl(chartyped))){
        evt.consume();
        }
            if (SID.getText().length()>8){
            evt.consume();
            }
            
    }//GEN-LAST:event_SIDKeyTyped

    private void SNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SNameKeyTyped
        char chartyped = evt.getKeyChar();
        if(!(Character.isAlphabetic(chartyped)||Character.isISOControl(chartyped)||Character.isSpace(chartyped)))
            evt.consume();
    }//GEN-LAST:event_SNameKeyTyped

    private void SPhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SPhoneKeyTyped
        char chartyped = evt.getKeyChar();
        if(!(Character.isDigit(chartyped)||Character.isISOControl(chartyped))){
        evt.consume();
        }
            if (SPhone.getText().length()>12){
            evt.consume();
            }
            
    }//GEN-LAST:event_SPhoneKeyTyped

    private void SIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SIDActionPerformed

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
            java.util.logging.Logger.getLogger(AddAStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddAStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddAStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddAStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddAStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBT;
    private javax.swing.JButton CloseBT;
    private javax.swing.JFormattedTextField DOBTF;
    private javax.swing.JButton DeleteBT;
    private javax.swing.JTextField SAddress;
    private javax.swing.JTextField SClass;
    private javax.swing.JTextField SCourse;
    private javax.swing.JTextField SID;
    private javax.swing.JTextField SName;
    private javax.swing.JTextField SPhone;
    private javax.swing.JButton SearchBT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
