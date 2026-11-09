import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese lado a: ");
        double a = scanner.nextDouble();
        System.out.print("Ingrese lado b: ");
        double b = scanner.nextDouble();
        System.out.print("Ingrese lado c: ");
        double c = scanner.nextDouble();
        
        boolean esIsosceles = (((a == b) || (a == c)) || (b == c));
        
        System.out.println("¿Es un triangulo isosceles?: " + esIsosceles);
        scanner.close();
    }
}