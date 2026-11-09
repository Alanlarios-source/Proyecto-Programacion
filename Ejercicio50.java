import java.util.Scanner;

public class Ejercicio50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese coordenada x del punto: ");
        double x = scanner.nextDouble();
        System.out.print("Ingrese coordenada y del punto: ");
        double y = scanner.nextDouble();
        System.out.print("Ingrese el radio r de la circunferencia: ");
        double r = scanner.nextDouble();
        
        boolean dentroOEnCircunferencia = (((x * x) + (y * y)) <= (r * r));
        
        System.out.println("¿El punto cae dentro o sobre la circunferencia?: " + dentroOEnCircunferencia);
        scanner.close();
    }
}