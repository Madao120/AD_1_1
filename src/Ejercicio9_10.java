public class Ejercicio9_10 {
    public static void main(String[] args) {
        // 6

        System.out.println("\nEjercicio 9");
        System.out.println(Metodos.crearDirectorio("C:\\Users\\DIEGO CURRÁS\\Desktop\\DAM2\\Acceso_Datos\\Trimestre_1\\arquivosdir"));
        System.out.println(Metodos.crearDirectorio("C:\\Users\\DIEGO CURRÁS\\Desktop\\DAM2\\Acceso_Datos\\Trimestre_1\\arquivosdir\\subdir"));
        System.out.println(Metodos.crearFichero("C:\\Users\\DIEGO CURRÁS\\Desktop\\DAM2\\Acceso_Datos\\Trimestre_1\\arquivosdir\\subdir", "Products2.txt"));

        System.out.println(Metodos.borrarFichero("C:\\Users\\DIEGO CURRÁS\\Desktop\\DAM2\\Acceso_Datos\\Trimestre_1\\arquivosdir\\subdir", "Products2.txt"));
        System.out.println(Metodos.borrarDirectorio("C:\\Users\\DIEGO CURRÁS\\Desktop\\DAM2\\Acceso_Datos\\Trimestre_1\\arquivosdir\\subdir"));
        System.out.println(Metodos.borrarDirectorio("C:\\Users\\DIEGO CURRÁS\\Desktop\\DAM2\\Acceso_Datos\\Trimestre_1\\arquivosdir"));
    }
}
