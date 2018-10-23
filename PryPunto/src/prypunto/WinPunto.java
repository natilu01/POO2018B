
package prypunto;

/**
 *
 * @author ESFOT
 */
public class WinPunto extends javax.swing.JFrame {

    /**
     * Creates new form WinPunto
     */
    public WinPunto() {
        initComponents();
    }
    //Declarar variables de la ventana
   int x,y;
   ClsPunto p,q;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TxtPantalla = new javax.swing.JTextField();
        BtnCx = new javax.swing.JButton();
        BtnCy = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TxtPantalla.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        BtnCx.setBackground(new java.awt.Color(204, 204, 0));
        BtnCx.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        BtnCx.setForeground(new java.awt.Color(51, 51, 51));
        BtnCx.setText("Coordenada X");
        BtnCx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCxActionPerformed(evt);
            }
        });

        BtnCy.setBackground(new java.awt.Color(204, 204, 0));
        BtnCy.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        BtnCy.setForeground(new java.awt.Color(51, 51, 51));
        BtnCy.setText("Coordenada Y");
        BtnCy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TxtPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnCx)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnCy)))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TxtPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCx)
                    .addComponent(BtnCy))
                .addContainerGap(215, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCxActionPerformed
        x=Integer.parseInt(TxtPantalla.getText());//leer el valor de x
        TxtPantalla.setText(null);
        TxtPantalla.requestFocus();//ponemos el cursor
    }//GEN-LAST:event_BtnCxActionPerformed

    private void BtnCyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCyActionPerformed
        y=Integer.parseInt(TxtPantalla.getText());
        q=new ClsPunto (x,y);
        TxtPantalla.setText(null);
        TxtPantalla.requestFocus();
    }//GEN-LAST:event_BtnCyActionPerformed

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
            java.util.logging.Logger.getLogger(WinPunto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinPunto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinPunto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinPunto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WinPunto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCx;
    private javax.swing.JButton BtnCy;
    private javax.swing.JTextField TxtPantalla;
    // End of variables declaration//GEN-END:variables
}
