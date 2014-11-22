package libreria;
import javax.swing.JOptionPane;

public class SeguridadUsuarios extends javax.swing.JFrame {
    String user = "user";
    String admin = "admin";
    int acmd =0;
    
    public SeguridadUsuarios() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        pswContraseña = new javax.swing.JPasswordField();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("USUARIO");

        jLabel2.setText("CONTASEÑA");

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAceptar)
                        .addGap(84, 84, 84)
                        .addComponent(btnCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(pswContraseña))))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pswContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        
            if (String.valueOf(txtUsuario.getText()).compareTo("") == 0 && String.valueOf(pswContraseña.getPassword()).compareTo("") == 0) {
                JOptionPane.showMessageDialog(rootPane, "Los parametros estan vacios");
                acmd++;
                 if (acmd == 3) {
                     dispose();
                 }
            } else {
                if (String.valueOf(txtUsuario.getText()).compareTo(txtUsuario.getText()) == 0 && String.valueOf(pswContraseña.getText()).compareTo("") == 0) {
                    JOptionPane.showMessageDialog(rootPane, "El parametro contraseña esta vacio");
                    acmd++;
                    if (acmd == 3) {
                     dispose();
                 }
                } else {
                    if (String.valueOf(txtUsuario.getText()).compareTo("") == 0 && String.valueOf(pswContraseña.getPassword()).compareTo(pswContraseña.getText()) == 0) {
                        JOptionPane.showMessageDialog(rootPane, "El parametro usuario esta vacio");
                        acmd++;
                        if (acmd == 3) {
                     dispose();
                 }
                    } else {
                        if (String.valueOf(txtUsuario.getText()).compareTo(user) == 0 && String.valueOf(pswContraseña.getText()).compareTo(admin) == 0) {
                            FormUsuario obj= new FormUsuario();
                            obj.setVisible(true);
                            dispose();
                        } else {

                            JOptionPane.showMessageDialog(rootPane, "Usuario o contraseña incorecta", "ERROR DE CODIGO", JOptionPane.ERROR_MESSAGE);
                            acmd++;
                            if (acmd == 3) {
                     dispose();
                 }
                        }
                    }
                }
            }

        


    }//GEN-LAST:event_btnAceptarActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeguridadUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField pswContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
