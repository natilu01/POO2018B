/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pryfraccion;

/**
 *
 * @author Estudiante
 */
public class WinFraccion extends javax.swing.JFrame {

    
    public WinFraccion() {
        initComponents();
    }
    int n,d;
    //int n1,d1;
   int codigo;
    ClsFraccion p,q,p1;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TxtPantalla = new javax.swing.JTextField();
        BtnNumerador = new javax.swing.JButton();
        BtnDenominador = new javax.swing.JButton();
        BtnSuma = new javax.swing.JButton();
        BtnResta = new javax.swing.JButton();
        BtnPor = new javax.swing.JButton();
        BtnDivision = new javax.swing.JButton();
        BtnIgual = new javax.swing.JButton();
        BtnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TxtPantalla.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        TxtPantalla.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        BtnNumerador.setText("Numerador");
        BtnNumerador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNumeradorActionPerformed(evt);
            }
        });

        BtnDenominador.setText("Denominador");
        BtnDenominador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDenominadorActionPerformed(evt);
            }
        });

        BtnSuma.setText("SUMA");
        BtnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSumaActionPerformed(evt);
            }
        });

        BtnResta.setText("RESTA");
        BtnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRestaActionPerformed(evt);
            }
        });

        BtnPor.setText("MULTIPLICACION");
        BtnPor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPorActionPerformed(evt);
            }
        });

        BtnDivision.setText("DIVISION");
        BtnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDivisionActionPerformed(evt);
            }
        });

        BtnIgual.setText("=");
        BtnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIgualActionPerformed(evt);
            }
        });

        BtnLimpiar.setText("Limpiar");
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BtnPor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnDivision)
                        .addGap(48, 48, 48)
                        .addComponent(BtnIgual))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(TxtPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnNumerador)
                            .addComponent(BtnSuma))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnResta)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnDenominador)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                                .addComponent(BtnLimpiar)))))
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TxtPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnNumerador)
                    .addComponent(BtnDenominador)
                    .addComponent(BtnLimpiar))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSuma)
                    .addComponent(BtnResta))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnPor)
                    .addComponent(BtnDivision)
                    .addComponent(BtnIgual))
                .addContainerGap(128, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnNumeradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNumeradorActionPerformed
        n=Integer.parseInt(TxtPantalla.getText());
        TxtPantalla.setText(null);
         TxtPantalla.requestFocus();
         
//         n1=Integer.parseInt(TxtPantalla.getText());
//         TxtPantalla.setText(null);
//         TxtPantalla.requestFocus();
         
        
                
    }//GEN-LAST:event_BtnNumeradorActionPerformed

    private void BtnDenominadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDenominadorActionPerformed
       d=Integer.parseInt(TxtPantalla.getText());
       p= new ClsFraccion(n,d);
       q= new ClsFraccion(p);//clona p , pasa el valor de p a q.
       
       TxtPantalla.setText(p.toString());
       TxtPantalla.requestFocus();
       
//       d1=Integer.parseInt(TxtPantalla.getText());
//       p1= new ClsFraccion(n1,d1);
//       TxtPantalla.setText(p1.toString());
//       TxtPantalla.requestFocus();
       
        
    }//GEN-LAST:event_BtnDenominadorActionPerformed

    private void BtnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRestaActionPerformed
        TxtPantalla.setText(null);
        TxtPantalla.requestFocus();
        codigo =2;
    }//GEN-LAST:event_BtnRestaActionPerformed

    private void BtnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSumaActionPerformed
        // TODO add your handling code here:
        TxtPantalla.setText(null);
        TxtPantalla.requestFocus();
        codigo =1;
       
     
       
      
      
      
      /*http://puntocomnoesunlenguaje.blogspot.com/2015/05/ejercicio-basico-programacion-orientada-objetos-clase-fraccion.html */
        /*http://www.areadelprogramador.com/java/fracciones-en-java-operaciones-basicas/*/
    }//GEN-LAST:event_BtnSumaActionPerformed

    private void BtnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIgualActionPerformed
      switch (codigo){
          case 1:              
//              q.mas(p);
//              p = new ClsFraccion(q);
              p.mas(q);                    
              break;
          case 2:
              p.menos(q);
              break;
          case 3:
              p.por(q);
              break;
          case 4:
              p.para(q);
              break;
          default: 
      
      }
      TxtPantalla.setText(p.toString());
      TxtPantalla.requestFocus();
       
    }//GEN-LAST:event_BtnIgualActionPerformed

    private void BtnPorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPorActionPerformed
        TxtPantalla.setText(null);
        TxtPantalla.requestFocus();
        codigo =3;
    }//GEN-LAST:event_BtnPorActionPerformed

    private void BtnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDivisionActionPerformed
        TxtPantalla.setText(null);
        TxtPantalla.requestFocus();
        codigo =4;
    }//GEN-LAST:event_BtnDivisionActionPerformed

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
        // TODO add your handling code here:
        TxtPantalla.setText(null);
    }//GEN-LAST:event_BtnLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(WinFraccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinFraccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinFraccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinFraccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WinFraccion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnDenominador;
    private javax.swing.JButton BtnDivision;
    private javax.swing.JButton BtnIgual;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JButton BtnNumerador;
    private javax.swing.JButton BtnPor;
    private javax.swing.JButton BtnResta;
    private javax.swing.JButton BtnSuma;
    private javax.swing.JTextField TxtPantalla;
    // End of variables declaration//GEN-END:variables
}
