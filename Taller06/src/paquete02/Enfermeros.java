/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author Matias Quezada
 */
public class Enfermeros {
    private String nombre;
    private String tipo;
    private double sueldo;
    
    public Enfermeros(String n, String e, double s) {
        nombre = n;
        tipo = e;
        sueldo = s;
    }
    public void establecerNombre(String x) {
        nombre = x;
    }
    
    public void establecerTipo(String x) {
        tipo = x;
    }
    
    public void establecerSueldo(double x) {
        sueldo = x;
    }
    
    public String obtenerNombre() {
        return nombre;
    }
    
    public String obtenerTipo() {
        return tipo;
    }
    
    public double obtenerSueldo() {
        return sueldo;
    }
}
