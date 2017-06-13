/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisfacturacion.Clases;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author andre
 */
public class NuevoArticulo extends javax.swing.JFrame {

    /**
     * Creates new form NuevoArticulo
     */
    public NuevoArticulo() {
        initComponents();
        Estado.add(ActivoRbt);
        Estado.add(InactivoRbt);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Estado = new javax.swing.ButtonGroup();
        title = new javax.swing.JLabel();
        codigo = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        categoria = new javax.swing.JLabel();
        precio = new javax.swing.JLabel();
        existencia = new javax.swing.JLabel();
        existencia1 = new javax.swing.JLabel();
        codigoTxt = new javax.swing.JTextField();
        NombreTxt = new javax.swing.JTextField();
        precioTxt = new javax.swing.JTextField();
        CategoriaTxt = new javax.swing.JTextField();
        ExistenciaTxt = new javax.swing.JTextField();
        ActivoRbt = new javax.swing.JRadioButton();
        InactivoRbt = new javax.swing.JRadioButton();
        AceptarBt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setText("NUEVO ARTICULO");

        codigo.setText("* Codigo:");

        nombre.setText("* Nombre:");

        categoria.setText("Categoria:");

        precio.setText("* Precio:");

        existencia.setText("Existencia:");

        existencia1.setText("Estado:");

        codigoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoTxtActionPerformed(evt);
            }
        });

        NombreTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreTxtActionPerformed(evt);
            }
        });

        precioTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioTxtActionPerformed(evt);
            }
        });

        CategoriaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriaTxtActionPerformed(evt);
            }
        });

        ExistenciaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExistenciaTxtActionPerformed(evt);
            }
        });

        ActivoRbt.setText("Activo");
        ActivoRbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActivoRbtActionPerformed(evt);
            }
        });

        InactivoRbt.setText("Inactivo");
        InactivoRbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InactivoRbtActionPerformed(evt);
            }
        });

        AceptarBt.setText("Aceptar");
        AceptarBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarBtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nombre)
                            .addComponent(codigo))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(title)
                            .addComponent(codigoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(categoria)
                            .addComponent(precio)
                            .addComponent(existencia)
                            .addComponent(existencia1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(precioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CategoriaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ExistenciaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ActivoRbt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(InactivoRbt))
                            .addComponent(AceptarBt, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(codigo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(codigoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(categoria)
                            .addComponent(CategoriaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(precioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(precio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ExistenciaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(existencia))
                        .addGap(31, 31, 31))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(existencia1)
                        .addComponent(ActivoRbt)
                        .addComponent(InactivoRbt)))
                .addGap(18, 18, 18)
                .addComponent(AceptarBt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codigoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoTxtActionPerformed

    private void NombreTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreTxtActionPerformed

    private void precioTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioTxtActionPerformed

    private void CategoriaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoriaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CategoriaTxtActionPerformed

    private void ExistenciaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExistenciaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExistenciaTxtActionPerformed

    private void ActivoRbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActivoRbtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ActivoRbtActionPerformed

    private void InactivoRbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InactivoRbtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InactivoRbtActionPerformed

    private void AceptarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarBtActionPerformed

        try {
            // TODO add your handling code here:
            Articulo art = new Articulo(codigoTxt.getText(),NombreTxt.getText(),Double.parseDouble(precioTxt.getText()));
            art.setCategoria(CategoriaTxt.getText());
            art.setExistencia(Double.parseDouble(ExistenciaTxt.getText()));
            if(ActivoRbt.isSelected() == true){
                art.activar();
            }else{
                art.desactivar();
            }
        } catch (Exception ex) {
            Logger.getLogger(NuevoArticulo.class.getName()).log(Level.SEVERE, null, ex);
        }
                  
            
            
        
        
    }//GEN-LAST:event_AceptarBtActionPerformed

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
            java.util.logging.Logger.getLogger(NuevoArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevoArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevoArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevoArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevoArticulo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AceptarBt;
    private javax.swing.JRadioButton ActivoRbt;
    private javax.swing.JTextField CategoriaTxt;
    private javax.swing.ButtonGroup Estado;
    private javax.swing.JTextField ExistenciaTxt;
    private javax.swing.JRadioButton InactivoRbt;
    private javax.swing.JTextField NombreTxt;
    private javax.swing.JLabel categoria;
    private javax.swing.JLabel codigo;
    private javax.swing.JTextField codigoTxt;
    private javax.swing.JLabel existencia;
    private javax.swing.JLabel existencia1;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel precio;
    private javax.swing.JTextField precioTxt;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
