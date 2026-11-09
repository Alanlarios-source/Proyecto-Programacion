import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese a: ");
        int a = scanner.nextInt();
        System.out.print("Ingrese b: ");
        int b = scanner.nextInt();
        System.out.print("Ingrese c: ");
        int c = scanner.nextInt();
        
        boolean sonIguales = ((a == b) && (b == c));
        
        System.out.println("¿Los tres numeros son identicos entre si?: " + sonIguales);
        scanner.close();
    }
}