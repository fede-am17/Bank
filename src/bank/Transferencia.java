
package bank;

import java.io.*;
import javax.swing.*;

public class Transferencia extends javax.swing.JFrame {

    private String usuarioOrigen;
    private String numeroCuentaOrigen;
    private String monedaCuentaOrigen;
    private double saldoCuentaOrigen;

    public Transferencia(String usuarioOrigen, String numeroCuentaOrigen, String monedaCuentaOrigen, double saldoCuentaOrigen) {
        this.usuarioOrigen = usuarioOrigen;
        this.numeroCuentaOrigen = numeroCuentaOrigen;
        this.monedaCuentaOrigen = monedaCuentaOrigen;
        this.saldoCuentaOrigen = saldoCuentaOrigen;
        initComponents();
        cargarDatosCuentaOrigen();
    }

    
    /**
     * Metodo que carga los datos de la cuenta bancaria de origen 
     * No tiene parametros
     * No tiene retornos
     * @exception Mensaje de error
     * Carga los datos de la cuenta origen y se prepara para hacer la transferencia a la cuenta que se quiera transferir
     */
    private void cargarDatosCuentaOrigen() {
        try {
            // Recuperar detalles de la cuenta del remitente
            File directorioCuentaOrigen = new File("Cuentas/" + usuarioOrigen + "/" + numeroCuentaOrigen);
            monedaCuentaOrigen = leerArchivo(new File(directorioCuentaOrigen, "cuentasEn.txt"));
            saldoCuentaOrigen = Double.parseDouble(leerArchivo(new File(directorioCuentaOrigen, "balance.txt")));
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(rootPane, "Error al cargar datos de la cuenta de origen.", "Error", JOptionPane.ERROR_MESSAGE);
            this.dispose();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CuentaT = new javax.swing.JLabel();
        MontoT = new javax.swing.JLabel();
        CuentaTrans = new javax.swing.JTextField();
        MontoTrans = new javax.swing.JTextField();
        Transfe = new javax.swing.JButton();
        AtrasR = new javax.swing.JLabel();
        NombreT = new javax.swing.JLabel();
        nombreTrans = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(153, 51, 255));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("RobotBank");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(201, 201, 201))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 255));
        jLabel3.setText("TRANSFERENCIA ");

        CuentaT.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        CuentaT.setForeground(new java.awt.Color(153, 51, 255));
        CuentaT.setText("Nro de la cuenta a trasferir:");

        MontoT.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        MontoT.setForeground(new java.awt.Color(153, 51, 255));
        MontoT.setText("Monto: ");

        CuentaTrans.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        CuentaTrans.setForeground(new java.awt.Color(255, 0, 51));
        CuentaTrans.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        MontoTrans.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        MontoTrans.setForeground(new java.awt.Color(255, 0, 51));
        MontoTrans.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Transfe.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        Transfe.setText("Listo");
        Transfe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TransfeMouseClicked(evt);
            }
        });

        AtrasR.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        AtrasR.setForeground(new java.awt.Color(153, 51, 255));
        AtrasR.setText("Atras");
        AtrasR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AtrasRMouseClicked(evt);
            }
        });

        NombreT.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        NombreT.setForeground(new java.awt.Color(153, 51, 255));
        NombreT.setText("Nombre de la cuenta a trasferir:");

        nombreTrans.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        nombreTrans.setForeground(new java.awt.Color(255, 0, 51));
        nombreTrans.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(AtrasR))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CuentaT)
                            .addComponent(MontoT)
                            .addComponent(NombreT))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CuentaTrans, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MontoTrans, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombreTrans, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(Transfe))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(jLabel3)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreTrans, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CuentaT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CuentaTrans, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MontoT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MontoTrans, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(Transfe)
                .addGap(12, 12, 12)
                .addComponent(AtrasR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
     * Metodo que gestiona la transferencia de dinero entre cuentas
     * No tiene parametros
     * No tiene retornos 
     * @exception Un mensaje de error 
     * Obtiene datos para hacer la transferencia y corrobora si los tipos de moneda son iguales o diferentes
     * de ser iguales se transfiere el monto como está pero si son diferentes busca cambiarla al tipo de moneda
     * y asi tranfiere correctamente respetando el tipo de cambio
     */
    private void TransfeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TransfeMouseClicked
        String usuarioDestino = nombreTrans.getText();
        String numeroCuentaDestino = CuentaTrans.getText();
        double montoATransferir = Double.parseDouble(MontoTrans.getText());

        try {
            // Recuperar detalles de la cuenta del destinatario
            File directorioCuentaDestino = new File("Cuentas/" + usuarioDestino + "/" + numeroCuentaDestino);
            String monedaCuentaDestino = leerArchivo(new File(directorioCuentaDestino, "cuentasEn.txt"));
            double saldoCuentaDestino = Double.parseDouble(leerArchivo(new File(directorioCuentaDestino, "balance.txt")));

            // Convertir el monto si es necesario
            double montoConvertido = convertir(montoATransferir, monedaCuentaOrigen, monedaCuentaDestino);

            // Realizar la transferencia
            if (saldoCuentaOrigen >= montoATransferir) {
                saldoCuentaOrigen -= montoATransferir;
                saldoCuentaDestino += montoConvertido;

                // Actualizar saldos de las cuentas
                escribirArchivo(new File("Cuentas/" + usuarioOrigen + "/" + numeroCuentaOrigen + "/balance.txt"), String.valueOf(saldoCuentaOrigen));
                escribirArchivo(new File("Cuentas/" + usuarioDestino + "/" + numeroCuentaDestino + "/balance.txt"), String.valueOf(saldoCuentaDestino));

                JOptionPane.showMessageDialog(rootPane, "Transferencia realizada con éxito.");
                registrarTransaccion("Transferencia de salida", montoATransferir, usuarioOrigen, numeroCuentaOrigen);
                registrarTransaccion("Transferencia de entrada", montoConvertido, usuarioDestino, numeroCuentaDestino);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Saldo insuficiente.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(rootPane, "Error al realizar la transferencia.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_TransfeMouseClicked
    
    /**
     * Lo que hace este metodo es registrar la operacion en el Historial
     * @param tipo Tiene el tipo de cuenta
     * @param monto Tiene el monto que fue transferido
     * @param usuario Tiene al usuario que hizo dicha transferencia
     * @param numeroCuenta Tiene el numero de cuenta a transferir 
     * Tiene una excepcion un mensaje de error
     * Este metodo manda el a regisrar dicha operacion a Historial
     */
    protected void registrarTransaccion(String tipo, double monto, String usuario, String numeroCuenta) {
        String rutaCarpetaUsuario = "Cuentas/" + usuario + "/" + numeroCuenta;
        File archivoHistorial = new File(rutaCarpetaUsuario, "historial.txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivoHistorial, true))) {
            writer.write(tipo + "," + monto);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * Metodo que lee un archivo y lo devuelve como una cadena
     * @param archivo 
     * @return String 
     * @exception IOException Mensaje de error
     * Simplemente lee la primera linea de un archivo
     */
    private String leerArchivo(File archivo) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(archivo));
        String contenido = reader.readLine();
        reader.close();
        return contenido;
    }
    
    /**
     * Escribe el contenido en los archivos
     * @param archivo
     * @param contenido
     * No cuenta con retorno
     * @exception IOException Mensaje de error
     * Este método sobrescribe el contenido existente del archivo con el nuevo contenido proporcionado
     */
    private void escribirArchivo(File archivo, String contenido) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(archivo));
        writer.write(contenido);
        writer.close();
    }

    /**
     * Este metodo convierte un monto de una moneda a otra según tasas de conversión predefinidas
     * @param monto
     * @param desdeMoneda
     * @param haciaMoneda
     * @return double 
     * @exception IllegalArgumentException
     * Este método convierte montos entre Bolivianos, Dólares, y Euros 
     * usando tasas de cambio específicas
     */
    private double convertir(double monto, String desdeMoneda, String haciaMoneda) {
        if (desdeMoneda.equals(haciaMoneda)) {
            return monto;
        }

        switch (desdeMoneda + "_" + haciaMoneda) {
            case "Bs._$.": return monto / 6.96;
            case "Bs._€.": return monto / 8.26;
            case "$._Bs.": return monto * 6.96;
            case "$._€.": return monto * 0.83;
            case "€._Bs.": return monto * 8.26;
            case "€._$.": return monto / 0.83;
            default: throw new IllegalArgumentException("Conversión de moneda no válida: " + desdeMoneda + " a " + haciaMoneda);
        }
    }

    /**
     * Metodo que borra los label de Cuenta a transferir y monto a transferir
     * No tiene parametros
     * No tiene retornos
     * No tiene excepciones
     * Es llamado por el metodo Transferir, para dejar los labels vacios
     */
    private void borrar() {
        CuentaTrans.setText("");
        MontoTrans.setText("");
    }
    
    /**
     * Metodo que nos permite ir a atras
     * No tiene parametros
     * No tiene retornos
     * No tiene excepciones
     * Es un boton que al momento de dar click nos manda atras
     */
    private void AtrasRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AtrasRMouseClicked
        new Menu(usuarioOrigen, numeroCuentaOrigen, monedaCuentaOrigen, saldoCuentaOrigen).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AtrasRMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AtrasR;
    private javax.swing.JLabel CuentaT;
    private javax.swing.JTextField CuentaTrans;
    private javax.swing.JLabel MontoT;
    private javax.swing.JTextField MontoTrans;
    private javax.swing.JLabel NombreT;
    private javax.swing.JButton Transfe;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nombreTrans;
    // End of variables declaration//GEN-END:variables
}
