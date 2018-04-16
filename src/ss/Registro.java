package ss;

/**
 *
 * @author 
 * Dachely Otero Argote
 * Ernesto Alejandro Cervantes Villa
 * Jorge Alexis Rubio Sumano
 * 
 */
public abstract class Registro{
    
    protected String IDregistro;
    protected String nombre;
    protected String apellido;
    protected String edad;
    protected String sexo;
    protected String peso;
    protected String talla;
    protected Categoria categoria;
    protected RangoObesidad rangoObesidad;
    protected Double imc;


    public Registro(String IDregistro, String nombre , String apellido, String edad, String sexo, String peso, String talla, Categoria categoria, RangoObesidad rangoObesidad) {
        this.IDregistro = IDregistro;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.talla = talla;
        this.categoria = categoria;
        this.rangoObesidad = rangoObesidad;
        this.imc = Double.parseDouble(peso)/Math.pow(Double.parseDouble(talla), 2);
    }
    
    @Override
    public String toString() {
        return IDregistro + "," + nombre + "," + apellido + "," + edad + ","+ sexo + "," + peso + "," + talla + "," + categoria + "," + rangoObesidad + "," + imc;
    }    
}
