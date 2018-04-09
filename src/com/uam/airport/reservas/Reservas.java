/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uam.airport.reservas;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.uam.Hangar69.AeroNaves.RegistrarAeronaves;
import com.uam.airport.Asientos.GUiSelectAsientos;
import com.uam.airport.vuelos.RegistroVuelos;
import java.io.FileOutputStream;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author krh_9
 */
public class Reservas extends javax.swing.JFrame {

    /**
     * Creates new form Reservas
     */
    RegistroVuelos listaVuelos;    
    String []Destinos = {"SJO - San Jose","PTR - Orotina","MIA - Miami"};
    public Reservas(RegistroVuelos listaVuelos) {
        this.listaVuelos=listaVuelos;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldComprador = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jTextFieldPrimeraClase = new javax.swing.JTextField();
        jTextFieldClaseTurista = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jComboBoxOrigen = new javax.swing.JComboBox<>();
        jComboBoxDestino = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablevuelosIda = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableViajeRegreso = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButtonSelect1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jLabel1.setText("Comprador :");

        jLabel2.setText("Fecha de Ida :");

        jLabel3.setText("Fecha de Regreso :");

        jLabel4.setText("Asientos de Primera Clase :");

        jLabel5.setText("Asientos Clase turista :");

        jTextFieldPrimeraClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPrimeraClaseActionPerformed(evt);
            }
        });

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Origen :");

        jLabel9.setText("Destino :");

        jComboBoxOrigen.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jComboBoxOrigenPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxOrigen, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextFieldPrimeraClase, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                                        .addComponent(jTextFieldClaseTurista, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextFieldComprador)
                                        .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                        .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(0, 2, Short.MAX_VALUE))
                            .addComponent(jComboBoxDestino, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jTextFieldComprador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2))
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3))
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldPrimeraClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldClaseTurista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jComboBoxOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jComboBoxDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTablevuelosIda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Piloto", "Vuelo", "Duración", "Hora Salida", "Hora Llegada", "Asientos Disponibles"
            }
        ));
        jTablevuelosIda.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(jTablevuelosIda);
        jTablevuelosIda.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jTableViajeRegreso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pioto", "Vuelo", "Duración", "Hora Salida", "Hora Llegada", "Asientos Disponibles"
            }
        ));
        jTableViajeRegreso.setColumnSelectionAllowed(true);
        jScrollPane2.setViewportView(jTableViajeRegreso);
        jTableViajeRegreso.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jLabel6.setText("Vuelos ida :");

        jLabel7.setText("Vuelos Regreso :");

        jButtonSelect1.setText("Escoger asientos");
        jButtonSelect1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelect1ActionPerformed(evt);
            }
        });

        jButton3.setText("Escoger asientos");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Facturar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4)
                    .addComponent(jButtonSelect1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addComponent(jButton3))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(3, 3, 3)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSelect1)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldPrimeraClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPrimeraClaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPrimeraClaseActionPerformed

    private void jComboBoxOrigenPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jComboBoxOrigenPropertyChange
        for (String Destino : Destinos) {
            jComboBoxDestino.addItem(Destino);
            jComboBoxOrigen.addItem(Destino);
        }
    }//GEN-LAST:event_jComboBoxOrigenPropertyChange

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            
        mostrarTablas();




    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonSelect1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelect1ActionPerformed
        // TODO add your handling code here:
        String pCodigoVuelo = jTablevuelosIda.getModel().getValueAt( jTablevuelosIda.getSelectedRow(), 1).toString();
        
        
        if(Integer.parseInt(jTextFieldPrimeraClase.getText())>listaVuelos.getbyCodigo(pCodigoVuelo).getAviondelVuelo().getCantidadAsientosPrimeraClasesDisponible()){
            JOptionPane.showMessageDialog(null, "No hay suficientes espacion para primera clase");
        }else if(Integer.parseInt(jTextFieldClaseTurista.getText())>listaVuelos.getbyCodigo(pCodigoVuelo).getAviondelVuelo().getCantidadAsientosClaseregularDisponible()){
                        JOptionPane.showMessageDialog(null, "No hay suficientes espacion para la clase turista");

        }else{
            
            
        if(validador1()==true){
                   GUiSelectAsientos seleccionDeAsientosDEstino = new GUiSelectAsientos(listaVuelos, listaVuelos.getbyCodigo(pCodigoVuelo).getAviondelVuelo(),pCodigoVuelo,jTextFieldComprador.getText()
                ,Integer.parseInt(jTextFieldClaseTurista.getText()),Integer.parseInt(jTextFieldPrimeraClase.getText()));
        seleccionDeAsientosDEstino.setVisible(true); 
        }else{
          JOptionPane.showMessageDialog(null, "Ya seleccionó estos asientos");
        }            
            
        }
        
        
        


        
        
        
    }//GEN-LAST:event_jButtonSelect1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        facturarTicket();

             
        
        
        
        
        
        
        
        
        
                
        
        
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
                String pCodigoVuelo = jTableViajeRegreso.getModel().getValueAt( jTableViajeRegreso.getSelectedRow(), 1).toString();
        
        
        if(Integer.parseInt(jTextFieldPrimeraClase.getText())>listaVuelos.getbyCodigo(pCodigoVuelo).getAviondelVuelo().getCantidadAsientosPrimeraClasesDisponible()){
            JOptionPane.showMessageDialog(null, "No hay suficientes espacion para primera clase");
        }else if(Integer.parseInt(jTextFieldClaseTurista.getText())>listaVuelos.getbyCodigo(pCodigoVuelo).getAviondelVuelo().getCantidadAsientosClaseregularDisponible()){
                        JOptionPane.showMessageDialog(null, "No hay suficientes espacion para la clase turista");

        }else{
            
            
        if(validador2()==true){
                   GUiSelectAsientos seleccionDeAsientosDEstino = new GUiSelectAsientos(listaVuelos, listaVuelos.getbyCodigo(pCodigoVuelo).getAviondelVuelo(),pCodigoVuelo,jTextFieldComprador.getText()
                ,Integer.parseInt(jTextFieldClaseTurista.getText()),Integer.parseInt(jTextFieldPrimeraClase.getText()));
        seleccionDeAsientosDEstino.setVisible(true); 
        }else{
          JOptionPane.showMessageDialog(null, "Ya seleccionó estos asientos");
        }            
            
        }
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Reservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonSelect1;
    private javax.swing.JComboBox<String> jComboBoxDestino;
    private javax.swing.JComboBox<String> jComboBoxOrigen;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableViajeRegreso;
    private javax.swing.JTable jTablevuelosIda;
    private javax.swing.JTextField jTextFieldClaseTurista;
    private javax.swing.JTextField jTextFieldComprador;
    private javax.swing.JTextField jTextFieldPrimeraClase;
    // End of variables declaration//GEN-END:variables

  public void mostrarTablas(){
    int temp1=0,temp2=0,temp3=0,temp4=0;
    //String matris[][] = new String[this.listaVuelos.sizeVuelos()][6];
    DefaultTableModel tModel = (DefaultTableModel)this.jTablevuelosIda.getModel();
    
      for (int i = 0; i < listaVuelos.sizeVuelos(); i++) {
          if(listaVuelos.get(i).getDestino()==jComboBoxDestino.getSelectedItem().toString()){
          temp1++;
          }
      
      }
      for (int i = 0; i < listaVuelos.sizeVuelos(); i++) {
          if(listaVuelos.get(i).getOrigen()==jComboBoxDestino.getSelectedItem().toString()){
          temp2++;
          }
      
      }
      
      
         String matrisDestino[][] = new String[temp1][6];
         String matrisOrigen[][] = new String[temp2][6];
      
      for (int i = 0; i < listaVuelos.sizeVuelos(); i++) {
          if(listaVuelos.get(i).getDestino()==jComboBoxDestino.getSelectedItem().toString()&&listaVuelos.get(i).getOrigen()==jComboBoxOrigen.getSelectedItem().toString()){
          
          matrisDestino[temp3][0]=listaVuelos.get(i).getPiloto();
          matrisDestino[temp3][1]=listaVuelos.get(i).getCodigoVuelo();
          matrisDestino[temp3][2]=listaVuelos.get(i).getDuracion();
          matrisDestino[temp3][3]=listaVuelos.get(i).getHorasSalida();
          matrisDestino[temp3][4]=listaVuelos.get(i).getHorasLlegada();
          matrisDestino[temp3][5]=Integer.toString(listaVuelos.get(i).getAviondelVuelo().getCantidadAsientosDisponibles());
              temp3++;
          }
      }
      
      
            for (int i = 0; i < listaVuelos.sizeVuelos(); i++) {
          if(listaVuelos.get(i).getOrigen()==jComboBoxDestino.getSelectedItem().toString()&&listaVuelos.get(i).getDestino()==jComboBoxOrigen.getSelectedItem().toString()){
          
          matrisOrigen[temp4][0]=listaVuelos.get(i).getPiloto();
          matrisOrigen[temp4][1]=listaVuelos.get(i).getCodigoVuelo();
          matrisOrigen[temp4][2]=listaVuelos.get(i).getDuracion();
          matrisOrigen[temp4][3]=listaVuelos.get(i).getHorasSalida();
          matrisOrigen[temp4][4]=listaVuelos.get(i).getHorasLlegada();
          matrisOrigen[temp4][5]=Integer.toString(listaVuelos.get(i).getAviondelVuelo().getCantidadAsientosDisponibles());
              temp4++;
          }
      }
//      for (int i = 0; i < listaVuelos.sizeVuelos(); i++) {
//          if(listaVuelos.get(i).getDestino()==jComboBoxDestino.getSelectedItem().toString()){
//          
//          matrisDestino[i][0]=listaVuelos.get(i).getPiloto();
//          matrisDestino[i][1]=listaVuelos.get(i).getCodigoVuelo();
//          matrisDestino[i][2]=listaVuelos.get(i).getDuracion();
//          matrisDestino[i][3]=listaVuelos.get(i).getHorasSalida();
//          matrisDestino[i][4]=listaVuelos.get(i).getHorasLlegada();
//          matrisDestino[i][5]=Integer.toString(listaVuelos.get(i).getAviondelVuelo().getCantidadAsientosDisponibles());
//              
//          }
//      }

        jTablevuelosIda.setModel(new javax.swing.table.DefaultTableModel(
            matrisDestino,
            new String [] {
                "Piloto", "Vuelo", "duracion", "Hora Salida", "Hora Llegada", "Asientos Disponibles"
            }
        ));
        jTableViajeRegreso.setModel(new javax.swing.table.DefaultTableModel(
            matrisOrigen,
            new String [] {
                "Piloto", "Vuelo", "duracion", "Hora Salida", "Hora Llegada", "Asientos Disponibles"
            }
        ));
        
      
      
    
}
  
    public boolean validador1(){
        
        String asientosIda="";
        
        
        String pCodigoVueloida = jTablevuelosIda.getModel().getValueAt( jTablevuelosIda.getSelectedRow(), 1).toString();
        for(int x =0;x<listaVuelos.getbyCodigo(pCodigoVueloida).sizeAsientosReservados();x++){
            //if(listaVuelos.getbyCodigo(pCodigoVueloida).get(x).getNombreCompra()==jTextFieldComprador.getText()){
                asientosIda=listaVuelos.getbyCodigo(pCodigoVueloida).get(x).getAsiento()+" ";
            //}
        }
        
        return asientosIda=="";
        }
    public boolean validador2(){
        
        String asientosRegreso="";
        
        
        String pCodigoVueloida = jTableViajeRegreso.getModel().getValueAt( jTableViajeRegreso.getSelectedRow(), 1).toString();
        for(int x =0;x<listaVuelos.getbyCodigo(pCodigoVueloida).sizeAsientosReservados();x++){
            //if(listaVuelos.getbyCodigo(pCodigoVueloida).get(x).getNombreCompra()==jTextFieldComprador.getText()){
               asientosRegreso=listaVuelos.getbyCodigo(pCodigoVueloida).get(x).getAsiento()+" ";
            //}
        }
        
        return asientosRegreso=="";
        }
  
     public void facturarTicket(){
       
               String Factura;
        String Ida;
        String Regreso="";
        String asientosIda="";
        
        
        String pCodigoVueloida = jTablevuelosIda.getModel().getValueAt( jTablevuelosIda.getSelectedRow(), 1).toString();

        
        for(int x =0;x<listaVuelos.getbyCodigo(pCodigoVueloida).sizeAsientosReservados();x++){
            //if(listaVuelos.getbyCodigo(pCodigoVueloida).get(x).getNombreCompra()==jTextFieldComprador.getText()){
                asientosIda=asientosIda+listaVuelos.getbyCodigo(pCodigoVueloida).get(x).getAsiento()+" ";
            //}
        }
        
        
        Calendar fechaactual=Calendar.getInstance();
        
        
        
        
                
                
        Ida= "Nunero de Vuelo: "+pCodigoVueloida+
             "\n Fecha de compra: "+fechaactual.get(Calendar.DAY_OF_WEEK_IN_MONTH)+"/"+fechaactual.get(Calendar.MONTH)+"/"+fechaactual.get(Calendar.YEAR)+
             "\n ---------Vuelo-----------------"+
             "\n"+listaVuelos.getbyCodigo(pCodigoVueloida).getOrigen()+"-"+listaVuelos.getbyCodigo(pCodigoVueloida).getDestino()+
             "\n Fecha: "+listaVuelos.getbyCodigo(pCodigoVueloida).getSalida().getTime()+
             "\n Cantidad Pasajeros: " +Integer.toString(Integer.parseInt(jTextFieldClaseTurista.getText())+Integer.parseInt(jTextFieldPrimeraClase.getText()))+
             "\n Asientos: "+asientosIda+
             "\n Total a Pagar :"+" $"+Integer.toString(Integer.parseInt(jTextFieldClaseTurista.getText())*listaVuelos.getbyCodigo(pCodigoVueloida).getPrecioTurista()+Integer.parseInt(jTextFieldPrimeraClase.getText())*listaVuelos.getbyCodigo(pCodigoVueloida).getPrecioPrimera())
                ;
        
        
        Factura=Ida+Regreso;
       
       
         generarPDF(Factura);
   }
     
     
     public void generarPDF(String nDatosaGenerar){
         try {
             FileOutputStream nuevoArchivo = new FileOutputStream(jTextFieldComprador.getText()+".pdf");
             Document doc =new Document();
             PdfWriter.getInstance(doc, nuevoArchivo);
             doc.open();
             doc.add(new Paragraph(nDatosaGenerar));
             doc.close();
             JOptionPane.showMessageDialog(null, "PDF creado correctamente");
             
         } catch (Exception e) {
         }
         
         
     }



}
