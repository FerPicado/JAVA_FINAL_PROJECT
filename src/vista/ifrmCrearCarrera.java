package vista;

import models.CrearCarrera;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ifrmCrearCarrera extends javax.swing.JInternalFrame {

    private ArrayList<CrearCarrera> crearCarrera = new ArrayList<>();
    private int index;

    public ifrmCrearCarrera() {
        initComponents();
        loadCrearCarreraTable();
    }

    public void loadCrearCarreraTable() {
        CrearCarrera ccp = new CrearCarrera();
        this.crearCarrera = ccp.getCrearCarrera();

        DefaultTableModel model = (DefaultTableModel) tblCrearCarrera.getModel();
        //eliminar tablas para que no aparezcan
        model.setRowCount(0);
        for (CrearCarrera crearCarreraV : crearCarrera) {
            model.addRow(new Object[]{
                crearCarreraV.getCarrera(),
                crearCarreraV.getTec()
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panCrearCarrera = new javax.swing.JPanel();
        lblCrearCarreraName = new javax.swing.JLabel();
        lblCrearCarreraColeTec = new javax.swing.JLabel();
        txtTec = new javax.swing.JTextField();
        txtCrearCarreraName = new javax.swing.JTextField();
        btnCrearCarreraCreate = new javax.swing.JButton();
        btnUpdateCrearCarrera = new javax.swing.JButton();
        btnDeleteCrearCarrera = new javax.swing.JButton();
        btnCancelCrearCarrera = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCrearCarrera = new javax.swing.JTable();

        panCrearCarrera.setPreferredSize(new java.awt.Dimension(1200, 1800));
        panCrearCarrera.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCrearCarreraName.setText("Nueva carrera");
        panCrearCarrera.add(lblCrearCarreraName, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 119, -1, -1));

        lblCrearCarreraColeTec.setText("Tecnico");
        panCrearCarrera.add(lblCrearCarreraColeTec, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 196, -1, -1));
        panCrearCarrera.add(txtTec, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 192, 90, -1));
        panCrearCarrera.add(txtCrearCarreraName, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 115, 90, -1));

        btnCrearCarreraCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/btnSave.png"))); // NOI18N
        btnCrearCarreraCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearCarreraCreateActionPerformed(evt);
            }
        });
        panCrearCarrera.add(btnCrearCarreraCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 295, 50, -1));

        btnUpdateCrearCarrera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/btnEdit.png"))); // NOI18N
        btnUpdateCrearCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateCrearCarreraActionPerformed(evt);
            }
        });
        panCrearCarrera.add(btnUpdateCrearCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 295, 50, -1));

        btnDeleteCrearCarrera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/btnDelete.png"))); // NOI18N
        btnDeleteCrearCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCrearCarreraActionPerformed(evt);
            }
        });
        panCrearCarrera.add(btnDeleteCrearCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 295, -1, -1));

        btnCancelCrearCarrera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/btnCancel.png"))); // NOI18N
        btnCancelCrearCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelCrearCarreraActionPerformed(evt);
            }
        });
        panCrearCarrera.add(btnCancelCrearCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 295, -1, -1));

        tblCrearCarrera.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Carrera", "Colegio Tecnico"
            }
        ));
        tblCrearCarrera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCrearCarreraMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCrearCarrera);

        panCrearCarrera.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 65, 409, 330));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panCrearCarrera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panCrearCarrera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearCarreraCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCarreraCreateActionPerformed
        CrearCarrera ccp = new CrearCarrera();

        ccp.setCarrera(txtCrearCarreraName.getText().trim());
        ccp.setTec(txtTec.getText().trim());

        this.crearCarrera.add(ccp);

        //guardar el plato en el archivo binario
        ccp.saveCrearCarrera();

        //agregr una nueva fia a la tabla
        //primero obtener el default model de la tabla
        DefaultTableModel model = (DefaultTableModel) tblCrearCarrera.getModel();
        //generar fila
        model.addRow(new Object[]{ccp.getCarrera(),
            ccp.getTec(),});

        txtCrearCarreraName.setText("");
        txtTec.setText("");

    }//GEN-LAST:event_btnCrearCarreraCreateActionPerformed

    private void btnUpdateCrearCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCrearCarreraActionPerformed
        int option = JOptionPane.showConfirmDialog(null, "Esta seguro que desea modificar el puesto?", "Confirm", JOptionPane.WARNING_MESSAGE);

        // 0 es SI de la JOption pop up/ 1 2 , 3 etc es no 
        if (option == 0) {
            //recolectar los datos a modificar
            CrearCarrera ccp = new CrearCarrera();

            //cargar el objeto con datos
            ccp.setCarrera(txtCrearCarreraName.getText());
            ccp.setTec(txtTec.getText());

            ccp.modifyCrearCarrera(this.crearCarrera.get(index).getCarrera());

            this.loadCrearCarreraTable();
        }
    }//GEN-LAST:event_btnUpdateCrearCarreraActionPerformed

    private void btnDeleteCrearCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCrearCarreraActionPerformed
        int option = JOptionPane.showConfirmDialog(null, "Seguro que desea eliminar la carrera?", "Message", JOptionPane.WARNING_MESSAGE);

        CrearCarrera ccp = new CrearCarrera();
        //verificacion
        if (option == 0) {
            ccp.deleteCrearCarrera(txtCrearCarreraName.getText());
            this.loadCrearCarreraTable();
        }
    }//GEN-LAST:event_btnDeleteCrearCarreraActionPerformed

    private void btnCancelCrearCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelCrearCarreraActionPerformed
        txtCrearCarreraName.setText("");
        txtTec.setText("");
    }//GEN-LAST:event_btnCancelCrearCarreraActionPerformed

    private void tblCrearCarreraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCrearCarreraMouseClicked
        this.index = tblCrearCarrera.getSelectedRow();

        //obtener el palto de la lista que corresponde a la fila seleccionada
        CrearCarrera ccp = this.crearCarrera.get(index);

        //mostrar datos en el formulario
        txtCrearCarreraName.setText(ccp.getCarrera());
        txtTec.setText(ccp.getTec());
        
        DefaultTableModel model = (DefaultTableModel) tblCrearCarrera.getModel();
        model.setRowCount(0);

        //cargar los ingredientes del plato seleccionado
        for (CrearCarrera crearCarrera : this.crearCarrera.get(this.index).crearCarrera) {
            model.addRow(new Object[]{
                crearCarrera.getCarrera(),
                crearCarrera.getTec()
            });
        }
    }//GEN-LAST:event_tblCrearCarreraMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelCrearCarrera;
    private javax.swing.JButton btnCrearCarreraCreate;
    private javax.swing.JButton btnDeleteCrearCarrera;
    private javax.swing.JButton btnUpdateCrearCarrera;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCrearCarreraColeTec;
    private javax.swing.JLabel lblCrearCarreraName;
    private javax.swing.JPanel panCrearCarrera;
    private javax.swing.JTable tblCrearCarrera;
    private javax.swing.JTextField txtCrearCarreraName;
    private javax.swing.JTextField txtTec;
    // End of variables declaration//GEN-END:variables
}
