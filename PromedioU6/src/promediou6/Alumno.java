/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package promediou6;

/**
 *
 * @author Tobi
 */

public class Alumno {
    private String nombre;
    private double notaUno;
    private double notaDos;
    private double notaTres;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNotaUno() {
        return notaUno;
    }

    public void setNotaUno(double notaUno) {
        this.notaUno = notaUno;
    }

    public double getNotaDos() {
        return notaDos;
    }

    public void setNotaDos(double notaDos) {
        this.notaDos = notaDos;
    }

    public double getNotaTres() {
        return notaTres;
    }

    public void setNotaTres(double notaTres) {
        this.notaTres = notaTres;
    }

    public Alumno() {
    }

    public Alumno(String nombre, double notaUno, double notaDos, double notaTres) {
        this.nombre = nombre;
        this.notaUno = notaUno;
        this.notaDos = notaDos;
        this.notaTres = notaTres;
    }
    
    public double promedio(double primerNota, double segundaNota, double tercerNota) {
        double promedio = (primerNota + segundaNota + tercerNota) / 3;
        return promedio;
    }
    
}
