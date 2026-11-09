import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Ingrese y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Ingrese x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Ingrese y2: ");
        double y2 = scanner.nextDouble();
        
        double distanciaCuadrado = ((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1));
        
        System.out.println("El cuadrado de la distancia entre los dos puntos es: " + distanciaCuadrado);
        scanner.close();
    }
}