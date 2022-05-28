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
public class Hospital {
    private String nombre;
    private Ciudad ciudad;
    private int especialidades;
    private Medico[] doctores;
    private Enfermeros[] enfermeros;
    private int sueldosCancelar;
    private String direccion;
    
    public Hospital(String n, Ciudad c, int e, Medico[] d, Enfermeros[] en, String dir) {
        nombre = n;
        ciudad = c;
        especialidades = e;
        doctores = d;
        enfermeros = en;
        direccion = dir;                
    }
    public void establecerNombre(String x) {
        nombre = x;
    }
    
    public void establecerCiudad(Ciudad x) {
        ciudad= x;
    }
    
    public void establecerEspecialidades(int x) {
        especialidades = x;
    }
    
    public void establecerDoctores(Medico[] x) {
        doctores = x;
    }
    
    public void establecerEnfermeros(Enfermeros[] x) {
        enfermeros = x;
    }
    
    public void calcularSueldosCancelar() {
        sueldosCancelar = doctores.length + enfermeros.length;
    }
    
    public void establecerDireccion(String x) {
        direccion = x;
    }
    
    public String obtenerNombre() {
        return nombre;
    }
    
    public Ciudad obtenerCiudad() {
        return ciudad;
    }
    
    public int obtenerEspecialidades() {
        return especialidades;
    }
    
    public Medico[] obtenerDoctores() {
        return doctores;
    }
    
    public Enfermeros[] obtenerEnfermeros() {
        return enfermeros;
    }
    
    public int obtenerSueldosCancelar() {
        return sueldosCancelar;
    }
    
    public String obtenerDireccion() {
        return direccion;
    }
    
    public String toString() {
        String cadena = String.format("%s\n"
                + "Direccion: %s\n"
                + "Ciudad: %s\n"
                + "Provincia: %s\n"
                + "Numero de Especialidades: %d\n"
                + "Listado de Medicos\n", 
                nombre,
                direccion,
                ciudad.obtenerNombre(),
                ciudad.obtenerProvincia(),
                especialidades);
        for (int i = 0; i < doctores.length; i++) {
            cadena = String.format("%s- %s - sueldo: %.2f - %s\n",
                    cadena, 
                    doctores[i].obtenerNombre(),
                    doctores[i].obtenerSueldo(),
                    doctores[i].obtenerEspecialidad());
        }
        cadena = String.format("%sListado de Enfermeros\n", cadena);
        for (int i = 0; i < enfermeros.length; i++) {
            cadena = String.format("%s- %s - sueldo: %.2f - %s\n",
                    cadena, 
                    enfermeros[i].obtenerNombre(),
                    enfermeros[i].obtenerSueldo(),
                    enfermeros[i].obtenerTipo());
        }   
        return cadena;
    
        }
}
