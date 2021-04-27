/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwaredevcoursework;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author theod
 */
public class MainScreenUser extends javax.swing.JFrame {
    
    


    /**
     * Creates new form MainScreenUser
     */
    public MainScreenUser() {
        initComponents();
    }
    
    public MainScreenUser(String userEmail){
        initComponents();
        userEmailMain.setText(userEmail);
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barChartButton = new javax.swing.JButton();
        lineChartButton = new javax.swing.JButton();
        pieChartButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        userEmailMain = new javax.swing.JLabel();
        signOut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        barChartButton.setText("Bar Chart");
        barChartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barChartButtonActionPerformed(evt);
            }
        });

        lineChartButton.setText("Line Chart");
        lineChartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lineChartButtonActionPerformed(evt);
            }
        });

        pieChartButton.setText("Pie Chart");
        pieChartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pieChartButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Fourth Chart");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        userEmailMain.setText("jLabel1");

        signOut.setText("Sign Out");
        signOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(barChartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lineChartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pieChartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(userEmailMain)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(signOut)
                        .addGap(14, 14, 14))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(barChartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lineChartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pieChartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(userEmailMain)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(signOut)))
                .addContainerGap(366, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signOutActionPerformed
        JOptionPane.showMessageDialog(this,"You are now signed out. Redirecting to Sign in page!");

        Date date = new Date();
        long time = date.getTime();
        java.sql.Timestamp LogoutTime = new java.sql.Timestamp(time);
        String userEmail1 = userEmailMain.getText();
        userActivityTable.update(userEmail1, LogoutTime);
        


        SignIn signin = new SignIn();
        signin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_signOutActionPerformed

    private void barChartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barChartButtonActionPerformed
        BarChartDashboard barchart = new BarChartDashboard();
        barchart.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_barChartButtonActionPerformed

    private void lineChartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lineChartButtonActionPerformed
        LineChartDashboard linechart = new LineChartDashboard();
        linechart.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lineChartButtonActionPerformed

    private void pieChartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pieChartButtonActionPerformed
        PieChartDashboard piechart = new PieChartDashboard();
        piechart.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_pieChartButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FourthChartDashboard fourthchart = new FourthChartDashboard();
        fourthchart.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        JOptionPane.showMessageDialog(this,"You will be automatically signed out!");

        Date date = new Date();
        long time = date.getTime();
        java.sql.Timestamp LogoutTime = new java.sql.Timestamp(time);
        String userEmail1 = userEmailMain.getText();
        userActivityTable.update(userEmail1, LogoutTime);
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(MainScreenUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreenUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreenUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreenUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreenUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton barChartButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton lineChartButton;
    private javax.swing.JButton pieChartButton;
    private javax.swing.JButton signOut;
    private javax.swing.JLabel userEmailMain;
    // End of variables declaration//GEN-END:variables
}
