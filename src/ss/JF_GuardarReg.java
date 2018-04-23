package ss;


import java.awt.Color;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
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
public class JF_GuardarReg extends javax.swing.JFrame {
    
    //private ListaUsuarios lista;
    private Registro registro;
    private Principal principal;
    private JF_Aceptado acepReg;
    private JF_NuevoReg nuevoRegistro;
    
    
    /**
     * Creates new form NuevoUsuario
     */
    public JF_GuardarReg() {
        initComponents();
        this.getContentPane().setBackground(jPanelGuardarReg.getBackground());
        pack();
        this.setLocationRelativeTo(null);
        setResizable(false);
    }
    
 
    public JF_GuardarReg(Principal principal, Registro registro, JF_NuevoReg nuevoReg) throws IOException{
        this();
        this.principal = principal;
        this.registro = registro;
        this.nuevoRegistro = nuevoReg;
        //Se puede cambiar variables a private y poner gets
        this.setCampos();   //Llena los campos de IMC y rango Obesidad; 
        this.setCamposVisibles();//verifica que categoria es para detemrinar campos a mostrar;
    }
    
    private void setCampos() {
        //Llena el campo de IMC con dos decimales
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        jtIMC.setText(String.valueOf(numberFormat.format(registro.imc)));
        //Cambia el color del campo dependiendo del rango de IMC
        switch(registro.rangoObesidad){
            case AMARILLO:
                jtRangoObesidad.setBackground(Color.yellow);
                break;
            case VERDE:
                jtRangoObesidad.setBackground(Color.green);
                break;
            case ROJO:
                jtRangoObesidad.setBackground(Color.red);
                break;
            default:
                break;
         
        }
    }
    
    private void setCamposVisibles(){
        Categoria cat = registro.getCategoria();
        if(cat == Categoria.DIRECTIVO || cat == Categoria.JEFE_FAMILIA || cat == Categoria.PREP_COMIDA || cat == Categoria.VOLUNTARIO){
            jlEscuela.setVisible(false);
            jtEscuela.setVisible(false);
            jlTallaEdad.setVisible(false);
            jtTallaEdad.setVisible(false);
        }
        else if(cat == Categoria.MAESTRO){
            jlTallaEdad.setVisible(false);
            jtTallaEdad.setVisible(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelGuardarReg = new javax.swing.JPanel();
        jlIMC = new javax.swing.JLabel();
        jtIMC = new javax.swing.JTextField();
        jlTallaEdad = new javax.swing.JLabel();
        jtRangoObesidad = new javax.swing.JTextField();
        jlRangoObesidad = new javax.swing.JLabel();
        jtEscuela = new javax.swing.JTextField();
        jlEscuela = new javax.swing.JLabel();
        jtTallaEdad = new javax.swing.JPasswordField();
        jbGuardad = new javax.swing.JButton();
        jcCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nuevo Usuario");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(500, 400));
        getContentPane().setLayout(new java.awt.FlowLayout());

        jPanelGuardarReg.setBackground(new java.awt.Color(255, 255, 255));

        jlIMC.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jlIMC.setText("IMC:");

        jtIMC.setEditable(false);
        jtIMC.setColumns(10);
        jtIMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtIMCActionPerformed(evt);
            }
        });

        jlTallaEdad.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jlTallaEdad.setText("Talla/Edad:");

        jtRangoObesidad.setEditable(false);
        jtRangoObesidad.setColumns(10);

        jlRangoObesidad.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jlRangoObesidad.setText("Rango Obesidad:");

        jtEscuela.setColumns(10);

        jlEscuela.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jlEscuela.setText("Escuela:");

        jtTallaEdad.setEditable(false);
        jtTallaEdad.setColumns(10);

        jbGuardad.setBackground(new java.awt.Color(0, 102, 102));
        jbGuardad.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jbGuardad.setForeground(new java.awt.Color(255, 255, 255));
        jbGuardad.setText("Guardar");
        jbGuardad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardadActionPerformed(evt);
            }
        });

        jcCancelar.setBackground(new java.awt.Color(0, 102, 102));
        jcCancelar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jcCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jcCancelar.setText("Cancelar");
        jcCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcCancelarActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo_pequeño_1.png"))); // NOI18N

        javax.swing.GroupLayout jPanelGuardarRegLayout = new javax.swing.GroupLayout(jPanelGuardarReg);
        jPanelGuardarReg.setLayout(jPanelGuardarRegLayout);
        jPanelGuardarRegLayout.setHorizontalGroup(
            jPanelGuardarRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGuardarRegLayout.createSequentialGroup()
                .addGroup(jPanelGuardarRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelGuardarRegLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jlTallaEdad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtTallaEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelGuardarRegLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanelGuardarRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlRangoObesidad)
                            .addComponent(jlIMC)
                            .addComponent(jlEscuela))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelGuardarRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtRangoObesidad, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtEscuela, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtIMC, javax.swing.GroupLayout.Alignment.LEADING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addGroup(jPanelGuardarRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGuardarRegLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGuardarRegLayout.createSequentialGroup()
                        .addComponent(jbGuardad)
                        .addGap(18, 18, 18)
                        .addComponent(jcCancelar)
                        .addGap(33, 33, 33))))
        );
        jPanelGuardarRegLayout.setVerticalGroup(
            jPanelGuardarRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGuardarRegLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanelGuardarRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelGuardarRegLayout.createSequentialGroup()
                        .addGroup(jPanelGuardarRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelGuardarRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jtRangoObesidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jlRangoObesidad))
                            .addGroup(jPanelGuardarRegLayout.createSequentialGroup()
                                .addGroup(jPanelGuardarRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtIMC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlIMC))
                                .addGap(35, 35, 35)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelGuardarRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlEscuela)
                            .addComponent(jtEscuela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanelGuardarRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtTallaEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlTallaEdad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelGuardarRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardad)
                    .addComponent(jcCancelar))
                .addContainerGap(149, Short.MAX_VALUE))
        );

        jtIMC.getAccessibleContext().setAccessibleDescription("");
        jtRangoObesidad.getAccessibleContext().setAccessibleName("jpEdad");
        jtTallaEdad.getAccessibleContext().setAccessibleName("jpApellido");

        getContentPane().add(jPanelGuardarReg);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtIMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtIMCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtIMCActionPerformed

    private void jbGuardadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardadActionPerformed
        if(registro.getCategoria() == Categoria.ALUMNO){
            registro.setEscuela(jtEscuela.getText());
            //**********************Falta ajustar la talla_edad********************
        }
        if(registro.getCategoria() == Categoria.MAESTRO){
            registro.setEscuela(jtEscuela.getText());
        }
        principal.getRegistros().add(this.registro);
        registro.setIDregistro(principal.getRegistros().size());
        actualizarArchivoRegistros(this.registro);
        this.acepReg = new JF_Aceptado(nuevoRegistro);
        nuevoRegistro.resetCampos();
        acepReg.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbGuardadActionPerformed

    private void jcCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcCancelarActionPerformed
            this.setVisible(false);
            nuevoRegistro.resetCampos();
            nuevoRegistro.setVisible(true);
    }//GEN-LAST:event_jcCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(JF_GuardarReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_GuardarReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_GuardarReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_GuardarReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_GuardarReg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanelGuardarReg;
    private javax.swing.JButton jbGuardad;
    private javax.swing.JButton jcCancelar;
    private javax.swing.JLabel jlEscuela;
    private javax.swing.JLabel jlIMC;
    private javax.swing.JLabel jlRangoObesidad;
    private javax.swing.JLabel jlTallaEdad;
    private javax.swing.JTextField jtEscuela;
    private javax.swing.JTextField jtIMC;
    private javax.swing.JTextField jtRangoObesidad;
    private javax.swing.JPasswordField jtTallaEdad;
    // End of variables declaration//GEN-END:variables

    public void actualizarArchivoRegistros(Registro r) {
        FileWriter archivoSal; 
        
        try {
            archivoSal = new FileWriter("src/registros.txt", true);
            PrintWriter salida= new PrintWriter(archivoSal);            
            salida.println(r.getIDregistro()+","+ (r.getNombre())+","+ (r.getApellido()) +","+
                    r.getFechaNac()+","+ (r.getSexo())+","+ (r.getPeso()) +","+
                    r.getTalla()+","+ (r.getCategoria())+ ","+(r.getEscuela())+ ","+ (r.getTallaEdad()));

            salida.close();
        } catch (Exception e) {
            
        }
        }
        /*catch (IOException ex) {
            Logger.getLogger(Registrar.class.getName()).log(Level.SEVERE, null, ex);
        }*/

}
