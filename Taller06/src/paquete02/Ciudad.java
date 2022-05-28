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
public class Ciudad {
    private String nombre;
    private String provincia;
    
    public Ciudad(String n, String p) {
        nombre = n;
        provincia = p;
    }
    
    public void establecerNombre(String x) {
        nombre = x;
    }
    
    public void establcerProvincia(String x) {
        provincia = x;
    }
    
    public String obtenerNombre() {
        return nombre;
    }
    
    public String obtenerProvincia() {
        return provincia;
    }
}
