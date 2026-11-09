import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese nota del Examen 1: ");
        double ex1 = scanner.nextDouble();
        System.out.print("Ingrese nota del Examen 2: ");
        double ex2 = scanner.nextDouble();
        
        boolean aprueba = ((ex1 >= 80.0) || (ex2 >= 80.0));
        
        System.out.println("¿Aprueba la certificacion?: " + aprueba);
        scanner.close();
    }
}
