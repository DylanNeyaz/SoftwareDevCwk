/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwaredevcoursework;

import java.awt.Color;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.Date;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.jdbc.JDBCCategoryDataset;

/**
 *
 * @author theod
 */
public class MainScreenAdmin extends javax.swing.JFrame {
    
    ChartFrame frame;

    /**
     * Creates new form MainScreen
     */
    public MainScreenAdmin() {
        initComponents();

    }

    public MainScreenAdmin(String userEmail) {
        initComponents();
        userEmailMain.setText(userEmail);
        showData();

    }
    
     public void drawPie() {
        Connection connection = TrafficDatabaseConnect.getConnection();
        Statement stmt = null;
        JDBCCategoryDataset dataset = null;

       
        try {
            /**
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from employee limit 6");
            
            int n = 0;
            while (rs.next()) {
                int numColumns = rs.getMetaData().getColumnCount();
                n++;
                for (int i = 1; i <= numColumns; i++) {
                    System.out.print(" " + rs.getObject(i));
                }

                System.out.println("");
            }

            rs.close();
            */

            String sql = "SELECT countPointId, count(*) As Number_Of FROM vehicleType GROUP BY allMotorVehicles ";

            dataset = new JDBCCategoryDataset(connection, sql);

            System.out.println("dataset cols and rows : " + dataset.getColumnCount() + "  " + dataset.getRowCount());
            
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    System.err.println("SQLException: " + e.getMessage());
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    System.err.println("SQLException: " + e.getMessage());
                }
            }
        }
        JFreeChart chart = ChartFactory.createBarChart("Volume of Vehicle at Count Point: ",
                "Vehicle Type", "Volume", dataset, PlotOrientation.VERTICAL, false, true, false);
        chart.setBackgroundPaint(Color.white);
        chart.getTitle().setPaint(Color.blue);

        CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.blue);
        BarRenderer renderer = (BarRenderer) p.getRenderer();
        renderer.setDrawBarOutline(true);
        renderer.setShadowVisible(true);
        renderer.setItemMargin(-4);
        renderer.setSeriesPaint(0, Color.blue);

        frame = new ChartFrame("Vehicle Volume", chart);
        frame.setVisible(true);
        frame.setSize(400, 350);
       

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        signOut = new javax.swing.JButton();
        userEmailMain = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        updateTable = new javax.swing.JButton();
        fourthChartButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        signOut.setText("Sign Out");
        signOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signOutActionPerformed(evt);
            }
        });

        userEmailMain.setText("jLabel1");

        jTable1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "E-mail", "Login Time", "Logout Time"
            }
        ));
        jTable1.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTable1.setRowHeight(35);
        jScrollPane1.setViewportView(jTable1);

        updateTable.setText("Update");
        updateTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateTableActionPerformed(evt);
            }
        });

        fourthChartButton.setText("FourthChart");
        fourthChartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourthChartButtonActionPerformed(evt);
            }
        });

        jButton2.setText("Bar Chart");

        jButton3.setText("Line Chart");

        jButton4.setText("Admin Panel");

        jButton5.setText("Pie Chart");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PieChartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fourthChartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(userEmailMain)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(signOut)
                        .addGap(22, 22, 22))))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(updateTable, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 873, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fourthChartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(userEmailMain)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(signOut)))
                .addGap(1, 1, 1)
                .addComponent(updateTable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signOutActionPerformed
        JOptionPane.showMessageDialog(this, "You are now signed out. Redirecting to Sign in page!");

        Date date = new Date();
        long time = date.getTime();
        Timestamp LogoutTime = new Timestamp(time);
        String userEmail1 = userEmailMain.getText();
        userActivityTable.update(userEmail1, LogoutTime);

        SignIn signin = new SignIn();
        signin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_signOutActionPerformed

    private void fourthChartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourthChartButtonActionPerformed
        

    }//GEN-LAST:event_fourthChartButtonActionPerformed

    private void updateTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateTableActionPerformed
        String urlSQLite = "jdbc:sqlite:CustomerDatabase.db";
        Connection connection = null;

        try {

            Driver driverSQLite = new org.sqlite.JDBC();
            DriverManager.registerDriver(driverSQLite);
            System.out.println("SQLite Driver loaded up successfuly!");
            Connection con = DriverManager.getConnection(urlSQLite);
            System.out.println("Connected to the database!");

            Statement st = con.createStatement();
            String sql = "SELECT * FROM userActivity";
            ResultSet resultSet2 = st.executeQuery(sql);

            while (resultSet2.next()) {
                String userEmail = resultSet2.getString("userEmail");

                String loginTime = resultSet2.getString("loginTime");
                String logoutTime = resultSet2.getString("logoutTime");

                String DBdata[] = {userEmail, loginTime, logoutTime};
                DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();

                tblModel.addRow(DBdata);

            }

            connection.close();

        } catch (Exception ex) {
            System.out.println("Error " + ex.getMessage());
        }
    }//GEN-LAST:event_updateTableActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        JOptionPane.showMessageDialog(this,"You will be automatically signed out!");

        Date date = new Date();
        long time = date.getTime();
        java.sql.Timestamp LogoutTime = new java.sql.Timestamp(time);
        String userEmail1 = userEmailMain.getText();
        userActivityTable.update(userEmail1, LogoutTime);
    }//GEN-LAST:event_formWindowClosing

    private void PieChartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PieChartActionPerformed
        drawPie();
    }//GEN-LAST:event_PieChartActionPerformed

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
            java.util.logging.Logger.getLogger(MainScreenAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreenAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreenAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreenAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreenAdmin().setVisible(true);
            }
        });

    }
    
    public void showData(){
        String urlSQLite = "jdbc:sqlite:CustomerDatabase.db";
        Connection connection = null;

        try {

            Driver driverSQLite = new org.sqlite.JDBC();
            DriverManager.registerDriver(driverSQLite);
            System.out.println("SQLite Driver loaded up successfuly!");
            Connection con = DriverManager.getConnection(urlSQLite);
            System.out.println("Connected to the database!");

            Statement st = con.createStatement();
            String sql = "SELECT * FROM userActivity";
            ResultSet resultSet2 = st.executeQuery(sql);

            while (resultSet2.next()) {
                String userEmail = resultSet2.getString("userEmail");

                String loginTime = resultSet2.getString("loginTime");
                String logoutTime = resultSet2.getString("logoutTime");

                String DBdata[] = {userEmail, loginTime, logoutTime};
                DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();

                tblModel.addRow(DBdata);

            }

            connection.close();

        } catch (Exception ex) {
            System.out.println("Error " + ex.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fourthChartButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton signOut;
    private javax.swing.JButton updateTable;
    private javax.swing.JLabel userEmailMain;
    // End of variables declaration//GEN-END:variables
}
