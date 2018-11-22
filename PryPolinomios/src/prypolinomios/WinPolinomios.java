
package prypolinomios;
import CapaNegocio.ClsPolinomio;
public class WinPolinomios extends javax.swing.JFrame {

    public WinPolinomios() {
        initComponents();
    }
    int g, k;
    ClsPolinomio p,q;
    float c [];
    
    int b=1;
    float vi, vf, dx;
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TxtPantalla = new javax.swing.JTextField();
        BtnGrado = new javax.swing.JButton();
        BtnCoeficiente = new javax.swing.JButton();
        BtnEvaluar = new javax.swing.JButton();
        BtnLimpiar = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        BtnRango = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnGrado.setText("Grado");
        BtnGrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGradoActionPerformed(evt);
            }
        });

        BtnCoeficiente.setText("Coeficiente [i]");
        BtnCoeficiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCoeficienteActionPerformed(evt);
            }
        });

        BtnEvaluar.setText("Evaluar");
        BtnEvaluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEvaluarActionPerformed(evt);
            }
        });

        BtnLimpiar.setText("Limpiar");
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });

        BtnSalir.setText("SALIR");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        BtnRango.setText("Rango:ValInicial");
        BtnRango.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRangoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnGrado)
                            .addComponent(BtnEvaluar))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnRango)
                            .addComponent(BtnCoeficiente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnSalir)
                            .addComponent(BtnLimpiar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(TxtPantalla)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(TxtPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnGrado)
                    .addComponent(BtnCoeficiente)
                    .addComponent(BtnLimpiar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(BtnEvaluar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnSalir)
                            .addComponent(BtnRango))))
                .addContainerGap(135, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnGradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGradoActionPerformed
        g=Integer.parseInt(TxtPantalla.getText());
        k=g;
        c=new float [k+1];
        BtnCoeficiente.setText("COEFICIENTE ["+k+"]");
        BtnGrado.setEnabled(false);
        TxtPantalla.setText(null);
        TxtPantalla.requestFocus();
    }//GEN-LAST:event_BtnGradoActionPerformed

    private void BtnCoeficienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCoeficienteActionPerformed
        c [k]=Float.parseFloat(TxtPantalla.getText());
        k-=1;
        BtnCoeficiente.setText("COEFICIENTE ["+k+"]");
        
        TxtPantalla.setText(null);
        TxtPantalla.requestFocus();
        if (k<0){
            q=new ClsPolinomio (g,c);
            TxtPantalla.setText(q.toString ());
            BtnCoeficiente.setText("COEFICIENTE [i]");
            BtnGrado.setEnabled(true);
            
        }
    }//GEN-LAST:event_BtnCoeficienteActionPerformed

    private void BtnEvaluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEvaluarActionPerformed
        float a;
        a=Integer.parseInt(TxtPantalla.getText());
        TxtPantalla.setText(q.Fx(a)+" ");
        TxtPantalla.requestFocus();
    }//GEN-LAST:event_BtnEvaluarActionPerformed

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
       TxtPantalla.setText(null);
       TxtPantalla.requestFocus();
    }//GEN-LAST:event_BtnLimpiarActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnRangoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRangoActionPerformed
        float [] r;
        String resp;
        switch (b){
            case 1:
                vi=Float.parseFloat(TxtPantalla.getText());
                b=2;
                BtnRango.setText("RANGO: Valor final");
                break;
            case 2:
                vf=Float.parseFloat(TxtPantalla.getText());
                b=3;
                BtnRango.setText("RANGO: Incremento");
                break;
            case 3:
                dx=Float.parseFloat(TxtPantalla.getText());
                b=1;
                BtnRango.setText("RANGO: Valor Inicial");
                r=q.evalua(vi, vf, dx);
                for (int i=vi; i<vf; i+=dx){
                    resp+="("+i+","+r[n]+",";
                }
                TxtPantalla.setText(resp);
                break;
        }
        TxtPantalla.requestFocus();
    }//GEN-LAST:event_BtnRangoActionPerformed

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
            java.util.logging.Logger.getLogger(WinPolinomios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinPolinomios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinPolinomios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinPolinomios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WinPolinomios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCoeficiente;
    private javax.swing.JButton BtnEvaluar;
    private javax.swing.JButton BtnGrado;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JButton BtnRango;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JTextField TxtPantalla;
    // End of variables declaration//GEN-END:variables
}
