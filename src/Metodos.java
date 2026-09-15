import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;

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

    // Método para comprobar un fichero

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
    public static String crearDirectorio(String cadea){
        File file = new File(cadea);
        if (file.exists()){
            return "Ya existe este directorio, no se ha completado el proceso\"";
        }
        else {
            file.mkdir();
            return "Directorio" + cadea + " creado exitosamente";
        }
    }

    /////////////////// 4 Método para crear un fichero
    public static String crearFichero (String dirName, String fileName){
        File dir = new File(dirName);
        File file = new File(dirName.concat(fileName));
        if (dir.exists()){
            return "Ya existe este directorio, no se ha completado el proceso";
        }
        else {
            try {
                dir.mkdir();
                file.createNewFile();
                return "Fichero" + fileName + " creado exitosamente en " + dirName;
            } catch (IOException e) {
                return "Error al crear el archivo";
            }
        }
    }

    //////////// 5 Lee los permisos del fichero
    public static String modoAcceso (String dirName, String fileName) {
        File dir = new File(dirName);
        File file = new File(dirName.concat(fileName));
        String respuesta = "";

        if (file.canWrite()){
            respuesta = respuesta.concat("Escritura si. ");
        }
        else{
            respuesta = respuesta.concat("Escritura no. ");
        }

        if (file.canRead()){
            return respuesta.concat("Lectura si.");
        }
        else{
            return respuesta.concat("Lectura no.");
        }
    }


    ///////// 6 Longitud

    public static String calculaLonxitude (String dirName, String fileName) {
        File dir = new File(dirName);
        File file = new File(dirName.concat(fileName));

        return "Lonxitude do arquivo" + fileName + " = " + file.length();
    }

    //////////// 7 Solo Lectura
    public static String mLectura(String dirName, String fileName) {
        File dir = new File(dirName);
        File file = new File(dirName.concat(fileName));

        file.setReadOnly();
        return "O arquivo" + dirName.concat(fileName) + " agora é de so lectura";
    }

    //////////// 8 Permisos Escritura
    public static String mEscritura(String dirName, String fileName) {
        File dir = new File(dirName);
        File file = new File(dirName.concat(fileName));

        file.setWritable(true);
        return "O arquivo" + dirName.concat(fileName) + " ten permisos de escritura";
    }

    ///////////// 9 Borra Fichero
    public static String borrarFichero (String cadea){
        File file = new File(cadea);
        if (file.delete()){
            return "Directorio" + cadea + " e ha borrado exitosamente";
        }
        else{
            return "No se ha encontrado el directorio " + cadea;
        }
    }

    ///////////// 10 Borra Directorio
    public static String borrarDirectorio (String cadea){
        File file = new File(cadea);
        if (file.delete()){
            return cadea + " se ha borrado exitosamente";
        }
        else{
            return "No se ha encontrado el directorio"+cadea+" o aun tiene contenido";
        }
    }



    ///////////// 11 BMuestra el contenido de un Directorio
    public static void mContido(String dirName) {

        File dir = new File(dirName);

        File[] contenido = dir.listFiles();

        if (contenido != null) {

            for (File file : contenido) {
                System.out.println(file.getName());
            }
        }
        else{
            System.out.println("No sa ha encontrado el directorio " + dirName);
        }
    }

    ///////////// 12 Muestra los archivos directorios y subdirectorios de estos
    public static void recur(File dir) {

        File[] contenido = dir.listFiles();

        if (contenido != null) {

            for (File file : contenido) {

                System.out.println(file.getName());

                if (file.isDirectory()) {
                    recur(file);
                }
            }
        }
        else{
            System.out.println("No sa ha encontrado el directorio");
        }
    }

}
