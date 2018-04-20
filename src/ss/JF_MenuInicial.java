package ss;


import java.awt.event.KeyEvent;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * @author 
 * Dachely Otero Argote
 * Ernesto Alejandro Cervantes Villa
 * Jorge Alexis Rubio Sumano
 * 
 */
public class JF_MenuInicial extends javax.swing.JFrame {
    

    /**
     * Creates new form logIn
     * @throws java.io.IOException
     */
    public JF_MenuInicial() throws IOException{
        initComponents();
        this.getContentPane().setBackground(panelPrinicpal.getBackground());
        pack();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrinicpal = new javax.swing.JPanel();
        jbVerRegistros = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        jLPassWrong = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jlLogoGrande = new javax.swing.JLabel();
        jbAgregarRegistro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(400, 320));
        getContentPane().setLayout(new java.awt.FlowLayout());

        panelPrinicpal.setBackground(new java.awt.Color(255, 255, 255));

        jbVerRegistros.setBackground(new java.awt.Color(0, 102, 102));
        jbVerRegistros.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jbVerRegistros.setForeground(new java.awt.Color(255, 255, 255));
        jbVerRegistros.setText("Ver Registros");
        jbVerRegistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVerRegistrosActionPerformed(evt);
            }
        });

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo1.png"))); // NOI18N

        jLPassWrong.setForeground(new java.awt.Color(255, 51, 51));

        jlLogoGrande.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo_grande.png"))); // NOI18N

        jbAgregarRegistro.setBackground(new java.awt.Color(0, 102, 102));
        jbAgregarRegistro.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jbAgregarRegistro.setForeground(new java.awt.Color(255, 255, 255));
        jbAgregarRegistro.setText("Agregar Nuevo");
        jbAgregarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarRegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPrinicpalLayout = new javax.swing.GroupLayout(panelPrinicpal);
        panelPrinicpal.setLayout(panelPrinicpalLayout);
        panelPrinicpalLayout.setHorizontalGroup(
            panelPrinicpalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrinicpalLayout.createSequentialGroup()
                .addGroup(panelPrinicpalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrinicpalLayout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(jLabel1))
                    .addGroup(panelPrinicpalLayout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jlLogoGrande))
                    .addGroup(panelPrinicpalLayout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addGroup(panelPrinicpalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLPassWrong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrinicpalLayout.createSequentialGroup()
                .addGap(0, 143, Short.MAX_VALUE)
                .addComponent(jbAgregarRegistro)
                .addGap(65, 65, 65)
                .addComponent(jbVerRegistros)
                .addGap(156, 156, 156))
        );
        panelPrinicpalLayout.setVerticalGroup(
            panelPrinicpalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrinicpalLayout.createSequentialGroup()
                .addGroup(panelPrinicpalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrinicpalLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(logo))
                    .addComponent(jlLogoGrande))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(panelPrinicpalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbVerRegistros)
                    .addComponent(jbAgregarRegistro))
                .addGap(50, 50, 50)
                .addComponent(jLPassWrong, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panelPrinicpal);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbVerRegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVerRegistrosActionPerformed
   
    }//GEN-LAST:event_jbVerRegistrosActionPerformed

    private void jbAgregarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbAgregarRegistroActionPerformed

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
            java.util.logging.Logger.getLogger(JF_MenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_MenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_MenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_MenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new JF_MenuInicial().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(JF_MenuInicial.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLPassWrong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbAgregarRegistro;
    private javax.swing.JButton jbVerRegistros;
    private javax.swing.JLabel jlLogoGrande;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel panelPrinicpal;
    // End of variables declaration//GEN-END:variables
}
