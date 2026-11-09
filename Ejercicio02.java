import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad en dolares: ");
        double dolares = scanner.nextDouble();
        System.out.print("Ingrese el tipo de cambio a pesos: ");
        double tipoCambio = scanner.nextDouble();
        System.out.print("Ingrese el porcentaje de comision fija (ej. 2.5): ");
        double porcentajeComision = scanner.nextDouble();
        
        double totalNeto = (dolares * tipoCambio) * (1 - (porcentajeComision / 100.0));
        
        System.out.println("El total neto en pesos es: " + totalNeto);
        scanner.close();
    }
}