package vista;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Employees;

public class ifrmEmployee extends javax.swing.JInternalFrame {

    private ArrayList<Employees> employee = new ArrayList<>();
    private int index;

    public ifrmEmployee() {
        initComponents();
        loadEmployeesTable();
        panEmployee.setBounds(100, 50, 140, 60);

    }

    public void loadEmployeesTable() {
        Employees e = new Employees();
        this.employee = e.getEmployee();

        DefaultTableModel model = (DefaultTableModel) tblEmployee.getModel();
        //eliminar tablas para que no aparezcan
        model.setRowCount(0);
        for (Employees employeeV : employee) {
            model.addRow(new Object[]{
                employeeV.getName(),
                employeeV.getLastname(),
                employeeV.getEmail(),
                employeeV.getPuesto(),
                employeeV.getGradoAcademico(),
                employeeV.getPrestamo(),
                employeeV.getPension()
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panEmployee = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtLastname = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtPrestamo = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        cmbPuesto = new javax.swing.JComboBox<>();
        cmbGradoAcademico = new javax.swing.JComboBox<>();
        cmbPension = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployee = new javax.swing.JTable();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panEmployee.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Name");
        panEmployee.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel2.setText("Lastname");
        panEmployee.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel3.setText("E-mail");
        panEmployee.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel4.setText("Puesto");
        panEmployee.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel5.setText("Grado academico");
        panEmployee.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jLabel6.setText("Prestamo");
        panEmployee.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jLabel7.setText("Pension");
        panEmployee.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));
        panEmployee.add(txtLastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 110, -1));
        panEmployee.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 110, -1));

        txtPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrestamoActionPerformed(evt);
            }
        });
        panEmployee.add(txtPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 110, -1));
        panEmployee.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 110, -1));

        cmbPuesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Personal de apoyo", "Administrativo1", "Técnico especializado", "Administrativo 2 ", "Profesional de apoyo", "Docente Licenciado", "Docente Máster", "Jefe1", "Jefe2 ", "Director " }));
        cmbPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPuestoActionPerformed(evt);
            }
        });
        panEmployee.add(cmbPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 110, -1));

        cmbGradoAcademico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bachillerato", "Licenciatura", "Master" }));
        cmbGradoAcademico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbGradoAcademicoActionPerformed(evt);
            }
        });
        panEmployee.add(cmbGradoAcademico, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 110, -1));

        cmbPension.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SI", "NO" }));
        cmbPension.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPensionActionPerformed(evt);
            }
        });
        panEmployee.add(cmbPension, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, -1, -1));

        tblEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Lastname", "Email", "Puesto", "Grado Academico", "Prestamos", "Pension"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmployeeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmployee);

        panEmployee.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 640, 400));

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/btnSave.png"))); // NOI18N
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        panEmployee.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 50, 50));

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/btnEdit.png"))); // NOI18N
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        panEmployee.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 50, 50));

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/btnDelete.png"))); // NOI18N
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        panEmployee.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 50, 50));

        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/btnCancel.png"))); // NOI18N
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        panEmployee.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 50, 50));

        getContentPane().add(panEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 930, 432));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrestamoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrestamoActionPerformed

    private void cmbGradoAcademicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGradoAcademicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbGradoAcademicoActionPerformed

    private void cmbPensionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPensionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPensionActionPerformed

    private void cmbPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPuestoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPuestoActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int option = JOptionPane.showConfirmDialog(null, "Esta seguro que desea modificar el empleado?", "Confirm", JOptionPane.WARNING_MESSAGE);

        // 0 es SI de la JOption pop up/ 1 2 , 3 etc es no 
        if (option == 0) {
            //recolectar los datos a modificar
            Employees e = new Employees();

            //cargar el objeto con datos
            e.setName(txtName.getText().trim());
            e.setLastname(txtLastname.getText());
            e.setEmail(txtEmail.getText());
            e.setPuesto(cmbPuesto.getSelectedItem().toString());
            e.setGradoAcademico(cmbGradoAcademico.getSelectedItem().toString());
            e.setPrestamo(txtPrestamo.getText());
            e.setPension(cmbPension.getSelectedItem().toString());

            e.modifyEmployee(this.employee.get(index).getName());

            this.loadEmployeesTable();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        Employees e = new Employees();

        //cargar el objeto con datos
        e.setName(txtName.getText().trim());
        e.setLastname(txtLastname.getText().trim());
        e.setEmail(txtEmail.getText().trim());
        e.setPuesto(cmbPuesto.getSelectedItem().toString());
        e.setGradoAcademico(cmbGradoAcademico.getSelectedItem().toString());
        e.setPrestamo(txtPrestamo.getText());
        e.setPension(cmbPension.getSelectedItem().toString());


        //agregar el plato al arraylist
        this.employee.add(e);

        //guardar el plato en el archivo binario
        e.saveEmployee();

        //agregr una nueva fia a la tabla
        //primero obtener el default model de la tabla
        DefaultTableModel model = (DefaultTableModel) tblEmployee.getModel();
        //generar fila
        model.addRow(new Object[]{
            e.getName(),
            e.getLastname(),
            e.getEmail(),
            e.getPuesto(),
            e.getGradoAcademico(),
            e.getPrestamo(),
            e.getPension()});

        //limpiar los campos
        txtName.setText("");
        txtLastname.setText("");
        txtEmail.setText("");
        txtPrestamo.setText("");
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int option = JOptionPane.showConfirmDialog(null, "Seguro que desea eliminar la data?", "Message", JOptionPane.WARNING_MESSAGE);

        Employees e = new Employees();
        //verificacion
        if (option == 0) {
            e.deleteEmployee(txtName.getText());
            this.loadEmployeesTable();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        //restablecer campos en vacio
        txtName.setText("");
        txtLastname.setText("");
        txtEmail.setText("");
        
        txtPrestamo.setText("");

    }//GEN-LAST:event_btnCancelActionPerformed

    private void tblEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmployeeMouseClicked
        this.index = tblEmployee.getSelectedRow();

        
        Employees e = this.employee.get(index);

       
        txtName.setText(e.getName());
        txtLastname.setText(e.getLastname());
        txtEmail.setText(e.getEmail());
        cmbPuesto.setSelectedItem(e.getPuesto());
        cmbGradoAcademico.setSelectedItem(e.getGradoAcademico());
        cmbPension.setSelectedItem(e.getPension());

        
        DefaultTableModel model = (DefaultTableModel) tblEmployee.getModel();
        model.setRowCount(0);

        
        for (Employees employee : this.employee.get(this.index).employee) {
            model.addRow(new Object[]{
                employee.getName(),
                employee.getLastname(),
                employee.getEmail(),
                employee.getPuesto(),
                employee.getGradoAcademico(),
                employee.getPension()
            });
        }
    }//GEN-LAST:event_tblEmployeeMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbGradoAcademico;
    private javax.swing.JComboBox<String> cmbPension;
    private javax.swing.JComboBox<String> cmbPuesto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panEmployee;
    private javax.swing.JTable tblEmployee;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLastname;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrestamo;
    // End of variables declaration//GEN-END:variables
}
