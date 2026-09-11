import java.io.File;
public class Main {
    /* Método por el cual comprobaremos si existe un directorio */
    public static String eDirectorio(String cadea) {
        File file = new File(cadea);

        if(file.exists() && file.isDirectory()){
            String respuesta = "Es Directorio";
            return respuesta;
        }
        else{
            String respuesta = "No es directorio";
            return respuesta;
        }
    }

    public static void main(String[] args) {

        String cadea1 = "../Diego";

        System.out.println(eDirectorio(cadea1));
    }


}
