import java.util.Scanner;

public class Ejercicio40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor inicial de la maquinaria: ");
        double valorInicial = scanner.nextDouble();
        System.out.print("Ingrese el valor de rescate final: ");
        double valorRescate = scanner.nextDouble();
        System.out.print("Ingrese los años de vida util: ");
        double vidaUtil = scanner.nextDouble();
        
        double depreciacionAnual = (valorInicial - valorRescate) / vidaUtil;
        
        System.out.println("La depreciacion anual es: $" + depreciacionAnual);
        scanner.close();
    }
}