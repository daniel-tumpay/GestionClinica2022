package Ventanas;
import Clases.Paciente;
import System.Sistema;
import javax.swing.JOptionPane;

public class REPORTE_PACIENTE_H extends javax.swing.JPanel {
    public REPORTE_PACIENTE_H() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        titulo1 = new javax.swing.JLabel();
        labelingresa = new javax.swing.JLabel();
        txtcodigobuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        txtnombre = new javax.swing.JTextField();
        labelapellidop = new javax.swing.JLabel();
        txtapellido = new javax.swing.JTextField();
        labelgenero = new javax.swing.JLabel();
        labelnombre = new javax.swing.JLabel();
        labelcama = new javax.swing.JLabel();
        txtcama = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        btnNuevaConsult = new java.awt.Button();
        txtsexo = new javax.swing.JTextField();

        titulo.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        titulo.setText("REGISTRO DE PACIENTES");

        jSeparator5.setForeground(new java.awt.Color(7, 143, 193));

        setBackground(new java.awt.Color(255, 255, 255));

        titulo1.setFont(new java.awt.Font("Dubai", 1, 36)); // NOI18N
        titulo1.setForeground(new java.awt.Color(0, 51, 153));
        titulo1.setText("BUSQUEDA DE PACIENTES HOSPITALIZADOS");

        labelingresa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelingresa.setText("INGRESA EL CODIGO DEL PACIENTE");

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        labelapellidop.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelapellidop.setText("APELLIDOS: ");

        labelgenero.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelgenero.setText("SEXO: ");

        labelnombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelnombre.setText("NOMBRE: ");

        labelcama.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelcama.setText("CAMA: ");

        jSeparator6.setForeground(new java.awt.Color(7, 143, 193));

        btnNuevaConsult.setBackground(new java.awt.Color(0, 153, 153));
        btnNuevaConsult.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnNuevaConsult.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevaConsult.setLabel("NUEVA CONSULTA");
        btnNuevaConsult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaConsultActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator6)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelingresa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtcodigobuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelapellidop)
                        .addGap(53, 53, 53))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(labelgenero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 412, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtsexo, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelnombre)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(114, 114, 114)))
                        .addComponent(labelcama)
                        .addGap(74, 74, 74)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcama))
                .addContainerGap(128, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(376, 376, 376)
                .addComponent(btnNuevaConsult, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titulo1)
                .addGap(165, 165, 165))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelingresa)
                    .addComponent(txtcodigobuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelnombre)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelapellidop)
                    .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelgenero)
                    .addComponent(txtsexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelcama))
                .addGap(67, 67, 67)
                .addComponent(btnNuevaConsult, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String codigobus = txtcodigobuscar.getText();  
        Paciente p = new Paciente () ;
        
        String numcama = Sistema.planilla.obtenerCamaPacienteH(codigobus);        
        p = Sistema.planilla.ObtenerPaciente(codigobus);
        
        if(txtcodigobuscar.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Tiene que ingresar un codigo");
        }else{
            if(p.isHospitalizado()){
                txtnombre.setText(p.getNombre());
                txtapellido.setText(p.getApellido());
                txtsexo.setText(p.getSexo());
                txtcama.setText(numcama);
            }else{
                JOptionPane.showMessageDialog(this, "El DNI le pertenece a un paciente no hospitalizado");
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnNuevaConsultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaConsultActionPerformed
        this.txtcodigobuscar.setText("");
        //------------------------------
        this.txtapellido.setText("");
        this.txtcama.setText("");
        this.txtsexo.setText("");        
        this.txtnombre.setText("");
    }//GEN-LAST:event_btnNuevaConsultActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private java.awt.Button btnNuevaConsult;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel labelapellidop;
    private javax.swing.JLabel labelcama;
    private javax.swing.JLabel labelgenero;
    private javax.swing.JLabel labelingresa;
    private javax.swing.JLabel labelnombre;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel titulo1;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcama;
    private javax.swing.JTextField txtcodigobuscar;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtsexo;
    // End of variables declaration//GEN-END:variables
}
