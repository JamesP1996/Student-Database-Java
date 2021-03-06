/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdatabase;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author IceFox
 */
public class Link extends javax.swing.JFrame {
       String url = "jdbc:mysql://127.0.0.1:3306/";
       String dbName = "studentresultdb";
       String driver = "com.mysql.jdbc.Driver";
       String userName = "root";
       String password = "root";
    /**
     * Creates new form Link
     */
    public Link() {
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
        unlinkbt = new javax.swing.JButton();
        CID = new javax.swing.JTextField();
        MID = new javax.swing.JTextField();
        Linkbt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ListB = new java.awt.List();
        listA = new java.awt.List();
        ModBT = new javax.swing.JButton();
        CorBT = new javax.swing.JButton();
        closebt = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        unlinkbt.setText("Un-Link");
        unlinkbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unlinkbtActionPerformed(evt);
            }
        });
        getContentPane().add(unlinkbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, -1, 40));
        getContentPane().add(CID, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 89, 77, -1));

        MID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIDActionPerformed(evt);
            }
        });
        getContentPane().add(MID, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 63, 77, -1));

        Linkbt.setText("Link");
        Linkbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LinkbtActionPerformed(evt);
            }
        });
        getContentPane().add(Linkbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 124, 36));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ModuleID :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 66, 68, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CourseID:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 89, 68, -1));
        getContentPane().add(ListB, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 20, 196, 232));
        getContentPane().add(listA, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 20, 196, 232));

        ModBT.setText("See all Modules");
        ModBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModBTActionPerformed(evt);
            }
        });
        getContentPane().add(ModBT, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 262, -1, -1));

        CorBT.setText("See all Courses");
        CorBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorBTActionPerformed(evt);
            }
        });
        getContentPane().add(CorBT, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 262, -1, -1));

        closebt.setText("Close");
        closebt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closebtActionPerformed(evt);
            }
        });
        getContentPane().add(closebt, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 203, -1, -1));

        jButton1.setText("See Modules in a Course");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 174, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentdatabase/267760-cool-background-images-1920x1200.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 700, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MIDActionPerformed

    private void LinkbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LinkbtActionPerformed
        
        try {
            Class.forName(driver).newInstance();

            System.out.println("Connecting to the Database " + dbName + "....");
            Connection conn = DriverManager.getConnection(url + dbName, userName, password);
            System.out.println("Database Connection Successful");

            String sql = "INSERT INTO coursemodule Values (?,?)";
            PreparedStatement prest = conn.prepareStatement(sql);
            prest.setString(1, MID.getText());
            prest.setString(2, CID.getText());
            prest.executeUpdate();
            
 
            prest.close();
            conn.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "This  Module and Course are already Linked "
                    + "Or your Entry is Invalid");
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_LinkbtActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
      
       
    }//GEN-LAST:event_formWindowActivated

    private void ModBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModBTActionPerformed
        try {
              listA.clear();
            // load the driver into memory
            Class.forName(driver).newInstance();
            // create a connection. The first command line parameter is assumed to
            // be the MDB file in which data tables are held
            System.out.println("Connecting to the Database " + dbName + "....");
            Connection conn = DriverManager.getConnection(url + dbName, userName, password);
            System.out.println("Database Connection Successful");
           


            Statement stmt = conn.createStatement();

            // replacing the ? with the Title

            
            ResultSet rs = stmt.executeQuery("Select * From Module");
            while (rs.next()) {
                // Adding requested data to the listbox in a side by side order
                listA.add(("Module ID = "+ rs.getObject(1)+ "   ") +(" Module Name = " + rs.getObject(2)+"   "));
            }

            // execute a query

            // close the objects
            rs.close();
            stmt.close();
            conn.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_ModBTActionPerformed

    private void CorBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorBTActionPerformed
        
         try {
              ListB.clear();
            // load the driver into memory
            Class.forName(driver).newInstance();
            // create a connection. The first command line parameter is assumed to
            // be the MDB file in which data tables are held
            System.out.println("Connecting to the Database " + dbName + "....");
            Connection conn = DriverManager.getConnection(url + dbName, userName, password);
            System.out.println("Database Connection Successful");
           


            Statement stmt = conn.createStatement();

            // replacing the ? with the Title

            
            ResultSet rs = stmt.executeQuery("Select * From Course");
            while (rs.next()) {
                // Adding requested data to the listbox in a side by side order
                ListB.add(("Course ID = "+ rs.getObject(1)+ "   ") +(" Course Name = " + rs.getObject(2)+"   "));
            }

            // execute a query

            // close the objects
            rs.close();
            stmt.close();
            conn.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_CorBTActionPerformed

    private void closebtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closebtActionPerformed
        dispose();
    }//GEN-LAST:event_closebtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ModuleCourse MC = new ModuleCourse();
        MC.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void unlinkbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unlinkbtActionPerformed
         try {
            Class.forName(driver).newInstance();

            System.out.println("Connecting to the Database " + dbName + "....");
            Connection conn = DriverManager.getConnection(url + dbName, userName, password);
            System.out.println("Database Connection Successful");

            String sql = "DELETE FROM coursemodule WHERE ModuleID = ? AND CourseID = ? ";
            PreparedStatement prest = conn.prepareStatement(sql);
            prest.setString(1, MID.getText());
            prest.setString(2, CID.getText());
            prest.executeUpdate();
            
 
            prest.close();
            conn.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "This  Module and Course are already UN-Linked "
                    + "Or your Entry is Invalid");
            e.printStackTrace();
        }
    }//GEN-LAST:event_unlinkbtActionPerformed

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
            java.util.logging.Logger.getLogger(Link.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Link.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Link.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Link.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Link().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CID;
    private javax.swing.JButton CorBT;
    private javax.swing.JButton Linkbt;
    private java.awt.List ListB;
    private javax.swing.JTextField MID;
    private javax.swing.JButton ModBT;
    private javax.swing.JButton closebt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private java.awt.List listA;
    private javax.swing.JButton unlinkbt;
    // End of variables declaration//GEN-END:variables
}
