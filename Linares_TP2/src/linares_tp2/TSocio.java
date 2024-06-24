/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linares_tp2;

/**
 *
 * @author Tobi
 */
public class TSocio {
    private String apellidoYNombre;
    private String dni;
    private String telefono;
    private String categoria;

    public TSocio(String apellidoYNombre, String dni, String telefono, String categoria) {
        this.apellidoYNombre = apellidoYNombre;
        this.dni = dni;
        this.telefono = telefono;
        this.categoria = categoria;
    }

    // Getters y setters
    public String getApellidoYNombre() {
        return apellidoYNombre;
    }

    public void setApellidoYNombre(String apellidoYNombre) {
        this.apellidoYNombre = apellidoYNombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return apellidoYNombre + "; " + dni + "; " + telefono + "; " + categoria;
    }
}