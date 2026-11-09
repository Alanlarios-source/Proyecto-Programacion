import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la presion sistolica: ");
        double presion = scanner.nextDouble();
        
        boolean esPresionNormal = ((presion >= 90.0) && (presion <= 120.0));
        
        System.out.println("¿Esta en el rango saludable (90 a 120 mmHg)?: " + esPresionNormal);
        scanner.close();
    }
}