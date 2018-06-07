/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 /*
WIP: 
Show username/email already taken.
Show email isn't in correct format.
Show password's length is to short (8+)
Show username or name or email have special symbol

 */
package na.phong.study;

import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author qvanphong
 */
public class RegisterForm extends javax.swing.JFrame {

    LoginForm lgf = new LoginForm();
    RegisterChecker checker = new RegisterChecker();
    UserValidate userValidate;
    String triggerBox = null;

    public String getTriggerBox() {
        return triggerBox;
    }

    public void setTriggerBox(String triggerBox) {
        this.triggerBox = triggerBox;
    }

    public RegisterForm(UserValidate existAccData) {
//        arrList = arr;
        userValidate = existAccData;
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registerErrorDialog = new javax.swing.JDialog();
        titlePanelLoginErrorDialog = new javax.swing.JPanel();
        lblTitle1 = new javax.swing.JLabel();
        lblClose1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblRegisterErrorDialog = new javax.swing.JLabel();
        btnOkRegisterErrorDialog = new javax.swing.JButton();
        registerCheckboxErrorDialog = new javax.swing.JDialog();
        titlePanelLoginErrorDialog1 = new javax.swing.JPanel();
        lblTitle2 = new javax.swing.JLabel();
        lblClose2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblRegisterErrorDialog1 = new javax.swing.JLabel();
        btnOkRegisterErrorDialog1 = new javax.swing.JButton();
        titlePanel = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblClose = new javax.swing.JLabel();
        lblMinimize = new javax.swing.JLabel();
        bodyPanel = new javax.swing.JPanel();
        lblFullName = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblRetype = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        fullNameTextField = new javax.swing.JTextField();
        usernameTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        acceptTermCheckBox = new javax.swing.JCheckBox();
        btnSignUp = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        registerErrorDialog.setUndecorated(true);

        titlePanelLoginErrorDialog.setBackground(new java.awt.Color(248, 148, 6));

        lblTitle1.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        lblTitle1.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle1.setText("Login Error");

        lblClose1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblClose1.setForeground(new java.awt.Color(51, 51, 51));
        lblClose1.setText("X");
        lblClose1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblClose1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout titlePanelLoginErrorDialogLayout = new javax.swing.GroupLayout(titlePanelLoginErrorDialog);
        titlePanelLoginErrorDialog.setLayout(titlePanelLoginErrorDialogLayout);
        titlePanelLoginErrorDialogLayout.setHorizontalGroup(
            titlePanelLoginErrorDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLoginErrorDialogLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblTitle1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblClose1)
                .addGap(16, 16, 16))
        );
        titlePanelLoginErrorDialogLayout.setVerticalGroup(
            titlePanelLoginErrorDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLoginErrorDialogLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(titlePanelLoginErrorDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle1)
                    .addComponent(lblClose1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(34, 49, 63));

        lblRegisterErrorDialog.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblRegisterErrorDialog.setForeground(new java.awt.Color(255, 255, 255));
        lblRegisterErrorDialog.setText("All information should be insert");

        btnOkRegisterErrorDialog.setBackground(new java.awt.Color(89, 171, 227));
        btnOkRegisterErrorDialog.setForeground(new java.awt.Color(255, 255, 255));
        btnOkRegisterErrorDialog.setText("OK");
        btnOkRegisterErrorDialog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOkRegisterErrorDialogMouseClicked(evt);
            }
        });
        btnOkRegisterErrorDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkRegisterErrorDialogActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(153, Short.MAX_VALUE)
                .addComponent(btnOkRegisterErrorDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(lblRegisterErrorDialog)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblRegisterErrorDialog)
                .addGap(18, 18, 18)
                .addComponent(btnOkRegisterErrorDialog)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout registerErrorDialogLayout = new javax.swing.GroupLayout(registerErrorDialog.getContentPane());
        registerErrorDialog.getContentPane().setLayout(registerErrorDialogLayout);
        registerErrorDialogLayout.setHorizontalGroup(
            registerErrorDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(titlePanelLoginErrorDialog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        registerErrorDialogLayout.setVerticalGroup(
            registerErrorDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerErrorDialogLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(titlePanelLoginErrorDialog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        registerCheckboxErrorDialog.setUndecorated(true);

        titlePanelLoginErrorDialog1.setBackground(new java.awt.Color(248, 148, 6));

        lblTitle2.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        lblTitle2.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle2.setText("Login Error");

        lblClose2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblClose2.setForeground(new java.awt.Color(51, 51, 51));
        lblClose2.setText("X");
        lblClose2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblClose2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout titlePanelLoginErrorDialog1Layout = new javax.swing.GroupLayout(titlePanelLoginErrorDialog1);
        titlePanelLoginErrorDialog1.setLayout(titlePanelLoginErrorDialog1Layout);
        titlePanelLoginErrorDialog1Layout.setHorizontalGroup(
            titlePanelLoginErrorDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLoginErrorDialog1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblTitle2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblClose2)
                .addGap(16, 16, 16))
        );
        titlePanelLoginErrorDialog1Layout.setVerticalGroup(
            titlePanelLoginErrorDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLoginErrorDialog1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(titlePanelLoginErrorDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle2)
                    .addComponent(lblClose2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(34, 49, 63));

        lblRegisterErrorDialog1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblRegisterErrorDialog1.setForeground(new java.awt.Color(255, 255, 255));
        lblRegisterErrorDialog1.setText("You should accept our terms.");

        btnOkRegisterErrorDialog1.setBackground(new java.awt.Color(89, 171, 227));
        btnOkRegisterErrorDialog1.setForeground(new java.awt.Color(255, 255, 255));
        btnOkRegisterErrorDialog1.setText("OK");
        btnOkRegisterErrorDialog1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOkRegisterErrorDialog1MouseClicked(evt);
            }
        });
        btnOkRegisterErrorDialog1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkRegisterErrorDialog1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btnOkRegisterErrorDialog1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(144, 144, 144))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lblRegisterErrorDialog1)
                        .addGap(63, 63, 63))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblRegisterErrorDialog1)
                .addGap(18, 18, 18)
                .addComponent(btnOkRegisterErrorDialog1)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout registerCheckboxErrorDialogLayout = new javax.swing.GroupLayout(registerCheckboxErrorDialog.getContentPane());
        registerCheckboxErrorDialog.getContentPane().setLayout(registerCheckboxErrorDialogLayout);
        registerCheckboxErrorDialogLayout.setHorizontalGroup(
            registerCheckboxErrorDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(titlePanelLoginErrorDialog1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        registerCheckboxErrorDialogLayout.setVerticalGroup(
            registerCheckboxErrorDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerCheckboxErrorDialogLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(titlePanelLoginErrorDialog1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        titlePanel.setBackground(new java.awt.Color(248, 148, 6));

        lblTitle.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Register Form");

        lblClose.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblClose.setForeground(new java.awt.Color(51, 51, 51));
        lblClose.setText("X");
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
        });

        lblMinimize.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblMinimize.setForeground(new java.awt.Color(51, 51, 51));
        lblMinimize.setText("_");
        lblMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMinimize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblClose)
                .addGap(16, 16, 16))
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMinimize)
                        .addComponent(lblClose))
                    .addComponent(lblTitle))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bodyPanel.setBackground(new java.awt.Color(34, 49, 63));

        lblFullName.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblFullName.setForeground(new java.awt.Color(204, 204, 204));
        lblFullName.setText("Full name:");

        lblUsername.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(204, 204, 204));
        lblUsername.setText("Username:");

        lblPassword.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(204, 204, 204));
        lblPassword.setText("Password:");

        lblRetype.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblRetype.setForeground(new java.awt.Color(204, 204, 204));
        lblRetype.setText("Retype Password:");

        lblEmail.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(204, 204, 204));
        lblEmail.setText("Email:");

        fullNameTextField.setForeground(new java.awt.Color(51, 51, 51));
        fullNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullNameTextFieldActionPerformed(evt);
            }
        });

        usernameTextField.setForeground(new java.awt.Color(51, 51, 51));
        usernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextFieldActionPerformed(evt);
            }
        });

        emailTextField.setForeground(new java.awt.Color(51, 51, 51));
        emailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextFieldActionPerformed(evt);
            }
        });

        jPasswordField1.setForeground(new java.awt.Color(51, 51, 51));
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        jPasswordField2.setForeground(new java.awt.Color(51, 51, 51));

        acceptTermCheckBox.setBackground(new java.awt.Color(34, 49, 63));
        acceptTermCheckBox.setForeground(new java.awt.Color(204, 204, 204));
        acceptTermCheckBox.setText("I accept all tùm lum tùm la");

        btnSignUp.setBackground(new java.awt.Color(89, 171, 227));
        btnSignUp.setText("Sign up");
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Back to login");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(231, 76, 60));
        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblUsername)
                        .addComponent(lblPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblFullName, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblEmail)
                            .addComponent(lblRetype))
                        .addGap(4, 4, 4)))
                .addGap(18, 18, 18)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(emailTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(jPasswordField2)
                    .addComponent(jPasswordField1)
                    .addComponent(usernameTextField)
                    .addComponent(fullNameTextField))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyPanelLayout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyPanelLayout.createSequentialGroup()
                        .addComponent(acceptTermCheckBox)
                        .addGap(71, 71, 71))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyPanelLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(119, 119, 119))))
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFullName)
                    .addComponent(fullNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername)
                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRetype)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(acceptTermCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSignUp, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_lblCloseMouseClicked

    private void lblMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseClicked
        // TODO add your handling code here:
        this.setState(ICONIFIED);
    }//GEN-LAST:event_lblMinimizeMouseClicked

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        // TODO add your handling code here:
        if (acceptTermCheckBox.isSelected() && !usernameTextField.getText().equals("") && !fullNameTextField.getText().equals("")
                && !jPasswordField1.getText().equals("") && !jPasswordField2.getText().equals("") && !emailTextField.getText().equals("")) {
            if (!userValidate.find(usernameTextField.getText(), emailTextField.getText())) {
                if (checker.passwordCheck(jPasswordField1.getText(), jPasswordField2.getText())) {
                    userValidate.add(fullNameTextField.getText(), usernameTextField.getText(), jPasswordField1.getText(), emailTextField.getText());
                    System.out.println(usernameTextField.getText() + " added.");

                    if (triggerBox == "main") {
                        this.dispose();
                    } else {
                        this.dispose();
                        lgf.setVisible(true);
                        lgf.pack();
                        lgf.setLocationRelativeTo(null);
                    }
                }
            }

        }else if(!acceptTermCheckBox.isSelected() && (usernameTextField.getText().equals("") || fullNameTextField.getText().equals("")
                && jPasswordField1.getText().equals("") || jPasswordField2.getText().equals("") || emailTextField.getText().equals(""))){
            registerErrorDialog.setVisible(true);
            registerErrorDialog.pack();
            registerErrorDialog.setLocationRelativeTo(null);
        }else if(!acceptTermCheckBox.isSelected()){
            registerCheckboxErrorDialog.setVisible(true);
            registerCheckboxErrorDialog.pack();
            registerCheckboxErrorDialog.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void fullNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullNameTextFieldActionPerformed

    private void emailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextFieldActionPerformed

    private void usernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTextFieldActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        lgf.setVisible(true);
        lgf.pack();
        lgf.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void lblClose1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClose1MouseClicked
        // TODO add your handling code here:
        //        System.exit(0);
        registerErrorDialog.dispose();
    }//GEN-LAST:event_lblClose1MouseClicked

    private void btnOkRegisterErrorDialogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOkRegisterErrorDialogMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_btnOkRegisterErrorDialogMouseClicked


    private void btnOkRegisterErrorDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkRegisterErrorDialogActionPerformed
        // TODO add your handling code here:
        registerErrorDialog.dispose();
    }//GEN-LAST:event_btnOkRegisterErrorDialogActionPerformed

    private void lblClose2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClose2MouseClicked
        // TODO add your handling code here:
//         registerCheckboxErrorDialog.dispose();
    }//GEN-LAST:event_lblClose2MouseClicked

    private void btnOkRegisterErrorDialog1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOkRegisterErrorDialog1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOkRegisterErrorDialog1MouseClicked

    private void btnOkRegisterErrorDialog1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkRegisterErrorDialog1ActionPerformed
        // TODO add your handling code here:
        registerCheckboxErrorDialog.dispose();
        
    }//GEN-LAST:event_btnOkRegisterErrorDialog1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox acceptTermCheckBox;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JButton btnOkRegisterErrorDialog;
    private javax.swing.JButton btnOkRegisterErrorDialog1;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JTextField fullNameTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblClose1;
    private javax.swing.JLabel lblClose2;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFullName;
    private javax.swing.JLabel lblMinimize;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRegisterErrorDialog;
    private javax.swing.JLabel lblRegisterErrorDialog1;
    private javax.swing.JLabel lblRetype;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTitle1;
    private javax.swing.JLabel lblTitle2;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JDialog registerCheckboxErrorDialog;
    private javax.swing.JDialog registerErrorDialog;
    private javax.swing.JPanel titlePanel;
    private javax.swing.JPanel titlePanelLoginErrorDialog;
    private javax.swing.JPanel titlePanelLoginErrorDialog1;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
