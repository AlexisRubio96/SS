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
/*hola*/
/*Prueba pushh*/
public class Alumno extends Registro{
    
    protected int tallaEdad;
    protected String Escuela;

    public Alumno(int IDregistro, String nombre, String apellido, String edad, String sexo, double peso, double talla, Categoria categoria, String Escuela) {
        super(IDregistro, nombre, apellido, edad, sexo, peso, talla, categoria);
        this.Escuela = Escuela;
    }
    
}
