/* Una escuela necesita imprimir las calificaciones de los estudiantes en orden de registro. El programa debe pedir el nombre completo de cada estudiante y mostrarlo junto con su posición en la lista.
 */
package semana3_bucles;
import java.util.Scanner;

public class CalificacionesEstudiantesDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de estudiantes: ");
        int cantidad = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Ingrese el nombre completo del estudiante " + i + ": ");
            String nombre = sc.nextLine();

            System.out.println(i + ". " + nombre.toUpperCase());
        }

        sc.close();
    }
}
