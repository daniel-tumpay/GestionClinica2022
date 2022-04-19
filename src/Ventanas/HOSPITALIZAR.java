package Ventanas;

import Clases.Doctor;
import Clases.Paciente;
import System.Sistema;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class HOSPITALIZAR extends javax.swing.JPanel {
    
    DefaultComboBoxModel m;
    
    public HOSPITALIZAR() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        CODIGO = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        telefono = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        nombre1 = new javax.swing.JLabel();
        telefono1 = new javax.swing.JLabel();
        opcmasculino = new javax.swing.JRadioButton();
        opcfemenino = new javax.swing.JRadioButton();
        jSeparator5 = new javax.swing.JSeparator();
        espec = new javax.swing.JLabel();
        comboEspecialidad = new javax.swing.JComboBox<>();
        telefono2 = new javax.swing.JLabel();
        comboCama = new javax.swing.JComboBox<>();
        jSeparator6 = new javax.swing.JSeparator();
        titulo1 = new javax.swing.JLabel();
        codigolabel = new javax.swing.JLabel();
        txtdnipaciente = new javax.swing.JTextField();
        btRegistrar1 = new javax.swing.JButton();
        btNuevo1 = new javax.swing.JButton();
        btnDarDeAlta = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        titulo.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        titulo.setText("REGISTRO DE PACIENTES");

        CODIGO.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CODIGO.setText("CÓDIGO: ");

        nombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nombre.setText("NOMBRE: ");

        telefono.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        telefono.setText("TELÉFONO:");

        nombre1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nombre1.setText("APELLIDOS: ");

        telefono1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        telefono1.setText("SEXO:");

        opcmasculino.setText("Masculino");

        opcfemenino.setText("Femenino");

        jSeparator5.setForeground(new java.awt.Color(7, 143, 193));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telefono1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nombre)
                            .addComponent(CODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(opcmasculino)
                                .addGap(18, 18, 18)
                                .addComponent(opcfemenino)))))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombre1)
                    .addComponent(telefono))
                .addGap(26, 26, 26)
                .addComponent(txttelefono)
                .addGap(196, 230, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(364, Short.MAX_VALUE)
                .addComponent(titulo)
                .addGap(419, 419, 419))
            .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre)
                    .addComponent(nombre1))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefono)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefono1)
                    .addComponent(opcmasculino)
                    .addComponent(opcfemenino))
                .addContainerGap(166, Short.MAX_VALUE))
        );

        setBackground(new java.awt.Color(255, 255, 255));

        espec.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        espec.setText("ESPECIALIDAD:");

        comboEspecialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin Seleccionar", "Medicina General", "Cardiología", "Dermatología", "Hematología", "Traumatología", "Geriatría", "Neumología", "Nefrología", "Reumatología" }));
        comboEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEspecialidadActionPerformed(evt);
            }
        });

        telefono2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        telefono2.setText("CAMA:");

        comboCama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EscojaEspecialidad" }));
        comboCama.setPreferredSize(new java.awt.Dimension(56, 28));

        jSeparator6.setForeground(new java.awt.Color(7, 143, 193));

        titulo1.setFont(new java.awt.Font("Dubai", 1, 36)); // NOI18N
        titulo1.setForeground(new java.awt.Color(0, 51, 153));
        titulo1.setText("HOSPITALIZACIÓN DE PACIENTES");

        codigolabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        codigolabel.setText("DNI PACIENTE:");

        btRegistrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar.png"))); // NOI18N
        btRegistrar1.setText("HOSPITALIZAR");
        btRegistrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegistrar1ActionPerformed(evt);
            }
        });

        btNuevo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo.jpg"))); // NOI18N
        btNuevo1.setText("   NUEVO");
        btNuevo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevo1ActionPerformed(evt);
            }
        });

        btnDarDeAlta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dar de alta.jpg"))); // NOI18N
        btnDarDeAlta.setText("DAR DE ALTA");
        btnDarDeAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDarDeAltaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(385, 385, 385)
                        .addComponent(codigolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtdnipaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(415, 415, 415)
                        .addComponent(telefono2)
                        .addGap(48, 48, 48)
                        .addComponent(comboCama, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(espec)
                                .addGap(33, 33, 33)
                                .addComponent(comboEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btNuevo1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(btRegistrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDarDeAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(193, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(titulo1)
                .addGap(236, 236, 236))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtdnipaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(espec))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboCama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefono2))
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btRegistrar1)
                    .addComponent(btNuevo1)
                    .addComponent(btnDarDeAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(153, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comboEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEspecialidadActionPerformed
        String especialidad;
        especialidad = comboEspecialidad.getSelectedItem().toString();
        if(especialidad == "Sin Seleccionar") {
            JOptionPane.showMessageDialog(this, "Primero tienes que escoger una especialidad");
        }else{
            m = new DefaultComboBoxModel (Sistema.planilla.CamasxEsp(especialidad));        
            this.comboCama.setModel(m);
        }  
    }//GEN-LAST:event_comboEspecialidadActionPerformed

    private void btRegistrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegistrar1ActionPerformed
        String dni, numcama, especialidad;
        especialidad = comboEspecialidad.getSelectedItem().toString();
        if(ValidarForm()){
            if(EstadoCama ()){
                dni = this.txtdnipaciente.getText();
                numcama = this.comboCama.getSelectedItem().toString();
                if(!Sistema.planilla.EstaHospitalizado(dni)){
                    if (Sistema.planilla.HospitalizarP(dni, numcama)) {
                        JOptionPane.showMessageDialog(this, "Paciente hospitalizado exitosamente.");
                        Sistema.planilla.RegistrarServicio(dni,"Hospitalización",especialidad);
                    }else{
                        JOptionPane.showMessageDialog(this, "Hubo un error al hospitalizar.");
                    }
                }else{
                   JOptionPane.showMessageDialog(this, "Este paciente ya estaba hospitalizado"); 
                }                
            }else{
                JOptionPane.showMessageDialog(this, "La cama que ha escogido está OCUPADA");
            }            
        }else{
            JOptionPane.showMessageDialog(this, "Ingrese todos los datos solicitados.");
        }
    }//GEN-LAST:event_btRegistrar1ActionPerformed

    private void btNuevo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevo1ActionPerformed
        txtdnipaciente.setText("");        
        comboEspecialidad.setSelectedIndex(0);
        comboCama.setSelectedIndex(0);
    }//GEN-LAST:event_btNuevo1ActionPerformed

    private void btnDarDeAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDarDeAltaActionPerformed
        String dni = JOptionPane.showInputDialog(null, "Ingrese el DNI del paciente");
        String numcama = Sistema.planilla.obtenerCamaPacienteH(dni);
        if(Sistema.planilla.BuscarPaciente(dni)){
            if(Sistema.planilla.EstaHospitalizado(dni)){
                if (Sistema.planilla.DarAlta(dni, numcama)) {
                    JOptionPane.showMessageDialog(this, "Se dió de alta al paciente exitosamente.");
                }else{
                    JOptionPane.showMessageDialog(this, "Hubo un error al dar de alta");
                }
            }else{
                JOptionPane.showMessageDialog(this, "Este paciente no estaba hospitalizado");
            }            
        }else{
            JOptionPane.showMessageDialog(this, "No hay paciente con ese DNI");
        }        
    }//GEN-LAST:event_btnDarDeAltaActionPerformed

    private boolean ValidarForm(){
        boolean result=true;
        String aux = comboCama.getSelectedItem().toString();
        if (this.txtdnipaciente.getText().equals("") ||  
                comboEspecialidad.getSelectedIndex() == 0 ||
                aux == "EscojaEspecialidad" ) {
            result=false;
        }
        return result;
    }
    private boolean EstadoCama (){
        boolean result=true;
        if (this.comboCama.getSelectedItem().toString().contains("OCUPADO")) {
            result=false;
        }
        return result;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CODIGO;
    private javax.swing.JButton btNuevo1;
    private javax.swing.JButton btRegistrar1;
    private javax.swing.JButton btnDarDeAlta;
    private javax.swing.JLabel codigolabel;
    private javax.swing.JComboBox<String> comboCama;
    private javax.swing.JComboBox<String> comboEspecialidad;
    private javax.swing.JLabel espec;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel nombre1;
    private javax.swing.JRadioButton opcfemenino;
    private javax.swing.JRadioButton opcmasculino;
    private javax.swing.JLabel telefono;
    private javax.swing.JLabel telefono1;
    private javax.swing.JLabel telefono2;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel titulo1;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtdnipaciente;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables

}
