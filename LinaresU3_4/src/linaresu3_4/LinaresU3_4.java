/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linaresu3_4;

import javax.swing.JOptionPane;

/**
 *
 * @author Tobi
 */
public class LinaresU3_4 {
   static final int PUNTO_CONGELACION_CELSIUS = 0; // Almaceno una variable tipo int constante, utilizo static debido a que es un valor universal

    // Creo la función aFahrenheit y le explico la fórmula para convertir Celsius a Fahrenheit
    public static double aFahrenheit(double celsius) {
        return Math.round((celsius * 9.0 / 5.0) + PUNTO_CONGELACION_CELSIUS * 100.0) / 100.0; // Devuelve el valor de Fahrenheit redondeado en 2 decimales gracias a Math.round.
    }

    public static void main(String[] args) {
        double celsius = 0.0; // Inicializo la variable celsius para utilizarla más adelante
        
        // Utilizaré un bucle "while" para prevenir que el usuario ingrese un valor inválido cómo celsius
        while (true) {
            try {
                String input = JOptionPane.showInputDialog(null, "Ingrese la temperatura en grados Celsius:"); // Toma un "String" del usuario

                if (input == null) { // Si no hay input
                    return;  // El usuario canceló, salimos del programa
                }

                // Si el usuario ingresó un input
                celsius = Double.parseDouble(input.trim()); // trim() elimina espacios en blanco del input, este pasa de "String" a "Double" y se almacena en la variable celsius
                break; // Salgo del bucle si la conversión fue exitosa, continúo en linea 41
            } catch (NumberFormatException e) { // En cuyo caso la conversión no haya sido exitosa, se ejecuta el catch
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido."); // Le informa al usuario del error
            }
        }

        double fahrenheit = aFahrenheit(celsius); // Utiliza la función "aFahrenheit" para transformar el valor de celsius y almacenarlo en el double "fahrenheit"
        JOptionPane.showMessageDialog(null, "La temperatura en grados Fahrenheit es: " + fahrenheit); // Devuelve el valor de fahrenheit al usuario
    }
}