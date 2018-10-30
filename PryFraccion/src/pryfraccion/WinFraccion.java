/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pryfraccion;

/**
 *
 * @author ESFOT
 */
public class WinFraccion extends javax.swing.JFrame {

    /**
     * Creates new form WinFraccion
     */
    public WinFraccion() {
        initComponents();
    }
    int n,d;
    ClsFraccion p,q;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TxtPantalla = new javax.swing.JTextField();
        BrnNumerador = new javax.swing.JButton();
        BtnDenominador = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TxtPantalla.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        TxtPantalla.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        BrnNumerador.setText("Numerador");
        BrnNumerador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrnNumeradorActionPerformed(evt);
            }
        });

        BtnDenominador.setText("Denominador");
        BtnDenominador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDenominadorActionPerformed(evt);
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
                        .addComponent(TxtPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(BrnNumerador)
                        .addGap(53, 53, 53)
                        .addComponent(BtnDenominador)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(TxtPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BrnNumerador)
                    .addComponent(BtnDenominador))
                .addContainerGap(197, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BrnNumeradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrnNumeradorActionPerformed
        n=Integer.parseInt(TxtPantalla.getText());
        TxtPantalla.setText(null);
        TxtPantalla.requestFocus();
    }//GEN-LAST:event_BrnNumeradorActionPerformed

    private void BtnDenominadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDenominadorActionPerformed
        // TODO add your handling code here:
         d=Integer.parseInt(TxtPantalla.getText());
         p=new ClsFraccion (n,d);
        TxtPantalla.setText(p.toString());
        TxtPantalla.requestFocus();
    }//GEN-LAST:event_BtnDenominadorActionPerformed

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
    private javax.swing.JButton BrnNumerador;
    private javax.swing.JButton BtnDenominador;
    private javax.swing.JTextField TxtPantalla;
    // End of variables declaration//GEN-END:variables
}
