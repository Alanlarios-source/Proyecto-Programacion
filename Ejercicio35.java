import java.util.Scanner;

public class Ejercicio35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el monto de inversion: ");
        double inversion = scanner.nextDouble();
        System.out.print("Ingrese los dias de plazo: ");
        int dias = scanner.nextInt();
        
        double rendimiento = (inversion * 0.095) * (dias / 365.0);
        
        System.out.println("El rendimiento ganado es: $" + rendimiento);
        scanner.close();
    }
}