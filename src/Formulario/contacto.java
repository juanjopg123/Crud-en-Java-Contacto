package Formulario;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class contacto extends javax.swing.JFrame {

    public static final String ubicacion="jdbc:mysql://localhost/contacto";
    public static final String usuario="root";
    public static final String contraseña="";
    
    PreparedStatement ps;
    ResultSet rs;
    
    public contacto() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public static com.mysql.jdbc.Connection getConection(){
    com.mysql.jdbc.Connection con = null;
    try{
        Class.forName("com.mysql.jdbc.Driver");
        con = (com.mysql.jdbc.Connection) DriverManager.getConnection(ubicacion,usuario,contraseña);
       } catch (ClassNotFoundException | SQLException e){
           System.out.println(e);
       }
           return con;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        apellido = new javax.swing.JTextField();
        cedula = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        edad = new javax.swing.JTextField();
        genero = new javax.swing.JTextField();
        Teléfono = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        Teléfono1 = new javax.swing.JLabel();
        celular = new javax.swing.JTextField();
        eliminar = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 204, 255));
        jLabel1.setFont(new java.awt.Font("Century751 SeBd BT", 1, 18)); // NOI18N
        jLabel1.setText("Listado de Contactos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 200, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Documento:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Apellido:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Nombre:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Genero:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Edad:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        apellido.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jPanel1.add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 118, -1));

        cedula.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jPanel1.add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 118, -1));

        nombre.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 118, -1));

        edad.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jPanel1.add(edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 118, -1));

        genero.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jPanel1.add(genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 118, -1));

        Teléfono.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Teléfono.setText("Teléfono:");
        jPanel1.add(Teléfono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        telefono.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jPanel1.add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 118, -1));

        Teléfono1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Teléfono1.setText("Celular:");
        jPanel1.add(Teléfono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        celular.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jPanel1.add(celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 118, -1));

        eliminar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        jPanel1.add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 100, 30));

        buscar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        jPanel1.add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 100, 30));

        guardar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        jPanel1.add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 100, 30));

        Modificar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });
        jPanel1.add(Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, -1, 30));

        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit.PNG"))); // NOI18N
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirMouseClicked(evt);
            }
        });
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jPanel1.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 60, 60));

        limpiar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        limpiar.setText("Limpiar");
        limpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                limpiarMouseClicked(evt);
            }
        });
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });
        jPanel1.add(limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 100, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        com.mysql.jdbc.Connection con = null;
        try{
            con = getConection();
            ps = con.prepareStatement("SELECT * FROM persona WHERE CEDULA = ?");
            ps.setString(1, cedula.getText());
            rs = ps.executeQuery();
            if (rs.next()) {
                apellido.setText(rs.getString("APELLIDO"));
                nombre.setText(rs.getString("NOMBRE"));
                genero.setText(rs.getString("GENERO"));
                edad.setText(rs.getString("EDAD"));
                telefono.setText(rs.getString("TELEFONO"));
                celular.setText(rs.getString("CELULAR"));   
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró ningun dato");    
            }
        } catch (Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
       com.mysql.jdbc.Connection con = null;
    try{
        con = getConection();
        ps = con.prepareStatement("INSERT INTO persona (CEDULA,APELLIDO,NOMBRE,GENERO,EDAD,TELEFONO,CELULAR) VALUES (?,?,?,?,?,?,?)");
        ps.setString(1, cedula.getText());
        ps.setString(2, apellido.getText());
        ps.setString(3, nombre.getText());
        ps.setString(4, genero.getText());
        ps.setString(5, edad.getText());
        ps.setString(6, telefono.getText());
        ps.setString(7, celular.getText());
        int res = ps.executeUpdate();
            
        if (res > 0) {
            JOptionPane.showMessageDialog(null, "Datos guardados");          
        } else {
            JOptionPane.showMessageDialog(null, "Error al guardar los datos");
        }
        con.close();
    } catch (Exception e) {
        System.err.println(e);
    
    }
    limpiar();
                  
             
    }//GEN-LAST:event_guardarActionPerformed

    private void salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseClicked
        dispose();
    }//GEN-LAST:event_salirMouseClicked

    private void limpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limpiarMouseClicked
       limpiar();
    }//GEN-LAST:event_limpiarMouseClicked

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_limpiarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salirActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        com.mysql.jdbc.Connection con = null;
        try{
            con = getConection();
            ps = con.prepareStatement("UPDATE persona SET CEDULA=? ,APELLIDO=? ,NOMBRE=? ,GENERO=? ,EDAD=? ,TELEFONO=? ,CELULAR=?");
            ps.setString(1, cedula.getText());
            ps.setString(2, apellido.getText());
            ps.setString(3, nombre.getText());
            ps.setString(4, genero.getText());
            ps.setString(5, edad.getText());
            ps.setString(6, telefono.getText());
            ps.setString(7, celular.getText());
            int res = ps.executeUpdate();
            
            if (res > 0) {
                 JOptionPane.showMessageDialog(null, "Se actualizaron los datos");          
            } else {
                 JOptionPane.showMessageDialog(null, "Error no se pudo actualizar");
            }
             con.close();
          } catch (Exception e) {             
              System.err.println(e);
          }
              limpiar();                                                                
    }//GEN-LAST:event_ModificarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        com.mysql.jdbc.Connection con = null;
        try{
            con = getConection();
            ps = con.prepareStatement("DELETE FROM persona WHERE CEDULA=?");
            ps.setInt(1, Integer.parseInt(cedula.getText()));
            
            int res = ps.executeUpdate();
            
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Registro eliminado");             
            } else {
                JOptionPane.showMessageDialog(null, "No se puede eliminar");
            } 
            con.close();
        } catch (Exception e) {
            System.err.println(e);        
        }
        limpiar();
    }//GEN-LAST:event_eliminarActionPerformed
    
    private void limpiar(){
        cedula.setText("");
        apellido.setText("");
        nombre.setText("");
        edad.setText("");
        genero.setText("");
        telefono.setText("");
        celular.setText("");
    }
    
    
    
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
            java.util.logging.Logger.getLogger(contacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(contacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(contacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(contacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new contacto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Modificar;
    private javax.swing.JLabel Teléfono;
    private javax.swing.JLabel Teléfono1;
    private javax.swing.JTextField apellido;
    private javax.swing.JButton buscar;
    private javax.swing.JTextField cedula;
    private javax.swing.JTextField celular;
    private javax.swing.JTextField edad;
    private javax.swing.JButton eliminar;
    private javax.swing.JTextField genero;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton limpiar;
    private javax.swing.JTextField nombre;
    private javax.swing.JButton salir;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables
}
