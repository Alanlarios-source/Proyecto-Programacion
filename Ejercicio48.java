import java.util.Scanner;

public class Ejercicio48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese estado del sensor s1 (1 o 0): ");
        int s1 = scanner.nextInt();
        System.out.print("Ingrese estado del sensor s2 (1 o 0): ");
        int s2 = scanner.nextInt();
        System.out.print("Ingrese estado del sensor s3 (1 o 0): ");
        int s3 = scanner.nextInt();
        
        boolean todosEncendidos = (((s1 == 1) && (s2 == 1)) && (s3 == 1));
        
        System.out.println("¿Exactamente los tres sensores estan encendidos?: " + todosEncendidos);
        scanner.close();
    }
}