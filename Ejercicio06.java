import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad entera de cambio en pesos: ");
        int cambio = scanner.nextInt();
        
        int monedas10 = cambio / 10;
        int monedas1 = cambio % 10;
        
        System.out.println("Monedas de $10: " + monedas10);
        System.out.println("Monedas de $1: " + monedas1);
        scanner.close();
    }
}