import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio1_5 {
    public static void main(String[] args) {

        // 1
        System.out.println("Ejercicio 1");
        System.out.println(Metodos.crearDirectorio("C:\\Users\\DIEGO CURRÁS\\Desktop\\DAM2\\Acceso_Datos\\Trimestre_1\\arquivosdir"));
        System.out.println(Metodos.eDirectorio("C:\\Users\\DIEGO CURRÁS\\Desktop\\DAM2\\Acceso_Datos\\Trimestre_1\\arquivosdir"));

        // 2
        System.out.println("\nEjercicio 2");
        System.out.println(Metodos.crearFichero("C:\\Users\\DIEGO CURRÁS\\Desktop\\DAM2\\Acceso_Datos\\Trimestre_1\\arquivosdir", "Products1.txt"));
        System.out.println(Metodos.eFichero("C:\\Users\\DIEGO CURRÁS\\Desktop\\DAM2\\Acceso_Datos\\Trimestre_1\\arquivosdir\\Products1.txt"));

        // 3
        System.out.println("\nEjercicio 3");
        System.out.println(Metodos.crearDirectorio("C:\\Users\\DIEGO CURRÁS\\Desktop\\DAM2\\Acceso_Datos\\Trimestre_1\\arquivosdir\\subdir"));
        System.out.println(Metodos.crearFichero("C:\\Users\\DIEGO CURRÁS\\Desktop\\DAM2\\Acceso_Datos\\Trimestre_1\\arquivosdir\\subdir", "Products2.txt"));

        // 4
        System.out.println("\nEjercicio 4");
        Metodos.mContido("C:\\Users\\DIEGO CURRÁS\\Desktop\\DAM2\\Acceso_Datos\\Trimestre_1\\arquivosdir");

        // 5
        System.out.println("\nEjercicio 5");
        System.out.println(Metodos.modoAcceso("C:\\Users\\DIEGO CURRÁS\\Desktop\\DAM2\\Acceso_Datos\\Trimestre_1\\arquivosdir", "Products1.txt"));
        System.out.println(Metodos.calculaLonxitude("C:\\Users\\DIEGO CURRÁS\\Desktop\\DAM2\\Acceso_Datos\\Trimestre_1\\arquivosdir", "Products1.txt"));
    }
}
