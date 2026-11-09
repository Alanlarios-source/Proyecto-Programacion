import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese los minutos totales de estacionamiento: ");
        int minutos = scanner.nextInt();
        
        double totalPagar = ((minutos + 59) / 60) * 25.0;
        
        System.out.println("Total a pagar por estacionamiento: $" + totalPagar);
        scanner.close();
    }
}