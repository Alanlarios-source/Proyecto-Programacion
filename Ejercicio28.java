import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un entero positivo: ");
        int numero = scanner.nextInt();
        
        boolean noTerminaEnCero = ((numero % 10) != 0);
        
        System.out.println("¿NO termina en cero?: " + noTerminaEnCero);
        scanner.close();
    }
}