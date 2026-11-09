import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el radio del cilindro: ");
        double r = scanner.nextDouble();
        System.out.print("Ingrese la altura del cilindro: ");
        double h = scanner.nextDouble();
        
        double volumen = 3.14159 * (r * r) * h;
        
        System.out.println("El volumen del cilindro es: " + volumen);
        scanner.close();
    }
}