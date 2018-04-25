package ss;


import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author 
 * Dachely Otero Argote
 * Ernesto Alejandro Cervantes Villa
 * Jorge Alexis Rubio Sumano
 * 
 */
/**
 * 
 * Genera el AbtractTableModel de cada arreglo de Objetos
 * Depende de la categoria que se mande como indice
 * 
 */
public final class ModeloTabla extends AbstractTableModel{
    
    private int indice;     //int que define el index que se selecciono en la lista para filtrar por categoria
    String[] datos;
    private Principal principal;
    private ArrayList<Registro> datosTabla; //Datos con los que se llenara la tabla
    
    public ModeloTabla(Principal principal, int indice){
        this.principal = principal;
        this.indice = indice;
        datos = new String[]{"Nombre","Apellido","Edad", "Peso","Talla","Categoria","IMC"};
        datosTabla = new ArrayList<Registro>();
        setDatosTabla();
    }
    
    //Llena el arreglo de datos para la tabla dependiendo de la categoria
    public void setDatosTabla() {
        // todo, ALUMNO, MAESTRO, JEFE_FAMILIA, PREP_COMIDA, DIRECTIVO, VOLUNTARIO
        switch(indice){
            case 0:
                for (Registro regis : principal.getRegistros()) {
                    if(regis.getCategoria()==Categoria.ALUMNO){
                        datosTabla.add(regis);
                    }
                }
                break;
            case 1:
                for (Registro regis : principal.getRegistros()) {
                    if(regis.getCategoria()==Categoria.MAESTRO){
                        datosTabla.add(regis);
                    }
                }
                break;
            case 2:
                for (Registro regis : principal.getRegistros()) {
                    if(regis.getCategoria()==Categoria.JEFE_FAMILIA){
                        datosTabla.add(regis);
                    }
                }
                break;
            case 3:
                for (Registro regis : principal.getRegistros()) {
                    if(regis.getCategoria()==Categoria.PREP_COMIDA){
                        datosTabla.add(regis);
                    }
                }
                break;
            case 4:
                for (Registro regis : principal.getRegistros()) {
                    if(regis.getCategoria()==Categoria.DIRECTIVO){
                        datosTabla.add(regis);
                    }
                }
                break;
            case 5:
                for (Registro regis : principal.getRegistros()) {
                    if(regis.getCategoria()==Categoria.VOLUNTARIO){
                        datosTabla.add(regis);
                    }
                }
                break;
            case 6:
                datosTabla = principal.getRegistros();
                break;
            default:
                break;
            
        }
    }   


    @Override
    public int getRowCount() {
        return datosTabla.size();
    }

    @Override
    public int getColumnCount() {
        return datos.length;   
    }

    @Override
    public Object getValueAt(int row, int col){
        
        //"Nombre","Apellido","Edad", "Peso","Talla","Categoria","IMC"
        //Recorre las filas por cada columna
        switch(col){
            case 0:
                return datosTabla.get(row).getNombre();
            case 1:
                return datosTabla.get(row).getApellido();
            case 2:
                return datosTabla.get(row).getEdad();
            case 3:
                return datosTabla.get(row).getPeso();
            case 4:
                return datosTabla.get(row).getTalla();
            case 5:
                return datosTabla.get(row).getCategoria();
            case 6:
                return datosTabla.get(row).getImc();
            default:
                return null;            
        }
    }

    @Override
    public String getColumnName(int i) {
        return datos[i];
    }
        
    
}
