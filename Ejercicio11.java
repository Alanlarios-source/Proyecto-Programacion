import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double temp = scanner.nextDouble();
        
        boolean estaCongelada = (temp <= 0.0);
        
        System.out.println("¿El agua esta en estado de congelacion?: " + estaCongelada);
        scanner.close();
    }
}