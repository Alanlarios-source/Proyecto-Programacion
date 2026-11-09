import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor decimal x: ");
        double x = scanner.nextDouble();
        
        boolean estaEnRango = ((x > 15.0) && (x < 85.0));
        
        System.out.println("¿Esta estrictamente entre 15 y 85?: " + estaEnRango);
        scanner.close();
    }
}