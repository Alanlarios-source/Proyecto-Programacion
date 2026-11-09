import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la edad del asistente: ");
        int edad = scanner.nextInt();
        System.out.print("¿Tiene pase VIP? (1 para si, 0 para no): ");
        int vip = scanner.nextInt();
        
        boolean tieneAccesoPreferencial = ((edad < 12) || (vip == 1));
        
        System.out.println("¿Tiene acceso preferencial?: " + tieneAccesoPreferencial);
        scanner.close();
    }
}