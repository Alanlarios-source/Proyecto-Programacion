import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un entero: ");
        int numero = scanner.nextInt();
        
        boolean esImparNegativo = ((numero < 0) && ((numero % 2) != 0));
        
        System.out.println("¿Es impar y negativo?: " + esImparNegativo);
        scanner.close();
    }
}