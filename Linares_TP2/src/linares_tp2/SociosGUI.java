/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package linares_tp2;
import javax.swing.*;
import java.io.*;
import java.util.*;

/**
 *
 * @author Tobi
 */
public class SociosGUI extends javax.swing.JFrame {
    private List<TSocio> socios;
       private int currentIndex;
    
    public SociosGUI() {
        socios = new ArrayList<>();
        currentIndex = 0;
        initComponents();
        cargarDatosDesdeArchivo();
        setLocationRelativeTo(null);
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
        txtApellidoYNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        cmbCategoria = new javax.swing.JComboBox<>();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        btnAbrir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestión de Socios");

        jLabel1.setText("Apellido y Nombres:");

        jLabel2.setText("DNI:");

        jLabel3.setText("Teléfono:");

        jLabel4.setText("Categoría:");

        cmbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Menor", "Cadete", "Mayor" }));
        cmbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCategoriaActionPerformed(evt);
            }
        });

        btnAgregar.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setMaximumSize(new java.awt.Dimension(77, 28));
        btnAgregar.setMinimumSize(new java.awt.Dimension(77, 28));
        btnAgregar.setPreferredSize(new java.awt.Dimension(77, 28));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setMaximumSize(new java.awt.Dimension(77, 28));
        btnEliminar.setMinimumSize(new java.awt.Dimension(77, 28));
        btnEliminar.setPreferredSize(new java.awt.Dimension(77, 28));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnListar.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        btnListar.setText("Listar");
        btnListar.setMaximumSize(new java.awt.Dimension(77, 28));
        btnListar.setMinimumSize(new java.awt.Dimension(77, 28));
        btnListar.setPreferredSize(new java.awt.Dimension(77, 28));
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        btnAbrir.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        btnAbrir.setText("Abrir");
        btnAbrir.setMaximumSize(new java.awt.Dimension(77, 28));
        btnAbrir.setMinimumSize(new java.awt.Dimension(77, 28));
        btnAbrir.setPreferredSize(new java.awt.Dimension(77, 28));
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setMaximumSize(new java.awt.Dimension(77, 28));
        btnGuardar.setMinimumSize(new java.awt.Dimension(77, 28));
        btnGuardar.setPreferredSize(new java.awt.Dimension(77, 28));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setMaximumSize(new java.awt.Dimension(77, 28));
        btnSalir.setMinimumSize(new java.awt.Dimension(77, 28));
        btnSalir.setPreferredSize(new java.awt.Dimension(77, 28));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnAbrir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(txtDni, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtApellidoYNombre, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtApellidoYNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCategoriaActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
agregarSocio();
listarTodosLosSocios();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
listarSocios();
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
eliminarSocio();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
abrirArchivo();
listarTodosLosSocios();
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
guardarArchivo();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
                guardarArchivo();
                System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed


// Método para agregar un socio
    private void agregarSocio() {
        String apellidoYNombre = txtApellidoYNombre.getText();
        String dni = txtDni.getText();
        String telefono = txtTelefono.getText();
        String categoria = (String) cmbCategoria.getSelectedItem();

        TSocio socio = new TSocio(apellidoYNombre, dni, telefono, categoria);
        socios.add(socio);

        JOptionPane.showMessageDialog(this, "Socio agregado.");
        limpiarCampos();
    }
// Normalización de datos
private String normalizarTelefono(String telefono) {
    return telefono.replaceAll("[^\\d]", ""); // Elimina cualquier carácter que no sea un dígito
}

private String normalizarDni(String dni) {
    return dni.replaceAll("[^\\d]", ""); // Elimina cualquier carácter que no sea un dígito
}

private String normalizarTexto(String texto) {
    return texto.trim().replaceAll("\\s+", " "); // Elimina espacios adicionales
}

// Método para eliminar un socio
private void eliminarSocio() {
    String apellidoYNombre = normalizarTexto(txtApellidoYNombre.getText());
    String dni = normalizarDni(txtDni.getText().trim());
    String telefono = normalizarTelefono(txtTelefono.getText().trim());
    boolean encontrado = false;

    System.out.println("Intentando eliminar socio con:");
    System.out.println("Apellido y Nombre: " + apellidoYNombre);
    System.out.println("DNI: " + dni);
    System.out.println("Teléfono: " + telefono);

    for (Iterator<TSocio> iterator = socios.iterator(); iterator.hasNext(); ) {
        TSocio socio = iterator.next();
        boolean match = false;

        // Compara Apellido y Nombre
        if (!apellidoYNombre.isEmpty() && socio.getApellidoYNombre().equalsIgnoreCase(apellidoYNombre)) {
            match = true;
            System.out.println("Coincidencia encontrada por Apellido y Nombre: " + socio.getApellidoYNombre());
        }

        // Compara DNI
        if (!dni.isEmpty() && socio.getDni().equals(dni)) {
            match = true;
            System.out.println("Coincidencia encontrada por DNI: " + socio.getDni());
        }

        // Compara Teléfono
        if (!telefono.isEmpty() && socio.getTelefono().equals(telefono)) {
            match = true;
            System.out.println("Coincidencia encontrada por Teléfono: " + socio.getTelefono());
        }

        // Si hay una coincidencia, elimina el socio
        if (match) {
            iterator.remove();
            encontrado = true;
            JOptionPane.showMessageDialog(this, "Socio eliminado.");
            break;
        }
    }

    if (!encontrado) {
        JOptionPane.showMessageDialog(this, "Socio no encontrado. Asegúrese de ingresar un campo válido.");
    }

    listarSocios();  // Actualiza el JTextArea para mostrar la lista de socios
}

// Método para listar los socios uno por uno
    private void listarSocios() {
        if (socios.isEmpty()) {
            txtArea.setText("No hay socios en la lista.");
            return;
        }
        
        txtArea.setText(""); // Limpiar el área de texto

        TSocio socio = socios.get(currentIndex);
        txtArea.append(socio.toString() + "\n");

        currentIndex = (currentIndex + 1) % socios.size(); // Incrementar el índice y reiniciar si llega al final
    }

       // Método para listar todos los socios a la vez
    private void listarTodosLosSocios() {
        if (socios.isEmpty()) {
            txtArea.setText("No hay socios en la lista.");
            return;
        }

        txtArea.setText(""); // Limpiar el área de texto

        for (TSocio socio : socios) {
            txtArea.append(socio.toString() + "\n");
        }
    }
    
// Método para abrir archivo
        private void abrirArchivo() {
            try (BufferedReader reader = new BufferedReader(new FileReader("socios.txt"))) {
                String line;
                socios.clear();
                while ((line = reader.readLine()) != null) {
                    String[] data = line.split(";");
                    if (data.length == 4) {
                        TSocio socio = new TSocio(data[0], data[1], data[2], data[3]);
                        socios.add(socio);
                    }
                }
                JOptionPane.showMessageDialog(this, "Datos cargados.");
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error al abrir el archivo.");
            }
    }

// Método para guardar archivo
        private void guardarArchivo() {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("socios.txt"))) {
                for (TSocio socio : socios) {
                    writer.write(socio.toString());
                    writer.newLine();
                }
                JOptionPane.showMessageDialog(this, "Datos guardados.");
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error al guardar el archivo.");
            }
    }
    
// Método para limpiar campos
        private void limpiarCampos() {
            txtApellidoYNombre.setText("");
            txtDni.setText("");
            txtTelefono.setText("");
            cmbCategoria.setSelectedIndex(0);
        }
    
private void cargarDatosDesdeArchivo() {
    String nombreArchivo = "sociosPrueba.txt";
    File file = new File(nombreArchivo);
    if (!file.exists()) {
        JOptionPane.showMessageDialog(this, "El archivo " + nombreArchivo + " no existe en " + file.getAbsolutePath());
        return;
    }
    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
        String line;
        socios.clear();
        while ((line = reader.readLine()) != null) {
            String[] data = line.split(";");
            if (data.length == 4) {
                TSocio socio = new TSocio(data[0], data[1], data[2], data[3]);
                socios.add(socio);
            }
        }
        JOptionPane.showMessageDialog(this, "Datos cargados desde archivo.");
        listarSocios();  // Actualiza el JTextArea para mostrar la lista de socios
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error al abrir el archivo: " + e.getMessage());
    }
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
            java.util.logging.Logger.getLogger(SociosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SociosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SociosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SociosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SociosGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtApellidoYNombre;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
