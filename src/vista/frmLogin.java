
package vista;

import javax.swing.JOptionPane;

public class frmLogin extends javax.swing.JFrame {

    private String msg;
    
    public frmLogin() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();
        lblUser = new javax.swing.JLabel();
        txtPassword = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        pwdUser = new javax.swing.JPasswordField();
        lblTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogin.setFont(new java.awt.Font("Hack Nerd Font", 1, 14)); // NOI18N
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/btnLogin.png"))); // NOI18N
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 40, 40));

        lblUser.setFont(new java.awt.Font("Hack Nerd Font", 1, 14)); // NOI18N
        lblUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/lblUser.png"))); // NOI18N
        jPanel1.add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 140, 40, 40));

        txtPassword.setFont(new java.awt.Font("Hack Nerd Font", 1, 14)); // NOI18N
        txtPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/lblPassword.png"))); // NOI18N
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 40, 40));

        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        jPanel1.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 110, -1));

        pwdUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwdUserActionPerformed(evt);
            }
        });
        jPanel1.add(pwdUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 110, -1));

        lblTitle.setFont(new java.awt.Font("Hack Nerd Font", 3, 24)); // NOI18N
        lblTitle.setText("Inicio de sesion");
        jPanel1.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pwdUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwdUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwdUserActionPerformed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed

        final String ADMIN = "Admin";
        final String ASISTENTE = "Asistente";
        final String adminPwd = "adminpwd";
        final String asistPwd = "asistpwd";
        String msg;

        String PWD = new String(pwdUser.getPassword());
        
        if(txtUser.getText().equals(ADMIN) && PWD.equals(adminPwd)) {
            mdiMain wMain = new mdiMain();
            wMain.setVisible(true);
            dispose();
            
        } else if (txtUser.getText().equals(ASISTENTE) && PWD.equals(asistPwd)) {
            mdiAssis wAssis = new mdiAssis();
            wAssis.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Datos incorrectos");
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    
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
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPasswordField pwdUser;
    private javax.swing.JLabel txtPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
