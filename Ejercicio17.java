import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la velocidad registrada del vehiculo (km/h): ");
        double velocidad = scanner.nextDouble();
        
        boolean excedeLimite = (velocidad > 110.0);
        
        System.out.println("¿Excede el limite permitido?: " + excedeLimite);
        scanner.close();
    }
}