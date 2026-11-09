import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese precio del articulo 1: ");
        double art1 = scanner.nextDouble();
        System.out.print("Ingrese precio del articulo 2: ");
        double art2 = scanner.nextDouble();
        System.out.print("Ingrese precio del articulo 3: ");
        double art3 = scanner.nextDouble();
        System.out.print("Ingrese dinero disponible: ");
        double dinero = scanner.nextDouble();
        
        boolean alcanza = ((art1 + art2 + art3) <= dinero);
        
        System.out.println("¿El dinero alcanza exactamente o sobra?: " + alcanza);
        scanner.close();
    }
}