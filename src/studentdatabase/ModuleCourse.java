/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdatabase;
import java.sql.*;


/**
 *
 * @author IceFox
 */
public class ModuleCourse extends javax.swing.JFrame {
       String url = "jdbc:mysql://127.0.0.1:3306/";
       String dbName = "studentresultdb";
       String driver = "com.mysql.jdbc.Driver";
       String userName = "root";
       String password = "root";
    /**
     * Creates new form ModuleCourse
     */
    public ModuleCourse() {
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

        jButton2 = new javax.swing.JButton();
        SMod = new javax.swing.JButton();
        CMod = new javax.swing.JTextField();
        CorMod = new java.awt.List();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        SMod.setText("Search Modules");
        SMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SModActionPerformed(evt);
            }
        });
        getContentPane().add(SMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 11, -1, -1));

        CMod.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CMod.setText("Enter Course ID....");
        getContentPane().add(CMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 12, 202, -1));

        CorMod.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        CorMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorModActionPerformed(evt);
            }
        });
        getContentPane().add(CorMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 629, 448));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Course ID ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 80, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentdatabase/267760-cool-background-images-1920x1200.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SModActionPerformed
        
        CorMod.clear();
        
        try {
            // load the driver into memory
            Class.forName(driver).newInstance();
            // create a connection. The first command line parameter is assumed to
            // be the MDB file in which data tables are held
            System.out.println("Connecting to the Database " + dbName + "....");
            Connection conn = DriverManager.getConnection(url + dbName, userName, password);
            System.out.println("Database Connection Successful");
            String sql = "SELECT * FROM module INNER JOIN coursemodule on Module.ModuleID = coursemodule.ModuleID Where coursemodule.CourseID = ?";


            PreparedStatement prest = conn.prepareStatement(sql);

            // replacing the ? with the Title

            prest.setString(1, CMod.getText());
            ResultSet rs = prest.executeQuery();
            while (rs.next()) {
                // Adding requested data to the listbox in a side by side order
                CorMod.add(("ModuleID= "+ rs.getObject(1)+ "   ") +("" + rs.getObject(2)+"   "));
            }

            // execute a query

            // close the objects
            rs.close();
            prest.close();
            conn.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_SModActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void CorModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorModActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CorModActionPerformed

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
            java.util.logging.Logger.getLogger(ModuleCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModuleCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModuleCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModuleCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModuleCourse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CMod;
    private java.awt.List CorMod;
    private javax.swing.JButton SMod;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
