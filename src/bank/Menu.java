
package bank;

import java.io.*;
import java.nio.file.*;
import java.util.List;
import javax.swing.*;

public class Menu extends javax.swing.JFrame {

    private String nombreCompleto;
    private String numeroCuenta;
    private String tipoMonedaSeleccionado;
    private double balance;

    public Menu() {
        initComponents();
    }

    public Menu(String nombreCompleto, String numeroCuenta, String tipoMonedaSeleccionado, double balance) {
        initComponents();
        this.nombreCompleto = nombreCompleto;
        this.numeroCuenta = numeroCuenta;
        this.tipoMonedaSeleccionado = tipoMonedaSeleccionado;
        this.balance = balance;
        NombreCompletoLabel.setText(nombreCompleto);
        CuentaNumero.setText(numeroCuenta);
        BalanceLabel.setText(String.valueOf(balance));
        TipoMoneda.setSelectedItem(tipoMonedaSeleccionado);
    }


    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        TipoMoneda = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        Deposito = new javax.swing.JButton();
        Retiro = new javax.swing.JButton();
        Transfe = new javax.swing.JButton();
        Historial = new javax.swing.JButton();
        CambioContraseña = new javax.swing.JButton();
        NombreCompletoLabel = new javax.swing.JLabel();
        CuentaNumero = new javax.swing.JLabel();
        BalanceLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(153, 51, 255));

        jLabel2.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel2.setText("Seleccione su transacción");

        TipoMoneda.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        TipoMoneda.setForeground(new java.awt.Color(255, 0, 0));
        TipoMoneda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bs.", "$.", "€." }));
        TipoMoneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoMonedaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(294, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TipoMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(TipoMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 255));
        jLabel3.setText("Nombre Completo de Usuario:");

        Deposito.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        Deposito.setText("DEPOSITO");
        Deposito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DepositoMouseClicked(evt);
            }
        });
        Deposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepositoActionPerformed(evt);
            }
        });

        Retiro.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        Retiro.setText("RETIRO");
        Retiro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RetiroMouseClicked(evt);
            }
        });

        Transfe.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        Transfe.setText("TRANSFERENCIA");
        Transfe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TransfeMouseClicked(evt);
            }
        });
        Transfe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransfeActionPerformed(evt);
            }
        });

        Historial.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        Historial.setText("HISTORIAL ");
        Historial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HistorialMouseClicked(evt);
            }
        });
        Historial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistorialActionPerformed(evt);
            }
        });

        CambioContraseña.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        CambioContraseña.setText("CAMBIAR PIN");
        CambioContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CambioContraseñaMouseClicked(evt);
            }
        });
        CambioContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CambioContraseñaActionPerformed(evt);
            }
        });

        NombreCompletoLabel.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        NombreCompletoLabel.setForeground(new java.awt.Color(255, 0, 51));

        CuentaNumero.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        CuentaNumero.setForeground(new java.awt.Color(255, 0, 51));
        CuentaNumero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        BalanceLabel.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        BalanceLabel.setForeground(new java.awt.Color(255, 0, 0));
        BalanceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CuentaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BalanceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(Transfe))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(75, 75, 75)
                            .addComponent(Deposito)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CambioContraseña))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(90, 90, 90)
                            .addComponent(Retiro)
                            .addGap(171, 171, 171)
                            .addComponent(Historial)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addGap(33, 33, 33)
                        .addComponent(NombreCompletoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombreCompletoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(Historial)
                        .addGap(32, 32, 32)
                        .addComponent(CambioContraseña)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CuentaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BalanceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(Retiro)
                        .addGap(12, 12, 12)
                        .addComponent(Deposito)
                        .addGap(15, 15, 15)
                        .addComponent(Transfe)
                        .addGap(47, 47, 47))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Metodo que nos permite ir a Deposito
     * No tiene parametros
     * No tiene retornos
     * No tiene excepciones
     * Funciona al precionar el boton de Deposito
     */
    private void DepositoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DepositoMouseClicked
        Deposito deposito = new Deposito(nombreCompleto, numeroCuenta, tipoMonedaSeleccionado, balance);
        deposito.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DepositoMouseClicked

    private void DepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepositoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DepositoActionPerformed
    
    /**
     * Metodo que nos permite ir a Retiro
     * No tiene parametros
     * No tiene retornos
     * No tiene excepciones
     * Funciona al precionar el boton de Retiro
     */
    private void RetiroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RetiroMouseClicked
        Retiro retiro = new Retiro(nombreCompleto, numeroCuenta, tipoMonedaSeleccionado, balance);
        retiro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RetiroMouseClicked
    
    /**
     * Metodo que nos permite ir a Transferencia
     * No tiene parametros
     * No tiene retornos
     * No tiene excepciones
     * Funciona al precionar el boton de Transferencia
     */
    private void TransfeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TransfeMouseClicked
        Transferencia transferencia = new Transferencia(nombreCompleto, numeroCuenta, tipoMonedaSeleccionado, balance);
        transferencia.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_TransfeMouseClicked
    
    /**
     * Metodo que nos permite ir a Cambiar PIN
     * No tiene parametros
     * No tiene retornos
     * No tiene excepciones
     * Funciona al precionar el boton de Cambiar PIN
     */
    private void CambioContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CambioContraseñaMouseClicked
        CambiarPIN cambio = new CambiarPIN(nombreCompleto, numeroCuenta, tipoMonedaSeleccionado, balance);
        cambio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CambioContraseñaMouseClicked

    private void HistorialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HistorialMouseClicked
        //
    }//GEN-LAST:event_HistorialMouseClicked
    
    /**
     * Este metodo nos permite elegir entre el tipo de moneda
     * No tiene parametros
     * No tiene retornos, pero si actializa el estado del combo box dentro de la cuenta del usuario
     * No tiene excepciones
     * El usuario puede escoger las cuentas que tenga con el combo box, eligioendo el tipo de moneda de dicha cuenta
     */
    private void TipoMonedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoMonedaActionPerformed
        tipoMonedaSeleccionado = (String) TipoMoneda.getSelectedItem();
        actualizarDatosCuenta();
    }//GEN-LAST:event_TipoMonedaActionPerformed

    private void TransfeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransfeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TransfeActionPerformed
    
    /**
     * Metodo que nos permite ir a Deposito
     * No tiene parametros
     * No tiene retornos
     * No tiene excepciones
     * Funciona al precionar el boton de Deposito
     */
    private void HistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistorialActionPerformed
        Historial historial = new Historial(nombreCompleto, numeroCuenta, tipoMonedaSeleccionado, balance);
        historial.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HistorialActionPerformed

    private void CambioContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CambioContraseñaActionPerformed
        
    }//GEN-LAST:event_CambioContraseñaActionPerformed

    
    /**
     * Este metodo nos permite actulizar los datos mostrados en Menu
     * No tiene parametros
     * No tiene retornos
     * @exception un mensaje de error, pero no va a suceder por que si o si tiene existir una cuenta para entrar a Menu
     * Si el usuario decide cambiar la cuenta en Bs a $ cambia su balance y numero de cuenta, ese es el funcionamiento 
     */
    private void actualizarDatosCuenta() {
        // Ruta de la carpeta del usuario
        String rutaCarpetaUsuario = "Cuentas/" + nombreCompleto;
        
        // Leer archivos en la carpeta del usuario
        File carpetaUsuario = new File(rutaCarpetaUsuario);
        File[] archivos = carpetaUsuario.listFiles();

        if (archivos != null) {
            for (File archivo : archivos) {
                if (archivo.isDirectory()) {
                    File cuentaEnFile = new File(archivo, "cuentasEn.txt");
                    if (cuentaEnFile.exists()) {
                        try {
                            List<String> lineas = Files.readAllLines(cuentaEnFile.toPath());
                            if (lineas.size() >= 1) {
                                String tipoMoneda = lineas.get(0).trim();
                                if (tipoMoneda.equals(tipoMonedaSeleccionado)) {
                                    numeroCuenta = archivo.getName();
                                    balance = Double.parseDouble(Files.readAllLines(new File(archivo, "balance.txt").toPath()).get(0).trim());
                                    CuentaNumero.setText(numeroCuenta);
                                    BalanceLabel.setText(String.valueOf(balance));
                                    break;
                                }
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
    
    
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu("Juan Perez", "12345", "Bs.", 1000.00).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BalanceLabel;
    private javax.swing.JButton CambioContraseña;
    private javax.swing.JLabel CuentaNumero;
    private javax.swing.JButton Deposito;
    private javax.swing.JButton Historial;
    private javax.swing.JLabel NombreCompletoLabel;
    private javax.swing.JButton Retiro;
    private javax.swing.JComboBox<String> TipoMoneda;
    private javax.swing.JButton Transfe;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
