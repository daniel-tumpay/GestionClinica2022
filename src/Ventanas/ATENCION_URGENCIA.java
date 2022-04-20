package Ventanas;

import Clases.*;
import System.Sistema;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import Grafos.AtencionMinima;
import Serializadores.SerializadorG;
import java.awt.HeadlessException;
import javax.swing.table.DefaultTableModel;

public class ATENCION_URGENCIA extends javax.swing.JPanel {

    DefaultComboBoxModel m;
    private int tiempos [] = new int [16];
    private MatrizCama camas = cargarCamas();
    private int aux = 0;
    private DefaultTableModel modelo= new DefaultTableModel(new Object[][]{},new String[]{"Urgencia","Paciente", "Cama", "Especialidad"});
    
    public ATENCION_URGENCIA() {
        initComponents();
        tablaRecorrido.setModel(modelo);
    }
    
    private MatrizCama cargarCamas(){
        //aquie se carga desde una archivo de texto
        //MatrizCama cam=Sistema.planilla.habitaciones;
        MatrizCama mc=Sistema.planilla.habitaciones;       
        return mc;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator7 = new javax.swing.JSeparator();
        titulo = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        comboEspecialidad = new javax.swing.JComboBox<>();
        comboCama = new javax.swing.JComboBox<>();
        Urgencia = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        btnGuardarUrgencia = new java.awt.Button();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaRecorrido = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        recorrido = new javax.swing.JTextField();
        btnPrimerRecorrido = new java.awt.Button();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        comboPiso = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));

        jSeparator7.setForeground(new java.awt.Color(7, 143, 193));

        titulo.setFont(new java.awt.Font("Dubai", 1, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(0, 51, 153));
        titulo.setText("OPTIMIZACIÓN DE ATENCIONES A URGENCIA");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("INSERTANDO URGENCIA DE ATENCIÓN");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("ESPECIALIDAD");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("CAMAS");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("URGENCIA DE ATENCIÓN");

        comboEspecialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin Seleccionar", "Medicina General", "Cardiología", "Dermatología", "Hematología", "Traumatología", "Geriatría", "Neumología", "Nefrología", "Reumatología" }));
        comboEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEspecialidadActionPerformed(evt);
            }
        });

        comboCama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EscojaEspecialidad" }));
        comboCama.setPreferredSize(new java.awt.Dimension(56, 28));
        comboCama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCamaActionPerformed(evt);
            }
        });

        Urgencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/grafo2.png"))); // NOI18N

        btnGuardarUrgencia.setActionCommand("MOSTRAR RECORRIDO RÁPIDO");
        btnGuardarUrgencia.setBackground(new java.awt.Color(0, 153, 153));
        btnGuardarUrgencia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGuardarUrgencia.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarUrgencia.setLabel("GUARDAR URGENCIA");
        btnGuardarUrgencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarUrgenciaActionPerformed(evt);
            }
        });

        tablaRecorrido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Paciente", "Cama", "Especialidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaRecorrido);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("RECORRIDO");

        recorrido.setEditable(false);

        btnPrimerRecorrido.setActionCommand("MOSTRAR RECORRIDO RÁPIDO");
        btnPrimerRecorrido.setBackground(new java.awt.Color(0, 153, 153));
        btnPrimerRecorrido.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPrimerRecorrido.setForeground(new java.awt.Color(255, 255, 255));
        btnPrimerRecorrido.setLabel("MOSTRAR RECORRIDO RÁPIDO");
        btnPrimerRecorrido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimerRecorridoActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(7, 143, 193));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("PISO A EVALUAR");

        comboPiso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4", "5", "6" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel5)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(comboEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(64, 64, 64)
                                        .addComponent(Urgencia, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(jLabel3)
                                        .addGap(133, 133, 133)
                                        .addComponent(comboCama, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(165, 165, 165))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(btnGuardarUrgencia, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(46, 46, 46)
                                        .addComponent(comboPiso, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(recorrido, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(btnPrimerRecorrido, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator7)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(comboCama, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(23, 23, 23)
                                .addComponent(Urgencia, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardarUrgencia, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboPiso, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(31, 31, 31)
                        .addComponent(btnPrimerRecorrido, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(recorrido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(23, 23, 23))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comboEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEspecialidadActionPerformed
        String especialidad; 
        especialidad = comboEspecialidad.getSelectedItem().toString();        
        m = new DefaultComboBoxModel (Sistema.planilla.CamasxEsp2(especialidad));
        this.comboCama.setModel(m);
    }//GEN-LAST:event_comboEspecialidadActionPerformed

    private void btnGuardarUrgenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarUrgenciaActionPerformed
        String numeroCama=(String)comboCama.getSelectedItem();
        int tiempoAtencion = Integer.parseInt(Urgencia.getSelectedItem().toString());
        camas.editarNivelUrgencia(numeroCama, tiempoAtencion);
        Urgencia.setSelectedIndex(0);
        JOptionPane.showMessageDialog(null,"Realizado correctamente");
    }//GEN-LAST:event_btnGuardarUrgenciaActionPerformed

    private void btnPrimerRecorridoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimerRecorridoActionPerformed
        modelo.setRowCount(0);
        int piso=Integer.parseInt(comboPiso.getSelectedItem().toString());
        int engaño = 10 - piso;
        AtencionMinima atencion= new AtencionMinima(camas,engaño-4);
        int recorridoMinimo[]= atencion.getVerticesMinimos();
        if(recorridoMinimo!=null){
            Cama incidencia[][]=atencion.obtenerCamasIncidentes();
            int anterior=recorridoMinimo[0];
            int j=0;
            while(recorridoMinimo[j]!=-1){
                System.out.print(recorridoMinimo[j]+" ");
                j++;
            }
            int i = 1;
            int tiempo=0;
            while (recorridoMinimo[i] != -1){
                int actual=recorridoMinimo[i];
                Cama cama= incidencia[anterior][actual];
                if(cama.isUso()){                        
                    modelo.addRow(new Object[]{cama.getUrgencia(),cama.getPaciente().getNombre(),cama.getNumero(),cama.getSeccion()});
                }
                anterior=actual;
                i++;
            }
            recorrido.setText(atencion.obtenerRecorrido());                
        }else{
            JOptionPane.showMessageDialog(this,"Faltan Paciente en camas del piso: "+piso+"\n para dar solucion optima","VERTICES NO CONECTADOS",JOptionPane.ERROR_MESSAGE);
        }                    
    }//GEN-LAST:event_btnPrimerRecorridoActionPerformed

    private void comboCamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCamaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Urgencia;
    private java.awt.Button btnGuardarUrgencia;
    private java.awt.Button btnPrimerRecorrido;
    private javax.swing.JComboBox<String> comboCama;
    private javax.swing.JComboBox<String> comboEspecialidad;
    private javax.swing.JComboBox<String> comboPiso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField recorrido;
    private javax.swing.JTable tablaRecorrido;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
