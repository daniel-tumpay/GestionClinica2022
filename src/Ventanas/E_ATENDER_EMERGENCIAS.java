package Ventanas;

import Clases.AtencionEmergencia;
import Clases.Paciente;
import Clases.Servicio;
import Listas.Cola;
import Listas.Pila;
import System.Sistema;
import static Ventanas.Gestion.PANEL_INTRO;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;

public class E_ATENDER_EMERGENCIAS extends javax.swing.JPanel {
    Cola emergencias = new Cola ();
    Pila historial = new Pila ();
    
    public E_ATENDER_EMERGENCIAS() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator3 = new javax.swing.JSeparator();
        titulo = new javax.swing.JLabel();
        CODIGO = new javax.swing.JLabel();
        txtdni = new javax.swing.JTextField();
        nombre = new javax.swing.JLabel();
        combonivel = new javax.swing.JComboBox<>();
        nombre1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCausa = new javax.swing.JTextArea();
        flecah = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        btnInsertarCola = new java.awt.Button();
        btnEliminarCola = new java.awt.Button();
        btnMostrarCola = new java.awt.Button();
        btnPrimeroCola = new java.awt.Button();
        btnPila = new java.awt.Button();

        setBackground(new java.awt.Color(255, 255, 255));

        jSeparator3.setForeground(new java.awt.Color(7, 143, 193));

        titulo.setFont(new java.awt.Font("Dubai", 1, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(0, 51, 153));
        titulo.setText("ATENCIÓN POR EMERGENCIA");

        CODIGO.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CODIGO.setText("DNI:");

        nombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nombre.setText("NIVEL:");

        combonivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));

        nombre1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nombre1.setText("CAUSA:");

        txtCausa.setColumns(20);
        txtCausa.setRows(5);
        jScrollPane1.setViewportView(txtCausa);

        flecah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flechalabel.png"))); // NOI18N

        area.setColumns(20);
        area.setRows(5);
        jScrollPane2.setViewportView(area);

        btnInsertarCola.setBackground(new java.awt.Color(0, 153, 153));
        btnInsertarCola.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnInsertarCola.setForeground(new java.awt.Color(255, 255, 255));
        btnInsertarCola.setLabel("INSERTAR ATENCIÓN");
        btnInsertarCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarColaActionPerformed(evt);
            }
        });

        btnEliminarCola.setBackground(new java.awt.Color(0, 153, 153));
        btnEliminarCola.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEliminarCola.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarCola.setLabel("ATENDER Y ELIMINAR");
        btnEliminarCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarColaActionPerformed(evt);
            }
        });

        btnMostrarCola.setBackground(new java.awt.Color(0, 153, 153));
        btnMostrarCola.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnMostrarCola.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrarCola.setLabel("MOSTRAR COLA");
        btnMostrarCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarColaActionPerformed(evt);
            }
        });

        btnPrimeroCola.setBackground(new java.awt.Color(0, 153, 153));
        btnPrimeroCola.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPrimeroCola.setForeground(new java.awt.Color(255, 255, 255));
        btnPrimeroCola.setLabel("PRIMERO EN COLA");
        btnPrimeroCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeroColaActionPerformed(evt);
            }
        });

        btnPila.setBackground(new java.awt.Color(0, 153, 153));
        btnPila.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPila.setForeground(new java.awt.Color(255, 255, 255));
        btnPila.setLabel("PILA DE ATENCIONES POR EMERGENCIA");
        btnPila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPilaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator3)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre)
                            .addComponent(nombre1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtdni, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                            .addComponent(combonivel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(flecah)
                        .addGap(76, 76, 76))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnInsertarCola, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnPrimeroCola, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnMostrarCola, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEliminarCola, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(btnPila, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titulo)
                .addGap(299, 299, 299))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(235, 235, 235)
                                .addComponent(flecah))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtdni, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombre)
                            .addComponent(combonivel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombre1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnInsertarCola, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminarCola, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMostrarCola, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPrimeroCola, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(btnPila, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertarColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarColaActionPerformed
        String dni = txtdni.getText();
        String causa= txtCausa.getText();
        int nivel = Integer.parseInt(combonivel.getSelectedItem().toString());
            
        Paciente p = Sistema.planilla.ObtenerPaciente(dni);
        Servicio s = new Servicio ();
        s.setCausa(causa);
        s.setTipo("Emergencia");
        s.setNivel(String.valueOf(nivel));
        
        String nombrepaciente = p.getNombre() + " " + p.getApellido();
         
        if(ValidarForm()){            
            AtencionEmergencia at = new AtencionEmergencia (nombrepaciente, nivel, causa);
            emergencias.Encolar(at);
            Sistema.planilla.RegistrarServicio2 (dni,s);
            JOptionPane.showMessageDialog(this, "Atención registrada con éxito.");
        }else{
            JOptionPane.showMessageDialog(this, "Debe ingresar todos los datos");
        }        
    }//GEN-LAST:event_btnInsertarColaActionPerformed

    private void btnEliminarColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarColaActionPerformed
        AtencionEmergencia UltAtencion = emergencias.primero();
        historial.InsertarNodo(UltAtencion);
        emergencias.EliminarInicio();        
    }//GEN-LAST:event_btnEliminarColaActionPerformed

    private void btnMostrarColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarColaActionPerformed
        String cola = "";
        cola = emergencias.Cola();
        area.setText(cola);
    }//GEN-LAST:event_btnMostrarColaActionPerformed

    private void btnPrimeroColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeroColaActionPerformed
        String primero = "";
        primero = emergencias.DatosPrimero();
        area.setText(primero);
    }//GEN-LAST:event_btnPrimeroColaActionPerformed

    private void btnPilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPilaActionPerformed
        String historialpila = "";
        historialpila = historial.Pila();
        area.setText(historialpila);
    }//GEN-LAST:event_btnPilaActionPerformed

    private boolean ValidarForm(){
        boolean result=true;
        if (this.txtdni.getText().equals("") || 
                this.txtCausa.getText().equals("")){
            result=false;
        }
        return result;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CODIGO;
    private javax.swing.JTextArea area;
    private java.awt.Button btnEliminarCola;
    private java.awt.Button btnInsertarCola;
    private java.awt.Button btnMostrarCola;
    private java.awt.Button btnPila;
    private java.awt.Button btnPrimeroCola;
    private javax.swing.JComboBox<String> combonivel;
    private javax.swing.JLabel flecah;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel nombre1;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextArea txtCausa;
    private javax.swing.JTextField txtdni;
    // End of variables declaration//GEN-END:variables
}

