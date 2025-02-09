/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package systemmanagement;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author test
 */
public class registeredStudent extends javax.swing.JFrame {

    static setVisible setVisible;

    /**
     * Creates new form temp_adminHome
     */
    public registeredStudent() {
        initComponents();
         setLocation(310,160);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel2 = new java.awt.Panel();
        jLabel2 = new javax.swing.JLabel();
        back1 = new javax.swing.JButton();
        addNewStudent = new javax.swing.JButton();
        addStudentResult = new javax.swing.JButton();
        registeredStudent = new javax.swing.JButton();
        allStudentResult = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setSize(new java.awt.Dimension(40, 10));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        panel2.setBackground(new java.awt.Color(219, 253, 218));

        jLabel2.setFont(new java.awt.Font("K2D", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Admin Portal");

        back1.setBackground(new java.awt.Color(102, 102, 255));
        back1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        back1.setForeground(new java.awt.Color(255, 255, 255));
        back1.setText("Back");
        back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back1ActionPerformed(evt);
            }
        });

        addNewStudent.setBackground(new java.awt.Color(0, 51, 51));
        addNewStudent.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        addNewStudent.setForeground(java.awt.SystemColor.textHighlight);
        addNewStudent.setText("Add New Student");
        addNewStudent.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        addNewStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewStudentActionPerformed(evt);
            }
        });

        addStudentResult.setBackground(new java.awt.Color(0, 51, 51));
        addStudentResult.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        addStudentResult.setForeground(java.awt.SystemColor.textHighlight);
        addStudentResult.setText("Add Student Result");
        addStudentResult.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        addStudentResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentResultActionPerformed(evt);
            }
        });

        registeredStudent.setBackground(new java.awt.Color(153, 255, 204));
        registeredStudent.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        registeredStudent.setForeground(new java.awt.Color(0, 102, 102));
        registeredStudent.setText("Registered Student");
        registeredStudent.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        registeredStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registeredStudentActionPerformed(evt);
            }
        });

        allStudentResult.setBackground(new java.awt.Color(0, 51, 51));
        allStudentResult.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        allStudentResult.setForeground(java.awt.SystemColor.textHighlight);
        allStudentResult.setText("All Student Result");
        allStudentResult.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        allStudentResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allStudentResultActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addNewStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(allStudentResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(registeredStudent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addStudentResult, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE))))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(back1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(addNewStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(addStudentResult, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(registeredStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(allStudentResult, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(back1)
                .addGap(34, 34, 34))
        );

        jTable1.setBackground(new java.awt.Color(237, 251, 255));
        jTable1.setFont(new java.awt.Font("Helvetica", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Student Details Information ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back1ActionPerformed

        setVisible(false);
        new adminHome().setVisible(true);
        // TODO add your handling code here:
       
    }//GEN-LAST:event_back1ActionPerformed

    private void addNewStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewStudentActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new addNewStd().setVisible(true);
    }//GEN-LAST:event_addNewStudentActionPerformed

    private void addStudentResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentResultActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new addStdResult().setVisible(true);
    }//GEN-LAST:event_addStudentResultActionPerformed

    private void registeredStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registeredStudentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registeredStudentActionPerformed

    private void allStudentResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allStudentResultActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new allStudentResult().setVisible(true);
    }//GEN-LAST:event_allStudentResultActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
                                   
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/srms", "root", "rootsystem");
        Statement st = con.createStatement();
        java.sql.ResultSet rs = st.executeQuery("select * from student");
        
        // Correct method: resultSetToTableModel
        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e.toString());
    
    }
    }//GEN-LAST:event_formComponentShown

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
            java.util.logging.Logger.getLogger(registeredStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registeredStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registeredStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registeredStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registeredStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNewStudent;
    private javax.swing.JButton addStudentResult;
    private javax.swing.JButton allStudentResult;
    private javax.swing.JButton back1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private java.awt.Panel panel2;
    private javax.swing.JButton registeredStudent;
    // End of variables declaration//GEN-END:variables

    static class setVisible {

        public setVisible(boolean b) {
        }
    }
}
