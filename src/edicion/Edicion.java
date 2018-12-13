package edicion;

import conexion.ConexionSQLite;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import principal.Principal;

//Es un JFrame que sirve para agregar palabras y elegir palabras a editar.
public class Edicion extends javax.swing.JFrame {
    //Los nombres de los atributos son específicos y respetan el encapsulamiento.
    private String palabraNueva, dificultad, palabraTabla;
    private int largoPalabra, id;
    private ConexionSQLite CN = new ConexionSQLite();  
    
    public Edicion() {
        initComponents();
        
        //Impide que se pueda agrandar la pantalla
        this.setResizable(false);
        
        //Oculta los botones hasta que se use el botón Editar
        btnFacil.setVisible(false);
        btnNormal.setVisible(false);
        btnDificil.setVisible(false);         
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnFacil = new javax.swing.JButton();
        btnNormal = new javax.swing.JButton();
        btnDificil = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEdit = new javax.swing.JTable();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ahorcado");
        setIconImage(getIconImage());

        btnAgregar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAgregar.setText("Agregar palabra");
        btnAgregar.setMaximumSize(new java.awt.Dimension(150, 25));
        btnAgregar.setMinimumSize(new java.awt.Dimension(80, 25));
        btnAgregar.setPreferredSize(new java.awt.Dimension(150, 25));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnEditar.setText("Editar lista");
        btnEditar.setMaximumSize(new java.awt.Dimension(150, 25));
        btnEditar.setMinimumSize(new java.awt.Dimension(80, 25));
        btnEditar.setPreferredSize(new java.awt.Dimension(150, 25));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnFacil.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnFacil.setText("Fácil");
        btnFacil.setPreferredSize(new java.awt.Dimension(80, 20));
        btnFacil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacilActionPerformed(evt);
            }
        });

        btnNormal.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnNormal.setText("Normal");
        btnNormal.setPreferredSize(new java.awt.Dimension(80, 20));
        btnNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNormalActionPerformed(evt);
            }
        });

        btnDificil.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnDificil.setText("Difícil");
        btnDificil.setPreferredSize(new java.awt.Dimension(80, 20));
        btnDificil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDificilActionPerformed(evt);
            }
        });

        tblEdit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Palabras"
            }
        ));
        tblEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblEditMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tblEdit);

        btnVolver.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnVolver.setText("Volver al juego");
        btnVolver.setMaximumSize(new java.awt.Dimension(150, 25));
        btnVolver.setMinimumSize(new java.awt.Dimension(80, 25));
        btnVolver.setPreferredSize(new java.awt.Dimension(150, 25));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnFacil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(btnNormal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(btnDificil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnFacil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNormal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDificil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //El btnAgregar despliga un JOptionPane que recibe una palabra a agregar, recibida como palabraNueva. Se mide la longitud con largoPalabra.
    //A partir de ahí se controla que la palabra no contenga cosas que no sean letras y que el largo sea mayor a 4 y menor a 13.
    //Si pasa se recibe una nueva palabra. Dentro de bucles se comprueban y renuevan ambas condiciones (palabraNueva y largoPalabra) hasta que la palabra sea acorde.
    //En cuanto se cumplan ambas condiciones se usa el método agregarPalabra que está debajo.
    //El try & catch es necesario por la conexión con la BDD.
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        palabraNueva = JOptionPane.showInputDialog (null, "Escriba la palabra que desea agregar");
        largoPalabra = palabraNueva.length();
        
        if(palabraNueva.matches("[a-zA-Z]*")==false){
            while(palabraNueva.matches("[a-zA-Z]*")==false || largoPalabra<=4 || largoPalabra>=13){
                while(palabraNueva.matches("[a-zA-Z]*")==false){                
                    palabraNueva = JOptionPane.showInputDialog(null, "La palabra sólo debe contener letras", "Error", JOptionPane.ERROR_MESSAGE);
                    largoPalabra=palabraNueva.length(); 
                }
                while(largoPalabra<=4 || largoPalabra>=13){
                    palabraNueva = JOptionPane.showInputDialog(null, "La palabra sólo puede tener entre 5 y 12 letras", "Error", JOptionPane.ERROR_MESSAGE);
                    largoPalabra=palabraNueva.length();                
                } 
            }          
            try {
                agregarPalabra(palabraNueva, largoPalabra);
            } catch (Exception ex) {
                Logger.getLogger(Edicion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(largoPalabra<=4 || largoPalabra>=13){
            while(palabraNueva.matches("[a-zA-Z]*")==false || largoPalabra<=4 || largoPalabra>=13){
                while(largoPalabra<=4 || largoPalabra>=13){
                    palabraNueva = JOptionPane.showInputDialog(null, "La palabra sólo puede tener entre 5 y 12 letras", "Error", JOptionPane.ERROR_MESSAGE);
                    largoPalabra=palabraNueva.length();  
                }
                while(palabraNueva.matches("[a-zA-Z]*")==false){
                    palabraNueva = JOptionPane.showInputDialog(null, "La palabra sólo debe contener letras", "Error", JOptionPane.ERROR_MESSAGE);
                    largoPalabra=palabraNueva.length(); 
                }
            }       
            try {
                agregarPalabra(palabraNueva, largoPalabra);
            } catch (Exception ex) {
                Logger.getLogger(Edicion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            try {
                agregarPalabra(palabraNueva, largoPalabra);
            } catch (Exception ex) {
                Logger.getLogger(Edicion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnAgregarActionPerformed
    
    //El btnEditar sólo muestra los botones Facil, Normal y Dificil
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        btnFacil.setVisible(true);
        btnNormal.setVisible(true);
        btnDificil.setVisible(true);
    }//GEN-LAST:event_btnEditarActionPerformed
    
    //En los tres botones funciona el método botonDificultad, ver más abajo
    private void btnFacilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacilActionPerformed
        botonDificultad("facil");
    }//GEN-LAST:event_btnFacilActionPerformed

    private void btnNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNormalActionPerformed
        botonDificultad("normal");
    }//GEN-LAST:event_btnNormalActionPerformed

    private void btnDificilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDificilActionPerformed
        botonDificultad("dificil");
    }//GEN-LAST:event_btnDificilActionPerformed
    
    //Se toma que presionar sobre una palabra es un evt. Con dos evt (getClickCount()) se ejecuta.
    //Se instancia la pantalla EditarPalabra, se centra y se impide que se maximice.
    //palabraTabla es la palabra clickeada. A partir de ella se trae el id.
    //Se establece que en EditarPalabra: txtPalabra y palabraVieja* van a ser palabraTabla, dif va a ser dificultad y id va a ser id.
    //Al final, se usa dispose para dar de baja la pantalla.
    //*la utilidad de palabraVieja se evalúa en EditarPalabra.
    private void tblEditMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEditMouseReleased
        if(evt.getClickCount()==2){                          
            EditarPalabra EP = new EditarPalabra ();
            EP.setVisible(true);
            EP.setLocationRelativeTo(null);
            EP.setResizable(false);

            palabraTabla = (String) tblEdit.getValueAt(tblEdit.getSelectedRow(), 0);
            try {
                id=CN.traerId(palabraTabla, dificultad);
            } catch (Exception ex) {
                Logger.getLogger(Edicion.class.getName()).log(Level.SEVERE, null, ex);
            }
            EP.txtPalabra.setText(palabraTabla);
            EP.dif=dificultad;
            EP.palabraVieja=palabraTabla;
            EP.id=id;
            this.dispose();
        }
    }//GEN-LAST:event_tblEditMouseReleased

        //El btnVolver instancia la pantalla Principal, la muestra, la centra e impide que se maximice. Después esta pantalla se da de baja.
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        Principal P = new Principal ();
        P.setVisible(true);
        P.setLocationRelativeTo(null);
        P.setResizable(false);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

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
            java.util.logging.Logger.getLogger(Edicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Edicion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnDificil;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnFacil;
    private javax.swing.JButton btnNormal;
    private javax.swing.JButton btnVolver;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblEdit;
    // End of variables declaration//GEN-END:variables
    
    //Se recibe la palabra del JOptionPane y el largo de la misma, medido antes. Se la lleva a mayúsculas.
    //Como todo es correcto, a partir del largo se mete la palabra en la dificultad correspondiente a partir del método agregarPalabraSQL de ConexionSQLite.
    private void agregarPalabra (String palabra, int largo) throws Exception{
        palabra=palabra.toUpperCase();
        switch(largo){
            case 5:
            case 6:
                CN.agregarPalabraSQL(palabra, "facil");
                break;
            case 7:
            case 8:
            case 9:
                CN.agregarPalabraSQL(palabra, "normal");
                break;
            case 10:
            case 11:
            case 12:
                CN.agregarPalabraSQL(palabra, "dificil");
                break;
        }
    }
    
    //Si tblEdit no está vacía, se la vacía para que no se acumulen palabras.
    //Después se usa el método llenarTabla de ConexionSQLite. Se usa tblEdit y la dificultad para ejecutar el query que traiga las palabras de esa dificultad.
    //A la vez, se establece que la dificultad es igual a dif.
    private void botonDificultad (String dif){
        if(tblEdit!= null){
            while (tblEdit.getRowCount() > 0) {
                ((DefaultTableModel) tblEdit.getModel()).removeRow(0);
            }
        }
        
        try {
            CN.llenarTabla(tblEdit, dif);
            dificultad=dif;
        } catch (Exception ex) {
            Logger.getLogger(Edicion.class.getName()).log(Level.SEVERE, null, ex);
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