import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero entero: ");
        int numero = scanner.nextInt();
        
        boolean esMultiplo4y6 = (((numero % 4) == 0) && ((numero % 6) == 0));
        
        System.out.println("¿Es multiplo simultaneo de 4 y 6?: " + esMultiplo4y6);
        scanner.close();
    }
}