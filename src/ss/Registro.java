package ss;

/**
 *
 * @author 
 * Dachely Otero Argote
 * Ernesto Alejandro Cervantes Villa
 * Jorge Alexis Rubio Sumano
 * 
 */
public /*abstract*/ class Registro{
    
    
    protected String IDregistro;
    protected String nombre;
    protected String apellido;
    protected String edad;
    protected String sexo;
    protected Double peso;
    protected Double talla;
    protected Categoria categoria;
    protected RangoObesidad rangoObesidad;
    protected Double imc;


    public Registro(String IDregistro, String nombre , String apellido, String edad, String sexo, Double peso, Double talla, Categoria categoria) {
        this.IDregistro = IDregistro;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.talla = talla;
        this.categoria = categoria;
        this.imc = peso/Math.pow(talla, 2);
        this.setRangoObesidad();
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
        return IDregistro + "," + nombre + "," + apellido + "," + edad + ","+ sexo + "," + peso + "," + talla + "," + categoria + "," + rangoObesidad + "," + imc;
    }    

}
