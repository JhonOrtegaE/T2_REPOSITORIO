/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TurnosPantallas;

/**
 *
 * @author USER
 */
public class MarioClases extends javax.swing.JFrame {

    /**
     * Creates new form MenuMarioP
     */
    public MarioClases() {
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

        jLabel1 = new javax.swing.JLabel();
        btnMañana = new javax.swing.JButton();
        btnMañana1 = new javax.swing.JButton();
        btnMañana2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("MARIO PEREZ");

        btnMañana.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnMañana.setText("TURNO MAÑANA");
        btnMañana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMañanaActionPerformed(evt);
            }
        });

        btnMañana1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnMañana1.setText("TURNO TARDE");
        btnMañana1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMañana1ActionPerformed(evt);
            }
        });

        btnMañana2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnMañana2.setText("TURNO NOCHE");
        btnMañana2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMañana2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1))
                    .addComponent(btnMañana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMañana1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMañana2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addComponent(btnMañana)
                .addGap(18, 18, 18)
                .addComponent(btnMañana1)
                .addGap(27, 27, 27)
                .addComponent(btnMañana2)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMañanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMañanaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMañanaActionPerformed

    private void btnMañana1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMañana1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMañana1ActionPerformed

    private void btnMañana2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMañana2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMañana2ActionPerformed

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
            java.util.logging.Logger.getLogger(MarioClases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MarioClases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MarioClases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MarioClases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MarioClases().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMañana;
    private javax.swing.JButton btnMañana1;
    private javax.swing.JButton btnMañana2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
