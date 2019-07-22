/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManejoConstructoresDos;

/**
 *
 * @author COMPUMARS
 */
public class Ciudad {
    private String nombre;
    private String provincia;
    
    //constructor 
    public Ciudad  (String n,  String p){
        establecerNombre(n);
        establecerProvincia(p);
    }
    
    public void establecerNombre(String m){
        nombre = m;
    }
    public void establecerProvincia(String m){
        provincia = m;
    }
    public String obtenerNombre(){
        return nombre;
    }
    public String obtenerProvincia(){
        return provincia;
    }
   
    public String toString(){
        String cadena = String.format ("Ciudad:\n\tNombre: %s\n\tProvincia: %s"
                + "\n", obtenerNombre(), obtenerProvincia());
                
        return cadena;
    }
}
