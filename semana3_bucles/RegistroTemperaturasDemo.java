/* En una ciudad, se está registrando la temperatura de cada día. El programa debe pedir la temperatura y la fecha (en formato dd/mm) y mostrar ambas, día por día, hasta que se ingrese la palabra "fin".
 */
package semana3_bucles;
import java.util.Scanner;

public class RegistroTemperaturasDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fecha;
        String temperatura;

        System.out.println("Registro de temperaturas diarias (escriba 'fin' para terminar).");

        System.out.print("Ingrese la fecha (dd/mm) o 'fin': ");
        fecha = sc.nextLine();

        while (!fecha.equalsIgnoreCase("fin")) {
            System.out.print("Ingrese la temperatura de " + fecha + ": ");
            temperatura = sc.nextLine();

            System.out.println("📅 " + fecha + " → 🌡 " + temperatura + "°C");

            System.out.print("\nIngrese la fecha (dd/mm) o 'fin': ");
            fecha = sc.nextLine();
        }

        System.out.println("Registro finalizado.");
        sc.close();
    }
}
