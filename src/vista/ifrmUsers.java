package vista;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.User;

public class ifrmUsers extends javax.swing.JInternalFrame {

    private ArrayList<User> user = new ArrayList<>();
    private int index;
    private int indexUser;

    public ifrmUsers() {
        initComponents();

        loadUsersTable();
    }

    public void loadUsersTable() {
        User u = new User();
        this.user = u.getUser();

        DefaultTableModel model = (DefaultTableModel) tblUsers.getModel();
        //eliminar tablas para que no aparezcan
        model.setRowCount(0);
        for (User userV : user) {
            model.addRow(new Object[]{
                userV.getName(),
                userV.getLastname(),
                userV.getEmail(),
                userV.getRole()
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panUsers = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        lblLastname = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblPwd = new javax.swing.JLabel();
        lblUserRole = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtLastname = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        pwdPass = new javax.swing.JPasswordField();
        cbxUserRole = new javax.swing.JComboBox<>();
        btnCreate = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsers = new javax.swing.JTable();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panUsers.setMinimumSize(new java.awt.Dimension(760, 600));
        panUsers.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblName.setText("Name");
        panUsers.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        lblLastname.setText("Lastname");
        panUsers.add(lblLastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        lblEmail.setText("E-mail");
        panUsers.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        lblPwd.setText("Password");
        panUsers.add(lblPwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        lblUserRole.setText("User role");
        panUsers.add(lblUserRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, 30));

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        panUsers.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 130, -1));

        txtLastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastnameActionPerformed(evt);
            }
        });
        panUsers.add(txtLastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 130, -1));
        panUsers.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 130, -1));

        pwdPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwdPassActionPerformed(evt);
            }
        });
        panUsers.add(pwdPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 182, 130, 20));

        cbxUserRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Assistant" }));
        cbxUserRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxUserRoleActionPerformed(evt);
            }
        });
        panUsers.add(cbxUserRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 120, -1));

        btnCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/btnSave.png"))); // NOI18N
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        panUsers.add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 60, 60));

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/btnEdit.png"))); // NOI18N
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        panUsers.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 60, 60));

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/btnDelete.png"))); // NOI18N
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        panUsers.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 60, 60));

        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/btnCancel.png"))); // NOI18N
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        panUsers.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 60, 60));

        tblUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Lastname", "E-mail", "Role"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUsersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblUsers);

        panUsers.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 410, 370));

        getContentPane().add(panUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 770, 467));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastnameActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void cbxUserRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxUserRoleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxUserRoleActionPerformed

    private void pwdPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwdPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwdPassActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        User u = new User();

        //cargar el objeto con datos
        u.setName(txtName.getText().trim());
        u.setLastname(txtLastname.getText().trim());
        u.setEmail(txtEmail.getText().trim());
        u.setRole(cbxUserRole.getSelectedItem().toString());

        //agregar el plato al arraylist
        this.user.add(u);

        //guardar el plato en el archivo binario
        u.saveUser();

        //agregr una nueva fia a la tabla
        //primero obtener el default model de la tabla
        DefaultTableModel model = (DefaultTableModel) tblUsers.getModel();
        //generar fila
        model.addRow(new Object[]{u.getName(),
            u.getLastname(),
            u.getEmail(),
            u.getRole()});

        //limpiar los campos
        txtName.setText("");
        txtLastname.setText("");
        txtEmail.setText("");
        pwdPass.setText("");
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int option = JOptionPane.showConfirmDialog(null, "Esta segurro que desea modificar el usuario?", "Confirm", JOptionPane.WARNING_MESSAGE);

        // 0 es SI de la JOption pop up/ 1 2 , 3 etc es no 
        if (option == 0) {
            //recolectar los datos a modificar
            User u = new User();

            //cargar el objeto con datos
            u.setName(txtName.getText().trim());
            u.setLastname(txtLastname.getText());
            u.setEmail(txtEmail.getText());
            u.setRole(cbxUserRole.getSelectedItem().toString());

            u.userModify(this.user.get(index).getName());

            this.loadUsersTable();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int option = JOptionPane.showConfirmDialog(null, "Seguro que desea eliminar la data?", "Message", JOptionPane.WARNING_MESSAGE);

        User u = new User();

        //verificacion
        if (option == 0) {
            u.delete(txtName.getText());

            this.loadUsersTable();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsersMouseClicked

        this.index = tblUsers.getSelectedRow();

        //obtener el palto de la lista que corresponde a la fila seleccionada
        User u = this.user.get(index);

        //mostrar datos en el formulario
        txtName.setText(u.getName());
        txtLastname.setText(u.getLastname());
        txtEmail.setText(u.getEmail());
        cbxUserRole.setSelectedItem(u.getRole());

        //limpiar la tabla de ingredientes
        DefaultTableModel model = (DefaultTableModel) tblUsers.getModel();
        model.setRowCount(0);

        //cargar los ingredientes del plato seleccionado
        for (User usuario : this.user.get(this.index).user) {
            model.addRow(new Object[]{
                usuario.getName(),
                usuario.getLastname(),
                usuario.getEmail(),
                usuario.getRole()
            });
        }
    }//GEN-LAST:event_tblUsersMouseClicked

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        //restablecer campos en vacio
        txtName.setText("");
        txtLastname.setText("");
        pwdPass.setText("");
        txtEmail.setText("");
    }//GEN-LAST:event_btnCancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbxUserRole;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblLastname;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPwd;
    private javax.swing.JLabel lblUserRole;
    private javax.swing.JPanel panUsers;
    private javax.swing.JPasswordField pwdPass;
    private javax.swing.JTable tblUsers;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLastname;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
