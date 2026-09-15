import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;

public class Metodos {
    /// 1  Método por el cual comprobaremos si existe un directorio */
    public static String eDirectorio(String cadea) {
        File file = new File(cadea);

        if(/*file.exists() &&*/ file.isDirectory()){
            String respuesta = cadea + "Es Directorio";
            return respuesta;
        }
        else{
            String respuesta = cadea + "No es directorio";
            return respuesta;
        }
    }

    /// 2 Método para comprobar un fichero

    public static String eFichero (String cadea) {
        File file = new File(cadea);

        if(/*file.exists() &&*/ file.isFile()){
            String respuesta = cadea + "Es Fichero";
            return respuesta;
        }
        else{
            String respuesta = cadea +"No es Fichero";
            return respuesta;
        }
    }

    /// 3 Método para crear un directori
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

    /// 4 Método para crear un fichero
    public static String crearFichero (String dirName, String fileName){
        File dir = new File(dirName);
        File file = new File(dir, fileName);

        try {

            if (!dir.exists() || !dir.isDirectory()) {
                return "La ruta no existe o no es un directorio";
            }

            if (!file.exists()) {
                file.createNewFile();
                return "Fichero " + fileName + " creado exitosamente en " + dirName;
            } else {
                return "El fichero " + fileName + " ya existe";
            }

        } catch (IOException e) {
            return "Error al crear el fichero";
        }
    }


    /// 5 Lee los permisos del fichero
    public static String modoAcceso (String dirName, String fileName) {
        File dir = new File(dirName);
        File file = new File(dir, fileName);
        String respuesta = "";

        if (file.canWrite()){
            respuesta = respuesta.concat(fileName +"Escritura si. ");
        }
        else{
            respuesta = respuesta.concat(fileName +"Escritura no. ");
        }

        if (file.canRead()){
            return respuesta.concat(fileName +"Lectura si.");
        }
        else{
            return respuesta.concat(fileName +"Lectura no.");
        }
    }


    /// 6 Longitud

    public static String calculaLonxitude (String dirName, String fileName) {
        File dir = new File(dirName);
        File file = new File(dir, fileName);

        return "Lonxitude do arquivo " + fileName + " = " + file.length() + "bytes";
    }

    /// 7 Solo Lectura
    public static String mLectura(String dirName, String fileName) {
        File dir = new File(dirName);
        File file = new File(dir, fileName);

        file.setReadOnly();
        return "O arquivo" + dirName.concat(fileName) + " agora é de so lectura";
    }

    /// 8 Permisos Escritura
    public static String mEscritura(String dirName, String fileName) {
        File dir = new File(dirName);
        File file = new File(dir, fileName);
        file.setWritable(true);
        return "O arquivo" + dirName.concat(fileName) + " ten permisos de escritura";
    }

    /// 9 Borra Fichero
    public static String borrarFichero (String dirName, String fileName) {
        File dir = new File(dirName);
        File file = new File(dir, fileName);

        if (file.delete()){
            return "Fichero" + fileName + " se ha borrado exitosamente";
        }
        else{
            return "No se ha encontrado el directorio " + fileName;
        }
    }

    /// 10 Borra Directorio
    public static String borrarDirectorio (String cadea){
        File file = new File(cadea);
        if (file.delete()){
            return cadea + " se ha borrado exitosamente";
        }
        else{
            return "No se ha encontrado el directorio"+cadea+" o aun tiene contenido";
        }
    }



    /// 11 Muestra el contenido de un Directorio
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

    /// 12 Muestra los archivos directorios y subdirectorios de estos
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
