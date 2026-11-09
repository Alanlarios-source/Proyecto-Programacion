import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero entero: ");
        int numero = scanner.nextInt();
        
        boolean terminaEnCero = ((numero % 10) == 0);
        
        System.out.println("¿El numero termina en cero?: " + terminaEnCero);
        scanner.close();
    }
}