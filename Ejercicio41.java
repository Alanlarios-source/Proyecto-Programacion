import java.util.Scanner;

public class Ejercicio41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese a: ");
        int a = scanner.nextInt();
        System.out.print("Ingrese b: ");
        int b = scanner.nextInt();
        System.out.print("Ingrese c: ");
        int c = scanner.nextInt();
        
        boolean esCreciente = ((a < b) && (b < c));
        
        System.out.println("¿Estan ordenados estrictamente creciente (a < b < c)?: " + esCreciente);
        scanner.close();
    }
}