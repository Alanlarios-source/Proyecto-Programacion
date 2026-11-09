import java.util.Scanner;

public class Ejercicio36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el subtotal de la compra: ");
        double subtotal = scanner.nextDouble();
        System.out.print("Ingrese la distancia en km: ");
        double distancia = scanner.nextDouble();
        
        boolean envioGratis = ((subtotal > 800.0) || (distancia < 3.0));
        
        System.out.println("¿Califica para envio gratis?: " + envioGratis);
        scanner.close();
    }
}