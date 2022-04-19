package Ventanas;

import System.Sistema;
import java.io.FileReader;
import java.io.IOException;

public class GUIA_TELEFONICA extends javax.swing.JPanel {

    public GUIA_TELEFONICA() throws IOException {
        initComponents();
        llenar_area ();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator5 = new javax.swing.JSeparator();
        titulo1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        label = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));

        jSeparator5.setForeground(new java.awt.Color(7, 143, 193));

        titulo1.setFont(new java.awt.Font("Dubai", 1, 36)); // NOI18N
        titulo1.setForeground(new java.awt.Color(0, 51, 153));
        titulo1.setText("GUÍA TELEFÓNICA DE PACIENTES");

        label.setColumns(20);
        label.setRows(5);
        jScrollPane1.setViewportView(label);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(287, 287, 287))
            .addGroup(layout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addComponent(titulo1)
                .addContainerGap(274, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(titulo1)
                .addGap(37, 37, 37)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void llenar_area () throws IOException {
        Sistema.planilla.Llenar_guia();
        String cadena = "";
        FileReader fr = new FileReader ("Guia Telefonica.txt");
        int valor = fr.read();
        while(valor != -1){
            cadena = cadena + (char)valor;
            valor = fr.read();
        }
       label.setText(cadena);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextArea label;
    private javax.swing.JLabel titulo1;
    // End of variables declaration//GEN-END:variables
}
