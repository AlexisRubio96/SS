package ss;


import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author 
 * Dachely Otero Argote
 * Ernesto Alejandro Cervantes Villa
 * Jorge Alexis Rubio Sumano
 * 
 */
public class ListaRegistros{
    
    Usuario[] usuario;
    RespaldoUsuarios respaldo;
    private int numUsuarios = 1;        //Numero de usuarios
    FileReader usuarios;

    public ListaRegistros() {        //Se genera un usario tipo Administrador por defecto
        usuario = new Usuario[numUsuarios];
        usuario[0] = new Administrador();
    }

    public ListaRegistros(FileReader usuarios) throws IOException{
        respaldo = new RespaldoUsuarios(this, usuarios);
        usuario = respaldo.obtenerUsuarios();
        numUsuarios = respaldo.numeroUsuarios;
    }    
    
    public void nuevoUsuario(String userName, String pass, String nombre, String apellido, String telefono, String mail, String rol) throws IOException{
        Usuario[] respaldos = new Usuario[numUsuarios];      //Arreglo con los usuarios anterorimete creados
        int i = 0;      //Contador
        for (Usuario usuario1 : usuario){       //Genera el respaldo
            respaldos[i] = usuario1;
            i++;
        }
        /*Prueba
        for (Usuario respaldo1 : respaldos) {
            System.out.println(respaldo1);
        }
        System.out.println("_________");*/
        numUsuarios++;      //Aumenta el numero de usuarios en uno
        usuario = new Usuario[numUsuarios];     //Genera nuevo arreglo con un usuario mas
        System.arraycopy(respaldos, 0, usuario, 0, usuario.length-1);        //Copia el respaldo en la nueva lista de usuarios
        if(rol.equals("Empleado")){     //Pregunta si es empleado
            usuario[numUsuarios-1] = new Empleado(userName, pass, nombre, apellido, telefono, mail, rol);
        }
        if(rol.equals("Manager")){      //Pregunta si es Manager
            usuario[numUsuarios-1] = new Manager(userName, pass, nombre, apellido, telefono, mail, rol);
        }
        if(rol.equals("Administrador")){        //Pregunta si es Administrador
            usuario[numUsuarios-1] = new Administrador(userName, pass, nombre, apellido, telefono, mail, rol);
        }
        respaldo.guardarUsuarios();
    }
           
    
}
