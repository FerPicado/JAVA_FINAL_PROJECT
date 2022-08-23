package vista;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.CarreraProfesional;

public class ifrmCarreraProfesional extends javax.swing.JInternalFrame {

    private ArrayList<CarreraProfesional> carrera = new ArrayList<>();
    private int index;

    public ifrmCarreraProfesional() {
        initComponents();
        loadCarreraTable();

    }

    public void loadCarreraTable() {
        CarreraProfesional cp = new CarreraProfesional();
        this.carrera = cp.getCarrera();

        DefaultTableModel model = (DefaultTableModel) tblCarreraProf.getModel();
        //eliminar tablas para que no aparezcan
        model.setRowCount(0);
        for (CarreraProfesional carreraV : carrera) {
            model.addRow(new Object[]{
                carreraV.getEmpleado(),
                carreraV.getCodigo(),
                carreraV.getTitulo(),
                carreraV.getCantHoras(),
                carreraV.getTipo(),
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panCarreraProf = new javax.swing.JPanel();
        lblCarrera = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblCantHoras = new javax.swing.JLabel();
        lblType = new javax.swing.JLabel();
        lblCode = new javax.swing.JLabel();
        txtTitle = new javax.swing.JTextField();
        cbxType = new javax.swing.JComboBox<>();
        cbxCarrera = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCarreraProf = new javax.swing.JTable();
        btnCreate = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        spnCantidadHoras = new javax.swing.JSpinner();
        cbxCodes = new javax.swing.JComboBox<>();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panCarreraProf.setPreferredSize(new java.awt.Dimension(2000, 1200));
        panCarreraProf.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCarrera.setText("Carrera");
        panCarreraProf.add(lblCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        lblTitle.setText("Titulo");
        panCarreraProf.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        lblCantHoras.setText("Cantidad de horas");
        panCarreraProf.add(lblCantHoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        lblType.setText("Tipo");
        panCarreraProf.add(lblType, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        lblCode.setText("Codigo");
        panCarreraProf.add(lblCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));
        panCarreraProf.add(txtTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 130, -1));

        cbxType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Participacion", "Aprovechamiento" }));
        panCarreraProf.add(cbxType, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, -1, -1));

        cbxCarrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Medicina\t", "Psicologia", "Enfermeria", "Periodismo", "Ingenieria de Software", "Ingeniria Mecatronica", "Ingenieria Telematica", "Ingenieria Industrial", " " }));
        panCarreraProf.add(cbxCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 130, -1));

        tblCarreraProf.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Carrera", "Codigo", "Titulo", "Cantidad horas", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCarreraProf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCarreraProfMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCarreraProf);

        panCarreraProf.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 630, 380));

        btnCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/btnSave.png"))); // NOI18N
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        panCarreraProf.add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 50, 40));

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/btnEdit.png"))); // NOI18N
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        panCarreraProf.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 50, 40));

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/btnDelete.png"))); // NOI18N
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        panCarreraProf.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, -1, -1));

        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/btnCancel.png"))); // NOI18N
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        panCarreraProf.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, -1, -1));

        spnCantidadHoras.setName(""); // NOI18N
        spnCantidadHoras.setRequestFocusEnabled(false);
        spnCantidadHoras.setValue(1);
        panCarreraProf.add(spnCantidadHoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 130, -1));

        cbxCodes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TQ-005", "AR-32", "F-003", "DGMAT", "PG-86", "CI-10", "EI-82" }));
        panCarreraProf.add(cbxCodes, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 130, -1));

        getContentPane().add(panCarreraProf, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 1010, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        CarreraProfesional cp = new CarreraProfesional();

        //cargar el objeto con datos
        cp.setEmpleado(cbxCarrera.getSelectedItem().toString());
        cp.setCodigo(cbxCodes.getSelectedItem().toString());
        cp.setTitulo(txtTitle.getText().trim());
        cp.setCantHoras(Integer.parseInt(spnCantidadHoras.getValue().toString()));
        cp.setTipo(cbxType.getSelectedItem().toString());

        //agregar el plato al arraylist
        this.carrera.add(cp);

        //guardar el plato en el archivo binario
        cp.saveCarrera();

        //agregr una nueva fia a la tabla
        //primero obtener el default model de la tabla
        DefaultTableModel model = (DefaultTableModel) tblCarreraProf.getModel();
        //generar fila
        model.addRow(new Object[]{cp.getEmpleado(),
            cp.getCodigo(),
            cp.getTitulo(),
            cp.getCantHoras(),
            cp.getTipo()
        });

        //limpiar los campos
        txtTitle.setText("");
        spnCantidadHoras.setValue(0);
        
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int option = JOptionPane.showConfirmDialog(null, "Esta seguro que desea modificar la carrera?", "Confirm", JOptionPane.WARNING_MESSAGE);

        // 0 es SI de la JOption pop up/ 1 2 , 3 etc es no 
        if (option == 0) {
            //recolectar los datos a modificar
            CarreraProfesional cp = new CarreraProfesional();

            //cargar el objeto con datos
            cp.setEmpleado(cbxCarrera.getSelectedItem().toString());
            cp.setCodigo(cbxCodes.getSelectedItem().toString());
            cp.setTitulo(txtTitle.getText());
            cp.setCantHoras(Integer.parseInt(spnCantidadHoras.getValue().toString()));
            cp.setTipo(cbxType.getSelectedItem().toString());

            cp.modifyCarrera(this.carrera.get(index).getEmpleado());

            this.loadCarreraTable();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int option = JOptionPane.showConfirmDialog(null, "Seguro que desea eliminar la carrera?", "Message", JOptionPane.WARNING_MESSAGE);

        CarreraProfesional cp = new CarreraProfesional();
        //verificacion
        if (option == 0) {
            cp.deleteCarrera(cbxCarrera.getSelectedItem().toString());
            this.loadCarreraTable();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        //restablecer campos en vacio
        txtTitle.setText("");
        spnCantidadHoras.setValue(0);
        txtTitle.setText("");
    }//GEN-LAST:event_btnCancelActionPerformed

    private void tblCarreraProfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCarreraProfMouseClicked
        this.index = tblCarreraProf.getSelectedRow();

        //obtener el palto de la lista que corresponde a la fila seleccionada
        CarreraProfesional cp = this.carrera.get(index);

        //mostrar datos en el formulario
        cbxCarrera.setSelectedItem(cp.getCarrera());
        cbxCodes.setSelectedItem(cp.getCodigo());
        txtTitle.setText(cp.getTitulo());
        spnCantidadHoras.setValue(cp.getCantHoras());
        cbxType.setSelectedItem(cp.getTipo());

        //limpiar la tabla de ingredientes
        DefaultTableModel model = (DefaultTableModel) tblCarreraProf.getModel();
        model.setRowCount(0);

     
        for (CarreraProfesional carreraProf : this.carrera.get(this.index).carrera) {
            model.addRow(new Object[]{
                carreraProf.getCarrera(),
                carreraProf.getCodigo(),
                carreraProf.getTitulo(),
                carreraProf.getCantHoras(),
                carreraProf.getTipo()
            });
        }
    }//GEN-LAST:event_tblCarreraProfMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbxCarrera;
    private javax.swing.JComboBox<String> cbxCodes;
    private javax.swing.JComboBox<String> cbxType;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCantHoras;
    private javax.swing.JLabel lblCarrera;
    private javax.swing.JLabel lblCode;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblType;
    private javax.swing.JPanel panCarreraProf;
    private javax.swing.JSpinner spnCantidadHoras;
    private javax.swing.JTable tblCarreraProf;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables

 

}
