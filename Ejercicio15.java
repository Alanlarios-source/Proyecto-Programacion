import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero entero: ");
        int numero = scanner.nextInt();
        
        boolean esMultiplo3yNo2 = (((numero % 3) == 0) && ((numero % 2) != 0));
        
        System.out.println("¿Es multiplo de 3 y no de 2?: " + esMultiplo3yNo2);
        scanner.close();
    }
}