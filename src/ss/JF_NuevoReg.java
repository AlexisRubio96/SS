package ss;


import java.awt.Color;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 
 * Dachely Otero Argote
 * Ernesto Alejandro Cervantes Villa
 * Jorge Alexis Rubio Sumano
 * 
 */
public class JF_NuevoReg extends javax.swing.JFrame {
    
    //private ListaUsuarios lista;
    private JF_GuardarReg guardarReg;
    private JF_MenuInicial menuInicial;
    private double talla;
    private double peso;
    private RangoObesidad rangoObesidad;
    private Principal principal;
    private Registro registro;
    
    
    /**
     * Creates new form NuevoUsuario
     */
    public JF_NuevoReg() {
        initComponents();
        this.getContentPane().setBackground(jPanel1.getBackground());
        jlRestriccionPT.setVisible(false);
        pack();
        this.setLocationRelativeTo(null);
        setResizable(false);
    }
    
    public JF_NuevoReg(JF_MenuInicial menuInicial, Principal principal) {
        this();
        this.principal = principal;
        this.menuInicial = menuInicial;
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
        jLNombre = new javax.swing.JLabel();
        jtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtEdad = new javax.swing.JTextField();
        jLUserName = new javax.swing.JLabel();
        jtSexo = new javax.swing.JTextField();
        jLPass1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtTalla = new javax.swing.JTextField();
        jcbCategoria = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jbSiguiente = new javax.swing.JButton();
        jBcancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jlRestriccionPT = new javax.swing.JLabel();
        jtPeso = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtApellido = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nuevo Usuario");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(500, 400));
        getContentPane().setLayout(new java.awt.FlowLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLNombre.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jLNombre.setText("Nombre(s):");

        jtNombre.setColumns(10);
        jtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNombreActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jLabel2.setText("Apellido(s):");

        jtEdad.setColumns(10);

        jLUserName.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jLUserName.setText("Edad:");

        jtSexo.setColumns(10);
        jtSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtSexoActionPerformed(evt);
            }
        });

        jLPass1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jLPass1.setText("Sexo:");

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jLabel5.setText("Peso:");

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jLabel6.setText("Talla:");

        jtTalla.setColumns(15);

        jcbCategoria.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jcbCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Alumno", "Maestro", "Jefe De Familia", "Preparadores de Comida", "Directivo", "Voluntario" }));
        jcbCategoria.setToolTipText("");
        jcbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCategoriaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jLabel8.setText("Categoria:");

        jbSiguiente.setBackground(new java.awt.Color(0, 102, 102));
        jbSiguiente.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jbSiguiente.setForeground(new java.awt.Color(255, 255, 255));
        jbSiguiente.setText("Siguiente");
        jbSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSiguienteActionPerformed(evt);
            }
        });

        jBcancelar.setBackground(new java.awt.Color(0, 102, 102));
        jBcancelar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jBcancelar.setForeground(new java.awt.Color(255, 255, 255));
        jBcancelar.setText("Cancelar");
        jBcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcancelarActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo_pequeño_1.png"))); // NOI18N

        jlRestriccionPT.setForeground(new java.awt.Color(255, 51, 51));
        jlRestriccionPT.setText("**Campos Peso o Talla no validos");

        jLabel3.setText("(Kg)");

        jLabel4.setText("(m)");

        jtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtApellidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLUserName)
                            .addComponent(jLabel2)
                            .addComponent(jLNombre)
                            .addComponent(jLPass1)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtEdad, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtTalla, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jtSexo)
                            .addComponent(jtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtPeso)
                            .addComponent(jtApellido))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jlRestriccionPT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(52, 52, 52))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbSiguiente)
                                .addGap(18, 18, 18)
                                .addComponent(jBcancelar)))
                        .addGap(21, 21, 21))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLNombre))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jtApellido))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLUserName)))
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLPass1)
                    .addComponent(jtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtTalla, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jcbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSiguiente)
                    .addComponent(jBcancelar)
                    .addComponent(jlRestriccionPT))
                .addGap(52, 52, 52))
        );

        jtNombre.getAccessibleContext().setAccessibleName("jpNombre");
        jtNombre.getAccessibleContext().setAccessibleDescription("");
        jtEdad.getAccessibleContext().setAccessibleName("jpEdad");

        getContentPane().add(jPanel1);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNombreActionPerformed

    
    private void jbSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSiguienteActionPerformed
        
        //Implementar try catch para restringir double
        try{
            peso = Double.parseDouble(jtPeso.getText());
            talla = Double.parseDouble(jtTalla.getText());
            
            Categoria cat;
            if(jcbCategoria.getSelectedIndex() == 0){
                cat = Categoria.ALUMNO;
            }else if(jcbCategoria.getSelectedIndex() == 1){
                cat = Categoria.MAESTRO;
            }else if(jcbCategoria.getSelectedIndex() == 2){
                cat = Categoria.JEFE_FAMILIA;
            }else if(jcbCategoria.getSelectedIndex() == 3){
                cat = Categoria.PREP_COMIDA;                
            }else if(jcbCategoria.getSelectedIndex() == 4){
                cat = Categoria.DIRECTIVO;
            }else{
                cat = Categoria.VOLUNTARIO;
            }
            
<<<<<<< HEAD
            Registro registro = new Registro(1, jtNombre.getText(), jtApellido.getText(), jtEdad.getText(), jtSexo.getText(), peso, talla, cat);
            
=======
            if(jtApellido.getText().equals("") || jtEdad.getText().equals("") || jtNombre.getText().equals("") || jtSexo.getText().equals("") || jtPeso.getText().equals("") || jtTalla.getText().equals("")){
                throw new Exception("");
            }
            
            registro = new Registro(1, jtNombre.getText(), jtApellido.getText(), jtEdad.getText(), jtSexo.getText(), peso, talla, cat, "", 0.0);
            //vaciar campos
>>>>>>> 0d46597fb4249f1c5a392c5f7b8525e78a37e5dd
            jtNombre.setText("");
            jtApellido.setText("");
            jtEdad.setText("");
            jtSexo.setText("");
            jtPeso.setText("");
            jtTalla.setText("");
            
            
            
            if(guardarReg == null){
                try {
                    guardarReg = new JF_GuardarReg(principal, registro, this);
                } catch (IOException ex) {
                    Logger.getLogger(JF_NuevoReg.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                guardarReg.dispose();        //Vuelve null el objeto anterior
                try {
                    guardarReg = new JF_GuardarReg(principal, registro, this);
                } catch (IOException ex) {
                    Logger.getLogger(JF_NuevoReg.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            guardarReg.setVisible(true);
            this.setVisible(false);
        }catch(NumberFormatException nFE){
            jlRestriccionPT.setVisible(true);
            jlRestriccionPT.setVisible(true);
        }
    }//GEN-LAST:event_jbSiguienteActionPerformed

    
    private void jBcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcancelarActionPerformed
            this.setVisible(false);
            this.menuInicial.setVisible(true);
            //System.exit(0);
            
    }//GEN-LAST:event_jBcancelarActionPerformed

    private void jcbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbCategoriaActionPerformed

    private void jtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtApellidoActionPerformed

    private void jtSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtSexoActionPerformed

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
            java.util.logging.Logger.getLogger(JF_NuevoReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_NuevoReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_NuevoReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_NuevoReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_NuevoReg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBcancelar;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLPass1;
    private javax.swing.JLabel jLUserName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbSiguiente;
    private javax.swing.JComboBox jcbCategoria;
    private javax.swing.JLabel jlRestriccionPT;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtEdad;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtPeso;
    private javax.swing.JTextField jtSexo;
    private javax.swing.JTextField jtTalla;
    // End of variables declaration//GEN-END:variables
}
