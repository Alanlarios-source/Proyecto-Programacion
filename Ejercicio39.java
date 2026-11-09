import java.util.Scanner;

public class Ejercicio39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el ingreso anual: ");
        double ingresoAnual = scanner.nextDouble();
        System.out.print("Ingrese el puntaje crediticio: ");
        int puntaje = scanner.nextInt();
        
        boolean calificaGold = ((ingresoAnual >= 300000.0) && (puntaje > 700));
        
        System.out.println("¿Califica para tarjeta Gold?: " + calificaGold);
        scanner.close();
    }
}