import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el total de horas: ");
        int horasTotales = scanner.nextInt();
        
        int dias = horasTotales / 24;
        int horasSobrantes = horasTotales % 24;
        
        System.out.println("Dias completos: " + dias);
        System.out.println("Horas sobrantes: " + horasSobrantes);
        scanner.close();
    }
}