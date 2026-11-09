import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese las horas trabajadas: ");
        double horas = scanner.nextDouble();
        System.out.print("Ingrese el costo por hora: ");
        double costoHora = scanner.nextDouble();
        
        double salarioNeto = ((horas * costoHora) * (1.0 - 0.12)) - 150.0;
        
        System.out.println("El salario neto final es: " + salarioNeto);
        scanner.close();
    }
}