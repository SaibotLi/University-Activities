/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package linaresu4;
import javax.swing.JOptionPane;
/**
 *
 * @author Tobi
 */
public class LinaresU4 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Ingrese un número entero:"); // Muestra un cuadro de diálogo para que el usuario ingrese un número
        int number = Integer.parseInt(input); // Convierte la entrada del usuario en un Int

        boolean isPrime = true; // Declaro un booleano llamado isPrime que utilizaré en un futuro para determinar si un número es primo o no

        if (number <= 1) { // Si el número es menor o igual a 1, no puede ser primo
            isPrime = false;
        } else {
            for (int i = 2; i <= number / 2; i++) { // Iteración "for" a través de los posibles divisores de el número indicado por el usuario, esto ayudará a determinar si es primo o no.
                if (number % i == 0) { // Si el residuo entre el número e i da 0, no es un número primo
                    isPrime = false;
                    break;
                }
            }
        }
         // Condicionalmente, muestra un cuadro con el número indicado por el usuario y la información de si es primo o no.
        if (isPrime) {
            JOptionPane.showMessageDialog(null, number + " es un número primo.");
        } else {
            JOptionPane.showMessageDialog(null, number + " no es un número primo."); // 
        }
    }
}