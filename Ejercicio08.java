import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese los kilometros recorridos: ");
        double km = scanner.nextDouble();
        System.out.print("Ingrese los litros de gasolina consumidos: ");
        double litros = scanner.nextDouble();
        
        double rendimiento = km / litros;
        
        System.out.println("El rendimiento del vehiculo es: " + rendimiento + " km/l");
        scanner.close();
    }
}
