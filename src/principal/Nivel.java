package principal;

import conexion.ConexionSQLite;
import edicion.Edicion;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

//Es un JFrame en el que se decide el nivel del juego.
public class Nivel extends javax.swing.JFrame {
    //Los nombres de los atributos son específicos y respetan el encapsulamiento.
    private int random, numPalabra;
    private List <String> palabra = new ArrayList<>();
        
    public Nivel() {
            initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnFacil = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnNormal = new javax.swing.JButton();
        btnDificil = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ahorcado");
        setIconImage(getIconImage());

        btnFacil.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnFacil.setText("Fácil");
        btnFacil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacilActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel1.setText("Elegí el nivel");

        btnNormal.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnNormal.setText("Normal");
        btnNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNormalActionPerformed(evt);
            }
        });

        btnDificil.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnDificil.setText("Difícil");
        btnDificil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDificilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnFacil, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btnNormal, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDificil, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnFacil, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNormal, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDificil, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Se establece qué palabra va a ir a la pantalla de Juego a través del metodoNivel, más adelante
    private void btnFacilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacilActionPerformed
        try {   
            metodoNivel("NIVEL FÁCIL", "facil");
        } catch (Exception ex) {
            Logger.getLogger(Nivel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnFacilActionPerformed

    private void btnNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNormalActionPerformed
        try {
            metodoNivel("NIVEL NORMAL", "normal");
        } catch (Exception ex) {
            Logger.getLogger(Nivel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnNormalActionPerformed

    private void btnDificilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDificilActionPerformed
        try {
            metodoNivel("NIVEL DIFÍCIL", "dificil");
        } catch (Exception ex) {
            Logger.getLogger(Nivel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDificilActionPerformed

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
            java.util.logging.Logger.getLogger(Nivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nivel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDificil;
    private javax.swing.JButton btnFacil;
    private javax.swing.JButton btnNormal;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
    
    //metodoNivel funciona a partir de los parámetros que arroja cada Nivel
    private void metodoNivel(String dificultad, String llamada) throws Exception{
        //Instancia Juego
        Juego JJ = new Juego();

        //Conecta con la BD a través de llenarArrayList de ConexionSQLite
        ConexionSQLite CN = new ConexionSQLite();
        CN.llenarArrayList(palabra, "select palabra_"+ llamada +" from "+ llamada);
        
        //Si el array palabra tiene algún resultado, muestra Juego, le asigna una dificultad, centra la ventana, evita que se maximice y cierra esta.
        //Además, mide el largo de la List palabra y a partir de eso elige un número Random para llevar la palabra al Juego.
        if(palabra!=null){
            JJ.setVisible(true);
            JJ.lblNivel.setText(dificultad);
            JJ.setLocationRelativeTo(null);//para centrar la ventana
            JJ.setResizable(false);//Evita que se maximice la ventana
            this.dispose();  
            numPalabra=palabra.size();
            random=(int) (Math.random() * numPalabra);
            JJ.palabra=palabra.get(random);
        }else{
            //Si por cualquier motivo no hubiera palabras, el programa te invita a agregarlas
            if (JOptionPane.showConfirmDialog(rootPane, "El nivel no tiene palabras. Por favor, agregue algunas",
                "Error", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                Edicion E= new Edicion();
                E.setVisible(true);
                E.setLocationRelativeTo(null);//para centrar la ventana
                E.setResizable(false);//Evita que se maximice la ventana
                this.dispose();
            }
        }

        //Establece el largo de la palabra, útil para los bucles switch a continuación
        JJ.largo = JJ.palabra.length();
        
        //A partir del largo (se presupone un mínimo de 5) establece cuántos lbl de espacio se muestran de los 12
        switch(JJ.largo){
            case 6: 
                JJ.lbl6.setVisible(true);;
            break;
            
            case 7: 
                JJ.lbl6.setVisible(true); 
                JJ.lbl7.setVisible(true);
            break;
            
            case 8:
                JJ.lbl6.setVisible(true); 
                JJ.lbl7.setVisible(true);
                JJ.lbl8.setVisible(true);
            break;
            
            case 9:
                JJ.lbl6.setVisible(true); 
                JJ.lbl7.setVisible(true);
                JJ.lbl8.setVisible(true);
                JJ.lbl9.setVisible(true);
            break;
            
            case 10:
                JJ.lbl6.setVisible(true); 
                JJ.lbl7.setVisible(true);
                JJ.lbl8.setVisible(true);
                JJ.lbl9.setVisible(true);
                JJ.lbl10.setVisible(true);
            break;
            
            case 11:
                JJ.lbl6.setVisible(true); 
                JJ.lbl7.setVisible(true);
                JJ.lbl8.setVisible(true);
                JJ.lbl9.setVisible(true); 
                JJ.lbl10.setVisible(true);
                JJ.lbl11.setVisible(true);
            break;
            
            case 12:
                JJ.lbl6.setVisible(true); 
                JJ.lbl7.setVisible(true);
                JJ.lbl8.setVisible(true);
                JJ.lbl9.setVisible(true); 
                JJ.lbl10.setVisible(true);
                JJ.lbl11.setVisible(true);
                JJ.lbl12.setVisible(true);
            break;
            
            default: System.out.println("Palabra de 5 letras");
        }
    }
    
    //Este Override permite meter imagenes/ahorcado.png como logo. Además, hay que ir a la parte gráfica, 
    //botón derecho a iconImage en Propiedades, seleccionar Propiedad y elegir iconImage.
    //También hay que escribir el título en Propiedades/title    
    @Override public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/ahorcado.png"));
        return retValue;
    }
}