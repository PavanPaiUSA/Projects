/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Ui.LoginPage;

import School.Principal.Principal;
import School.Teacher.Teacher;
import System.Directories.DB4OUtil;
import System.Directories.MainSystem;
import Ui.School.PrincipalWorkspace;
import Ui.School.SchoolAdminWorkspace;
import Ui.School.TeacherWorkspace;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author pavanpai
 */
public class SchoolLoginPage extends javax.swing.JPanel {

    /**
     * Creates new form SchoolLoginPage
     */
    private JPanel cardPanel;
    private MainSystem system;
    private DB4OUtil dB4OUtil;
    
    public SchoolLoginPage(JPanel cardPanel, MainSystem system, DB4OUtil dB4OUtil) {
        initComponents();
        this.cardPanel = cardPanel;
        this.system = system;
        this.dB4OUtil = dB4OUtil;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        txtUsername = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        lblRole = new javax.swing.JLabel();
        cmbRole = new javax.swing.JComboBox<>();
        btnLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("LOGIN PAGE");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 800, -1));

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 55, -1, -1));
        add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 120, 222, -1));

        lblUsername.setForeground(new java.awt.Color(255, 255, 255));
        lblUsername.setText("Username:");
        add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 123, 70, -1));

        lblPass.setForeground(new java.awt.Color(255, 255, 255));
        lblPass.setText("Password:");
        add(lblPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 70, -1));
        add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 224, -1));

        lblRole.setForeground(new java.awt.Color(255, 255, 255));
        lblRole.setText("Role:");
        add(lblRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, -1, -1));

        cmbRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "School Admin", "Teacher", "Principal" }));
        add(cmbRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 224, -1));

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 347, 61, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UiImagesssss/SChoolNi.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 750));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
        cardPanel.remove(this);
        cardLayout.previous(cardPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:

        String username = txtUsername.getText();
        String password = txtPass.getText();
        String role = String.valueOf(cmbRole.getSelectedItem());
        Principal principal =  system.getPrincipalList().findPrincipal(username, password);
        Teacher teacher = system.getTeacherList().findTeacher(username, password);
         

        try{
//            if(role.equals("School Admin")){
            if(role.equals("School Admin")&&(username.equals("Admin") && password.equals("pass"))){
                    SchoolAdminWorkspace adminJPanel = new SchoolAdminWorkspace(cardPanel, system, dB4OUtil);
                    CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
                    cardPanel.add("adminJPanel",adminJPanel);
                    cardLayout.next(cardPanel);
                }
//            }
//            else if(role.equals("Principal")){
            else if(role.equals("Principal")&&(username.equals(principal.getUsername()) && password.equals(principal.getPassword()))){
                    PrincipalWorkspace principalJPanel = new PrincipalWorkspace(principal,cardPanel, system, dB4OUtil);
                    CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
                    cardPanel.add("ngoManagerJPanel",principalJPanel);
                    cardLayout.next(cardPanel);
                }
//            }
//            else if(role.equals("Teacher")){
            else if(role.equals("Teacher")&&(username.equals(teacher.getUsername()) && password.equals(teacher.getPassword()))){
                    TeacherWorkspace caretakerJPanel = new TeacherWorkspace(teacher,cardPanel, system, dB4OUtil);
                    CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
                    cardPanel.add("caretakerJPanel",caretakerJPanel);
                    cardLayout.next(cardPanel);
                }
//            }
            else{
                JOptionPane.showMessageDialog(this, "Please enter the correct username and password and role.");
            }
        }
        catch(NullPointerException n){
            JOptionPane.showMessageDialog(this, "Please enter the correct username and password and role.");
        }
        
        txtUsername.setText("");
        txtPass.setText("");
    }//GEN-LAST:event_btnLoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogin;
    private javax.swing.JComboBox<String> cmbRole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
