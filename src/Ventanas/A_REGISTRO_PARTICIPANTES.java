package Ventanas;

import System.Sistema;
import static Ventanas.Gestion.PANEL_INTRO;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;

public class A_REGISTRO_PARTICIPANTES extends javax.swing.JPanel {
    
    String[] arreglo = new String [16];
    int x = 0;
    int octavos = 1, cuartos = 2, semifinal = 4;
    int padreo = 2, padrec = 4, padreS = 8;
    
    
    public A_REGISTRO_PARTICIPANTES() {
        initComponents();
        txtregistrados.setText(String.valueOf(Sistema.planilla.torneito.registrados));
        txtcupos.setText(String.valueOf(Sistema.planilla.torneito.cupos));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator7 = new javax.swing.JSeparator();
        titulo = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtregistrados = new javax.swing.JTextField();
        txtcupos = new javax.swing.JTextField();
        labelingresa1 = new javax.swing.JLabel();
        nombre1 = new javax.swing.JLabel();
        txtnombredoc = new javax.swing.JTextField();
        nombre2 = new javax.swing.JLabel();
        txtapellido = new javax.swing.JTextField();
        tituloFase = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        part1 = new javax.swing.JLabel();
        puntaje1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        part2 = new javax.swing.JLabel();
        puntaje2 = new javax.swing.JTextField();
        btnMostrarArbol = new java.awt.Button();
        btnGuardarPuntajes = new java.awt.Button();
        btnInscribirPart = new java.awt.Button();
        btnConsultar = new java.awt.Button();

        setBackground(new java.awt.Color(255, 255, 255));

        jSeparator7.setForeground(new java.awt.Color(7, 143, 193));

        titulo.setFont(new java.awt.Font("Dubai", 1, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(0, 51, 153));
        titulo.setText("PREGUNTAS RÁPIDAS : REGISTRO");

        nombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nombre.setText("CÓDIGO: ");

        jLabel2.setText("REGISTRADOS: ");

        jLabel3.setText("CUPOS: ");

        labelingresa1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelingresa1.setText("Se refiere al Doctor:");

        nombre1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nombre1.setText("NOMBRE: ");

        txtnombredoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombredocActionPerformed(evt);
            }
        });

        nombre2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nombre2.setText("APELLIDOS: ");

        txtapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapellidoActionPerformed(evt);
            }
        });

        tituloFase.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        tituloFase.setText("OCTAVOS DE FINAL");

        jLabel4.setText("PARTICPANTE 1");

        part1.setText("--> ");

        jLabel5.setText("PARTICIPANTE 2");

        part2.setText("-->");

        btnMostrarArbol.setBackground(new java.awt.Color(0, 153, 153));
        btnMostrarArbol.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnMostrarArbol.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrarArbol.setLabel("MOSTRAR ÁRBOL");
        btnMostrarArbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarArbolActionPerformed(evt);
            }
        });

        btnGuardarPuntajes.setBackground(new java.awt.Color(0, 153, 153));
        btnGuardarPuntajes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGuardarPuntajes.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarPuntajes.setLabel("GUARDAR");
        btnGuardarPuntajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarPuntajesActionPerformed(evt);
            }
        });

        btnInscribirPart.setBackground(new java.awt.Color(0, 153, 153));
        btnInscribirPart.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnInscribirPart.setForeground(new java.awt.Color(255, 255, 255));
        btnInscribirPart.setLabel("REGISTRAR");
        btnInscribirPart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInscribirPartActionPerformed(evt);
            }
        });

        btnConsultar.setBackground(new java.awt.Color(0, 153, 153));
        btnConsultar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnConsultar.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultar.setLabel("CONSULTAR");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator7, javax.swing.GroupLayout.DEFAULT_SIZE, 1057, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(182, 182, 182)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(132, 132, 132)
                                        .addComponent(nombre)
                                        .addGap(26, 26, 26)
                                        .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelingresa1)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(11, 11, 11)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(part2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(puntaje2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel4)
                                                        .addComponent(nombre1))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(txtnombredoc, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(95, 95, 95)
                                                            .addComponent(nombre2)
                                                            .addGap(18, 18, 18)
                                                            .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                            .addComponent(jLabel5)
                                                            .addGap(139, 139, 139)))))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(btnInscribirPart, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(245, 245, 245))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addComponent(jLabel2)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(txtregistrados, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(324, 324, 324))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addComponent(jLabel3)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(txtcupos, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(101, 101, 101))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(419, 419, 419)
                                .addComponent(tituloFase))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(253, 253, 253)
                                .addComponent(part1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(puntaje1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addComponent(btnGuardarPuntajes, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(220, 220, 220)
                .addComponent(btnMostrarArbol, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 84, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(titulo)
                .addGap(257, 257, 257))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nombre)))
                .addGap(29, 29, 29)
                .addComponent(labelingresa1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnombredoc, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre1)
                    .addComponent(nombre2)
                    .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(btnInscribirPart, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcupos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtregistrados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(34, 34, 34)
                .addComponent(tituloFase, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(puntaje1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(part1)
                    .addComponent(puntaje2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(part2))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardarPuntajes, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrarArbol, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtnombredocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombredocActionPerformed
        
    }//GEN-LAST:event_txtnombredocActionPerformed

    private void txtapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellidoActionPerformed

    }//GEN-LAST:event_txtapellidoActionPerformed

    private void btnMostrarArbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarArbolActionPerformed
        A_MOSTRAR_ARBOL mosa = new A_MOSTRAR_ARBOL ();
        mosa.setSize(1077, 679);
        mosa.setLocation(5, 5);

        PANEL_INTRO.removeAll();
        PANEL_INTRO.add(mosa, BorderLayout.CENTER);
        PANEL_INTRO.revalidate();
        PANEL_INTRO.repaint();
    }//GEN-LAST:event_btnMostrarArbolActionPerformed

    private void btnGuardarPuntajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarPuntajesActionPerformed
        if(PuntajesVacios()){                    
            if (Sistema.planilla.torneito.registrados == 16){
                int a = Integer.parseInt(puntaje1.getText());
                int b = Integer.parseInt(puntaje2.getText());                
                if (a != b){
                    x ++;
                    if(x >= 1 && x<=8) {
                        tituloFase.setText("OCTAVOS DE FINAL");
                        Sistema.planilla.torneito.DARPuntaje(octavos, a); 
                        Sistema.planilla.torneito.DARPuntaje(octavos+2, b);
                        Sistema.planilla.torneito.LlenarPadre(padreo);
                        octavos += 4;
                        padreo += 4;
                        if(x<=7) {
                            part1.setText(Sistema.planilla.torneito.cuadro.obtener(octavos).getNombre());
                            part2.setText(Sistema.planilla.torneito.cuadro.obtener(octavos+2).getNombre());
                        }else{
                            tituloFase.setText("CUARTOS DE FINAL");
                            part1.setText(Sistema.planilla.torneito.cuadro.obtener(cuartos).getNombre());
                            part2.setText(Sistema.planilla.torneito.cuadro.obtener(cuartos+4).getNombre());
                        }
                    }

                    if(x >= 9 && x<=12) {
                        tituloFase.setText("CUARTOS DE FINAL");            
                        Sistema.planilla.torneito.DARPuntaje(cuartos, a);
                        Sistema.planilla.torneito.DARPuntaje(cuartos+4, b);
                        Sistema.planilla.torneito.LlenarPadre(padrec);
                        cuartos += 8;
                        padrec += 8;
                        if(x<=11) {
                            part1.setText(Sistema.planilla.torneito.cuadro.obtener(cuartos).getNombre());
                            part2.setText(Sistema.planilla.torneito.cuadro.obtener(cuartos+4).getNombre());
                        }else{
                            tituloFase.setText("SEMIFINAL");
                            part1.setText(Sistema.planilla.torneito.cuadro.obtener(semifinal).getNombre());
                            part2.setText(Sistema.planilla.torneito.cuadro.obtener(semifinal+8).getNombre());
                        }
                    }
                    if(x >= 13 && x<=14) {
                        if(x ==13){
                            Sistema.planilla.torneito.DARPuntaje(semifinal, a);
                            Sistema.planilla.torneito.DARPuntaje(semifinal+8, b);
                            Sistema.planilla.torneito.LlenarPadre(padreS);
                            semifinal += 16;
                            padreS  += 16; 
                            part1.setText(Sistema.planilla.torneito.cuadro.obtener(semifinal).getNombre());
                            part2.setText(Sistema.planilla.torneito.cuadro.obtener(semifinal+8).getNombre());
                        }else{
                            Sistema.planilla.torneito.DARPuntaje(semifinal, a);
                            Sistema.planilla.torneito.DARPuntaje(semifinal+8, b);
                            Sistema.planilla.torneito.LlenarPadre(padreS);
                            tituloFase.setText("FINAL");
                            part1.setText(Sistema.planilla.torneito.cuadro.obtener(8).getNombre());
                            part2.setText(Sistema.planilla.torneito.cuadro.obtener(24).getNombre());                
                        }            
                    }
                    if(x == 15) {            
                        Sistema.planilla.torneito.DARPuntaje(8, a);
                        Sistema.planilla.torneito.DARPuntaje(24, b);
                        Sistema.planilla.torneito.LlenarPadre(16);
                    }
                    if(x > 15) {            
                        JOptionPane.showMessageDialog(this, "No es posible porque ya acabó el torneo.!");
                    } 
                    puntaje1.setText("");
                    puntaje2.setText("");
                }else{
                    JOptionPane.showMessageDialog(this, "Los puntajes no pueden ser iguales..!!!");
                }
            }else{
                JOptionPane.showMessageDialog(this, "Para registrar puntajes tiene que tener 16 participantes.");
            }
        }else{
          JOptionPane.showMessageDialog(this, "No ingresaste puntajes.!!");  
        }
    }//GEN-LAST:event_btnGuardarPuntajesActionPerformed

    private void btnInscribirPartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInscribirPartActionPerformed
        String part = txtnombredoc.getText() + " " + txtapellido.getText();       
        if(ValidarForm()){
            if (Sistema.planilla.torneito.cupos != 0){
                arreglo[Sistema.planilla.torneito.registrados] = part;
                Sistema.planilla.torneito.registrados ++;
                Sistema.planilla.torneito.cupos --;
            }else{
                JOptionPane.showMessageDialog(this, "No se pueden ingresar más participantes.");
            }
            if (Sistema.planilla.torneito.registrados == 16){
                Sistema.planilla.torneito.setParticipantes(arreglo);
                Sistema.planilla.torneito.InicializarArbol(arreglo);
                part1.setText(Sistema.planilla.torneito.cuadro.obtener(octavos).getNombre());
                part2.setText(Sistema.planilla.torneito.cuadro.obtener(octavos+2).getNombre());
            }
            txtregistrados.setText(String.valueOf(Sistema.planilla.torneito.registrados));
            txtcupos.setText(String.valueOf(Sistema.planilla.torneito.cupos));
            txtcodigo.setText("");
            txtnombredoc.setText("");
            txtapellido.setText("");
        }else{
            JOptionPane.showMessageDialog(this, "Ingrese todos los datos solicitados.");
        }        
    }//GEN-LAST:event_btnInscribirPartActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        String codigobus = txtcodigo.getText();
        String [] datosDoctor = new String [3];

        datosDoctor = Sistema.planilla.ObtenerNombreApellidoDoctorCitas(codigobus);
        
        if(txtcodigo.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Tiene que ingresar un codigo");
        }else{
            txtnombredoc.setText(datosDoctor[0]);
            txtapellido.setText(datosDoctor[1]);
        }                        
    }//GEN-LAST:event_btnConsultarActionPerformed

    private boolean ValidarForm(){
        boolean result=true;
        if (this.txtcodigo.getText().equals("") || this.txtnombredoc.getText().equals("") || 
                this.txtapellido.getText().equals("")) {
            result=false;
        }
        return result;
    }
    
    private boolean PuntajesVacios (){
        boolean result=true;
        if (this.puntaje1.getText().equals("") || this.puntaje2.getText().equals("")) {
            result=false;
        }
        return result;
    }
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnConsultar;
    private java.awt.Button btnGuardarPuntajes;
    private java.awt.Button btnInscribirPart;
    private java.awt.Button btnMostrarArbol;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel labelingresa1;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel nombre1;
    private javax.swing.JLabel nombre2;
    private javax.swing.JLabel part1;
    private javax.swing.JLabel part2;
    private javax.swing.JTextField puntaje1;
    private javax.swing.JTextField puntaje2;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel tituloFase;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtcupos;
    private javax.swing.JTextField txtnombredoc;
    private javax.swing.JTextField txtregistrados;
    // End of variables declaration//GEN-END:variables
}
