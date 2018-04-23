/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ss;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dachely
 */
public class Principal {
    protected ArrayList<Registro> regis;
    
    public Principal(){
        regis = new ArrayList<>();
        llenarArregloRegistros();
    }
    
    public ArrayList<Registro> getRegistros() {
        //System.out.println(regis.get(0));
        return regis;
    }
    
    public void setRegistros(ArrayList<Registro> registros) {
        this.regis = registros;
    }
    
    private void llenarArregloRegistros() {
        Registro reg= null;
        FileReader archivo;
        try {
            archivo = new FileReader("src/registros.txt");
            BufferedReader entrada= new BufferedReader(archivo);        
            while(entrada.ready()){
                String linea= entrada.readLine();
                String[] datos= linea.split(",");
                
                try {
                    
                    Categoria categoria;
            
                    //Determinar la categoria
                    if(datos[7].equals("Alumno")){
                        categoria = Categoria.ALUMNO;
                    }
                    else if(datos[7].equals("Directivo")){
                        categoria = Categoria.DIRECTIVO;
                    }
                    else if(datos[7].equals("Jefe de Familia")){
                        categoria = Categoria.JEFE_FAMILIA;
                    }
                    else if(datos[7].equals("Preparadores de Comida")){
                        categoria = Categoria.PREP_COMIDA;
                    }
                    else{
                        categoria = Categoria.VOLUNTARIO;
                    }
                    //                  int IDregistro, String nombre , String apellido, String edad, String sexo, Double peso, Double talla, Categoria categoria, String escuela, Double tallaEdad)
                    reg= new Registro(Integer.parseInt(datos[0]),datos[1],datos[2], datos[3],datos[4], Double.parseDouble(datos[5]), Double.parseDouble(datos[6]), categoria, datos[8], Double.parseDouble(datos[9]));
                } catch (Exception e) {
                    System.err.println(e);
                }
                        
                regis.add(reg);                  
            }
            entrada.close();
            System.out.println("Se lleno regis");
        } catch (IOException e) {
        }

    }
}


