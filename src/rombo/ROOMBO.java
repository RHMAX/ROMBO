package rombo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class ROOMBO extends javax.swing.JFrame {

    /**
     * Creates new form ROOMBO
     */
    public ROOMBO() {
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
        txtCALCULAR = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtBORRAR = new javax.swing.JButton();
        txtDIAGONALMAYOR = new javax.swing.JTextField();
        txtDIAGONALMENOR = new javax.swing.JTextField();
        txtAREA = new javax.swing.JTextField();
        txtPERIMETRO = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("DIAGONAL MAYOR");

        txtCALCULAR.setText("CALCULAR");
        txtCALCULAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCALCULARActionPerformed(evt);
            }
        });

        jLabel2.setText("DIAGONAL MENOR");

        jLabel3.setText("AREA");

        jLabel4.setText("PERÍMETRO");

        txtBORRAR.setText("BORRAR");
        txtBORRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBORRARActionPerformed(evt);
            }
        });

        txtPERIMETRO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPERIMETROActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(txtCALCULAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(txtBORRAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDIAGONALMAYOR)
                    .addComponent(txtDIAGONALMENOR)
                    .addComponent(txtAREA)
                    .addComponent(txtPERIMETRO, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtDIAGONALMAYOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtDIAGONALMENOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAREA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPERIMETRO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(txtCALCULAR)
                .addGap(29, 29, 29)
                .addComponent(txtBORRAR)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPERIMETROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPERIMETROActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPERIMETROActionPerformed

    private void txtCALCULARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCALCULARActionPerformed
        double lado,diagonalM,diagonalm,area,perimetro;
    
    
    diagonalM=Double.parseDouble(String.valueOf(txtDIAGONALMAYOR.getText()));
    diagonalm=Double.parseDouble(String.valueOf(txtDIAGONALMENOR.getText()));
   
    area=(diagonalM*diagonalm)/2;
    lado= Math.sqrt(diagonalM/2 + Math.pow(diagonalM, 2)+(diagonalm/2+(Math.pow(diagonalm, 2))));

    perimetro=lado*4;
    
    txtAREA.setText(String.valueOf(area));
    txtPERIMETRO.setText(String.valueOf(perimetro));
        
    }//GEN-LAST:event_txtCALCULARActionPerformed

    private void txtBORRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBORRARActionPerformed
        // TODO add your handling code here:
        
        txtDIAGONALMAYOR.setText("");
        txtDIAGONALMENOR.setText("");
        txtAREA.setText("");
        txtPERIMETRO.setText("");
             
    }//GEN-LAST:event_txtBORRARActionPerformed

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
            java.util.logging.Logger.getLogger(ROOMBO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ROOMBO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ROOMBO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ROOMBO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ROOMBO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtAREA;
    private javax.swing.JButton txtBORRAR;
    private javax.swing.JButton txtCALCULAR;
    private javax.swing.JTextField txtDIAGONALMAYOR;
    private javax.swing.JTextField txtDIAGONALMENOR;
    private javax.swing.JTextField txtPERIMETRO;
    // End of variables declaration//GEN-END:variables
}
