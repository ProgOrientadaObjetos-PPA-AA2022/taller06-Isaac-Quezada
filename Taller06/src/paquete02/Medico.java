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
public class Medico {
    private String nombre;
    private String especialidad;
    private double sueldo;
    
    public Medico(String n, String e, double s) {
        nombre = n;
        especialidad = e;
        sueldo = s;
    }
    public void establecerNombre(String x) {
        nombre = x;
    }
    
    public void establecerEspecialidad(String x) {
        especialidad = x;
    }
    
    public void establecerSueldo(double x) {
        sueldo = x;
    }
    
    public String obtenerNombre() {
        return nombre;
    }
    
    public String obtenerEspecialidad() {
        return especialidad;
    }
    
    public double obtenerSueldo() {
        return sueldo;
    }
}
