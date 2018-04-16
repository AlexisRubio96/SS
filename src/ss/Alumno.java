/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ss;

/**
 *
 * @author 
 * Dachely Otero Argote
 * Ernesto Alejandro Cervantes Villa
 * Jorge Alexis Rubio Sumano
 * 
 */
public class Alumno extends Registro{
    
    protected Double tallaEdad;
    protected String Escuela;

    public Alumno(String IDregistro, String nombre, String apellido, String edad, String sexo, String peso, String talla, Categoria categoria, RangoObesidad rangoObesidad, String Escuela) {
        super(IDregistro, nombre, apellido, edad, sexo, peso, talla, categoria, rangoObesidad);
        this.Escuela = Escuela;
    }    
}
