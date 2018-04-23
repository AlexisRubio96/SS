package ss;

import java.util.Date;

/**
 *
 * @author 
 * Dachely Otero Argote
 * Ernesto Alejandro Cervantes Villa
 * Jorge Alexis Rubio Sumano
 * 
 */
public /*abstract*/ class Registro{
    
    
    protected int IDregistro;
    protected String nombre;
    protected String apellido;
    protected String fechaNac;
    protected String sexo;
    protected Double peso;
    protected Double talla;
    protected Categoria categoria;
    protected RangoObesidad rangoObesidad;
    protected Double imc;
    protected String Escuela;
    protected Double tallaEdad;


    public Registro(int IDregistro, String nombre , String apellido, String fechaNac, String sexo, Double peso, Double talla, Categoria categoria, String escuela, Double tallaEdad) {
        this.IDregistro = IDregistro;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.sexo = sexo;
        this.peso = peso;
        this.talla = talla;
        this.categoria = categoria;
        this.imc = peso/Math.pow(talla, 2);
        this.setRangoObesidad();
        this.Escuela = escuela;
        this.tallaEdad = tallaEdad;
    }
    
    
    private void setRangoObesidad() {
        if(imc < 25){
            this.rangoObesidad = RangoObesidad.VERDE;
        }else if(imc >= 25 && imc < 30){
            this.rangoObesidad = RangoObesidad.AMARILLO;        
        }else{
            this.rangoObesidad = RangoObesidad.ROJO;        
        }
    }
    
    @Override
    public String toString() {
        return IDregistro + "," + nombre + "," + apellido + "," + fechaNac + ","+ sexo + "," + peso + "," + talla + "," + categoria + "," + rangoObesidad + "," + imc;
    }    

    public int getIDregistro() {
        return IDregistro;
    }

    public void setIDregistro(int IDregistro) {
        this.IDregistro = IDregistro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaNac() {
        
        return fechaNac;
    }

    public void setFecha(String edad) {
        this.fechaNac = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getTalla() {
        return talla;
    }

    public void setTalla(Double talla) {
        this.talla = talla;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public RangoObesidad getRangoObesidad() {
        return rangoObesidad;
    }

    public void setRangoObesidad(RangoObesidad rangoObesidad) {
        this.rangoObesidad = rangoObesidad;
    }

    public Double getImc() {
        return imc;
    }

    public void setImc(Double imc) {
        this.imc = imc;
    }

    public String getEscuela() {
        return Escuela;
    }

    public Double getTallaEdad() {
        return tallaEdad;
    }

    public void setEscuela(String Escuela) {
        this.Escuela = Escuela;
    }

    public void setTallaEdad(Double tallaEdad) {
        this.tallaEdad = tallaEdad;
    }
    
    public String getEdad(){
        String[] fecha = this.getFechaNac().split("-");     //Fecha de nacimiento del registro
        int año = Integer.parseInt(fecha[2]);       //Se obtiene año
        Date fechaActual = new Date();      //Fecha al dia actual
        int añoActual = fechaActual.getYear() + 1900;   //Comienza a partir de 1900 en jave Date
        System.out.println(añoActual + " ## " + año);
        int edad = añoActual-año;
        return String.valueOf(edad);
    }

}
