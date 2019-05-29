/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdatabase;

/**
 *
 * @author IceFox
 */
public class Select extends javax.swing.JFrame {

    /**
     * Creates new form Select
     */
    public Select() {
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

        AdminBT = new javax.swing.JButton();
        TeacherBT = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AdminBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentdatabase/AdminButton.jpg"))); // NOI18N
        AdminBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminBTActionPerformed(evt);
            }
        });
        getContentPane().add(AdminBT, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 47, 163, 219));

        TeacherBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentdatabase/TeacherButton.jpg"))); // NOI18N
        TeacherBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeacherBTActionPerformed(evt);
            }
        });
        getContentPane().add(TeacherBT, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 47, 163, 219));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentdatabase/Background.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 400, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdminBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminBTActionPerformed
        // Username = AdminQQI Password = GTIAdmin
        
        AdminLogin A = new AdminLogin();
         
         A.setVisible(true);
    }//GEN-LAST:event_AdminBTActionPerformed

    private void TeacherBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeacherBTActionPerformed
        // Username = TeacherQQI Password = GTITeacher
        
        TeacherLogin T = new TeacherLogin();
       
        T.setVisible(true);
    }//GEN-LAST:event_TeacherBTActionPerformed

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
            java.util.logging.Logger.getLogger(Select.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Select.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Select.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Select.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Select().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdminBT;
    private javax.swing.JButton TeacherBT;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
