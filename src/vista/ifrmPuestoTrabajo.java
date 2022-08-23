package vista;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.PuestosTrabajo;

public class ifrmPuestoTrabajo extends javax.swing.JInternalFrame {

    private ArrayList<PuestosTrabajo> puestoTrabajo = new ArrayList<>();
    private int index;

    public ifrmPuestoTrabajo() {
        initComponents();
        loadPuestoTable();
    }

    public void loadPuestoTable() {
        PuestosTrabajo pt = new PuestosTrabajo();
        this.puestoTrabajo = pt.getPuestoTrabajo();

        DefaultTableModel model = (DefaultTableModel) tblPuestoTrabajo.getModel();
        //eliminar tablas para que no aparezcan
        model.setRowCount(0);
        for (PuestosTrabajo puestoV : puestoTrabajo) {
            model.addRow(new Object[]{
                puestoV.getNombre(),
                puestoV.getCategoria(),
                puestoV.getSalario(),});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        panPuestoTrabajo = new javax.swing.JPanel();
        sprPuestoTrabajo = new javax.swing.JSeparator();
        lblPuestoNombre = new javax.swing.JLabel();
        txtCarreraNombre = new javax.swing.JTextField();
        lblCategoria = new javax.swing.JLabel();
        cbxCategoria = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPuestoTrabajo = new javax.swing.JTable();
        lblSalary = new javax.swing.JLabel();
        txtSalary = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setMinimumSize(new java.awt.Dimension(1200, 900));
        setPreferredSize(new java.awt.Dimension(1200, 900));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panPuestoTrabajo.setMinimumSize(new java.awt.Dimension(1000, 1000));
        panPuestoTrabajo.setName(""); // NOI18N
        panPuestoTrabajo.setPreferredSize(new java.awt.Dimension(1000, 1000));
        panPuestoTrabajo.setRequestFocusEnabled(false);
        panPuestoTrabajo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panPuestoTrabajo.add(sprPuestoTrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 839, 17));

        lblPuestoNombre.setText("Nombre del puesto");
        panPuestoTrabajo.add(lblPuestoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));
        panPuestoTrabajo.add(txtCarreraNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 140, -1));

        lblCategoria.setText("Categoria");
        panPuestoTrabajo.add(lblCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        cbxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2" }));
        panPuestoTrabajo.add(cbxCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 140, -1));

        tblPuestoTrabajo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Puesto", "Categoria", "Salario"
            }
        ));
        tblPuestoTrabajo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPuestoTrabajoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPuestoTrabajo);

        panPuestoTrabajo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 221, 820, 250));

        lblSalary.setText("Salario");
        panPuestoTrabajo.add(lblSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));
        panPuestoTrabajo.add(txtSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 140, -1));

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/btnEdit.png"))); // NOI18N
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        panPuestoTrabajo.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 50, -1));

        btnCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/btnSave.png"))); // NOI18N
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        panPuestoTrabajo.add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 50, -1));

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/btnDelete.png"))); // NOI18N
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        panPuestoTrabajo.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, -1, -1));

        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/btnCancel.png"))); // NOI18N
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        panPuestoTrabajo.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 70, -1, -1));

        getContentPane().add(panPuestoTrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 850, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int option = JOptionPane.showConfirmDialog(null, "Esta seguro que desea modificar el puesto?", "Confirm", JOptionPane.WARNING_MESSAGE);

        // 0 es SI de la JOption pop up/ 1 2 , 3 etc es no
        if (option == 0) {
            //recolectar los datos a modificar
            PuestosTrabajo pt = new PuestosTrabajo();

            //cargar el objeto con datos
            pt.setNombre(txtCarreraNombre.getText().trim());
            pt.setCategoria(cbxCategoria.getSelectedItem().toString());
            pt.setSalario(Integer.parseInt(txtSalary.getText().trim()));
            
            pt.modifyPuestoTrabajo(this.puestoTrabajo.get(index).getNombre());

            this.loadPuestoTable();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        PuestosTrabajo pt = new PuestosTrabajo();

        pt.setNombre(txtCarreraNombre.getText().trim());
        pt.setCategoria(cbxCategoria.getSelectedItem().toString());
        pt.setSalario(Integer.parseInt(txtSalary.getText().trim()));

        this.puestoTrabajo.add(pt);

        //guardar el plato en el archivo binario
        pt.savePuestoTrabajo();

        //agregr una nueva fia a la tabla
        //primero obtener el default model de la tabla
        DefaultTableModel model = (DefaultTableModel) tblPuestoTrabajo.getModel();
        //generar fila
        model.addRow(new Object[]{pt.getNombre(),
            pt.getCategoria(),
            pt.getSalario(),});

        txtCarreraNombre.setText("");
        cbxCategoria.setSelectedItem(0);
        txtSalary.setText("");
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int option = JOptionPane.showConfirmDialog(null, "Seguro que desea eliminar el puesto?", "Message", JOptionPane.WARNING_MESSAGE);

        PuestosTrabajo pt = new PuestosTrabajo();
        //verificacion
        if (option == 0) {
            pt.deletePuestoTrabajo(txtCarreraNombre.getText());
            this.loadPuestoTable();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        txtCarreraNombre.setText("");
        cbxCategoria.setSelectedItem(0);
        txtSalary.setText("");
    }//GEN-LAST:event_btnCancelActionPerformed

    private void tblPuestoTrabajoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPuestoTrabajoMouseClicked
        this.index = tblPuestoTrabajo.getSelectedRow();

        PuestosTrabajo pt = this.puestoTrabajo.get(index);

        txtCarreraNombre.setText(pt.getNombre());
        cbxCategoria.setSelectedItem(pt.getCategoria());
        txtSalary.setText(String.valueOf(pt.getSalario()));
        
        DefaultTableModel model = (DefaultTableModel) tblPuestoTrabajo.getModel();
        model.setRowCount(0);
        
        for (PuestosTrabajo pT : this.puestoTrabajo.get(this.index).puestoTrabajo) {
            model.addRow(new Object[]{
                pT.getNombre(),
                pT.getCategoria(),
                pT.getSalario()
            });
        }
    }//GEN-LAST:event_tblPuestoTrabajoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbxCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblPuestoNombre;
    private javax.swing.JLabel lblSalary;
    private javax.swing.JPanel panPuestoTrabajo;
    private javax.swing.JSeparator sprPuestoTrabajo;
    private javax.swing.JTable tblPuestoTrabajo;
    private javax.swing.JTextField txtCarreraNombre;
    private javax.swing.JTextField txtSalary;
    // End of variables declaration//GEN-END:variables
}
