import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el ingreso mensual: ");
        double ingreso = scanner.nextDouble();
        System.out.print("Ingrese el pago de tarjeta de credito: ");
        double pagoTarjeta = scanner.nextDouble();
        
        boolean supera30Porciento = (pagoTarjeta > (ingreso * 0.30));
        
        System.out.println("¿El pago de la tarjeta supera el 30% del ingreso mensual?: " + supera30Porciento);
        scanner.close();
    }
}