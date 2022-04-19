package Ventanas;

import System.Sistema;

public class CONSULTAS_GENERALES extends javax.swing.JPanel {

    public CONSULTAS_GENERALES() {
        initComponents();
        llenarDatos ();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator7 = new javax.swing.JSeparator();
        titulo2 = new javax.swing.JLabel();
        codigolabel = new javax.swing.JLabel();
        txtdoctores = new javax.swing.JTextField();
        codigolabel1 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        txtnumhospi = new javax.swing.JTextField();
        txtnumconsultas = new javax.swing.JTextField();
        codigolabel2 = new javax.swing.JLabel();
        txtpacientessistema = new javax.swing.JTextField();
        codigolabel3 = new javax.swing.JLabel();
        pachospitalizados = new javax.swing.JTextField();
        pac_hospi_hombres = new javax.swing.JTextField();
        pac_hospi_mujeres = new javax.swing.JTextField();
        pac_sistema_mujeres = new javax.swing.JTextField();
        codigolabel7 = new javax.swing.JLabel();
        pac_sistema_hombres = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        codigolabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jSeparator7.setForeground(new java.awt.Color(7, 143, 193));

        titulo2.setFont(new java.awt.Font("Dubai", 1, 36)); // NOI18N
        titulo2.setForeground(new java.awt.Color(0, 51, 153));
        titulo2.setText("ESTADÍSTICAS GENERALES");

        codigolabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        codigolabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnPaciente.PNG"))); // NOI18N
        codigolabel.setText("AREA DE HOSPITALIZACIÓN");

        codigolabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        codigolabel1.setText("NÚMERO DE DOCTORES");

        label3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btncitas.jpg"))); // NOI18N
        label3.setText("AREA DE CONSULTA");

        codigolabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        codigolabel2.setText("NÚMERO DE PACIENTES REGISTRADOS EN EL SISTEMA");

        codigolabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        codigolabel3.setText("NÚMERO DE PACIENTES HOSPITALIZADOS");

        codigolabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        codigolabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lblmujer.jpg"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lblhombre.jpg"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lblhombre.jpg"))); // NOI18N

        codigolabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        codigolabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lblmujer.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(89, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel1)
                                .addGap(31, 31, 31)
                                .addComponent(pac_sistema_hombres, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(codigolabel7)
                                .addGap(18, 18, 18)
                                .addComponent(pac_sistema_mujeres, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(199, 199, 199))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(codigolabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtpacientessistema, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(codigolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtnumhospi, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(49, 49, 49))
                                            .addComponent(codigolabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(txtdoctores, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(85, 85, 85)
                                                .addComponent(label3)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtnumconsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(codigolabel3))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(28, 28, 28)
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(pac_hospi_hombres, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(80, 80, 80)
                                                .addComponent(pachospitalizados, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(306, 306, 306)
                                                .addComponent(codigolabel8)
                                                .addGap(18, 18, 18)
                                                .addComponent(pac_hospi_mujeres, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(145, 145, 145)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(322, 322, 322)
                .addComponent(titulo2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(titulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigolabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdoctores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigolabel)
                    .addComponent(txtnumhospi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label3)
                    .addComponent(txtnumconsultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpacientessistema, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigolabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(pac_sistema_hombres, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(pac_sistema_mujeres, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(codigolabel7)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pachospitalizados, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(codigolabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pac_hospi_hombres, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(pac_hospi_mujeres, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(codigolabel8)
                                    .addComponent(jLabel2))
                                .addContainerGap(26, Short.MAX_VALUE))))))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void llenarDatos () {
        String [] datos = new String [10];        
        datos = Sistema.planilla.ConsultasGenerales();                
        txtdoctores.setText(datos[0]);
        txtnumhospi.setText(datos[1]);
        txtnumconsultas.setText(datos[2]);
        txtpacientessistema.setText(datos[4]);
        pac_sistema_hombres.setText(datos[5]);
        pac_sistema_mujeres.setText(datos[6]);
        pachospitalizados.setText(datos[7]);
        pac_hospi_hombres.setText(datos[8]);
        pac_hospi_mujeres.setText(datos[9]);            
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel codigolabel;
    private javax.swing.JLabel codigolabel1;
    private javax.swing.JLabel codigolabel2;
    private javax.swing.JLabel codigolabel3;
    private javax.swing.JLabel codigolabel7;
    private javax.swing.JLabel codigolabel8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel label3;
    private javax.swing.JTextField pac_hospi_hombres;
    private javax.swing.JTextField pac_hospi_mujeres;
    private javax.swing.JTextField pac_sistema_hombres;
    private javax.swing.JTextField pac_sistema_mujeres;
    private javax.swing.JTextField pachospitalizados;
    private javax.swing.JLabel titulo2;
    private javax.swing.JTextField txtdoctores;
    private javax.swing.JTextField txtnumconsultas;
    private javax.swing.JTextField txtnumhospi;
    private javax.swing.JTextField txtpacientessistema;
    // End of variables declaration//GEN-END:variables
}
