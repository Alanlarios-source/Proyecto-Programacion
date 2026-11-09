import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el largo (a): ");
        double a = scanner.nextDouble();
        System.out.print("Ingrese el ancho (b): ");
        double b = scanner.nextDouble();
        System.out.print("Ingrese el alto (c): ");
        double c = scanner.nextDouble();
        
        double areaTotal = 2.0 * ((a * b) + (a * c) + (b * c));
        
        System.out.println("El area superficial total es: " + areaTotal);
        scanner.close();
    }
}