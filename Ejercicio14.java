import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el radio r1: ");
        double r1 = scanner.nextDouble();
        System.out.print("Ingrese el radio r2: ");
        double r2 = scanner.nextDouble();
        
        boolean esMayor = ((3.14159 * r1 * r1) > (3.14159 * r2 * r2));
        
        System.out.println("¿El area del primer circulo supera al segundo?: " + esMayor);
        scanner.close();
    }
}