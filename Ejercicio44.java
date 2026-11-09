import java.util.Scanner;

public class Ejercicio44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la coordenada x: ");
        double x = scanner.nextDouble();
        System.out.print("Ingrese la coordenada y: ");
        double y = scanner.nextDouble();
        
        boolean primerCuadrante = ((x > 0.0) && (y > 0.0));
        
        System.out.println("¿Se encuentra en el primer cuadrante?: " + primerCuadrante);
        scanner.close();
    }
}