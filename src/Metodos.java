import java.io.File;
import java.io.IOException;

public class Metodos {
    /////////////////////////////* Método por el cual comprobaremos si existe un directorio */
    public static String eDirectorio(String cadea) {
        File file = new File(cadea);

        if(/*file.exists() &&*/ file.isDirectory()){
            String respuesta = "Es Directorio";
            return respuesta;
        }
        else{
            String respuesta = "No es directorio";
            return respuesta;
        }
    }

    ////////////////////////// Método para comprobar un fichero

    public static String eFichero (String cadea) {
        File file = new File(cadea);

        if(/*file.exists() &&*/ file.isFile()){
            String respuesta = "Es Fichero";
            return respuesta;
        }
        else{
            String respuesta = "No es Fichero";
            return respuesta;
        }
    }

    /////////////////// Método para crear un directori
    public String crearDirectorio (String cadea){
        File file = new File(cadea);
        if (file.exists()){
            return "Ya existe este directorio, no se ha completado el proceso\"";
        }
        else {
            file.mkdir();
            return "Directorio creado exitosamente";
        }
    }

    /////////////////// Método para crear un fichero
    public String crearFichero (String dirName, String fileName){
        File dir = new File(dirName);
        File file = new File(dirName.concat(fileName));
        if (dir.exists()){
            return "Ya existe este directorio, no se ha completado el proceso";
        }
        else {
            try {
                dir.mkdir();
                file.createNewFile();
                return "Fichero creado exitosamente";
            } catch (IOException e) {
                return "Error al crear el archivo";
            }
        }
    }

    ///////////// Borra Directorio
    public String borrarDirectorio (String cadea){
        File file = new File(cadea);
        if (file.delete()){
            return "Se ha borrado exitosamente";
        }
        else{
            return "No se ha encontrado el directorio o aun tiene contenido";
        }
    }

    ///////////// Borra Fichero
    public String borrarFichero (String cadea){
        File file = new File(cadea);
        if (file.delete()){
            return "Se ha borrado exitosamente";
        }
        else{
            return "No se ha encontrado el directorio";
        }
    }

    ///////////// Borra Directorio
    public String  (String cadea){
        File file = new File(cadea);
        if (){

        }
        else{

        }
    }

    ///////////// Borra Directorio
    public String  (String cadea){
        File file = new File(cadea);
        if (){

        }
        else{

        }
    }

}
