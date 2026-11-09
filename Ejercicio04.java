import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tiempo en segundos: ");
        double t = scanner.nextDouble();
        
        double distancia = 9.81 * ((t * t) / 2.0);
        
        System.out.println("La distancia de caida libre es: " + distancia + " metros");
        scanner.close();
    }
}