public class OperadoresLogicosDemo {
    public static void main(String[] args) {
        int edad = 20;
        boolean tieneEntrada = true;
        if (edad >= 18 && tieneEntrada) {
            System.out.println("Acceso permitido.");
        } else {
            System.out.println("Acceso denegado.");
        }
    }
}
