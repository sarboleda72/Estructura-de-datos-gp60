/* Un sistema de biblioteca permite a un usuario buscar libros por título. El programa pedirá un título y confirmará si coincide exactamente con "Cien años de soledad". El usuario puede seguir intentando hasta escribir el título correcto.
 */
package semana3_bucles;

import java.util.Scanner;

public class BusquedaLibroDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String titulo;
        int intentos = 0;

        do {
            System.out.print("Ingrese el título del libro: ");
            titulo = sc.nextLine();
            intentos++;
        } while (!titulo.equalsIgnoreCase("Cien años de soledad"));

        System.out.println("📚 Libro encontrado en " + intentos + " intento(s).");
        sc.close();
    }
}
