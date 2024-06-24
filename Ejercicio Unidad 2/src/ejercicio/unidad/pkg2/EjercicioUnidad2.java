package ejercicio.unidad.pkg2;

import javax.swing.JOptionPane;

public class EjercicioUnidad2 {

  
    public static void main(String[] args) {
     String nombre, apellido;
     nombre = JOptionPane.showInputDialog("Ingrese su nombre");
     apellido = JOptionPane.showInputDialog("Ingrese su apellido");
     JOptionPane.showMessageDialog(null, apellido + " " + nombre);
    }
    
}
