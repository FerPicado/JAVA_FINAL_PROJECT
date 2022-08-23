package vista;

public class mdiMain extends javax.swing.JFrame {

    public mdiMain() {
        initComponents();
        
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        desktopPane = new javax.swing.JDesktopPane();
        dskMain = new javax.swing.JDesktopPane();
        lblTxtEmpresa = new javax.swing.JLabel();
        lblEmpresaBienv = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        mnuUsers = new javax.swing.JMenu();
        mniUsers = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        mniEmployees = new javax.swing.JMenuItem();
        mnuCarrera = new javax.swing.JMenu();
        mniCarrera = new javax.swing.JMenuItem();
        mniCrearCarrera = new javax.swing.JMenuItem();
        mnuPuestos = new javax.swing.JMenu();
        mniPuestos = new javax.swing.JMenuItem();
        mnuPlanilla = new javax.swing.JMenu();
        mniPlanillas = new javax.swing.JMenuItem();
        fileMenu = new javax.swing.JMenu();
        exitMenuItem = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dskMain.setPreferredSize(new java.awt.Dimension(2000, 800));

        lblTxtEmpresa.setFont(new java.awt.Font("Hack Nerd Font", 2, 48)); // NOI18N
        lblTxtEmpresa.setText("GRUPO EDUCATIVO CR");

        lblEmpresaBienv.setFont(new java.awt.Font("Hack Nerd Font", 2, 36)); // NOI18N
        lblEmpresaBienv.setText("Bienvenido");

        dskMain.setLayer(lblTxtEmpresa, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dskMain.setLayer(lblEmpresaBienv, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout dskMainLayout = new javax.swing.GroupLayout(dskMain);
        dskMain.setLayout(dskMainLayout);
        dskMainLayout.setHorizontalGroup(
            dskMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dskMainLayout.createSequentialGroup()
                .addGroup(dskMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dskMainLayout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(lblTxtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dskMainLayout.createSequentialGroup()
                        .addGap(429, 429, 429)
                        .addComponent(lblEmpresaBienv)))
                .addContainerGap(288, Short.MAX_VALUE))
        );
        dskMainLayout.setVerticalGroup(
            dskMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dskMainLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(lblTxtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(lblEmpresaBienv, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(288, Short.MAX_VALUE))
        );

        desktopPane.add(dskMain);
        dskMain.setBounds(0, 0, 1120, 480);

        mnuUsers.setText("Users");

        mniUsers.setText("Create/view users");
        mniUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniUsersActionPerformed(evt);
            }
        });
        mnuUsers.add(mniUsers);

        menuBar.add(mnuUsers);

        jMenu1.setText("Empleados");

        mniEmployees.setText("Ingresar");
        mniEmployees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniEmployeesActionPerformed(evt);
            }
        });
        jMenu1.add(mniEmployees);

        menuBar.add(jMenu1);

        mnuCarrera.setText("Carreras");

        mniCarrera.setText("Ver");
        mniCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCarreraActionPerformed(evt);
            }
        });
        mnuCarrera.add(mniCarrera);

        mniCrearCarrera.setText("Crear");
        mniCrearCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCrearCarreraActionPerformed(evt);
            }
        });
        mnuCarrera.add(mniCrearCarrera);

        menuBar.add(mnuCarrera);

        mnuPuestos.setText("Puestos");

        mniPuestos.setText("Ver puestos");
        mniPuestos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniPuestosActionPerformed(evt);
            }
        });
        mnuPuestos.add(mniPuestos);

        menuBar.add(mnuPuestos);

        mnuPlanilla.setMnemonic('h');
        mnuPlanilla.setText("Planillas");

        mniPlanillas.setMnemonic('c');
        mniPlanillas.setText("Ingresar");
        mniPlanillas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniPlanillasActionPerformed(evt);
            }
        });
        mnuPlanilla.add(mniPlanillas);

        menuBar.add(mnuPlanilla);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Mas");

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniPlanillasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniPlanillasActionPerformed
        ifrmPlanillas wPlanilla = new ifrmPlanillas();
        wPlanilla.setSize(1200, 1200);

        dskMain.add(wPlanilla);
        wPlanilla.setVisible(true);
    }//GEN-LAST:event_mniPlanillasActionPerformed

    private void mniUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniUsersActionPerformed
        ifrmUsers wUser = new ifrmUsers();
        wUser.setSize(2500, 2500);
        dskMain.add(wUser);
        wUser.setVisible(true);
        
    }//GEN-LAST:event_mniUsersActionPerformed

    private void mniEmployeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniEmployeesActionPerformed
        ifrmEmployee wEmployee = new ifrmEmployee();
        wEmployee.setSize(1200, 1200);
        dskMain.add(wEmployee);
        wEmployee.setVisible(true);
    }//GEN-LAST:event_mniEmployeesActionPerformed

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void mniCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCarreraActionPerformed
        ifrmCarreraProfesional wCarreraProf = new ifrmCarreraProfesional();
        wCarreraProf.setSize(2500, 2500);

        dskMain.add(wCarreraProf);
        wCarreraProf.setVisible(true);
    }//GEN-LAST:event_mniCarreraActionPerformed

    private void mniPuestosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniPuestosActionPerformed
        ifrmPuestoTrabajo wPuesto = new ifrmPuestoTrabajo();
        wPuesto.setSize(2500,2500);
        dskMain.add(wPuesto);
        wPuesto.setVisible(true);
    }//GEN-LAST:event_mniPuestosActionPerformed

    private void mniCrearCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCrearCarreraActionPerformed
        ifrmCrearCarrera wCarreraProf = new ifrmCrearCarrera();
        dskMain.add(wCarreraProf);
        wCarreraProf.setVisible(true);
    }//GEN-LAST:event_mniCrearCarreraActionPerformed

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
            java.util.logging.Logger.getLogger(mdiMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mdiMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mdiMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mdiMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mdiMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JDesktopPane dskMain;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel lblEmpresaBienv;
    private javax.swing.JLabel lblTxtEmpresa;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem mniCarrera;
    private javax.swing.JMenuItem mniCrearCarrera;
    private javax.swing.JMenuItem mniEmployees;
    private javax.swing.JMenuItem mniPlanillas;
    private javax.swing.JMenuItem mniPuestos;
    private javax.swing.JMenuItem mniUsers;
    private javax.swing.JMenu mnuCarrera;
    private javax.swing.JMenu mnuPlanilla;
    private javax.swing.JMenu mnuPuestos;
    private javax.swing.JMenu mnuUsers;
    // End of variables declaration//GEN-END:variables

}
