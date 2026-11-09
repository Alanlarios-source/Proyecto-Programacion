import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el total de ventas mensuales: ");
        double ventas = scanner.nextDouble();
        
        boolean obtieneBono = (ventas >= 20000.0);
        
        System.out.println("¿Obtiene bono especial por ventas?: " + obtieneBono);
        scanner.close();
    }
}