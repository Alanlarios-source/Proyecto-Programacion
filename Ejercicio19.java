import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero decimal: ");
        double numero = scanner.nextDouble();
        
        boolean esNegativo = (numero < 0.0);
        
        System.out.println("¿El numero es estrictamente menor que cero?: " + esNegativo);
        scanner.close();
    }
}